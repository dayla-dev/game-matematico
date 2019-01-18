package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.FilialDAO;
import br.com.locadoraPBD.model.DAO.IcoreFilialDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Filial;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class FilialBusiness implements IcoreFilialBusiness{
    
    IcoreFilialDAO filialDAO;
    
    public FilialBusiness(){
        this.filialDAO = new FilialDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(Filial filial) {
    
        filialDAO.Salvar(filial);
    }

    @Override
    public void Editar(Filial filial) throws NonexistentEntityException, Exception {

        filialDAO.Editar(filial);
    }

    @Override
    public void Remover(Filial filial) throws NonexistentEntityException {
        
        filialDAO.Remover(filial.getId());
    }

    @Override
    public List<Filial> getFilialPorNome(String nome) {
 
        return filialDAO.getFilialPorNome(nome);
    }

    @Override
    public Filial getFilialPorId(Long id) {

        return filialDAO.getFilialPorId(id);
    }

    @Override
    public List<Filial> getTodasFiliais() {

        return filialDAO.getTodasFiliais();
    }
    
    
    
}
