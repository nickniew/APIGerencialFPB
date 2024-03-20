package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.UsuarioEmpreendedor;
import nickniew.feedplayback.apigerencial.repository.UsuarioEmpreendedorRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class UsuarioEmpreendedorService extends Service<UsuarioEmpreendedor, Long> {

    private final UsuarioEmpreendedorRepository usuarioEmpreendedorRepository;

    public UsuarioEmpreendedorService(UsuarioEmpreendedorRepository usuarioEmpreendedorRepository, JpaRepository<UsuarioEmpreendedor, Long> repository) {
        super(repository);
        this.usuarioEmpreendedorRepository = usuarioEmpreendedorRepository;
    }

}
