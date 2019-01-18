package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Reserva;

/**
 *
 * @author Dayla
 */
public interface IcoreReservaBusiness {
    
    public void Salvar(Reserva reserva);
    public void Editar(Reserva reserva) throws  NonexistentEntityException, Exception ;
    public void Remover(Reserva reserva) throws  NonexistentEntityException;
    
    public Reserva getReservaPorId(Long id);
    
}
