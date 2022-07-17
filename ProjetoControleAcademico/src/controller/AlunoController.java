
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Aluno;
import model.dao.AlunoDAO;

/**
 *
 * @author Douglas
 */
public class AlunoController {
    
    public boolean create (String nome, String endereco, String fone,
            String email, String matricula,  String curso) throws SQLException { 
        
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setEndereco(endereco);
        aluno.setFone(fone);
        aluno.setEmail(email);
        aluno.setMatricula(matricula);
        aluno.setCurso(curso);
        
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.create (aluno);
    }
    
    public ArrayList<Aluno> read() throws SQLException{
        //retorna a lista para a view 
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.read();
    }
    
    public boolean update (int idaluno, String nome, String endereco, String fone,
            String email, String matricula,  String curso) { 
        
        Aluno aluno = new Aluno();
        aluno.setId(idaluno);
        aluno.setNome(nome);
        aluno.setEndereco(endereco);
        aluno.setFone(fone);
        aluno.setEmail(email);
        aluno.setMatricula(matricula);
        aluno.setCurso(curso);
        
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.update(aluno);
        
    }
    
    public boolean delete (int id) throws SQLException {
        
        Aluno aluno = new Aluno();
        aluno.setId(id);
        
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.delete(aluno);
        
    }
    
    public ArrayList<Aluno> getListaAlunoPorNome(String nome) throws SQLException{
        //retorna a lista para a view 
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.getListaAlunoPorNome(nome);        
    }
    
    public ArrayList<Aluno> getListaAlunoPorMatricula(String matricula) throws SQLException{
        //retorna a lista para a view 
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.getListaAlunoPorMatricula(matricula);        
    }
    
    public ArrayList<Aluno> getListaAlunoPorCurso(String curso) throws SQLException{
        //retorna a lista para a view 
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.getListaAlunoPorCurso(curso);        
    }
    
}
