package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Veiculo;
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
public class VeiculoDAO implements IcoreVeiculoDAO, Serializable {
    
    private EntityManagerFactory emf = null;

    public VeiculoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }    

    @Override
    public void Salvar(Veiculo veiculo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(veiculo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Editar(Veiculo veiculo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            veiculo = em.merge(veiculo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = veiculo.getId();
                if (getVeiculoPorId(id) == null) {
                    throw new NonexistentEntityException("The veiculo with id " + id + " no longer exists.");
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
            Veiculo veiculo;
            try {
                veiculo = em.getReference(Veiculo.class, id);
                veiculo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The veiculo with id " + id + " no longer exists.", enfe);
            }
            em.remove(veiculo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
   }

    @Override
    public List<Veiculo> getVeiculoPorModelo(String modelo) {
        EntityManager em = getEntityManager();
        List<Veiculo> veiculos = null;
        
        try{
            String consulta = "select v from Veiculo v where v.modelo like :modelo";
            TypedQuery<Veiculo> query = em.createQuery(consulta, Veiculo.class);
            query.setParameter("modelo", "%" + modelo + "%");
            veiculos = query.getResultList();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            em.close();                    
        }
        
        return veiculos;   
    }

    @Override
    public List<Veiculo> getVeiculoPorFabricante(String fabricante) {
     EntityManager em = getEntityManager();
        List<Veiculo> veiculos = null;
        
        try{
            String consulta = "select v from Veiculo v where v.fabricante like :fabricante";
            TypedQuery<Veiculo> query = em.createQuery(consulta, Veiculo.class);
            query.setParameter("fabricante", "%" + fabricante + "%");
            veiculos = query.getResultList();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            em.close();                    
        }
        
        return veiculos; 
    }

    @Override
    public Veiculo getVeiculoPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Veiculo.class, id);
        } finally {
            em.close();
        }  
    }
    
    public List<Veiculo> getTodosVeiculos() {
        return getTodosVeiculos(true, -1, -1);
    }

    public List<Veiculo> getTodosVeiculos(int maxResults, int firstResult) {
        return getTodosVeiculos(false, maxResults, firstResult);
    }

    private List<Veiculo> getTodosVeiculos(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Veiculo.class));
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
    
     public int getVeiculoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Veiculo> rt = cq.from(Veiculo.class);
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
