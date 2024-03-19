package nickniew.feedplayback.apigerencial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author Nickniew
 */
@Entity
@Table(name = "regBeneficio")
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private enum TipoBeneficio {
        CUPOM,
        VOUCHER
    }
    
    @Column
    private TipoBeneficio tipoBeneficio = TipoBeneficio.CUPOM;

    @ManyToOne
    @JoinColumn(name = "estabelecimentoId")
    private Estabelecimento estabelecimento;

    @Column
    private int quantAvaliacoes;

    @Column
    private int desconto;

    public Beneficio(Long id, Estabelecimento estabelecimento, int quantAvaliacoes, int desconto) {
        this.id = id;
        this.estabelecimento = estabelecimento;
        this.quantAvaliacoes = quantAvaliacoes;
        this.desconto = desconto;
    }
    

    public Long getId() {
        return id;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public int getQuantAvaliacoes() {
        return quantAvaliacoes;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public void setQuantAvaliacoes(int quantAvaliacoes) {
        this.quantAvaliacoes = quantAvaliacoes;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
        if (desconto == 100){
            this.tipoBeneficio = TipoBeneficio.VOUCHER;
        }
    }

    public TipoBeneficio getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(TipoBeneficio tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }
    

}
