
import br.com.locadoraPBD.model.DAO.EstadoDAO;
import br.com.locadoraPBD.model.beans.Estado;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestePerEstado {
    
    public static void main(String args[]){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraPBD");
        
        EstadoDAO ed = new EstadoDAO(emf);
        
        Estado es = new Estado();
        es.setNome("pernambuco");
        
        
        ed.create(es);
        
    }
    
}
