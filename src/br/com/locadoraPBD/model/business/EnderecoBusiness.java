package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.DAO.IcoreEnderecoDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Endereco;

/**
 *
 * @author Dayla
 */
public class EnderecoBusiness implements IcoreEnderecoBusiness{
    
    IcoreEnderecoDAO enderecoDAO;
    
    public EnderecoBusiness(){
        enderecoDAO = new EnderecoDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(Endereco endereco) {

        enderecoDAO.Salvar(endereco);
    }

    @Override
    public void Editar(Endereco endereco) throws NonexistentEntityException, Exception {

        enderecoDAO.Editar(endereco);
    }

    @Override
    public void Remover(Long id) throws NonexistentEntityException {

        enderecoDAO.Remover(id);
    }

    @Override
    public Endereco getEnderecoPorId(Long id) {

        return enderecoDAO.getEnderecoPorId(id);
    }    
}
