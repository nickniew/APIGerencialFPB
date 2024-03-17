package nickniew.feedplayback.apigerencial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Nickniew
 */
@Entity
@Table(name = "regQuesito")
public class Quesito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nome;
    
    @Lob
    @Column
    private byte[] icone;

    public Quesito(Long id, String nome, byte[] icone) {
        this.id = id;
        this.nome = nome;
        this.icone = icone;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public byte[] getIcone() {
        return icone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIcone(byte[] icone) {
        this.icone = icone;
    }

}
