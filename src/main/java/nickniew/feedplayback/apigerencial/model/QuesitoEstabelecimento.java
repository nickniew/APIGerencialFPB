package nickniew.feedplayback.apigerencial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Nickniew
 */
@Entity
@Table(name = "regQuesitosEstabelecimento")
public class QuesitoEstabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quesitoId")
    private Quesito quesito;

    @ManyToOne
    @JoinColumn(name = "estabelecimentoId")
    private Estabelecimento estabelecimento;

    @Column
    private boolean ativo;

    public QuesitoEstabelecimento(Long id, Quesito quesito, Estabelecimento estabelecimento, boolean ativo) {
        this.id = id;
        this.quesito = quesito;
        this.estabelecimento = estabelecimento;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public Quesito getQuesito() {
        return quesito;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuesito(Quesito quesito) {
        this.quesito = quesito;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
