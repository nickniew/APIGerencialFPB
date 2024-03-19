package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Quesito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface QuesitoRepository extends JpaRepository<Quesito, Long> {
    
}
