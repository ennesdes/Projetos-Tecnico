
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Funcao;
import model.dao.FuncaoDAO;

// @author Douglas

public class FuncaoController {
    
    //RECEBENDO DADOS DAS INTERFACES
    
    public boolean create (String descricao) throws SQLException { 
        
        Funcao funcao = new Funcao();
        funcao.setDescricao(descricao);
        
        FuncaoDAO funcaoDAO = new FuncaoDAO();
        return funcaoDAO.create (funcao);
    }
    
    public ArrayList<Funcao> read() throws SQLException{
        //retorna a lista para a view 
        FuncaoDAO funcaoDAO = new FuncaoDAO();
        return funcaoDAO.read();        
    }
    
    public boolean update (int idfuncao, String descricao) { //parametros que vem da VIEW
        
        Funcao funcao = new Funcao();
        //pega dados da interface e coloca no objeto
        funcao.setIdFuncao(idfuncao);
        funcao.setDescricao(descricao);
        
        FuncaoDAO funcaoDAO = new FuncaoDAO();
        //envia dados do objeto para o banco de dados
        return funcaoDAO.update(funcao);
        
    }
    
    public boolean delete (int idfuncao) throws SQLException {
        
        Funcao funcao = new Funcao();
        FuncaoDAO funcaoDAO = new FuncaoDAO();
        
        funcao.setIdFuncao(idfuncao);
        return funcaoDAO.delete(funcao);
        
    }
    
    public ArrayList<Funcao> getListaFuncionarioPorFuncao(String descricao){
        //retorna a lista para a view 
        FuncaoDAO categoriaDAO = new FuncaoDAO();
        return categoriaDAO.getListaFuncaoPorDescricao(descricao);        
    }
}
