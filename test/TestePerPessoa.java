
import br.com.locadoraPBD.model.DAO.PessoaDAO;
import br.com.locadoraPBD.model.beans.Pessoa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestePerPessoa {
  
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraPBDPU");
//        EntityManager em = emf.createEntityManager();
        
        PessoaDAO pessoaDAO = new PessoaDAO(emf);
        Pessoa p1 = new Pessoa();
        p1.setNome("Vanessa");
        
//       
        pessoaDAO.create(p1);               //Adicionar

        Pessoa p2 = new Pessoa();
        p2 = pessoaDAO.findPessoa(new Long(1)); // Buscar
        System.out.println(p1.toString());
        
        p1.setNome("Joaquina");
        pessoaDAO.edit(p1);
        
         System.out.println(p1.toString());
         
         pessoaDAO.destroy(p1.getId());
   }
        
//        em.getTransaction().begin(); //abre a transação com BD
//        em.persist(p);  //diz ao framework o que vai ser feito: o que vai ser feito
//        em.getTransaction().commit();//framework executa
    
    
    }

