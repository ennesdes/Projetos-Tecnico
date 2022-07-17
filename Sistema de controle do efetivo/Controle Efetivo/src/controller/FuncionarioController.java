
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Funcao;
import model.bean.Funcionario;
import model.dao.FuncionarioDAO;

// @author Douglas

public class FuncionarioController {
    
    //RECEBENDO DADOS DAS INTERFACES
    
    public boolean create (String nome, String cpf, String celular, String email, String endereco, Funcao funcao) throws SQLException { 
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setCelular(celular);
        funcionario.setEmail(email);
        funcionario.setEndereco(endereco);
        funcionario.setFuncao(funcao);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.create (funcionario);
    }
    
    public ArrayList<Funcionario> read() throws SQLException{
        //retorna a lista para a view 
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.read();
    }
    
    // update (parametros que vem da VIEW)
    public boolean update (int idfuncionario, String nome, String cpf, String celular, String email, String endereco, Funcao funcao) { 
        
        Funcionario funcionario = new Funcionario();
        funcionario.setIdfuncionario(idfuncionario);
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setCelular(celular);
        funcionario.setEmail(email);
        funcionario.setEndereco(endereco);
        funcionario.setFuncao(funcao);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.update(funcionario);
        
    }
    
    public boolean delete (int idfuncionario) throws SQLException {
        
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        funcionario.setIdfuncionario(idfuncionario);
        return funcionarioDAO.delete(funcionario);
        
    }
    
    public ArrayList<Funcionario> getListaFuncionarioPorNome(String nome) throws SQLException{
        //retorna a lista para a view 
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.getListaFuncionarioPorNome(nome);        
    }
    
    public ArrayList<Funcionario> getListaFuncionarioPorFuncao(String descricao) throws SQLException{
        //retorna a lista para a view 
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.getListaFuncionarioPorFuncao(descricao);        
    }
    
}
