package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Dayla
 */
@Entity
@Table (name = "atendimento")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_hr_locacao")    
    private String dataHrLocacao;
    @Column(name = "data_hr_reserva")
    private String dataHrReserva;
    @Column(nullable=false,length=30)
    private String status;
    @Column(name = "valor_entrada")
    private Double valorEntrada;
    @OneToOne
    private PessoaFisica pessoaFisica;
    @OneToOne
    private Pessoa pessoa;
    @OneToOne
    private Categoria categoria;

    public Reserva() {
    }

    public Reserva(String dataHrLocacao, String dataHrReserva, String status, Double valorEntrada) {
        this.dataHrLocacao = dataHrLocacao;
        this.dataHrReserva = dataHrReserva;
        this.status = status;
        this.valorEntrada = valorEntrada;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.dataHrLocacao);
        hash = 67 * hash + Objects.hashCode(this.dataHrReserva);
        hash = 67 * hash + Objects.hashCode(this.status);
        hash = 67 * hash + Objects.hashCode(this.valorEntrada);
        hash = 67 * hash + Objects.hashCode(this.pessoaFisica);
        hash = 67 * hash + Objects.hashCode(this.pessoa);
        hash = 67 * hash + Objects.hashCode(this.categoria);
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
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.dataHrLocacao, other.dataHrLocacao)) {
            return false;
        }
        if (!Objects.equals(this.dataHrReserva, other.dataHrReserva)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.valorEntrada, other.valorEntrada)) {
            return false;
        }
        if (!Objects.equals(this.pessoaFisica, other.pessoaFisica)) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", dataHrLocacao=" + dataHrLocacao + ", dataHrReserva=" + dataHrReserva + ", status=" + status + ", valorEntrada=" + valorEntrada + ", pessoaFisica=" + pessoaFisica + ", pessoa=" + pessoa + ", categoria=" + categoria + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataHrLocacao() {
        return dataHrLocacao;
    }

    public void setDataHrLocacao(String dataHrLocacao) {
        this.dataHrLocacao = dataHrLocacao;
    }

    public String getDataHrReserva() {
        return dataHrReserva;
    }

    public void setDataHrReserva(String dataHrReserva) {
        this.dataHrReserva = dataHrReserva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

      
}
