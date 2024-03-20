package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.UsuarioEmpreendedor;
import nickniew.feedplayback.apigerencial.service.UsuarioEmpreendedorService;
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
@RequestMapping("/usuarioEmpreendedor")
public class UsuarioEmpreendedorController extends Controller<UsuarioEmpreendedor, Long> {

    public UsuarioEmpreendedorController(UsuarioEmpreendedorService usuarioEmpreendedorService) {
        super(usuarioEmpreendedorService);
    }

    @Override
    @Operation(summary = "Cria novo usuarioEmpreendedor")
    @PostMapping("/create")
    public ResponseEntity<UsuarioEmpreendedor> create(@RequestBody UsuarioEmpreendedor entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza usuarioEmpreendedor existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<UsuarioEmpreendedor> update(@PathVariable Long id, @RequestBody UsuarioEmpreendedor entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta usuarioEmpreendedor por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca usuarioEmpreendedor por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<UsuarioEmpreendedor> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos usuariosEmpreendedores")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<UsuarioEmpreendedor>> getAll() {
        return super.getAll();
    }

}
