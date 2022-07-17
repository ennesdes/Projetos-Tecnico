
package model.bean;

// @author Douglas

import model.bean.Funcao;


public class Funcionario {
    
    private int idfuncionario; 
    private String nome;
    private String cpf;
    private String celular;
    private String email;
    private String endereco;
    private Funcao funcao;

    public Funcionario() {
    }

    public Funcionario(int idfuncionario, String nome, String cpf, String celular, String email, String endereco, Funcao funcao) {
        this.idfuncionario = idfuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.funcao = funcao;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
    
    @Override
    public String toString() {
        return this.getNome();
    }
    
}
