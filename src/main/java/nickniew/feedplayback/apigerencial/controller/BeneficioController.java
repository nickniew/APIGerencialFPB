package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.Beneficio;
import nickniew.feedplayback.apigerencial.service.BeneficioService;
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
@RequestMapping("/beneficio")
public class BeneficioController extends Controller<Beneficio, Long> {

    public BeneficioController(BeneficioService beneficioService) {
        super(beneficioService);
    }

    @Override
    @Operation(summary = "Cria novo beneficio")
    @PostMapping("/create")
    public ResponseEntity<Beneficio> create(@RequestBody Beneficio entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza beneficio existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<Beneficio> update(@PathVariable Long id, @RequestBody Beneficio entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta beneficio por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca beneficio por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<Beneficio> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos beneficios")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<Beneficio>> getAll() {
        return super.getAll();
    }
}
