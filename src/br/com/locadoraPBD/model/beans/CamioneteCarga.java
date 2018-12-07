package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * @author Dayla
 */
@Entity
public class CamioneteCarga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double capCarga;
    private String acionamentoEmb;
    private Double consumo;
    private Double potencia;
    private String volumeCombust;
    private Double distEixos;

    public CamioneteCarga() {
    }

    public CamioneteCarga(Double capCarga, String acionamentoEmb, Double consumo, Double potencia, String volumeCombust, Double distEixos) {
        this.capCarga = capCarga;
        this.acionamentoEmb = acionamentoEmb;
        this.consumo = consumo;
        this.potencia = potencia;
        this.volumeCombust = volumeCombust;
        this.distEixos = distEixos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.capCarga);
        hash = 59 * hash + Objects.hashCode(this.acionamentoEmb);
        hash = 59 * hash + Objects.hashCode(this.consumo);
        hash = 59 * hash + Objects.hashCode(this.potencia);
        hash = 59 * hash + Objects.hashCode(this.volumeCombust);
        hash = 59 * hash + Objects.hashCode(this.distEixos);
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
        final CamioneteCarga other = (CamioneteCarga) obj;
        if (!Objects.equals(this.acionamentoEmb, other.acionamentoEmb)) {
            return false;
        }
        if (!Objects.equals(this.volumeCombust, other.volumeCombust)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.capCarga, other.capCarga)) {
            return false;
        }
        if (!Objects.equals(this.consumo, other.consumo)) {
            return false;
        }
        if (!Objects.equals(this.potencia, other.potencia)) {
            return false;
        }
        if (!Objects.equals(this.distEixos, other.distEixos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CamioneteCarga{" + "id=" + id + ", capCarga=" + capCarga + ", acionamentoEmb=" + acionamentoEmb + ", consumo=" + consumo + ", potencia=" + potencia + ", volumeCombust=" + volumeCombust + ", distEixos=" + distEixos + '}';
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(Double capCarga) {
        this.capCarga = capCarga;
    }

    public String getAcionamentoEmb() {
        return acionamentoEmb;
    }

    public void setAcionamentoEmb(String acionamentoEmb) {
        this.acionamentoEmb = acionamentoEmb;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public String getVolumeCombust() {
        return volumeCombust;
    }

    public void setVolumeCombust(String volumeCombust) {
        this.volumeCombust = volumeCombust;
    }

    public Double getDistEixos() {
        return distEixos;
    }

    public void setDistEixos(Double distEixos) {
        this.distEixos = distEixos;
    }
    
    
    
    

    
}
