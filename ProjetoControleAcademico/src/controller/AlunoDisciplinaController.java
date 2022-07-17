
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Aluno;
import model.bean.AlunoDisciplina;
import model.bean.Disciplina;
import model.dao.AlunoDisciplinaDAO;

/**
 *
 * @author Douglas
 */
public class AlunoDisciplinaController {
    
    public boolean create (Aluno aluno, Disciplina disciplina, int semestre, int ano, double nota1, double nota2, int faltas) throws SQLException { 
        
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina();
        alunoDisciplina.setAluno(aluno);
        alunoDisciplina.setDisciplina(disciplina);
        alunoDisciplina.setSemestre(semestre);
        alunoDisciplina.setAno(ano);
        alunoDisciplina.setNota1(nota1);
        alunoDisciplina.setNota2(nota2);
        alunoDisciplina.setFaltas(faltas);
        
        AlunoDisciplinaDAO alunoDisciplinaDAO = new AlunoDisciplinaDAO();
        return alunoDisciplinaDAO.create (alunoDisciplina);
    }
    
    public ArrayList<AlunoDisciplina> getDisciplinasPorAluno(int idaluno) throws SQLException{
        //retorna a lista para a view 
        AlunoDisciplinaDAO alunoDisciplinaDAO = new AlunoDisciplinaDAO();
        return alunoDisciplinaDAO.getListaDisciplinaPorAluno(idaluno);
    }
    
    public boolean update (Aluno aluno, Disciplina disciplina, int semestre, int ano, double nota1, double nota2, int faltas) { 
        
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina();
        alunoDisciplina.setAluno(aluno);
        alunoDisciplina.setDisciplina(disciplina);
        alunoDisciplina.setSemestre(semestre);
        alunoDisciplina.setAno(ano);
        alunoDisciplina.setNota1(nota1);
        alunoDisciplina.setNota2(nota2);
        alunoDisciplina.setFaltas(faltas);
        
        AlunoDisciplinaDAO alunoDisciplinaDAO = new AlunoDisciplinaDAO();
        return alunoDisciplinaDAO.update (alunoDisciplina);
        
    }
    
    public boolean delete (int idAluno, int idDisciplina) throws SQLException {
        
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina();
        Aluno aluno = new Aluno();
        aluno.setId(idAluno);
        
        Disciplina disciplina = new Disciplina();
        disciplina.setId(idDisciplina);
        
        alunoDisciplina.setAluno(aluno);
        alunoDisciplina.setDisciplina(disciplina);
        
        AlunoDisciplinaDAO alunoDisciplinaDAO = new AlunoDisciplinaDAO();
        return alunoDisciplinaDAO.delete (alunoDisciplina);
        
    }
    
}
