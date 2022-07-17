
package model.dao;

import connection.ConnectionFactory;
import model.bean.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class DisciplinaDAO {
    
    private Connection con = null;
    
    public DisciplinaDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Disciplina disciplina) {
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO disciplina (nome, codigo, cargahoraria) VALUES (?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getCodigo());
            stmt.setInt(3, disciplina.getCargaHoraria());
            
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
    
    public boolean update (Disciplina disciplina) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE disciplina SET nome = ?, codigo = ?, cargahoraria = ? WHERE iddisciplina = ? ";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql);
            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getCodigo());
            stmt.setInt(3, disciplina.getCargaHoraria());
            stmt.setInt(4, disciplina.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean delete (Disciplina disciplina) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM disciplina WHERE iddisciplina = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, disciplina.getId());            
            stmt.executeUpdate();            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir disciplina: " + ex );
            return false;            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    public ArrayList<Disciplina> read () throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Disciplina> listaDisciplina = new ArrayList<>();
          
        String sql = "SELECT * FROM disciplina";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setId(rs.getInt("iddisciplina"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCodigo(rs.getString("codigo"));
                disciplina.setCargaHoraria(rs.getInt("cargahoraria"));
                
                listaDisciplina.add(disciplina);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler disciplinas: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaDisciplina;
    }
    
    public ArrayList<Disciplina> getListaDisciplinaPorNome (String nome) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Disciplina> listaDisciplina = new ArrayList<>();
        
        String sql = "SELECT * FROM disciplina WHERE nome LIKE ? ORDER BY iddisciplina";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setId(rs.getInt("iddisciplina"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCodigo(rs.getString("codigo"));
                disciplina.setCargaHoraria(rs.getInt("cargahoraria"));
                
                listaDisciplina.add(disciplina);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as disciplinas!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaDisciplina;         
    }
    
    public ArrayList<Disciplina> getListaDisciplinaPorCodigo (String codigo) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Disciplina> listaDisciplina = new ArrayList<>();
        
        String sql = "SELECT * FROM disciplina WHERE codigo = ? ORDER BY iddisciplina";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, codigo);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setId(rs.getInt("iddisciplina"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCodigo(rs.getString("codigo"));
                disciplina.setCargaHoraria(rs.getInt("cargahoraria"));
                
                listaDisciplina.add(disciplina);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as disciplinas!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaDisciplina;         
    }
    
    public ArrayList<Disciplina> getListaDisciplinaPorCargaHoraria (int cargaHoraria) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Disciplina> listaDisciplina = new ArrayList<>();
        
        String sql = "SELECT * FROM disciplina WHERE cargahoraria = ? ORDER BY iddisciplina";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cargaHoraria);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setId(rs.getInt("iddisciplina"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCodigo(rs.getString("codigo"));
                disciplina.setCargaHoraria(rs.getInt("cargahoraria"));
                
                listaDisciplina.add(disciplina);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler as disciplinas!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaDisciplina;         
    }
}
