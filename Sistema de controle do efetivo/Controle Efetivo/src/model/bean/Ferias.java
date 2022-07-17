
package model.bean;

import model.bean.Funcionario;

// @author Douglas

public class Ferias {
    
    private int idferias; 
    private String tipo;
    private String aquisitivo;
    private String periodo;
    private String situacao;
    private Funcionario funcionario;
    

    public Ferias() {
    }

    public Ferias(int idferias, String tipo, String aquisitivo, String periodo, String situacao, Funcionario funcionario) {
        this.idferias = idferias;
        this.tipo = tipo;
        this.aquisitivo = aquisitivo;
        this.periodo = periodo;
        this.situacao = situacao;
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public int getIdferias() {
        return idferias;
    }

    public void setIdferias(int idferias) {
        this.idferias = idferias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAquisitivo() {
        return aquisitivo;
    }

    public void setAquisitivo(String aquisitivo) {
        this.aquisitivo = aquisitivo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
