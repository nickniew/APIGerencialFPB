package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.Avaliacao;
import nickniew.feedplayback.apigerencial.service.AvaliacaoService;
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
@RequestMapping("/avaliacao")
public class AvaliacaoController extends Controller<Avaliacao, Long> {

    public AvaliacaoController(AvaliacaoService avaliacaoService) {
        super(avaliacaoService);
    }

    @Override
    @Operation(summary = "Cria nova avaliacao")
    @PostMapping("/create")
    public ResponseEntity<Avaliacao> create(@RequestBody Avaliacao entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza avaliacao existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<Avaliacao> update(@PathVariable Long id, @RequestBody Avaliacao entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta avaliacao por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca avaliacao por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<Avaliacao> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todas avaliacoes")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<Avaliacao>> getAll() {
        return super.getAll();
    }

}
