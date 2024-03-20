package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.QuesitoEstabelecimento;
import nickniew.feedplayback.apigerencial.repository.QuesitoEstabelecimentoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class QuesitoEstabelecimentoService extends Service<QuesitoEstabelecimento, Long> {

    private final QuesitoEstabelecimentoRepository quesitoEstabelecimentoRepository;

    public QuesitoEstabelecimentoService(QuesitoEstabelecimentoRepository quesitoEstabelecimentoRepository, JpaRepository<QuesitoEstabelecimento, Long> repository) {
        super(repository);
        this.quesitoEstabelecimentoRepository = quesitoEstabelecimentoRepository;
    }

}
