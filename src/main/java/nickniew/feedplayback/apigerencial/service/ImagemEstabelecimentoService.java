package nickniew.feedplayback.apigerencial.service;

import nickniew.feedplayback.apigerencial.model.ImagemEstabelecimento;
import nickniew.feedplayback.apigerencial.repository.ImagemEstabelecimentoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nickniew
 */
public class ImagemEstabelecimentoService extends Service<ImagemEstabelecimento, Long> {

    private final ImagemEstabelecimentoRepository imagemEstabelecimentoRepository;

    public ImagemEstabelecimentoService(ImagemEstabelecimentoRepository imagemEstabelecimentoRepository, JpaRepository<ImagemEstabelecimento, Long> repository) {
        super(repository);
        this.imagemEstabelecimentoRepository = imagemEstabelecimentoRepository;
    }

}
