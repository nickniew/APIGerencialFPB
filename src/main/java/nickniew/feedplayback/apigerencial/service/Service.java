package nickniew.feedplayback.apigerencial.service;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public abstract class Service<T, ID> {

    private final JpaRepository<T, ID> repository;

    public Service(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    public T criarRegistro(T entity) {
        return repository.save(entity);
    }

    public T atualizarRegistro(ID id, T entity) {
        if (repository.existsById(id)) {
            return repository.save(entity);
        }
        throw new IllegalArgumentException("O registro ja existe!");
    }

    public void excluirRegistro(ID id) {
        repository.deleteById(id);
    }

    public Optional<T> obterPorId(ID id) {
        return repository.findById(id);
    }

    public Iterable<T> obterTodos() {
        return repository.findAll();
    }
}
