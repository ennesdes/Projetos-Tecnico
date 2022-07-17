
package model.dao;

import connection.ConnectionFactory;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;

//@author Douglas

public class UsuarioDAO {
    
    private Connection con = null;
    
    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public void createCriptografica(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO usuario (usuario, senha) VALUES (?,?)";
        try {
            
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usuario.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02X", 0xFF & b));
            }
            String senhaHex = sb.toString();
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, senhaHex);
            
            con.setAutoCommit(false);
            
            stmt.executeUpdate();
            con.commit();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            
            try {
                con.rollback();
            } catch (SQLException ex1) {
                System.out.println("Erro:" + ex1);
            }
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                System.out.println("Erro:" + ex);
            }
        }
    }
    
    public boolean verificaLogin (Usuario usu) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException{
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
        
        try {
            
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usu.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02X", 0xFF & b));
            }
            String senhaHex = sb.toString();
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usu.getUsuario());
            stmt.setString(2, senhaHex);
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                check = true;
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao identificar usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {  
        ConnectionFactory.closeConnection(con, stmt, rs);        
        }
        return check;
    }
    
}
