package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Pessoa;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcorePessoaDAO {
    
    public void salvar(Pessoa pessoa);
    public void editar(Pessoa pessoa) throws NonexistentEntityException, Exception;
    public void remover(Long id)  throws NonexistentEntityException;
    public List<Pessoa> getPessoaPorNome(String nome);
    public Pessoa getPessoaId(Long id);
    public List<Pessoa> getTodasPessoas();
}
