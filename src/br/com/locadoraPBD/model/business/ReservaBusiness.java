package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.IcoreReserva;
import br.com.locadoraPBD.model.DAO.ReservaDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Reserva;

/**
 *
 * @author Dayla
 */
public class ReservaBusiness implements IcoreReservaBusiness{
    
    IcoreReserva reservaDAO;
    
    public ReservaBusiness(){
        reservaDAO = new ReservaDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(Reserva reserva) {

        reservaDAO.Salvar(reserva);
    }

    @Override
    public void Editar(Reserva reserva) throws NonexistentEntityException, Exception {

        reservaDAO.Editar(reserva);
    }

    @Override
    public void Remover(Reserva reserva) throws NonexistentEntityException {

        reservaDAO.Remover(reserva.getId());
    }

    @Override
    public Reserva getReservaPorId(Long id) {

        return reservaDAO.getReservaPorId(id);
    }
    
}
