package br.ulbra.controller;

import br.ulbra.model.Usuario;
import br.ulbra.model.UsuarioDAO;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String email, String senha) {
        if (usuarioDAO.autenticar(email, senha)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
            return false;
        }
    }

    public boolean adicionarUsuario(String nome, String email,
            String senha, String datan, int ativo, Icon icone) {
        
            return usuarioDAO.adicionarUsuario(
                    nome, email, senha, datan, ativo, icone); 
    }

    public List<Usuario> readForDesc(String desc) {
        return usuarioDAO.readForDesc(desc);
    }

    public Usuario readForPk(int pk) {
        return usuarioDAO.readForPk(pk);
    }

    public boolean alterarUsuario(Usuario u) {
        return usuarioDAO.alterarUsuario(u);
    }

    public boolean excluirUsuario(int pkUsuario) {
        return usuarioDAO.excluirUsuario(pkUsuario);
    }
}
