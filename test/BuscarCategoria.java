
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.beans.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class BuscarCategoria {
    
    public static void main(String args[]){
        
        CategoriaDAO categoriaDAO = new CategoriaDAO(Conexao.conexao());
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            categorias = categoriaDAO.getCategoriaPorNomeCat("A1");
            for(int i=0; i<categorias.size(); i++){
                System.out.println("Nome categoria: " + categorias.get(i).getNomeCategoria()+
                                   "\nTipo categoria: " + categorias.get(i).getTipoCategoria()+
                                   "\nPreco: " + categorias.get(i).getPrecoCat());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }        
    }    
}
