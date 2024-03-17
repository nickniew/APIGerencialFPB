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
@Table(name = "regQuesitoAvaliado")
public class QuesitoAvaliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quesitoId")
    private Quesito quesito;

    @ManyToOne
    @JoinColumn(name = "avaliacaoId")
    private Avaliacao avaliacao;

    @Column
    private int valor;

    public QuesitoAvaliado(Long id, Quesito quesito, Avaliacao avaliacao, int valor) {
        this.id = id;
        this.quesito = quesito;
        this.avaliacao = avaliacao;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public Quesito getQuesito() {
        return quesito;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public int getValor() {
        return valor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuesito(Quesito quesito) {
        this.quesito = quesito;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
