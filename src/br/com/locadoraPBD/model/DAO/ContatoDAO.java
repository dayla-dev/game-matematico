package br.com.locadoraPBD.model.DAO;

import br.com.locadoraPBD.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Contato;
import br.com.locadoraPBD.model.beans.Pessoa;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * @author Dayla
 */
public class ContatoDAO implements Serializable{
    
    public ContatoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void Salvar(Contato contato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pessoa pessoa = contato.getPessoa();
            if (pessoa != null) {
                pessoa = em.getReference(pessoa.getClass(), pessoa.getId());
                contato.setPessoa(pessoa);
            }
            em.persist(contato);
            if (pessoa != null) {
                pessoa.getContatos().add(contato);
                pessoa = em.merge(pessoa);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    
    public void Editar(Contato contato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            System.out.println(contato.toString());
            Contato persistentContato = em.find(Contato.class, contato.getId());
            Pessoa pessoaOld = persistentContato.getPessoa();
            Pessoa pessoaNew = contato.getPessoa();
            if (pessoaNew != null) {
                pessoaNew = em.getReference(pessoaNew.getClass(), pessoaNew.getId());
                contato.setPessoa(pessoaNew);
            }
            contato = em.merge(contato);
            if (pessoaOld != null && !pessoaOld.equals(pessoaNew)) {
                pessoaOld.getContatos().remove(contato);
                pessoaOld = em.merge(pessoaOld);
            }
            if (pessoaNew != null && !pessoaNew.equals(pessoaOld)) {
                pessoaNew.getContatos().add(contato);
                pessoaNew = em.merge(pessoaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = contato.getId();
                if (getContatoPorId(id) == null) {
                    throw new NonexistentEntityException("The contato with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    
    public void Remover(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Contato contato;
            try {
                contato = em.getReference(Contato.class, id);
                contato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The contato with id " + id + " no longer exists.", enfe);
            }
            Pessoa pessoa = contato.getPessoa();
            if (pessoa != null) {
                pessoa.getContatos().remove(contato);
                pessoa = em.merge(pessoa);
            }
            em.remove(contato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Contato> findContatoEntities() {
        return findContatoEntities(true, -1, -1);
    }

    public List<Contato> findContatoEntities(int maxResults, int firstResult) {
        return findContatoEntities(false, maxResults, firstResult);
    }

    private List<Contato> findContatoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Contato.class));
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

    public Contato getContatoPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            Contato cont = em.find(Contato.class, id);
            cont.getPessoa();
            return cont;
        } finally {
            em.close();
        }
    }

    public int getContatoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Contato> rt = cq.from(Contato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
}
