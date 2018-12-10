
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.beans.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class AlterarCategoria {
    
    public static void main(String args[]) throws Exception{
        
        CategoriaDAO categoriaDAO = new CategoriaDAO(Conexao.conexao());
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            
            categorias = categoriaDAO.getCategoriaPorNomeCat("A0");
            for(int i = 0; i<categorias.size(); i++){
                categorias.get(i).setNomeCategoria("A3");
                categorias.get(i).setTipoCategoria("Carros passeio simples");
                categorias.get(i).setPrecoCat(150.00);
                categoriaDAO.Editar(categorias.get(i));
            }            
        }
        catch(Exception e){
            
        }
        }
        
    
}
