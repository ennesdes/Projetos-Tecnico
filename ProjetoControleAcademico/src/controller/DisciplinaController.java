
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Disciplina;
import model.dao.DisciplinaDAO;

/**
 *
 * @author Douglas
 */
public class DisciplinaController {
    
    public boolean create (String nome, String codigo, int cargaHoraria) throws SQLException { 
        
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setCodigo(codigo);
        disciplina.setCargaHoraria(cargaHoraria);
        
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        return disciplinaDAO.create (disciplina);
    }
    
    public ArrayList<Disciplina> read() throws SQLException{
        //retorna a lista para a view 
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        return disciplinaDAO.read();
    }
    
    public boolean update (int id, String nome, String codigo, int cargaHoraria) { 
        
        Disciplina aluno = new Disciplina();
        aluno.setId(id);
        aluno.setNome(nome);
        aluno.setCodigo(codigo);
        aluno.setCargaHoraria(cargaHoraria);
        
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        return disciplinaDAO.update(aluno);
        
    }
    
    public boolean delete (int id) throws SQLException {
        
        Disciplina disciplina = new Disciplina();
        disciplina.setId(id);
        
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        return disciplinaDAO.delete(disciplina);
        
    }
    
    public ArrayList<Disciplina> getListaDisciplinaPorNome(String nome) throws SQLException{
        //retorna a lista para a view 
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        return disciplinaDAO.getListaDisciplinaPorNome(nome);        
    }
    
    public ArrayList<Disciplina> getListaDisciplinaPorCodigo(String codigo) throws SQLException{
        //retorna a lista para a view 
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        return disciplinaDAO.getListaDisciplinaPorCodigo(codigo);        
    }
    
    public ArrayList<Disciplina> getListaDisciplinaPorCargaHoraria(int cargaHoraria) throws SQLException{
        //retorna a lista para a view 
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        return disciplinaDAO.getListaDisciplinaPorCargaHoraria(cargaHoraria);        
    }
}
