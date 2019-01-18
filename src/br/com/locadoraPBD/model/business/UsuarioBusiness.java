package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.IcoreUsuarioDAO;
import br.com.locadoraPBD.model.DAO.UsuarioDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Usuario;

/**
 *
 * @author Dayla
 */
public class UsuarioBusiness implements IcoreUsuarioBusiness{
    
    IcoreUsuarioDAO usuarioDAO;
    
    public UsuarioBusiness(){
        usuarioDAO = new UsuarioDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(Usuario usuario) {

        usuarioDAO.Salvar(usuario);
    }

    @Override
    public void Editar(Usuario usuario) throws NonexistentEntityException, Exception {

        usuarioDAO.Editar(usuario);
    }

    @Override
    public void Remover(Usuario usuario) throws NonexistentEntityException {

        usuarioDAO.Remover(usuario.getId());
    }
    
}
