
package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.IcorePessoaFisicaDAO;
import br.com.locadoraPBD.model.DAO.PessoaFisicaDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class PessoaFisicaBusiness implements IcorePessoaFisBusiness{
    
    IcorePessoaFisicaDAO pessoaFisicaDAO;
    
    public PessoaFisicaBusiness(){
        pessoaFisicaDAO = new PessoaFisicaDAO(Conexao.conexao());
    }
    
    @Override
    public void Salvar(PessoaFisica pessoaFisica) {

        pessoaFisicaDAO.Salvar(pessoaFisica);
    }

    @Override
    public void Editar(PessoaFisica pessoaFisica) throws NonexistentEntityException, Exception {
    
        pessoaFisicaDAO.Editar(pessoaFisica);
    }

    @Override
    public void Remover(PessoaFisica pessoaFisica) throws NonexistentEntityException {
    
        pessoaFisicaDAO.Remover(pessoaFisica.getId());
    }

    @Override
    public List<PessoaFisica> getPessoaFisicaPorNome(String nome) throws NonexistentEntityException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PessoaFisica> getPessoaFisicaPorCPF(String cpf) throws NonexistentEntityException {

        return pessoaFisicaDAO.getPessoaFisicaPorCPF(cpf);
    }

    @Override
    public PessoaFisica getPessoaFisicaPorId(Long id) throws NonexistentEntityException {
    
        return pessoaFisicaDAO.getPessoaFisicaPorId(id);
    }

    @Override
    public List<PessoaFisica> getTodasPessoaFisica() {

        return pessoaFisicaDAO.getTodasPessoaFisica();
    }
    
}
