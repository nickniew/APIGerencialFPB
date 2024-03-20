package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.Cupom;
import nickniew.feedplayback.apigerencial.repository.CupomRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
@org.springframework.stereotype.Service
public class CupomService extends Service<Cupom, Long> {

    private final CupomRepository cupomRepository;

    public CupomService(CupomRepository cupomRepository, JpaRepository<Cupom, Long> repository) {
        super(repository);
        this.cupomRepository = cupomRepository;
    }

}
