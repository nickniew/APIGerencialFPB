package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.QuesitoAvaliado;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/quesitoAvaliado")
public class QuesitoAvaliadoController extends Controller<QuesitoAvaliado, Long> {

    public QuesitoAvaliadoController(Service<QuesitoAvaliado, Long> repository) {
        super(repository);
    }

}
