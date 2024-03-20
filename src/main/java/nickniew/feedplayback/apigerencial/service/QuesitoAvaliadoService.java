package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.QuesitoAvaliado;
import nickniew.feedplayback.apigerencial.repository.QuesitoAvaliadoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class QuesitoAvaliadoService extends Service<QuesitoAvaliado, Long> {

    private final QuesitoAvaliadoRepository quesitoAvaliadoRepository;

    public QuesitoAvaliadoService(QuesitoAvaliadoRepository quesitoAvaliadoRepository, JpaRepository<QuesitoAvaliado, Long> repository) {
        super(repository);
        this.quesitoAvaliadoRepository = quesitoAvaliadoRepository;
    }

}
