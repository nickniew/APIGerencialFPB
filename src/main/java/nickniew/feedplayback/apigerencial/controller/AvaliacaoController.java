package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.Avaliacao;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/avaliacao")
public class AvaliacaoController extends Controller<Avaliacao, Long> {

    public AvaliacaoController(Service<Avaliacao, Long> repository) {
        super(repository);
    }

}
