package nickniew.feedplayback.apigerencial.controller;

import java.util.Optional;
import nickniew.feedplayback.apigerencial.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nickniew
 */
@RestController
@RequestMapping("/api")
public abstract class Controller<T, ID> {

    private final Service<T, ID> servico;

    public Controller(Service<T, ID> repository) {
        this.servico = repository;
    }

    public ResponseEntity<T> create(@RequestBody T entity) {
        T savedEntity = servico.criarRegistro(entity);
        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
    }

    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity) {
        T updatedEntity = servico.atualizarRegistro(id, entity);
        if (updatedEntity != null) {
            return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Void> delete(@PathVariable ID id) {
        servico.excluirRegistro(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<T> getById(@PathVariable ID id) {
        Optional<T> entity = servico.obterPorId(id);
        return entity.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<Iterable<T>> getAll() {
        Iterable<T> entities = servico.obterTodos();
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }

}
