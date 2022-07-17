
package model.bean;

/**
 *
 * @author Douglas
 */
public class Matricula {
    
    private Funcionario funcionario;
    private Curso curso;
    private int matricula;

    public Matricula() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }  
    
}
