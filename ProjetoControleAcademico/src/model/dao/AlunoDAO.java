
package model.dao;

import connection.ConnectionFactory;
import model.bean.Aluno;
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
public class AlunoDAO {
    
    private Connection con = null;
    
    public AlunoDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Aluno aluno) {
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO aluno (nome, endereco, fone, email, matricula, curso) VALUES (?,?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getFone());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getMatricula());
            stmt.setString(6, aluno.getCurso());
            
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
    
    public boolean update (Aluno aluno) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE aluno SET nome = ?, endereco = ?, fone = ?, email = ?, matricula = ?, curso = ? WHERE idaluno = ? ";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getFone());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getMatricula());
            stmt.setString(6, aluno.getCurso());
            stmt.setInt(7, aluno.getId());
            
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
    
    public boolean delete (Aluno aluno) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM aluno WHERE idaluno = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, aluno.getId());            
            stmt.executeUpdate();            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir aluno: " + ex );
            return false;            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    public ArrayList<Aluno> read () throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Aluno> listaAluno = new ArrayList<>();
          
        String sql = "SELECT * FROM aluno";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setFone(rs.getString("fone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setCurso(rs.getString("curso"));
                
                listaAluno.add(aluno);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler alunos: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaAluno;
    }
    
    public ArrayList<Aluno> getListaAlunoPorNome (String nome) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        
        String sql = "SELECT * FROM aluno WHERE nome LIKE ? ORDER BY idaluno";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setFone(rs.getString("fone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setCurso(rs.getString("curso"));
                
                listaAlunos.add(aluno);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os nomes: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaAlunos;         
    }
    
    public ArrayList<Aluno> getListaAlunoPorMatricula (String matricula) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        
        String sql = "SELECT * FROM aluno WHERE matricula LIKE ? ORDER BY idaluno";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + matricula + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setFone(rs.getString("fone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setCurso(rs.getString("curso"));
                
                listaAlunos.add(aluno);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os matricula: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaAlunos;         
    }
    
    public ArrayList<Aluno> getListaAlunoPorCurso (String curso) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        
        String sql = "SELECT * FROM aluno WHERE curso LIKE ? ORDER BY idaluno";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + curso + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setFone(rs.getString("fone"));
                aluno.setEmail(rs.getString("email"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setCurso(rs.getString("curso"));
                
                listaAlunos.add(aluno);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os curso: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaAlunos;         
    }
    
}
