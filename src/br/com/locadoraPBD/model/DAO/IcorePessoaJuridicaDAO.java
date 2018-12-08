package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.PessoaJuridica;
import java.util.List;

/*
 * @author Dayla
 */
public interface IcorePessoaJuridicaDAO {
    
    public void Salvar(PessoaJuridica pessoaJuridica);
    public void Editar(PessoaJuridica pessoaJuridica) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;

    public List<PessoaJuridica> getPessoaJuridicaPorCnpj(String cnpj);

    public List<PessoaJuridica> getPessoaFisicaPorInscEstadual(String inscricaoEstadual);

    public PessoaJuridica getPessoaJuridicaPorId(Long id);

    public List<PessoaJuridica> getTodasPessoasJuridicas();
    
}
