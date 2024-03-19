package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.QuesitoAvaliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface QuesitoAvaliadoRepository extends JpaRepository<QuesitoAvaliado, Long> {
    
}
