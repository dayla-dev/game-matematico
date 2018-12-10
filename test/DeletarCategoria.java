
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.beans.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class DeletarCategoria {
    
    public static void main(String args[]){
        
        CategoriaDAO categoriaDAO = new CategoriaDAO(Conexao.conexao());
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            categorias = categoriaDAO.getCategoriaPorNomeCat("A2");
            for(int i=0; i<categorias.size(); i++){
                categoriaDAO.Remover(categorias.get(i).getId());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }        
    }   
    
}
