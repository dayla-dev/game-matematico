
package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Categoria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Dayla
 */
public class CategoriaDAO implements IcoreCategoriaDAO, Serializable {
    
     private EntityManagerFactory emf = null;

    public CategoriaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
   
    @Override
    public void Salvar(Categoria categoria) {
     EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }    
    }

    @Override
    public void Editar(Categoria categoria) throws NonexistentEntityException, Exception {
    EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            categoria = em.merge(categoria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = categoria.getId();
                if (getPessoaCategoriaPorId(id) == null) {
                    throw new NonexistentEntityException("The categoria with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }    
    }

    @Override
    public void Remover(Long id) throws NonexistentEntityException {
    EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Categoria categoria;
            try {
                categoria = em.getReference(Categoria.class, id);
                categoria.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The categoria with id " + id + " no longer exists.", enfe);
            }
            em.remove(categoria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }       
    }

    @Override
    public List<Categoria> getCategoriaPorNomeCat(String nomeCategoria) {
        EntityManager em = getEntityManager();
        List<Categoria> categorias = null;
        
        try{
            String consulta = "select c from Categoria c where c.nomeCategoria like :nomeCategoria";
            TypedQuery<Categoria> query = em.createQuery(consulta, Categoria.class);
            query.setParameter("nomeCategoria", "%" + nomeCategoria + "%");
            categorias = query.getResultList();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            em.close();                    
        }
        
        return categorias;     
        
    }

    @Override
    public List<Categoria> getCategoriaPorTipo(String tipoCategoria) {
    EntityManager em = getEntityManager();
        List<Categoria> categorias = null;
        
        try{
            String consulta = "select c from Categoria c where c.tipoCategoria like :tipoCategoria";
            TypedQuery<Categoria> query = em.createQuery(consulta, Categoria.class);
            query.setParameter("tipoCategoria", "%" + tipoCategoria + "%");
            categorias = query.getResultList();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            em.close();                    
        }
        
        return categorias;  
        
    }

    @Override
    public Categoria getPessoaCategoriaPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Categoria.class, id);
        } finally {
            em.close();
        }  
    }
    
    public List<Categoria> getTodasCategorias() {
        return getTodasCategorias(true, -1, -1);
    }

    public List<Categoria> getTodasCategorias(int maxResults, int firstResult) {
        return getTodasCategorias(false, maxResults, firstResult);
    }

    private List<Categoria> getTodasCategorias(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Categoria.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
    
    public int getCategoriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Categoria> rt = cq.from(Categoria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}
