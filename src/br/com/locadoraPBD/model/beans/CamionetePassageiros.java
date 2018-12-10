package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*
 * @author Dayla
 */
@Entity
@Table (name = "camionetePassageiros")
@PrimaryKeyJoinColumn(name = "idVeiculo")
public class CamionetePassageiros extends Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean airbag;
    private boolean direcaoAssistida;
    private boolean cintoSeg;
    private boolean rodasLigaLeve;
    private boolean contPoluicaoAr;

    public CamionetePassageiros() {
    }

    public CamionetePassageiros(boolean airbag, boolean direcaoAssistida, boolean cintoSeg, boolean rodasLigaLeve, boolean contPoluicaoAr) {
        this.airbag = airbag;
        this.direcaoAssistida = direcaoAssistida;
        this.cintoSeg = cintoSeg;
        this.rodasLigaLeve = rodasLigaLeve;
        this.contPoluicaoAr = contPoluicaoAr;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + (this.airbag ? 1 : 0);
        hash = 59 * hash + (this.direcaoAssistida ? 1 : 0);
        hash = 59 * hash + (this.cintoSeg ? 1 : 0);
        hash = 59 * hash + (this.rodasLigaLeve ? 1 : 0);
        hash = 59 * hash + (this.contPoluicaoAr ? 1 : 0);
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
        final CamionetePassageiros other = (CamionetePassageiros) obj;
        if (this.airbag != other.airbag) {
            return false;
        }
        if (this.direcaoAssistida != other.direcaoAssistida) {
            return false;
        }
        if (this.cintoSeg != other.cintoSeg) {
            return false;
        }
        if (this.rodasLigaLeve != other.rodasLigaLeve) {
            return false;
        }
        if (this.contPoluicaoAr != other.contPoluicaoAr) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CamionetePassageiros{" + "id=" + id + ", airbag=" + airbag + ", direcaoAssistida=" + direcaoAssistida + ", cintoSeg=" + cintoSeg + ", rodasLigaLeve=" + rodasLigaLeve + ", contPoluicaoAr=" + contPoluicaoAr + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isDirecaoAssistida() {
        return direcaoAssistida;
    }

    public void setDirecaoAssistida(boolean direcaoAssistida) {
        this.direcaoAssistida = direcaoAssistida;
    }

    public boolean isCintoSeg() {
        return cintoSeg;
    }

    public void setCintoSeg(boolean cintoSeg) {
        this.cintoSeg = cintoSeg;
    }

    public boolean isRodasLigaLeve() {
        return rodasLigaLeve;
    }

    public void setRodasLigaLeve(boolean rodasLigaLeve) {
        this.rodasLigaLeve = rodasLigaLeve;
    }

    public boolean isContPoluicaoAr() {
        return contPoluicaoAr;
    }

    public void setContPoluicaoAr(boolean contPoluicaoAr) {
        this.contPoluicaoAr = contPoluicaoAr;
    }
}
