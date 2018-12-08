package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "status")
    private boolean status;
    @Column(name= "placa", nullable=false, length=20)
    private String placa;
    @Column(name= "chassi", nullable=false, length=20)
    private String chassi;
    @Column(name="motor", nullable=false, length=20)
    private String motor;
    @Column(name="cor", nullable=false, length=20)
    private String cor;
    @Column(name="torque_motor", nullable=false, length=20)
    private String torqueMotor;
    @Column(name="combustivel", nullable=false, length=50)
    private String tipoCombustivel;
    @Column(name="km_atual", nullable=false, length=30)
    private String kmAtual;
    @Column(name="fabricante", nullable=false, length=50)
    private String fabricante;
    @Column(name="modelo", nullable=false, length=50)
    private String modelo; 
    @Column(name="num_passageiros", nullable=false)
    private int numPassageiros;
    @Column(name="num_portas", nullable=false, length=50)
    private int numeroPortas;
     @Column(name="ano_fabricacao", nullable=false, length=20)
    private String anoFabricacao;
    @Column(name="ano_modelo", nullable=false, length=50)
    private String anoModelo;
    @Column(name="tamanho", nullable=false, length=50)
    private String tamanho;
    @Column(name = "ar_cond")
    private boolean arCondicionado;
    @Column(name = "radio")
    private boolean radio;
    @Column(name = "dvd")
    private boolean dvd;
    @Column(name = "mp3")
    private boolean mp3;
    @ManyToOne
    @JoinColumn (name = "categoria_id")
    private Categoria categoria;

    public Veiculo() {
    }

    public Veiculo(boolean status, String placa, String chassi, String motor, String cor, String torqueMotor, String tipoCombustivel, String kmAtual, String fabricante, String modelo, int numPassageiros, int numeroPortas, String anoFabricacao, String anoModelo, String tamanho, boolean arCondicionado, boolean radio, boolean dvd, boolean mp3, Categoria categoria) {
        this.status = status;
        this.placa = placa;
        this.chassi = chassi;
        this.motor = motor;
        this.cor = cor;
        this.torqueMotor = torqueMotor;
        this.tipoCombustivel = tipoCombustivel;
        this.kmAtual = kmAtual;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.numeroPortas = numeroPortas;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.tamanho = tamanho;
        this.arCondicionado = arCondicionado;
        this.radio = radio;
        this.dvd = dvd;
        this.mp3 = mp3;
        this.categoria = categoria;
    }

    public Veiculo(boolean status, String placa, String chassi, String motor, String cor, String torqueMotor, String tipoCombustivel, String kmAtual, String fabricante, String modelo, int numPassageiros, int numeroPortas, String anoFabricacao, String anoModelo, String tamanho, boolean arCondicionado, boolean radio, boolean dvd, boolean mp3) {
        this.status = status;
        this.placa = placa;
        this.chassi = chassi;
        this.motor = motor;
        this.cor = cor;
        this.torqueMotor = torqueMotor;
        this.tipoCombustivel = tipoCombustivel;
        this.kmAtual = kmAtual;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.numeroPortas = numeroPortas;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.tamanho = tamanho;
        this.arCondicionado = arCondicionado;
        this.radio = radio;
        this.dvd = dvd;
        this.mp3 = mp3;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + (this.status ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.placa);
        hash = 59 * hash + Objects.hashCode(this.chassi);
        hash = 59 * hash + Objects.hashCode(this.motor);
        hash = 59 * hash + Objects.hashCode(this.cor);
        hash = 59 * hash + Objects.hashCode(this.torqueMotor);
        hash = 59 * hash + Objects.hashCode(this.tipoCombustivel);
        hash = 59 * hash + Objects.hashCode(this.kmAtual);
        hash = 59 * hash + Objects.hashCode(this.fabricante);
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + this.numPassageiros;
        hash = 59 * hash + this.numeroPortas;
        hash = 59 * hash + Objects.hashCode(this.anoFabricacao);
        hash = 59 * hash + Objects.hashCode(this.anoModelo);
        hash = 59 * hash + Objects.hashCode(this.tamanho);
        hash = 59 * hash + (this.arCondicionado ? 1 : 0);
        hash = 59 * hash + (this.radio ? 1 : 0);
        hash = 59 * hash + (this.dvd ? 1 : 0);
        hash = 59 * hash + (this.mp3 ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.categoria);
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
        if (this.status != other.status) {
            return false;
        }
        if (this.numPassageiros != other.numPassageiros) {
            return false;
        }
        if (this.numeroPortas != other.numeroPortas) {
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
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.chassi, other.chassi)) {
            return false;
        }
        if (!Objects.equals(this.motor, other.motor)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.torqueMotor, other.torqueMotor)) {
            return false;
        }
        if (!Objects.equals(this.tipoCombustivel, other.tipoCombustivel)) {
            return false;
        }
        if (!Objects.equals(this.kmAtual, other.kmAtual)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.anoFabricacao, other.anoFabricacao)) {
            return false;
        }
        if (!Objects.equals(this.anoModelo, other.anoModelo)) {
            return false;
        }
        if (!Objects.equals(this.tamanho, other.tamanho)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", status=" + status + ", placa=" + placa + ", chassi=" + chassi + ", motor=" + motor + ", cor=" + cor + ", torqueMotor=" + torqueMotor + ", tipoCombustivel=" + tipoCombustivel + ", kmAtual=" + kmAtual + ", fabricante=" + fabricante + ", modelo=" + modelo + ", numPassageiros=" + numPassageiros + ", numeroPortas=" + numeroPortas + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", tamanho=" + tamanho + ", arCondicionado=" + arCondicionado + ", radio=" + radio + ", dvd=" + dvd + ", mp3=" + mp3 + ", categoria=" + categoria + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTorqueMotor() {
        return torqueMotor;
    }

    public void setTorqueMotor(String torqueMotor) {
        this.torqueMotor = torqueMotor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(String kmAtual) {
        this.kmAtual = kmAtual;
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

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    

    
    
}
