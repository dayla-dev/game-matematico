
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.beans.Categoria;

/*
 * @author Dayla
 */
public class TestePerCategoria {
    
    public static void main(String args[]){
        
        CategoriaDAO categoriaDAO =  new CategoriaDAO(Conexao.conexao());
        
        Categoria c1 = new Categoria("c1", "carro passeio simples", 4, true, true, true, true);
        categoriaDAO.create(c1);
        
    }
    
}
