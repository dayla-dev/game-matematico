package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Filial;
import br.com.locadoraPBD.model.beans.PessoaFisica;
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
public class FilialDAO implements IcoreFilialDAO, Serializable {
    
    private EntityManagerFactory emf = null;

    public FilialDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void Salvar(Filial filial) {
     EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(filial);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }    
    }

    @Override
    public void Editar(Filial filial) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            filial = em.merge(filial);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = filial.getId();
                if (getFilialPorId(id) == null) {
                    throw new NonexistentEntityException("The filial with id " + id + " no longer exists.");
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
            Filial filial;
            try {
                filial = em.getReference(Filial.class, id);
                filial.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The filial with id " + id + " no longer exists.", enfe);
            }
            em.remove(filial);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<Filial> getFilialPorNome(String nome) {
    EntityManager em = getEntityManager();
    List<Filial> filiais = null;
    
    try{
        String consulta = "select f from Filial f where f.nome like :nome";
        TypedQuery<Filial> query = em.createQuery(consulta, Filial.class);
        query.setParameter("nome", "%" + nome + "%");
        filiais = query.getResultList();        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        em.close();
    }
    return filiais;
    }

    @Override
    public Filial getFilialPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Filial.class, id);
        } finally {
            em.close();
        }    
    }

    @Override
    public List<Filial> getTodasFiliais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Filial> findFilialEntities() {
        return findFilialEntities(true, -1, -1);
    }

    public List<Filial> findFilialEntities(int maxResults, int firstResult) {
        return findFilialEntities(false, maxResults, firstResult);
    }

    private List<Filial> findFilialEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Filial.class));
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


    public int getFilialCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Filial> rt = cq.from(Filial.class);
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
