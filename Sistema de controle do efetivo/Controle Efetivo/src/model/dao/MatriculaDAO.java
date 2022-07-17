
package model.dao;

import connection.ConnectionFactory;
import model.bean.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Curso;
import model.bean.Funcionario;

/**
 *
 * @author Douglas
 */
public class MatriculaDAO {
    
    private Connection con = null;
    
    public MatriculaDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Matricula matricula) {
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO matricula (idcurso, idfuncionario, matricula) VALUES (?, ?, ?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, matricula.getCurso().getIdCurso());
            stmt.setInt(2, matricula.getFuncionario().getIdfuncionario());
            stmt.setInt(3, matricula.getMatricula());
            
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
    
    public boolean update (Matricula matricula) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE matricula SET matricula = ? "
                + "WHERE idcurso = ? and idfuncionario = ?";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, matricula.getMatricula());
            stmt.setInt(2, matricula.getCurso().getIdCurso());
            stmt.setInt(3, matricula.getFuncionario().getIdfuncionario());
            
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
    
    public boolean delete (Matricula matricula) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM matricula WHERE idcurso = ? and idfuncionario = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, matricula.getCurso().getIdCurso());
            stmt.setInt(2, matricula.getFuncionario().getIdfuncionario());
            
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
    
    public ArrayList<Matricula> getListaMatricula (int idFuncionario) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Matricula> listaMatriculas = new ArrayList<>();
        /*
        CREATE OR REPLACE VIEW public.view_matricula AS
        SELECT f.idfuncionario, f.nome AS fnome, c.idcurso, c.nome AS cnome, m.matricula 
        FROM matricula m
            JOIN funcionario f ON f.idfuncionario = m.idfuncionario
            JOIN curso c ON c.idcurso = m.idcurso
        */
          
        String sql = "SELECT * FROM view_matricula WHERE idfuncionario = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idFuncionario);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Matricula matricula = new Matricula();
                
                Funcionario funcionario = new Funcionario();
                funcionario.setIdfuncionario(rs.getInt("idfuncionario"));
                funcionario.setNome(rs.getString("fnome"));
                matricula.setFuncionario(funcionario);
                
                Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setNome(rs.getString("cnome"));
                matricula.setCurso(curso);
                
                matricula.setMatricula(rs.getInt("matricula"));
                
                listaMatriculas.add(matricula);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaMatriculas;
    }
    
    public ArrayList<Matricula> getListaMatriculaPorCurso (int idFuncionario, String cnome) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Matricula> listaMatriculas = new ArrayList<>();
          
        String sql = "SELECT * FROM view_matricula WHERE idfuncionario = ? AND cnome LIKE ? ORDER BY idcurso";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idFuncionario);
            stmt.setString(2, "%" + cnome + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Matricula matricula = new Matricula();
                
                Funcionario funcionario = new Funcionario();
                funcionario.setIdfuncionario(rs.getInt("idfuncionario"));
                funcionario.setNome(rs.getString("fnome"));
                matricula.setFuncionario(funcionario);
                
                Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setNome(rs.getString("cnome"));
                matricula.setCurso(curso);
                
                matricula.setMatricula(rs.getInt("matricula"));
                
                listaMatriculas.add(matricula);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaMatriculas;
    }
    
}
