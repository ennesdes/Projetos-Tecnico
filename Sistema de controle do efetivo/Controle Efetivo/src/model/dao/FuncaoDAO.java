
package model.dao;

import connection.ConnectionFactory;
import model.bean.Funcao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// @author Douglas

public class FuncaoDAO {
    
    private Connection con = null;

    public FuncaoDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Funcao funcao) {

        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO funcao (descricao) VALUES (?)";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, funcao.getDescricao());
            stmt.executeUpdate();
            System.out.println("Salvo com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public boolean update (Funcao funcao) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE funcao SET descricao = ? WHERE idfuncao = ? ";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql); //instrução sql
            stmt.setString(1, funcao.getDescricao());
            stmt.setInt(2, funcao.getIdFuncao());
            stmt.executeUpdate();
            System.out.println("Atualizado com sucesso!");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean delete (Funcao funcao) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM funcao WHERE idfuncao = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, funcao.getIdFuncao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Funcao> read() throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Funcao> listafuncao = new ArrayList<>();
        
        String sql = "SELECT * FROM funcao ORDER BY idfuncao";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Funcao fun = new Funcao();
                fun.setIdFuncao(rs.getInt("idfuncao"));
                fun.setDescricao(rs.getString("descricao"));
                listafuncao.add(fun);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return listafuncao;
    }
    
    public ArrayList<Funcao> getListaFuncaoPorDescricao (String descricao) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Funcao> listaFuncao = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM funcao WHERE descricao LIKE ? ORDER BY idfuncao");
            stmt.setString(1, "%" + descricao + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Funcao fun = new Funcao();
                fun.setIdFuncao(rs.getInt("idfuncao"));
                fun.setDescricao(rs.getString("descricao"));
                listaFuncao.add(fun);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as Funções" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return listaFuncao;
        
    }
}
