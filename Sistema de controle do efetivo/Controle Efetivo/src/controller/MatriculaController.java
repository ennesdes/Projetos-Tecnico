
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Funcionario;
import model.bean.Matricula;
import model.bean.Curso;
import model.dao.MatriculaDAO;

/**
 *
 * @author Douglas
 */
public class MatriculaController {
    
    public boolean create (Curso curso, Funcionario funcionario, int matricula) throws SQLException { 
        
        Matricula mat = new Matricula();
        mat.setCurso(curso);
        mat.setFuncionario(funcionario);
        mat.setMatricula(matricula);
        
        MatriculaDAO matriculaDAO = new MatriculaDAO();
        return matriculaDAO.create (mat);
    }
    
    public ArrayList<Matricula> getListaMatriculas(int idFuncionario) throws SQLException{
        //retorna a lista para a view 
        MatriculaDAO matriculaDAO = new MatriculaDAO();
        return matriculaDAO.getListaMatricula(idFuncionario);
    }
    
    public ArrayList<Matricula> getListaMatriculasPorCurso(int idFuncionario, String cnome) throws SQLException{
        //retorna a lista para a view 
        MatriculaDAO matriculaDAO = new MatriculaDAO();
        return matriculaDAO.getListaMatriculaPorCurso(idFuncionario, cnome);
    }
    
    public boolean update (Curso curso, Funcionario funcionario, int matricula) { 
        
        Matricula mat = new Matricula();
        mat.setCurso(curso);
        mat.setFuncionario(funcionario);
        mat.setMatricula(matricula);
        
        MatriculaDAO matriculaDAO = new MatriculaDAO();
        return matriculaDAO.update (mat);
        
    }
    
    public boolean delete (int idCurso, int idFuncionario) throws SQLException {
        
        Matricula mat = new Matricula();
        Curso curso = new Curso();
        curso.setIdCurso(idCurso);
        
        Funcionario funcionario = new Funcionario();
        funcionario.setIdfuncionario(idFuncionario);
        
        mat.setCurso(curso);
        mat.setFuncionario(funcionario);
        
        MatriculaDAO matriculaDAO = new MatriculaDAO();
        return matriculaDAO.delete (mat);
        
    }
    
}
