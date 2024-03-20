package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickniew
 */
@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {
    
}
