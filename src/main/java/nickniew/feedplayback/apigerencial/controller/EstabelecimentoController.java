package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.Estabelecimento;
import nickniew.feedplayback.apigerencial.service.EstabelecimentoService;
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
@RequestMapping("/estabelecimento")
public class EstabelecimentoController extends Controller<Estabelecimento, Long> {

    public EstabelecimentoController(EstabelecimentoService estabelecimentoService) {
        super(estabelecimentoService);
    }

    @Override
    @Operation(summary = "Cria novo estabelecimento")
    @PostMapping("/create")
    public ResponseEntity<Estabelecimento> create(@RequestBody Estabelecimento entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza estabelecimento existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<Estabelecimento> update(@PathVariable Long id, @RequestBody Estabelecimento entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta estabelecimento por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca estabelecimento por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<Estabelecimento> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos estabelecimentos")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<Estabelecimento>> getAll() {
        return super.getAll();
    }

}
