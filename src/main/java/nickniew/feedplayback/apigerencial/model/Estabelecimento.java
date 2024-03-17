package nickniew.feedplayback.apigerencial.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Nickniew
 */
@Entity
@Table(name = "regEstabelecimento")
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "proprietarioId")
    private UsuarioEmpreendedor proprietario;

    @Column
    private String descricao;

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<ImagemEstabelecimento> imagens;
    
    @OneToMany
    private List<Quesito> quesitos;

    public Estabelecimento(Long id, UsuarioEmpreendedor proprietario, String descricao, List<ImagemEstabelecimento> imagens, List<Quesito> quesitos) {
        this.id = id;
        this.proprietario = proprietario;
        this.descricao = descricao;
        this.imagens = imagens;
        this.quesitos = quesitos;
    }

    public Long getId() {
        return id;
    }

    public UsuarioEmpreendedor getProprietario() {
        return proprietario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProprietario(UsuarioEmpreendedor proprietario) {
        this.proprietario = proprietario;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ImagemEstabelecimento> getImagens() {
        return imagens;
    }

    public void setImagens(List<ImagemEstabelecimento> imagens) {
        this.imagens = imagens;
    }

    public List<Quesito> getQuesitos() {
        return quesitos;
    }

    public void setQuesitos(List<Quesito> quesitos) {
        this.quesitos = quesitos;
    }

}
