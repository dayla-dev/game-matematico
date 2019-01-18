package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.beans.Usuario;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreValidacaoBusiness {
    
    public List<Usuario> ValidarLogin(String login, String senha);
    
}
