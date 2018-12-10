package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
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
public class PessoaFisicaDAO implements IcorePessoaFisicaDAO, Serializable {

    public PessoaFisicaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public int getPessoaFisicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PessoaFisica> rt = cq.from(PessoaFisica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    @Override
    public void Salvar(PessoaFisica pessoaFisica) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pessoaFisica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Editar(PessoaFisica pessoaFisica) throws NonexistentEntityException, Exception {
       EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pessoaFisica = em.merge(pessoaFisica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = pessoaFisica.getId();
                if (getPessoaFisicaPorId(id) == null) {
                    throw new NonexistentEntityException("The pessoaFisica with id " + id + " no longer exists.");
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
            PessoaFisica pessoaFisica;
            try {
                pessoaFisica = em.getReference(PessoaFisica.class, id);
                pessoaFisica.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pessoaFisica with id " + id + " no longer exists.", enfe);
            }
            em.remove(pessoaFisica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<PessoaFisica> getTodasPessoaFisica() {
        return getTodasPessoaFisica(true, -1, -1);
    }

    public List<PessoaFisica> getTodasPessoaFisica(int maxResults, int firstResult) {
        return getTodasPessoaFisica(false, maxResults, firstResult);
    }

    private List<PessoaFisica> getTodasPessoaFisica(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PessoaFisica.class));
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


    @Override
    public List<PessoaFisica> getPessoaFisicaPorNome(String nome) {
    EntityManager em = getEntityManager();
    List<PessoaFisica> pessoasFisicas = null;
    
    try{
        String consulta = "select ps from PessoaFisica ps where ps.nome like :nome";
        TypedQuery<PessoaFisica> query = em.createQuery(consulta, PessoaFisica.class);
        query.setParameter("nome", "%" + nome + "%");
        pessoasFisicas = query.getResultList();        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        em.close();
    }
    return pessoasFisicas;
    }

    @Override
    public List<PessoaFisica> getPessoaFisicaPorCPF(String cpf) {
         EntityManager em = getEntityManager();
         List<PessoaFisica> pessoasFisicas = null;
    
    try{
        String consulta = "select ps from PessoaFisica ps where ps.cpf like :cpf";
        TypedQuery<PessoaFisica> query = em.createQuery(consulta, PessoaFisica.class);
        query.setParameter("cpf", "%" + cpf + "%");
        pessoasFisicas = query.getResultList();        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        em.close();
    }
    return pessoasFisicas;
    }
    
     @Override
    public PessoaFisica getPessoaFisicaPorId(Long id) {
        EntityManager em = getEntityManager();
        try{
            PessoaFisica pessoaFisica = em.find(PessoaFisica.class, id);
            
            return pessoaFisica;
        }
        finally{
            em.close();
        }
}
}

   

    
    
    
    
//    public PessoaFisica findPessoaFisica(Long id) {
//        EntityManager em = getEntityManager();
//        try {
//            return em.find(PessoaFisica.class, id);
//        } finally {
//            em.close();
//        }
//    }

