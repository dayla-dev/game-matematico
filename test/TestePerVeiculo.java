
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.DAO.VeiculoDAO;
import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Veiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class TestePerVeiculo {
    
    public static void main(String args[]){
        
        VeiculoDAO veiculoDAO = new VeiculoDAO(Conexao.conexao());
        Veiculo veiculo = new Veiculo();
        
        CategoriaDAO categoriaDAO = new CategoriaDAO(Conexao.conexao());
        
        List<Categoria> categorias = new ArrayList<>();
        
        veiculo.setModelo("Audi A4");
        veiculo.setStatus(true);
        veiculo.setNumPassageiros(4);
        veiculo.setNumeroPortas(4);
        veiculo.setAnoFabricacao("2017");
        veiculo.setAnoModelo("2017");
        veiculo.setTamanho("médio");
        veiculo.setPlaca("xxx");
        veiculo.setChassi("xxx");
        veiculo.setMotor("2.0");
        veiculo.setCor("Preto");
        veiculo.setTorqueMotor("xxx");
        veiculo.setTipoCombustivel("Gasolina");
        veiculo.setKmAtual(300.0);
        veiculo.setFabricante("audi");
        veiculo.setArCondicionado(true);
        veiculo.setRadio(true);
        veiculo.setDvd(true);
        veiculo.setMp3(true);
        
        try{
            categorias = categoriaDAO.getCategoriaPorNomeCat("A1");
            for(int i=0; i<categorias.size(); i++){
                veiculo.setCategoria(categorias.get(i));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        } 
        
        veiculoDAO.Salvar(veiculo);
        
    }
    
}
