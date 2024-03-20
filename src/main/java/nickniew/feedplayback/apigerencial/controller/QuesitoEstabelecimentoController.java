package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.QuesitoEstabelecimento;
import nickniew.feedplayback.apigerencial.service.QuesitoEstabelecimentoService;
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
@RequestMapping("/quesitoEstabelecimento")
@RestController
public class QuesitoEstabelecimentoController extends Controller<QuesitoEstabelecimento, Long> {

    public QuesitoEstabelecimentoController(QuesitoEstabelecimentoService quesitoEstabelecimentoService) {
        super(quesitoEstabelecimentoService);
    }
    
    @Override
    @Operation(summary = "Cria novo quesitoEstabelecimento")
    @PostMapping("/create")
    public ResponseEntity<QuesitoEstabelecimento> create(@RequestBody QuesitoEstabelecimento entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza quesitoEstabelecimento existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<QuesitoEstabelecimento> update(@PathVariable Long id, @RequestBody QuesitoEstabelecimento entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta quesitoEstabelecimento por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca quesitoEstabelecimento por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<QuesitoEstabelecimento> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todos quesitosEstabelecimentos")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<QuesitoEstabelecimento>> getAll() {
        return super.getAll();
    }

}
