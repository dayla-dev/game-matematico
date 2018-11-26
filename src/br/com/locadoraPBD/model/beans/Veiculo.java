package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * @author Dayla
 */
@Entity
@Table (name = "veiculo")
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="fabricante", nullable=false, length=50)
    private String fabricante;
    @Column(name="modelo", nullable=false, length=50)
    private String modelo;
    @Column(name="numero_placa", nullable=false, length=20)
    private String numeroPlaca;
    @Column(name="cor", nullable=false, length=20)
    private String cor;
    @Column(name="numero_portas", nullable=false, length=50)
    private int numeroPortas;
    @Column(name="motor", nullable=false, length=20)
    private String motor;
    @Column(name="ano_fabricacao", nullable=false, length=20)
    private String anoFabricacao;
    @Column(name="ano_modelo", nullable=false, length=50)
    private String anoModelo;
    @Column(name="combustivel", nullable=false, length=50)
    private String tipoCombustivel;
    @Column(name="quilometragem", nullable=false, length=30)
    private String quilAtual;
    @Column(name="potencia", nullable=false, length=20)
    private String potencia;

    public Veiculo() {
    }

    public Veiculo(String fabricante, String modelo, int numeroPortas, String motor, String potencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numeroPortas = numeroPortas;
        this.motor = motor;
        this.potencia = potencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.fabricante);
        hash = 67 * hash + Objects.hashCode(this.modelo);
        hash = 67 * hash + this.numeroPortas;
        hash = 67 * hash + Objects.hashCode(this.motor);
        hash = 67 * hash + Objects.hashCode(this.potencia);
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
        final Veiculo other = (Veiculo) obj;
        if (this.numeroPortas != other.numeroPortas) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.motor, other.motor)) {
            return false;
        }
        if (!Objects.equals(this.potencia, other.potencia)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", numeroPortas=" + numeroPortas + ", motor=" + motor + ", potencia=" + potencia + '}';
    }

    public Long getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
    

   
}
