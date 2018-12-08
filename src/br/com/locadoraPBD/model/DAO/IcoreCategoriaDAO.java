package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Categoria;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreCategoriaDAO {
    
    public void Salvar(Categoria categoria);
    public void Editar(Categoria categoria) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;

    public List<Categoria> getCategoriaPorNomeCat(String nomeCategoria);

    public List<Categoria> getCategoriaPorTipo(String tipoCategoria);

    public Categoria getPessoaCategoriaPorId(Long id);

    public List<Categoria> getTodasCategorias();
    
}
