package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.Avaliacao;
import nickniew.feedplayback.apigerencial.repository.AvaliacaoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class AvaliacaoService extends Service<Avaliacao, Long> {

    private final AvaliacaoRepository avaliacaoRepository;

    public AvaliacaoService(AvaliacaoRepository avaliacaoRepository, JpaRepository<Avaliacao, Long> repository) {
        super(repository);
        this.avaliacaoRepository = avaliacaoRepository;
    }

}
