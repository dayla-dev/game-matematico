
package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author Dayla
 */

@Entity
@Table (name ="pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nome",nullable = false)
    private String nome;
    @OneToMany(mappedBy = "pessoa")
    private List<Contato> contatos = new ArrayList<>();
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name="pessoa_endereco", joinColumns = @JoinColumn(name="id_pessoa"), inverseJoinColumns = @JoinColumn(name="id_endereco"))
    private List<Endereco> enderecos = new ArrayList<>();
    
    
    
    public Pessoa(){}
    
    public Pessoa(String nome){
        this.nome=nome;
    }
    
    public void addEndereco(Endereco endereco){
        enderecos.add(endereco);
        endereco.getPessoas().add(this);
    }
   public void removerEndereco(Endereco endereco){
       enderecos.remove(endereco);
       endereco.getPessoas().remove(this);
   }
  public void addContato(Contato contato) {
        contatos.add(contato);
        contato.setPessoa(this);
    }
 
    public void removeContato(Contato contato) {
        contatos.remove(contato);
        contato.setPessoa(null);
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + getId() + ", nome=" + getNome() +  '}';
    }
    
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }    
}
