package dao;

import model.Usuario;
import java.util.List;

/**
 * DAO interface for Usuario — follows Dependency Inversion.
 */
public interface UsuarioDAO {
    Usuario findById(Long id);
    List<Usuario> findAll();
    void save(Usuario usuario);
    void update(Usuario usuario);
    void delete(Long id);
}
