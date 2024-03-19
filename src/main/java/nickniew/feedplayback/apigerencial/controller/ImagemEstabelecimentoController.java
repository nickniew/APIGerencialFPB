package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.ImagemEstabelecimento;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/imagemEstabelecimento")
public class ImagemEstabelecimentoController extends Controller<ImagemEstabelecimento, Long> {

    public ImagemEstabelecimentoController(Service<ImagemEstabelecimento, Long> repository) {
        super(repository);
    }

}
