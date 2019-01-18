/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamioneteCarga;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreCamioneteCargaBusiness {
    
    public void Salvar(CamioneteCarga camioneteC);
    public void Editar(CamioneteCarga camioneteC) throws  NonexistentEntityException, Exception ;
    public void Remover(CamioneteCarga camioneteC) throws  NonexistentEntityException;

    public CamioneteCarga getCamioneteCargaPorId(Long id);

    public List<CamioneteCarga> getTodosCamioneteCarga();
    
}
