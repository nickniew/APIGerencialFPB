package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.QuesitoEstabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickniew
 */
@Repository
public interface QuesitoEstabelecimentoRepository extends JpaRepository<QuesitoEstabelecimento, Long> {
    
}
