package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Usuario;

/**
 *
 * @author Dayla
 */
public interface IcoreUsuarioDAO {
    
    public void Salvar(Usuario usuario);
    public void Editar(Usuario usuario) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;
    
}
