package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author Dayla
 */
@Entity
@Table (name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome_categoria", nullable=false, length=50)
    private String nomeCategoria;
    @Column(name="tipo_categoria", nullable=false, length=50)
    private String tipoCategoria;
    @Column(name="preco_cat")
    private Double precoCat;
    
    public Categoria() {
    }

    public Categoria(String nomeCategoria, String tipoCategoria, Double precoCat) {
        this.nomeCategoria = nomeCategoria;
        this.tipoCategoria = tipoCategoria;
        this.precoCat = precoCat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.nomeCategoria);
        hash = 89 * hash + Objects.hashCode(this.tipoCategoria);
        hash = 89 * hash + Objects.hashCode(this.precoCat);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.nomeCategoria, other.nomeCategoria)) {
            return false;
        }
        if (!Objects.equals(this.tipoCategoria, other.tipoCategoria)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.precoCat, other.precoCat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nomeCategoria=" + nomeCategoria + ", tipoCategoria=" + tipoCategoria + ", precoCat=" + precoCat + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public Double getPrecoCat() {
        return precoCat;
    }

    public void setPrecoCat(Double precoCat) {
        this.precoCat = precoCat;
    }

    
}
