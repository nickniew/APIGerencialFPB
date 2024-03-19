package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.Beneficio;
import nickniew.feedplayback.apigerencial.repository.BeneficioRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
public class BeneficioService extends Service<Beneficio, Long> {
    
    private final BeneficioRepository beneficioRepository;

    public BeneficioService(BeneficioRepository beneficioRepository, JpaRepository<Beneficio, Long> repository) {
        super(repository);
        this.beneficioRepository = beneficioRepository;
    }
    
}
