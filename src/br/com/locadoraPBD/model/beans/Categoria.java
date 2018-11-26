package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * @author Dayla
 */
@Entity
@Table (name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nome", nullable=false, length=50)
    private String nome;
    @Column(name="tipo_categoria", nullable=false, length=50)
    private String tipoCategoria;
    @Column(nullable=false)
    private int numeroPassageiros;
    private boolean arCondicionado;
    private boolean radio;
    private boolean dvd;
    private boolean mp3;
    @OneToMany ( cascade = {CascadeType.ALL})
    private List<Veiculo> veiculos = new ArrayList<>();
    

    public Categoria() {
    }

    public Categoria(String nome, String tipoCategoria, int numeroPassageiros, boolean arCondicionado, boolean radio, boolean dvd, boolean mp3) {
        this.nome = nome;
        this.tipoCategoria = tipoCategoria;
        this.numeroPassageiros = numeroPassageiros;
        this.arCondicionado = arCondicionado;
        this.radio = radio;
        this.dvd = dvd;
        this.mp3 = mp3;
    }
    
    public  void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    
    public void removerVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.tipoCategoria);
        hash = 13 * hash + this.numeroPassageiros;
        hash = 13 * hash + (this.arCondicionado ? 1 : 0);
        hash = 13 * hash + (this.radio ? 1 : 0);
        hash = 13 * hash + (this.dvd ? 1 : 0);
        hash = 13 * hash + (this.mp3 ? 1 : 0);
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
        if (this.numeroPassageiros != other.numeroPassageiros) {
            return false;
        }
        if (this.arCondicionado != other.arCondicionado) {
            return false;
        }
        if (this.radio != other.radio) {
            return false;
        }
        if (this.dvd != other.dvd) {
            return false;
        }
        if (this.mp3 != other.mp3) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipoCategoria, other.tipoCategoria)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
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

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isDvd() {
        return dvd;
    }

    public void setDvd(boolean dvd) {
        this.dvd = dvd;
    }

    public boolean isMp3() {
        return mp3;
    }

    public void setMp3(boolean mp3) {
        this.mp3 = mp3;
    }
    
    
    

    
}
