
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Funcionario;
import model.bean.Ferias;
import model.dao.FeriasDAO;

// @author Douglas

public class FeriasController {
    
    //RECEBENDO DADOS DAS INTERFACES
    
    public boolean create (String tipo, String aquisitivo, String periodo, String situacao, Funcionario funcionario) throws SQLException { 
        
        Ferias ferias = new Ferias();
        ferias.setTipo(tipo);
        ferias.setAquisitivo(aquisitivo);
        ferias.setPeriodo(periodo);
        ferias.setSituacao(situacao);
        ferias.setFuncionario(funcionario);
        
        FeriasDAO feriasDAO = new FeriasDAO();
        return feriasDAO.create (ferias);
    }
    
    public ArrayList<Ferias> read(String nome) throws SQLException{
        //retorna a lista para a view 
        FeriasDAO feriasDAO = new FeriasDAO();
        return feriasDAO.read(nome);
    }
    
    public ArrayList<Ferias> getListaFeriasPorTipo(String nome, String tipo) throws SQLException{
        //retorna a lista para a view 
        FeriasDAO feriasDAO = new FeriasDAO();
        return feriasDAO.getListaFeriasPorTipo(nome, tipo);
    }
    
    public ArrayList<Ferias> getListaFeriasSituacao(String nome, String situacao) throws SQLException{
        //retorna a lista para a view 
        FeriasDAO feriasDAO = new FeriasDAO();
        return feriasDAO.getListaFeriasPorSituacao(nome, situacao);
    }
    
    // update (parametros que vem da VIEW)
    public boolean update (int idferias, String tipo, String aquisitivo, String periodo, String situacao, Funcionario funcionario) { 
        
        Ferias ferias = new Ferias();
        
        ferias.setIdferias(idferias);
        ferias.setTipo(tipo);
        ferias.setAquisitivo(aquisitivo);
        ferias.setPeriodo(periodo);
        ferias.setSituacao(situacao);
        ferias.setFuncionario(funcionario);
        
        FeriasDAO feriasDAO = new FeriasDAO();
        return feriasDAO.update(ferias);
        
    }
    
    public boolean delete (int idferias) throws SQLException {
        
        Ferias ferias = new Ferias();
        FeriasDAO feriasDAO = new FeriasDAO();
        
        ferias.setIdferias(idferias);
        return feriasDAO.delete(ferias);
        
    }
    
    
}
