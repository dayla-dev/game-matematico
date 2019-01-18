package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Usuario;

/**
 *
 * @author Dayla
 */
public interface IcoreUsuarioBusiness {
    
    public void Salvar(Usuario usuario);
    public void Editar(Usuario usuario) throws  NonexistentEntityException, Exception ;
    public void Remover(Usuario usuario) throws  NonexistentEntityException;
    
}
