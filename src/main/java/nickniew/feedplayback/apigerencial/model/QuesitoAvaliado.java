package nickniew.feedplayback.apigerencial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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
