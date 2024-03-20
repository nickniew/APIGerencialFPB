package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.QuesitoAvaliado;
import nickniew.feedplayback.apigerencial.service.QuesitoAvaliadoService;
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
@RequestMapping("/quesitoAvaliado")
public class QuesitoAvaliadoController extends Controller<QuesitoAvaliado, Long> {

    public QuesitoAvaliadoController(QuesitoAvaliadoService quesitoAvaliadoService) {
        super(quesitoAvaliadoService);
    }

    @Override
    @Operation(summary = "Cria novo quesitoAvaliado")
    @PostMapping("/create")
    public ResponseEntity<QuesitoAvaliado> create(@RequestBody QuesitoAvaliado entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza quesitoAvaliado existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<QuesitoAvaliado> update(@PathVariable Long id, @RequestBody QuesitoAvaliado entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta quesitoAvaliado por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca quesitoAvaliado por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<QuesitoAvaliado> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos quesitosAvaliados")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<QuesitoAvaliado>> getAll() {
        return super.getAll();
    }

}
