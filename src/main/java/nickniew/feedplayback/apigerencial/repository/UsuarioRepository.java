package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickniew
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
