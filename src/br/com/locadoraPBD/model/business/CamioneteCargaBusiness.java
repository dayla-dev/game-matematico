package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CamioneteCargaDAO;
import br.com.locadoraPBD.model.DAO.IcoreCamioneteCarga;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamioneteCarga;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class CamioneteCargaBusiness implements IcoreCamioneteCargaBusiness{
    
    IcoreCamioneteCarga camioneteCargaDAO;
    
    public CamioneteCargaBusiness(){
        camioneteCargaDAO = new CamioneteCargaDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(CamioneteCarga camioneteC) {

        camioneteCargaDAO.Salvar(camioneteC);
    }

    @Override
    public void Editar(CamioneteCarga camioneteC) throws NonexistentEntityException, Exception {

        camioneteCargaDAO.Editar(camioneteC);
    }

    @Override
    public void Remover(CamioneteCarga camioneteC) throws NonexistentEntityException {

        camioneteCargaDAO.Remover(camioneteC.getId());
    }

    @Override
    public CamioneteCarga getCamioneteCargaPorId(Long id) {

       return camioneteCargaDAO.getCamioneteCargaPorId(id);
    }

    @Override
    public List<CamioneteCarga> getTodosCamioneteCarga() {

       return camioneteCargaDAO.getTodosCamioneteCarga();
    } 
    
}
