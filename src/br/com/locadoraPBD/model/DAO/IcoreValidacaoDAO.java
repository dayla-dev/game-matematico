package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.beans.Usuario;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreValidacaoDAO {
    
    public List<Usuario> ValidarLogin(String login, String senha);
    
}
