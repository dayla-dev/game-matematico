package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamioneteCarga;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreCamioneteCarga {
    
    public void Salvar(CamioneteCarga camioneteC);
    public void Editar(CamioneteCarga camioneteC) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;

    public CamioneteCarga getVeiculoPorId(Long id);

    public List<CamioneteCarga> getTodosCamioneteCarga();
    
}
