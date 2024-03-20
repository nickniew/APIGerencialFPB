package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class EstabelecimentoService extends Service<Estabelecimento, Long> {

    private final EstabelecimentoService estabelecimentoRepository;

    public EstabelecimentoService(EstabelecimentoService estabelecimentoRepository, JpaRepository<Estabelecimento, Long> repository) {
        super(repository);
        this.estabelecimentoRepository = estabelecimentoRepository;
    }

}
