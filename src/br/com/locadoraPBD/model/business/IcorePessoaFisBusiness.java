
package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import java.util.List;

/*
 * @author Dayla
 */
public interface IcorePessoaFisBusiness {
    
    public void Salvar(PessoaFisica pessoaFisica);
    public void Editar(PessoaFisica pessoaFisica) throws  NonexistentEntityException,Exception;
    public void Remover(PessoaFisica pessoaFisica) throws  NonexistentEntityException;
    
    public List<PessoaFisica> getPessoaFisicaPorNome(String nome)throws NonexistentEntityException;
    public List<PessoaFisica> getPessoaFisicaPorCPF(String cpf)throws NonexistentEntityException;    
    public PessoaFisica getPessoaFisicaPorId(Long id)throws NonexistentEntityException;

    public List<PessoaFisica> getTodasPessoaFisica();
    
}
