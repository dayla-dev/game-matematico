package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.IcoreVeiculoDAO;
import br.com.locadoraPBD.model.DAO.VeiculoDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Veiculo;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class VeiculoBusiness implements IcoreVeiculoBusiness{
    
    IcoreVeiculoDAO veiculoDAO;
    
    public VeiculoBusiness(){
        veiculoDAO = new VeiculoDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(Veiculo veiculo) {
    
        veiculoDAO.Salvar(veiculo);
    }

    @Override
    public void Editar(Veiculo veiculo) throws NonexistentEntityException, Exception {

        veiculoDAO.Editar(veiculo);
    }

    @Override
    public void Remover(Veiculo veiculo) throws NonexistentEntityException {

        veiculoDAO.Remover(veiculo.getId());
    }

    @Override
    public List<Veiculo> getVeiculoPorModelo(String modelo) {

        
        return veiculoDAO.getVeiculoPorModelo(modelo);
    }

    @Override
    public List<Veiculo> getVeiculoPorFabricante(String fabricante) {

       return veiculoDAO.getVeiculoPorFabricante(fabricante);
    }

    @Override
    public Veiculo getVeiculoPorId(Long id) {

        return veiculoDAO.getVeiculoPorId(id);
    }

    @Override
    public List<Veiculo> getTodosVeiculos() {

        return veiculoDAO.getTodosVeiculos();
    }
    
}
