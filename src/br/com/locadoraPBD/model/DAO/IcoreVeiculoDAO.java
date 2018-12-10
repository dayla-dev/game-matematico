package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Veiculo;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreVeiculoDAO {
    
    public void Salvar(Veiculo veiculo);
    public void Editar(Veiculo veiculo) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;

    public List<Veiculo> getVeiculoPorModelo(String modelo);

    public List<Veiculo> getVeiculoPorFabricante(String fabricante);

    public Veiculo getVeiculoPorId(Long id);

    public List<Veiculo> getTodosVeiculos();
    
}
