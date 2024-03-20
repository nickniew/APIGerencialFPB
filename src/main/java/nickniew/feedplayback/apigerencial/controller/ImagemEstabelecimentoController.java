package nickniew.feedplayback.apigerencial.controller;

import io.swagger.v3.oas.annotations.Operation;
import nickniew.feedplayback.apigerencial.model.ImagemEstabelecimento;
import nickniew.feedplayback.apigerencial.service.ImagemEstabelecimentoService;
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
@RequestMapping("/imagemEstabelecimento")
public class ImagemEstabelecimentoController extends Controller<ImagemEstabelecimento, Long> {

    public ImagemEstabelecimentoController(ImagemEstabelecimentoService imagemEstabelecimentoService) {
        super(imagemEstabelecimentoService);
    }

    @Override
    @Operation(summary = "Cria nova imagemEstabelecimento")
    @PostMapping("/create")
    public ResponseEntity<ImagemEstabelecimento> create(@RequestBody ImagemEstabelecimento entity) {
        return super.create(entity);
    }

    @Override
    @Operation(summary = "Atualiza imagemEstabelecimento existente")
    @PutMapping("/update/{id}")
    public ResponseEntity<ImagemEstabelecimento> update(@PathVariable Long id, @RequestBody ImagemEstabelecimento entity) {
        return super.update(id, entity);
    }

    @Override
    @Operation(summary = "Deleta imagemEstabelecimento por ID")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return super.delete(id);
    }

    @Override
    @Operation(summary = "Busca imagemEstabelecimento por ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<ImagemEstabelecimento> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @Operation(summary = "Busca todas imagensEstabelecimentos")
    @GetMapping("/getall")
    public ResponseEntity<Iterable<ImagemEstabelecimento>> getAll() {
        return super.getAll();
    }

}
