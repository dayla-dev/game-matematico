package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.beans.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author Dayla
 */
public class ValidacaoDAO {
    
    private EntityManagerFactory emf = null;
    
    public ValidacaoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
     public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     
    public List<Usuario> ValidarLogin(String login){
           EntityManager em = getEntityManager();
    try{
        List<Usuario> usuarios = null;
        String consulta = "select u from Usuario u where u.login = :login";
        TypedQuery<Usuario> query = em.createQuery(consulta,Usuario.class);
        query.setParameter("login", login);
        usuarios = query.getResultList();
        
        return usuarios;
        
    }finally{
          em.close();
    }
          
      }
    
}
