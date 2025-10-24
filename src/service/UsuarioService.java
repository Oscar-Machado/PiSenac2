package service;

import dao.UsuarioDAO;
import model.Usuario;

import java.util.List;

/**
 * Service layer — business rules; single responsibility separate from persistence and UI.
 */
public class UsuarioService {
    private final UsuarioDAO usuarioDAO;

    public UsuarioService(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public Usuario criarUsuario(String nome, String email) {
        Usuario u = new Usuario(null, nome, email);
        if (!u.isEmailValid()) throw new IllegalArgumentException("Email inválido");
        usuarioDAO.save(u);
        return u;
    }

    public List<Usuario> listarTodos() {
        return usuarioDAO.findAll();
    }

    public void remover(Long id) {
        usuarioDAO.delete(id);
    }
}
