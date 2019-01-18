package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CamionetePassageirosDAO;
import br.com.locadoraPBD.model.DAO.IcoreCamionetePassageiro;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamionetePassageiros;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class CamionetePassageiroBusiness implements IcoreCamionetePassBusiness{
    
    IcoreCamionetePassageiro camionetePassaDAO; 
    
    public CamionetePassageiroBusiness(){
        camionetePassaDAO = new CamionetePassageirosDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(CamionetePassageiros camionetePassageiros) {
 
        camionetePassaDAO.Salvar(camionetePassageiros);
    }

    @Override
    public void Editar(CamionetePassageiros camionetePassageiros) throws NonexistentEntityException, Exception {

        camionetePassaDAO.Editar(camionetePassageiros);
    }

    @Override
    public void Remover(CamionetePassageiros camionetePassageiros) throws NonexistentEntityException {

        camionetePassaDAO.Remover(camionetePassageiros.getId());
    }

    @Override
    public CamionetePassageiros getCamionetePassagPorId(Long id) {

        return camionetePassaDAO.getCamionetePassagPorId(id);
    }

    @Override
    public List<CamionetePassageiros> getTodosCamionetePassageiros() {


        return camionetePassaDAO.getTodosCamionetePassageiros();
    }
    
}
