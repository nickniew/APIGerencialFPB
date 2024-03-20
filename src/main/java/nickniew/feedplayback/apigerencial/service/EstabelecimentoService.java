package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.Estabelecimento;
import nickniew.feedplayback.apigerencial.repository.EstabelecimentoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class EstabelecimentoService extends Service<Estabelecimento, Long> {

    private final EstabelecimentoRepository estabelecimentoRepository;

    public EstabelecimentoService(EstabelecimentoRepository estabelecimentoRepository, JpaRepository<Estabelecimento, Long> repository) {
        super(repository);
        this.estabelecimentoRepository = estabelecimentoRepository;
    }

}
