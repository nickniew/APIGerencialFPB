package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
