
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/dbcontroleacademico";
    private static final String USER = "postgres";
    private static final String SENHA = "1234";
    
    public static Connection getConnection(){
                
        try {
            //executa o driver
            Class.forName(DRIVER);
            //fazer conexão com usuário e senha na base de dados
            return DriverManager.getConnection(URL, USER, SENHA);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão com o Banco de dados", ex);
        }             
    }
    
    //metodo para fechar classe de conexão
    private static void closeConnection(Connection con) {
        
        if (con!=null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex);
            }
        }
        
    }
    
    //metodo para fechar classes de conexão e todas as preparações
    public static void closeConnection (Connection con, PreparedStatement stmt) {
        
        if (stmt != null) {
            
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex);
            }
          }
        closeConnection(con);        
    }

    //metodo para fechar classes de conexão, preparações e resultados
    public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet rs) {
        
        if (rs != null) {
            
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex);
            }            
        }
        closeConnection(con, stmt);
    }
    
}
