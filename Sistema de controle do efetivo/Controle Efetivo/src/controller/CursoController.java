
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Curso;
import model.dao.CursoDAO;

/**
 *
 * @author Douglas
 */
public class CursoController {
    
    public boolean create (String nome, String local, String periodo, String situacao) throws SQLException { 
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setLocal(local);
        curso.setPeriodo(periodo);
        curso.setSituacao(situacao);
        
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.create(curso);
    }
    
    public ArrayList<Curso> read() throws SQLException{
        //retorna a lista para a view 
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.read();
    }
    
    public boolean update (int idcurso, String nome, String local, String periodo, String situacao) throws SQLException { 
        
        Curso curso = new Curso();
        curso.setIdCurso(idcurso);
        curso.setNome(nome);
        curso.setLocal(local);
        curso.setPeriodo(periodo);
        curso.setSituacao(situacao);
        
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.update(curso);
    }
    
    public boolean delete (int idCurso) throws SQLException {
        
        Curso curso = new Curso();
        curso.setIdCurso(idCurso);
        
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.delete(curso);
        
    }
    
    public ArrayList<Curso> getListaCursoPorNome(String nome) throws SQLException{
        //retorna a lista para a view 
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.getListaCursoPorNome(nome);        
    }
    
    public ArrayList<Curso> getListaCursoPorLocal(String local) throws SQLException{
        //retorna a lista para a view 
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.getListaCursoPorLocal(local);        
    }
    
    public ArrayList<Curso> getListaCursoPorSituacao(String situacao) throws SQLException{
        //retorna a lista para a view 
        CursoDAO cursoDAO = new CursoDAO();
        return cursoDAO.getListaCursoPorSitucao(situacao);        
    }
    
}
