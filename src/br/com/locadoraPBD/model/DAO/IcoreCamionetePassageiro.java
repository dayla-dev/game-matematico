package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamionetePassageiros;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreCamionetePassageiro {
    
    public void Salvar(CamionetePassageiros camionetePassageiros);
    public void Editar(CamionetePassageiros camionetePassageiros) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;

    public CamionetePassageiros getCamionetePassagPorId(Long id);

    public List<CamionetePassageiros> getTodosCamionetePassageiros();
    
}
