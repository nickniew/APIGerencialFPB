package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.QuesitoEstabelecimento;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/quesitoEstabelecimento")
public class QuesitoEstabelecimentoController extends Controller<QuesitoEstabelecimento, Long> {

    public QuesitoEstabelecimentoController(Service<QuesitoEstabelecimento, Long> repository) {
        super(repository);
    }

}
