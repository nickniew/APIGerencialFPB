package nickniew.feedplayback.apigerencial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Nickniew
 */
@Entity
@Table(name = "regImagemEstabelecimento")
public class ImagemEstabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] dados;

    @ManyToOne
    @JoinColumn(name = "estabelecimentoId")
    private Estabelecimento estabelecimento;

    public ImagemEstabelecimento(Long id, byte[] dados, Estabelecimento estabelecimento) {
        this.id = id;
        this.dados = dados;
        this.estabelecimento = estabelecimento;
    }

    public Long getId() {
        return id;
    }

    public byte[] getDados() {
        return dados;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDados(byte[] dados) {
        this.dados = dados;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

}
