
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.VeiculoDAO;
import br.com.locadoraPBD.model.beans.Veiculo;

/*
 * @author Dayla
 */
public class PerVeiculo {
    
    public static void main(String args[]){
        
        VeiculoDAO veiculoDAO = new VeiculoDAO(Conexao.conexao());
        
        Veiculo veiculo = new Veiculo("Renault", "a1", 4, "1.0", "70");
        
        veiculoDAO.create(veiculo);
    }
    
}
