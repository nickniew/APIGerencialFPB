package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.ImagemEstabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface ImagemEstabelecimentoRepository extends JpaRepository<ImagemEstabelecimento, Long> {
    
}
