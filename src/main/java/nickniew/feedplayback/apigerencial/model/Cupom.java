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
@Table(name = "regCupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuarioId")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "beneficioId")
    private Beneficio beneficio;

    @Column
    private int progresso;

    public Cupom(Long id, Usuario usuario, Beneficio beneficio, int progresso) {
        this.id = id;
        this.usuario = usuario;
        this.beneficio = beneficio;
        this.progresso = progresso;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Beneficio getBeneficio() {
        return beneficio;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }
    
    

}
