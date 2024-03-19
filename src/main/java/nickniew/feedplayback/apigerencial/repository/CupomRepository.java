package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface CupomRepository extends JpaRepository<Cupom, Long> {
    
}
