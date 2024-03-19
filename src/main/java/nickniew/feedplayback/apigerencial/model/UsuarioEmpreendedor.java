package nickniew.feedplayback.apigerencial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author Nickniew
 */
@Entity
@Table(name = "regUsuarioEmpreendedor")
public class UsuarioEmpreendedor extends Usuario {
    
    private String cnpj;
    
    public UsuarioEmpreendedor(Long id, String email, String login, String senha, String nome, boolean ativo) {
        super(id, email, login, senha, nome, ativo);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
