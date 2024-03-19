package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.UsuarioEmpreendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface UsuarioEmpreendedorRepository extends JpaRepository<UsuarioEmpreendedor, Long> {
    
}
