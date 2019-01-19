package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.PessoaJuridica;
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
public class PessoaJuridicaDAO implements IcorePessoaJuridicaDAO ,Serializable {
    
    private EntityManagerFactory emf = null;

    public PessoaJuridicaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }    

    
    @Override
    public void Salvar(PessoaJuridica pessoaJuridica) {
    EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pessoaJuridica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    
    @Override
    public void Editar(PessoaJuridica pessoaJuridica) throws NonexistentEntityException, Exception {
         EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pessoaJuridica = em.merge(pessoaJuridica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = pessoaJuridica.getId();
                if (getPessoaJuridicaPorId(id) == null) {
                    throw new NonexistentEntityException("The pessoaJuridica with id " + id + " no longer exists.");
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
            PessoaJuridica pessoaJuridica;
            try {
                pessoaJuridica = em.getReference(PessoaJuridica.class, id);
                pessoaJuridica.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pessoaJuridica with id " + id + " no longer exists.", enfe);
            }
            em.remove(pessoaJuridica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    @Override
     public List<PessoaJuridica> getPessoaJuridicaPorNome(String nome) {
       EntityManager em = getEntityManager();
       List<PessoaJuridica> pessoasJuridicas=null;
       
       try{
           String consulta = "select pj from PessoaJuridica pj where pj.nome like :nome";
           TypedQuery<PessoaJuridica> query = em.createQuery(consulta, PessoaJuridica.class);
           query.setParameter("nome", "%" + nome + "%");
           pessoasJuridicas = query.getResultList();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       finally{
           em.close();
       }        
        return pessoasJuridicas;
    }
     
    @Override
    public List<PessoaJuridica> getPessoaJuridicaPorCnpj(String cnpj) {
       EntityManager em = getEntityManager();
       List<PessoaJuridica> pessoasJuridicas=null;
       
       try{
           String consulta = "select pj from PessoaJuridica pj where pj.cnpj like :cnpj";
           TypedQuery<PessoaJuridica> query = em.createQuery(consulta, PessoaJuridica.class);
           query.setParameter("cnpj", "%" + cnpj + "%");
           pessoasJuridicas = query.getResultList();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       finally{
           em.close();
       }        
        return pessoasJuridicas;
    }

    
    @Override
    public List<PessoaJuridica> getPessoaFisicaPorInscEstadual(String inscricaoEstadual) {
       EntityManager em = getEntityManager();
       List<PessoaJuridica> pessoasJuridicas=null;
       
       try{
           String consulta = "select pj from PessoaJuridica pj where pj.inscricaoEstadual like :inscricaoEstadual";
           TypedQuery<PessoaJuridica> query = em.createQuery(consulta, PessoaJuridica.class);
           query.setParameter("inscricaoEstadual", "%" + inscricaoEstadual + "%");
           pessoasJuridicas = query.getResultList();
       }
       catch(Exception e){
           e.printStackTrace();
       }
       finally{
           em.close();
       }
        return pessoasJuridicas;
    }
    
    @Override
    public PessoaJuridica getPessoaJuridicaPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PessoaJuridica.class, id);
        } finally {
            em.close();
        }
    }
    
    @Override
     public List<PessoaJuridica> getTodasPessoasJuridicas() {
        return getTodasPessoasJuridicas(true, -1, -1);
    }

    public List<PessoaJuridica> getTodasPessoasJuridicas(int maxResults, int firstResult) {
        return getTodasPessoasJuridicas(false, maxResults, firstResult);
    }

    private List<PessoaJuridica> getTodasPessoasJuridicas(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PessoaJuridica.class));
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
    
    
     public int getPessoaJuridicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PessoaJuridica> rt = cq.from(PessoaJuridica.class);
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
