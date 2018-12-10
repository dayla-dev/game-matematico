
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.beans.Categoria;

/**
 *
 * @author Dayla
 */
public class TestePerCategoria {
    
    public static void main(String args[]){
     
        CategoriaDAO categoriaDAO = new CategoriaDAO(Conexao.conexao());
        
        Categoria categoria = new Categoria();
        categoria.setNomeCategoria("A3");
        categoria.setTipoCategoria("Carros de passeio simples");
        categoria.setPrecoCat(90.00);
        
        categoriaDAO.Salvar(categoria);
        
    }    
}
