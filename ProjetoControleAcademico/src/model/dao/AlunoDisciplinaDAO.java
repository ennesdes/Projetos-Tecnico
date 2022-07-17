
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.AlunoDisciplina;
import model.bean.Disciplina;

/**
 *
 * @author Douglas
 */
public class AlunoDisciplinaDAO {
    
    private Connection con = null;
    
    public AlunoDisciplinaDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (AlunoDisciplina alunoDisciplina) {
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO aluno_disciplina "
                + "(idaluno, iddisciplina, semestre, ano, nota1, nota2, faltas) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, alunoDisciplina.getAluno().getId());
            stmt.setInt(2, alunoDisciplina.getDisciplina().getId());
            stmt.setInt(3, alunoDisciplina.getSemestre());
            stmt.setInt(4, alunoDisciplina.getAno());
            stmt.setDouble(5, alunoDisciplina.getNota1());
            stmt.setDouble(6, alunoDisciplina.getNota2());
            stmt.setInt(7, alunoDisciplina.getFaltas());
            
            stmt.executeUpdate();
            return true;
        } catch(SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean update (AlunoDisciplina alunoDisciplina) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE aluno_disciplina SET semestre = ?, ano = ?, nota1 = ?, "
                + "nota2 = ?, faltas = ? WHERE idaluno = ? and iddisciplina = ?";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, alunoDisciplina.getSemestre());
            stmt.setInt(2, alunoDisciplina.getAno());
            stmt.setDouble(3, alunoDisciplina.getNota1());
            stmt.setDouble(4, alunoDisciplina.getNota2());
            stmt.setInt(5, alunoDisciplina.getFaltas());
            stmt.setInt(6, alunoDisciplina.getAluno().getId());
            stmt.setInt(7, alunoDisciplina.getDisciplina().getId());
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<AlunoDisciplina> getListaDisciplinaPorAluno (int idaluno) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;    
        
        ArrayList<AlunoDisciplina> listaAlunoDisciplina = new ArrayList<>();
        
        /*COMANDO VIEW
        CREATE OR REPLACE VIEW public.view_aluno_disciplina AS
        SELECT al.idaluno,
        alu.nome,
        al.iddisciplina,
        d.nome AS disciplina,
        al.ano, **na hora de criar o view mudou a ordem do ano e semestre
        al.semestre,
        al.nota1,
        al.nota2,
        al.faltas
        FROM aluno_disciplina al
            JOIN aluno alu ON alu.idaluno = al.idaluno
            JOIN disciplina d ON al.iddisciplina = d.iddisciplina;
        
        
        ALTER TABLE public.view_aluno_disciplina
            OWNER TO postgres;
        
        
        */
        String sql = "SELECT * FROM view_aluno_disciplina WHERE idaluno = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idaluno);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                AlunoDisciplina alunoDisciplina = new AlunoDisciplina();
                
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("idaluno"));
                aluno.setNome(rs.getString("nome"));
                alunoDisciplina.setAluno(aluno);
                
                Disciplina disciplina = new Disciplina();
                disciplina.setId(rs.getInt("iddisciplina"));
                disciplina.setNome(rs.getString("disciplina"));
                alunoDisciplina.setDisciplina(disciplina);
                
                alunoDisciplina.setAno(rs.getInt("ano"));
                alunoDisciplina.setSemestre(rs.getInt("semestre"));
                alunoDisciplina.setNota1(rs.getDouble("nota1"));
                alunoDisciplina.setNota2(rs.getDouble("nota2"));
                alunoDisciplina.setFaltas(rs.getInt("faltas"));
                
                listaAlunoDisciplina.add(alunoDisciplina);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaAlunoDisciplina;         
    }
    
    public boolean delete (AlunoDisciplina alunoDisciplina) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM aluno_disciplina WHERE idaluno = ? and iddisciplina = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, alunoDisciplina.getAluno().getId());            
            stmt.setInt(2, alunoDisciplina.getDisciplina().getId());            
            stmt.executeUpdate();            
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex );
            return false;            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    
    
}
