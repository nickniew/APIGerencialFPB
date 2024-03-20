package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.QuesitoAvaliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickniew
 */
@Repository
public interface QuesitoAvaliadoRepository extends JpaRepository<QuesitoAvaliado, Long> {
    
}
