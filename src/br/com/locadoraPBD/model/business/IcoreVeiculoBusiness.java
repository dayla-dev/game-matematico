package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Veiculo;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreVeiculoBusiness {
    
    public void Salvar(Veiculo veiculo);
    public void Editar(Veiculo veiculo) throws  NonexistentEntityException, Exception ;
    public void Remover(Veiculo veiculo) throws  NonexistentEntityException;

    public List<Veiculo> getVeiculoPorModelo(String modelo);

    public List<Veiculo> getVeiculoPorFabricante(String fabricante);

    public Veiculo getVeiculoPorId(Long id);

    public List<Veiculo> getTodosVeiculos();
    
}
