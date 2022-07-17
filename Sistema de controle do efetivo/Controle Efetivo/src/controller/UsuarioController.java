
package controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

// @author Douglas

public class UsuarioController {
    
    public void createCriptografia (String usu, String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = new Usuario();
        usuario.setUsuario(usu);
        usuario.setSenha(senha);

        usuarioDAO.createCriptografica(usuario);
    }
    
    public boolean verificaLogin(String usu, String senha) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        Usuario usuario = new Usuario();
        usuario.setUsuario(usu);
        usuario.setSenha(senha);
        
        return usuarioDAO.verificaLogin(usuario);
    }
    
}
