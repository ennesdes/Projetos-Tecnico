
package model.dao;

import connection.ConnectionFactory;
import model.bean.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Funcao;

// @author Douglas

public class FuncionarioDAO {
    
    private Connection con = null;
    
    public FuncionarioDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Funcionario funcionario) {
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO funcionario (nome, cpf, celular, email, endereco, idfuncao) VALUES (?,?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCelular());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getEndereco());
            stmt.setInt(6, funcionario.getFuncao().getIdFuncao());
            
            stmt.executeUpdate();
            System.out.println("Salvo com sucesso!");
            return true;
        } catch(SQLException ex) {
            System.out.println("Erro ao salvar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean update (Funcionario funcionario) {
        
        PreparedStatement stmt = null; //variavel auxiliar para organizar os parametros
        String sql = "UPDATE funcionario SET nome = ?, cpf = ?, celular = ?, email = ?, endereco = ?, idfuncao =? WHERE idfuncionario = ? ";
        
        try {
            //inserir dados no banco de dados
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCelular());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getEndereco());
            stmt.setInt(6, funcionario.getFuncao().getIdFuncao());
            stmt.setInt(7, funcionario.getIdfuncionario());
            
            stmt.executeUpdate();
            System.out.println("Atualizado com sucesso!");
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Funcionario> read () throws SQLException {
        
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        /* COMANDO PARA CRIAR VIEW
        "CREATE VIEW view_funcionario_funcao AS SELECT idfuncionario, nome, cpf, celular, email, endereco, p.idfuncao AS pidfuncao,\n" +
        "c.idfuncao AS cidfuncao, descricao\n" +
        "from funcionario p INNER JOIN funcao c ON c.idfuncao = p.idfuncao" */
          
        String sql = "SELECT * FROM view_funcionario_funcao ORDER BY idfuncionario";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdfuncionario(rs.getInt("idfuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setEndereco(rs.getString("endereco"));
                
                Funcao funcao = new Funcao();
                funcao.setIdFuncao(rs.getInt("cidfuncao"));
                funcao.setDescricao(rs.getString("descricao"));
                funcionario.setFuncao(funcao);
                
                listaFuncionario.add(funcionario);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler funcionários: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaFuncionario;
        
    }
    
    public boolean delete (Funcionario funcionario) throws SQLException {
        
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM funcionario WHERE idfuncionario = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, funcionario.getIdfuncionario());
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir funcionário: " + ex );
            return false;            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    public ArrayList<Funcionario> getListaFuncionarioPorNome (String nome) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        String sql = "SELECT * FROM view_funcionario_funcao  WHERE nome LIKE ? ORDER BY idfuncionario";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdfuncionario(rs.getInt("idfuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setEndereco(rs.getString("endereco"));
                
                Funcao funcao = new Funcao();
                funcao.setIdFuncao(rs.getInt("cidfuncao"));
                funcao.setDescricao(rs.getString("descricao"));
                funcionario.setFuncao(funcao);
                
                listaFuncionario.add(funcionario);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler os nomes: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaFuncionario;         
    }
    
    public ArrayList<Funcionario> getListaFuncionarioPorFuncao (String descricao) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        String sql = "SELECT * FROM view_funcionario_funcao  WHERE descricao LIKE ? ORDER BY idfuncionario";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"%" + descricao + "%");
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdfuncionario(rs.getInt("idfuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setEndereco(rs.getString("endereco"));
                
                Funcao funcao = new Funcao();
                funcao.setIdFuncao(rs.getInt("cidfuncao"));
                funcao.setDescricao(rs.getString("descricao"));
                funcionario.setFuncao(funcao);
                
                listaFuncionario.add(funcionario);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler as funções: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaFuncionario;         
    }
    
}
