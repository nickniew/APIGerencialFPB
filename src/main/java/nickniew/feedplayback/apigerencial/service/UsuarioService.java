package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.Usuario;
import nickniew.feedplayback.apigerencial.repository.UsuarioRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class UsuarioService extends Service<Usuario, Long> {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository, JpaRepository<Usuario, Long> repository) {
        super(repository);
        this.usuarioRepository = usuarioRepository;
    }

}
