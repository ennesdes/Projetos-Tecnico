
package model.dao;

import connection.ConnectionFactory;
import model.bean.Ferias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Funcionario;

// @author Douglas

public class FeriasDAO {
    
    private Connection con = null;
    
    public FeriasDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Ferias ferias) {
        
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO ferias (tipo, aquisitivo, periodo, situacao, idfuncionario) VALUES (?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ferias.getTipo());
            stmt.setString(2, ferias.getAquisitivo());
            stmt.setString(3, ferias.getPeriodo());
            stmt.setString(4, ferias.getSituacao());
            stmt.setInt(5, ferias.getFuncionario().getIdfuncionario());
            
            stmt.executeUpdate();
            System.out.println("Salvo com sucesso!");
            return true;
        } catch(SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean update (Ferias ferias) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE ferias SET tipo = ?, aquisitivo = ?, periodo = ?, situacao = ?, idfuncionario = ? WHERE idferias = ? ";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, ferias.getTipo());
            stmt.setString(2, ferias.getAquisitivo());
            stmt.setString(3, ferias.getPeriodo());
            stmt.setString(4, ferias.getSituacao());
            stmt.setInt(5, ferias.getFuncionario().getIdfuncionario());
            stmt.setInt(6, ferias.getIdferias());
            
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
    
    public ArrayList<Ferias> read (String nome) throws SQLException {
        
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Ferias> listaFerias = new ArrayList<>();
        
        /* COMANDO PARA CRIAR VIEW
        "CREATE VIEW view_ferias_funcionario AS SELECT idferias, tipo, aquisitivo, periodo, situacao, p.idfuncionario AS pidfuncionario,\n" +
        "c.idfuncionario AS cidfuncionario, nome\n" +
        "from ferias p INNER JOIN funcionario c ON c.idfuncionario = p.idfuncionario" */
        
        String sql = "SELECT * FROM view_ferias_funcionario WHERE nome LIKE ? ORDER BY periodo";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");            
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                
                Ferias ferias = new Ferias();
                
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("nome"));
                ferias.setFuncionario(funcionario);
                
                ferias.setIdferias(rs.getInt("idferias"));
                ferias.setTipo(rs.getString("tipo"));
                ferias.setAquisitivo(rs.getString("aquisitivo"));
                ferias.setPeriodo(rs.getString("periodo"));
                ferias.setSituacao(rs.getString("situacao"));
                
                
                
                listaFerias.add(ferias);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os nomes: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaFerias;
        
    }
    
    public boolean delete (Ferias ferias) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM ferias WHERE idferias = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, ferias.getIdferias());
            
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir ferias: " + ex );
            return false;            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    public ArrayList<Ferias> getListaFeriasPorTipo (String nome, String tipo) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        ArrayList<Ferias> listaFerias = new ArrayList<>();
        
        String sql = "SELECT * FROM view_ferias_funcionario WHERE nome LIKE ? AND tipo LIKE ? ORDER BY idferias";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            stmt.setString(2, "%" + tipo + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Ferias ferias = new Ferias();
                ferias.setIdferias(rs.getInt("idferias"));
                ferias.setTipo(rs.getString("tipo"));
                ferias.setAquisitivo(rs.getString("aquisitivo"));
                ferias.setPeriodo(rs.getString("periodo"));
                ferias.setSituacao(rs.getString("situacao"));
                
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("nome"));
                ferias.setFuncionario(funcionario);
                
                listaFerias.add(ferias);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os tipos: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaFerias;        
    }
    
    public ArrayList<Ferias> getListaFeriasPorSituacao (String nome, String situacao) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        ArrayList<Ferias> listaFerias = new ArrayList<>();
        
        String sql = "SELECT * FROM view_ferias_funcionario WHERE nome LIKE ? AND situacao LIKE ?  ORDER BY idferias";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            stmt.setString(2, "%" + situacao + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Ferias ferias = new Ferias();
                ferias.setIdferias(rs.getInt("idferias"));
                ferias.setTipo(rs.getString("tipo"));
                ferias.setAquisitivo(rs.getString("aquisitivo"));
                ferias.setPeriodo(rs.getString("periodo"));
                ferias.setSituacao(rs.getString("situacao"));
                
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("nome"));
                ferias.setFuncionario(funcionario);
                
                listaFerias.add(ferias);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler as situações: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaFerias;        
    }
    
}
