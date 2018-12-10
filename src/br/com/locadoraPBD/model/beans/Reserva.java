package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Date;
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
    @Column(name = "data_locacao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataLocacao;
    @Column(name = "data_reserva")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataReserva;
    @Column(nullable=false,length=30)
    private String status;
    @Column(name = "valor_entrada")
    private Double valorEntrada;
    @OneToOne
    private PessoaFisica pessoaFisica;
    @OneToOne
    private PessoaJuridica pessoaJuridica;
    @OneToOne
    private Categoria categoria;

    public Reserva() {
    }

    public Reserva(Date dataLocacao, Date dataReserva, String status) {
        this.dataLocacao = dataLocacao;
        this.dataReserva = dataReserva;
        this.status = status;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", dataLocacao=" + dataLocacao + ", dataReserva=" + dataReserva + ", status=" + status + ", pessoaFisica=" + pessoaFisica + ", pessoaJuridica=" + pessoaJuridica + ", categoria=" + categoria + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

   
    
}
