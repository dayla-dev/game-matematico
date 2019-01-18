package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Categoria;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreCategoriaBusiness {
    
    
    public void Salvar(Categoria categoria);
    public void Editar(Categoria categoria) throws  NonexistentEntityException, Exception ;
    public void Remover(Categoria categoria) throws  NonexistentEntityException;

    public List<Categoria> getCategoriaPorNomeCat(String nomeCategoria);

    public List<Categoria> getCategoriaPorTipo(String tipoCategoria);

    public Categoria getPessoaCategoriaPorId(Long id);
    
    public List<Categoria> getTodasCategorias();
}
