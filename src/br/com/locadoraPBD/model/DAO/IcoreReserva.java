
package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Reserva;

/**
 *
 * @author Dayla
 */
public interface IcoreReserva {
    
    public void Salvar(Reserva reserva);
    public void Editar(Reserva reserva) throws  NonexistentEntityException, Exception ;
    public void Remover(Long id) throws  NonexistentEntityException;
    
        public Reserva getReservaPorId(Long id);
    
}
