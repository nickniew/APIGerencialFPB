package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickniew
 */
@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long>{
    
}
