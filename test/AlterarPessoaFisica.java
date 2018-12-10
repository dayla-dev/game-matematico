
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.PessoaDAO;
import br.com.locadoraPBD.model.DAO.PessoaFisicaDAO;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Dayla
 */
public class AlterarPessoaFisica {
    
    public static void main(String args[]) throws Exception{
        
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO(Conexao.conexao());
        
        List<PessoaFisica> pessoasFisicas = new ArrayList<>();
        
        try{
            
            pessoasFisicas = pessoaFisicaDAO.getPessoaFisicaPorNome("Dayla");
            for(int i = 0; i<pessoasFisicas.size(); i++){
                pessoasFisicas.get(i).setNome("Day");
                pessoaFisicaDAO.Editar(pessoasFisicas.get(i));
            }            
        }
        catch(Exception e){
            
        }
        }
        
        
        
    }
    

