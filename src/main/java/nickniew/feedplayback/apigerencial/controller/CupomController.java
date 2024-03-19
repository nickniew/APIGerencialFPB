package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.Cupom;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/cupom")
public class CupomController extends Controller<Cupom, Long> {

    public CupomController(Service<Cupom, Long> repository) {
        super(repository);
    }

}
