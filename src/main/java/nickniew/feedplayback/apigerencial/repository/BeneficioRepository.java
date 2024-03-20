package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickniew
 */
@Repository
public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {
    
}
