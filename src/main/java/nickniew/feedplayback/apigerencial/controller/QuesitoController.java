package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.Quesito;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/quesito")
public class QuesitoController extends Controller<Quesito, Long> {

    public QuesitoController(Service<Quesito, Long> repository) {
        super(repository);
    }

}
