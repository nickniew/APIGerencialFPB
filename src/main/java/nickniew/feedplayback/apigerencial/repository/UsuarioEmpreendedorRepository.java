package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.UsuarioEmpreendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickniew
 */
@Repository
public interface UsuarioEmpreendedorRepository extends JpaRepository<UsuarioEmpreendedor, Long> {
    
}
