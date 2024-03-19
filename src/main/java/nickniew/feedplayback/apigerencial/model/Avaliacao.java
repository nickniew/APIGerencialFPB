package nickniew.feedplayback.apigerencial.model;

import java.security.Timestamp;
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
@Table(name = "regAvaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "usuarioId")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "estabelecimentoId")
    private Estabelecimento estabelecimento;
    
    @Column
    private Double mediaGera;
    
    @Column
    private String descricao;
    
    @Column
    private Timestamp momento;

    public Avaliacao(Long id, Usuario usuario, Double mediaGera, String descricao, Timestamp momento) {
        this.id = id;
        this.usuario = usuario;
        this.mediaGera = mediaGera;
        this.descricao = descricao;
        this.momento = momento;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Double getMediaGera() {
        return mediaGera;
    }

    public String getDescricao() {
        return descricao;
    }

    public Timestamp getMomento() {
        return momento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setMediaGera(Double mediaGera) {
        this.mediaGera = mediaGera;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMomento(Timestamp momento) {
        this.momento = momento;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
}
