package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.QuesitoEstabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface QuesitoEstabelecimentoRepository extends JpaRepository<QuesitoEstabelecimento, Long> {
    
}
