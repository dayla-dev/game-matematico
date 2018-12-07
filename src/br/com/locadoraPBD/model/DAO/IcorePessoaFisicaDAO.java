package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcorePessoaFisicaDAO {
    
    public void Salvar(PessoaFisica pessoaFisica);
    public void Editar(PessoaFisica pessoaFisica) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;

    public List<PessoaFisica> getPessoaFisicaPorNome(String nome);

    public List<PessoaFisica> getPessoaFisicaPorCPF(String cpf);

    public PessoaFisica getPessoaFisicaPorId(Long id);

    public List<PessoaFisica> getTodasPessoaFisica();
    
}
