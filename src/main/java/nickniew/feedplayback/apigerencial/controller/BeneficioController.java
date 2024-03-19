package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.Beneficio;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/beneficio")
public class BeneficioController extends Controller<Beneficio, Long> {

    public BeneficioController(Service<Beneficio, Long> repository) {
        super(repository);
    }

}
