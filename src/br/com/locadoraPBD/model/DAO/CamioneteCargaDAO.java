package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamioneteCarga;
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
public class CamioneteCargaDAO implements IcoreCamioneteCarga ,Serializable {
    
    private EntityManagerFactory emf = null;
    
    public CamioneteCargaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    @Override
    public void Salvar(CamioneteCarga camioneteCarga) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(camioneteCarga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Editar(CamioneteCarga camioneteCarga) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            camioneteCarga = em.merge(camioneteCarga);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = camioneteCarga.getId();
                if (getVeiculoPorId(id) == null) {
                    throw new NonexistentEntityException("The camioneteCarga with id " + id + " no longer exists.");
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
            CamioneteCarga camioneteCarga;
            try {
                camioneteCarga = em.getReference(CamioneteCarga.class, id);
                camioneteCarga.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The camioneteCarga with id " + id + " no longer exists.", enfe);
            }
            em.remove(camioneteCarga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public CamioneteCarga getVeiculoPorId(Long id) {
    EntityManager em = getEntityManager();
        try {
            return em.find(CamioneteCarga.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<CamioneteCarga> getTodosCamioneteCarga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<CamioneteCarga> findCamioneteCargaEntities() {
        return findCamioneteCargaEntities(true, -1, -1);
    }

    public List<CamioneteCarga> findCamioneteCargaEntities(int maxResults, int firstResult) {
        return findCamioneteCargaEntities(false, maxResults, firstResult);
    }

    private List<CamioneteCarga> findCamioneteCargaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CamioneteCarga.class));
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
    
     public int getCamioneteCargaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CamioneteCarga> rt = cq.from(CamioneteCarga.class);
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
