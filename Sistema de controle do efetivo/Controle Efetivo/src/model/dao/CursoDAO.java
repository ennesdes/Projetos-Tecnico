
package model.dao;

import connection.ConnectionFactory;
import model.bean.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas
 */
public class CursoDAO {
    
    private Connection con = null;
    
    public CursoDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Curso curso) {
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO curso (nome, local, periodo, situacao) VALUES (?, ?, ?, ?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, curso.getNome());
            stmt.setString(2, curso.getLocal());
            stmt.setString(3, curso.getPeriodo());
            stmt.setString(4, curso.getSituacao());
            
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
    
    public boolean update (Curso curso) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE curso SET nome = ?, local = ?, periodo = ?, situacao = ? WHERE idcurso = ? ";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql);
            stmt.setString(1, curso.getNome());
            stmt.setString(2, curso.getLocal());
            stmt.setString(3, curso.getPeriodo());
            stmt.setString(4, curso.getSituacao());
            stmt.setInt(5, curso.getIdCurso());
            
            stmt.executeUpdate();
            System.out.println("Atualizado com sucesso");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean delete (Curso curso) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM curso WHERE idcurso = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, curso.getIdCurso());            
            stmt.executeUpdate();
            System.out.println("Excluído com sucesso!");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir: " + ex );
            return false;            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    public ArrayList<Curso> read () throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Curso> listaCurso = new ArrayList<>();
          
        String sql = "SELECT * FROM curso";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setNome(rs.getString("nome"));
                curso.setLocal(rs.getString("local"));
                curso.setPeriodo(rs.getString("periodo"));
                curso.setSituacao(rs.getString("situacao"));
                
                listaCurso.add(curso);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaCurso;
    }
    
    public ArrayList<Curso> getListaCursoPorNome (String nome) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Curso> listaCurso = new ArrayList<>();
        
        String sql = "SELECT * FROM curso WHERE nome LIKE ? ORDER BY idcurso";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
               Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setNome(rs.getString("nome"));
                curso.setLocal(rs.getString("local"));
                curso.setPeriodo(rs.getString("periodo"));
                curso.setSituacao(rs.getString("situacao"));
                
                listaCurso.add(curso);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os nomes: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaCurso;         
    }
    
    public ArrayList<Curso> getListaCursoPorLocal (String local) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Curso> listaCurso = new ArrayList<>();
        
        String sql = "SELECT * FROM curso WHERE local LIKE ? ORDER BY idcurso";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + local + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
               Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setNome(rs.getString("nome"));
                curso.setLocal(rs.getString("local"));
                curso.setPeriodo(rs.getString("periodo"));
                curso.setSituacao(rs.getString("situacao"));
                
                listaCurso.add(curso);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os locais: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaCurso;         
    }
    
    public ArrayList<Curso> getListaCursoPorSitucao (String situacao) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Curso> listaCurso = new ArrayList<>();
        
        String sql = "SELECT * FROM curso WHERE situacao LIKE ? ORDER BY idcurso";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + situacao + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
               Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setNome(rs.getString("nome"));
                curso.setLocal(rs.getString("local"));
                curso.setPeriodo(rs.getString("periodo"));
                curso.setSituacao(rs.getString("situacao"));
                
                listaCurso.add(curso);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler as situações: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaCurso;         
    }
    
}
