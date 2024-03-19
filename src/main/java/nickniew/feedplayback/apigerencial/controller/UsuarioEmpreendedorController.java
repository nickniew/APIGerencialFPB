package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.UsuarioEmpreendedor;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nickniew
 */
@RequestMapping("/usuarioEmpreendedor")
public class UsuarioEmpreendedorController extends Controller<UsuarioEmpreendedor, Long> {

    public UsuarioEmpreendedorController(Service<UsuarioEmpreendedor, Long> repository) {
        super(repository);
    }

}
