package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.IcoreValidacaoDAO;
import br.com.locadoraPBD.model.DAO.ValidacaoDAO;
import br.com.locadoraPBD.model.beans.Usuario;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class ValidacaoBusiness implements IcoreValidacaoBusiness{
    
    IcoreValidacaoDAO validacaoDAO;
    
    public ValidacaoBusiness(){
        this.validacaoDAO=new ValidacaoDAO(Conexao.conexao());                
    }

    @Override
    public List<Usuario> ValidarLogin(String login, String senha) {

        return validacaoDAO.ValidarLogin(login, senha);
    }
    
}
