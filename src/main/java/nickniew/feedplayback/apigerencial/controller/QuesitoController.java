package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.Quesito;
import nickniew.feedplayback.apigerencial.service.QuesitoService;
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
@RequestMapping("/quesito")
public class QuesitoController extends Controller<Quesito, Long> {

    public QuesitoController(QuesitoService quesitoService) {
        super(quesitoService);
    }

    @Override
    @Operation(summary = "Cria novo quesito")
    @PostMapping("/create")
    public ResponseEntity<Quesito> create(@RequestBody Quesito entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza quesito existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<Quesito> update(@PathVariable Long id, @RequestBody Quesito entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta quesito por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca quesito por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<Quesito> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos quesitos")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<Quesito>> getAll() {
        return super.getAll();
    }

}
