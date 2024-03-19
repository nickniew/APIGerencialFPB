package nickniew.feedplayback.apigerencial.repository;

import nickniew.feedplayback.apigerencial.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Nickniew
 */
@NoRepositoryBean
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
    
}
