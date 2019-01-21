package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.IcorePessoaDAO;
import br.com.locadoraPBD.model.DAO.PessoaDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Pessoa;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class PessoaBusiness implements IcorePessoaBusiness{
    
    IcorePessoaDAO pessoaDAO;
    
    public PessoaBusiness(){
        pessoaDAO = new PessoaDAO(Conexao.conexao());
    }

    @Override
    public void salvar(Pessoa pessoa) {

        pessoaDAO.salvar(pessoa);
    }

    @Override
    public void editar(Pessoa pessoa) throws NonexistentEntityException, Exception {

        pessoaDAO.editar(pessoa);
    }

    @Override
    public void remover(Long id) throws NonexistentEntityException {

        pessoaDAO.remover(id);
    }

    @Override
    public List<Pessoa> getPessoaPorNome(String nome) {
    
        return pessoaDAO.getPessoaPorNome(nome);
    }

    @Override
    public Pessoa getPessoaId(Long id) {

        return pessoaDAO.getPessoaId(id);
    }

    @Override
    public List<Pessoa> getTodasPessoas() {
    
        return pessoaDAO.getTodasPessoas();
    }
    
    
    
}
