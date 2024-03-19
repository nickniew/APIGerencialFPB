package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {
    
}
