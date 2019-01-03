
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.DAO.PessoaDAO;
import br.com.locadoraPBD.model.DAO.PessoaFisicaDAO;
import br.com.locadoraPBD.model.DAO.ReservaDAO;
import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Pessoa;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import br.com.locadoraPBD.model.beans.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class TestePerReserva {

    public static void main(String args[]) {

        ReservaDAO reservaDAO = new ReservaDAO(Conexao.conexao());
        CategoriaDAO categoriaDAO = new CategoriaDAO(Conexao.conexao());
        PessoaDAO pessoaDAO = new PessoaDAO(Conexao.conexao());
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO(Conexao.conexao());

        List<Pessoa> pessoas = new ArrayList<>();
        List<PessoaFisica> pessoasFisicas = new ArrayList<>();
        List<Categoria> categorias = new ArrayList<>();

        Reserva reserva = new Reserva();

        reserva.setDataHrLocacao("12/03/2018 - 14:00");
        reserva.setDataHrReserva("06/12/2018 - 08:00");
        reserva.setStatus("ativada");
        reserva.setValorEntrada(200.00);
        
        pessoas = pessoaDAO.getPessoaPorNome("Cecilia");
        for(int i = 0; i < pessoas.size(); i++){
            reserva.setPessoa(pessoas.get(i));
        }

       pessoasFisicas = pessoaFisicaDAO.getPessoaFisicaPorNome("Cecilia");
       for(int i=0; i<pessoasFisicas.size(); i++){
           reserva.setPessoaFisica(pessoasFisicas.get(i));
       }
       
       categorias = categoriaDAO.getCategoriaPorNomeCat("A3");
       for(int i = 0; i< categorias.size(); i++){
           reserva.setCategoria(categorias.get(i));
       }

       reservaDAO.Salvar(reserva);
        } 
    
    
    }

