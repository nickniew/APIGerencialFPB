package nickniew.feedplayback.apigerencial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

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
