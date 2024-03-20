package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.Usuario;
import nickniew.feedplayback.apigerencial.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nickniew
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController extends Controller<Usuario, Long>{

    public UsuarioController(UsuarioService usuarioService) {
        super(usuarioService);
    }
    
    @Override
    @Operation(summary = "Cria novo usuario")
    @PostMapping("/create")
    public ResponseEntity<Usuario> create(@RequestBody Usuario entity) {
        return super.create(entity);
    }
    
    @Override
    @Operation(summary = "Atualiza usuario existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta usuario por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca usuario por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos usuarios")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<Usuario>> getAll() {
        return super.getAll();
    }
}
