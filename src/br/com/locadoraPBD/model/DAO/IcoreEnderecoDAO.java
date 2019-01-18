package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Endereco;

/**
 *
 * @author Dayla
 */
public interface IcoreEnderecoDAO {
    
    public void Salvar(Endereco endereco);
    public void Editar(Endereco endereco)  throws  NonexistentEntityException, Exception;
    public void Remover(Long id) throws  NonexistentEntityException;
    
     public Endereco getEnderecoPorId(Long id);
    
}
