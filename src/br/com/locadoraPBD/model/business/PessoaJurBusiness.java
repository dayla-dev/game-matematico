package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.IcorePessoaJuridicaDAO;
import br.com.locadoraPBD.model.DAO.PessoaJuridicaDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.PessoaJuridica;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class PessoaJurBusiness implements IcorePessoaJurBusiness{
    
    IcorePessoaJuridicaDAO pessoaJurDAO;
    
    public PessoaJurBusiness(){
        this.pessoaJurDAO=new PessoaJuridicaDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(PessoaJuridica pessoaJuridica) {
    
        pessoaJurDAO.Salvar(pessoaJuridica);
        
    }

    @Override
    public void Editar(PessoaJuridica pessoaJuridica) throws NonexistentEntityException, Exception {
    
        pessoaJurDAO.Editar(pessoaJuridica);
        
    }

    @Override
    public void Remover(PessoaJuridica pessoaJuridica) throws NonexistentEntityException {
    
    pessoaJurDAO.Remover(pessoaJuridica.getId());
        
    }
    

    @Override
    public List<PessoaJuridica> getPessoaJuridicaPorCnpj(String cnpj) {
    
        return pessoaJurDAO.getPessoaJuridicaPorCnpj(cnpj);
    }

    @Override
    public List<PessoaJuridica> getPessoaFisicaPorInscEstadual(String inscricaoEstadual) {

        return pessoaJurDAO.getPessoaFisicaPorInscEstadual(inscricaoEstadual);
    }

    @Override
    public PessoaJuridica getPessoaJuridicaPorId(Long id) {
    
        return pessoaJurDAO.getPessoaJuridicaPorId(id);
     }

    @Override
    public List<PessoaJuridica> getTodasPessoasJuridicas() {
    
        return pessoaJurDAO.getTodasPessoasJuridicas();
    }

    
    
    
    
}
