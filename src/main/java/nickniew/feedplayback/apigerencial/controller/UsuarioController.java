package nickniew.feedplayback.apigerencial.controller;

import nickniew.feedplayback.apigerencial.model.Usuario;
import nickniew.feedplayback.apigerencial.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nickniew
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends Controller<Usuario, Long>{

    public UsuarioController(UsuarioService usuarioService) {
        super(usuarioService);
    }
    
}
