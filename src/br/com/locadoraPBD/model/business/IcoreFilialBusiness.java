package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Filial;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreFilialBusiness {
    
    public void Salvar(Filial filial);
    public void Editar(Filial filial) throws  NonexistentEntityException, Exception ;
    public void Remover(Filial filial) throws  NonexistentEntityException;


    public List<Filial> getFilialPorNome(String nome);

    public Filial getFilialPorId(Long id);

    public List<Filial> getTodasFiliais();
    
}
