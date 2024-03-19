package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.Quesito;
import nickniew.feedplayback.apigerencial.repository.QuesitoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
public class QuesitoService extends Service<Quesito, Long> {

    private final QuesitoRepository quesitoRepository;

    public QuesitoService(QuesitoRepository quesitoRepository, JpaRepository<Quesito, Long> repository) {
        super(repository);
        this.quesitoRepository = quesitoRepository;
    }

}
