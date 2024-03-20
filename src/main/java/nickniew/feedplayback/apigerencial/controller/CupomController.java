package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.Cupom;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Override
    @Operation(summary = "Cria novo cupom")
    @PostMapping("/create")
    public ResponseEntity<Cupom> create(@RequestBody Cupom entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza cupom existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<Cupom> update(@PathVariable Long id, @RequestBody Cupom entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta cupom por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca cupom por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<Cupom> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos cupons")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<Cupom>> getAll() {
        return super.getAll();
    }

}
