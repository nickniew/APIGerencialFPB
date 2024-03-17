package nickniew.feedplayback.apigerencial.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
