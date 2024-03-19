package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.Estabelecimento;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/estabelecimento")
public class EstabelecimentoController extends Controller<Estabelecimento, Long> {

    public EstabelecimentoController(Service<Estabelecimento, Long> repository) {
        super(repository);
    }

}
