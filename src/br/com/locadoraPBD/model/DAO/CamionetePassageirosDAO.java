package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamionetePassageiros;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Dayla
 */
public class CamionetePassageirosDAO implements IcoreCamionetePassageiro,Serializable {
    
    private EntityManagerFactory emf = null;

    public CamionetePassageirosDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }    

    @Override
    public void Salvar(CamionetePassageiros camionetePassageiros) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(camionetePassageiros);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }    }

    @Override
    public void Editar(CamionetePassageiros camionetePassageiros) throws NonexistentEntityException, Exception {
  EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            camionetePassageiros = em.merge(camionetePassageiros);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = camionetePassageiros.getId();
                if (getCamionetePassagPorId(id) == null) {
                    throw new NonexistentEntityException("The camionetePassageiros with id " + id + " no longer exists.");
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
            CamionetePassageiros camionetePassageiros;
            try {
                camionetePassageiros = em.getReference(CamionetePassageiros.class, id);
                camionetePassageiros.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The camionetePassageiros with id " + id + " no longer exists.", enfe);
            }
            em.remove(camionetePassageiros);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public CamionetePassageiros getCamionetePassagPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CamionetePassageiros.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<CamionetePassageiros> getTodosCamionetePassageiros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<CamionetePassageiros> findCamionetePassageirosEntities() {
        return findCamionetePassageirosEntities(true, -1, -1);
    }

    public List<CamionetePassageiros> findCamionetePassageirosEntities(int maxResults, int firstResult) {
        return findCamionetePassageirosEntities(false, maxResults, firstResult);
    }

    private List<CamionetePassageiros> findCamionetePassageirosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CamionetePassageiros.class));
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
    
      public int getCamionetePassageirosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CamionetePassageiros> rt = cq.from(CamionetePassageiros.class);
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
