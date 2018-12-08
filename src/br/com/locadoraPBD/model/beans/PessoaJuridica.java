package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
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
@Table (name = "pessoajuridica")
@PrimaryKeyJoinColumn (name = "idPessoa")
public class PessoaJuridica extends Pessoa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "cnpj", nullable = false, length=50)
    private String cnpj;
    @Column (name = "insc_estadual", nullable = false, length=50)
    private String inscricaoEstadual;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String nome) {
        super(nome);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String nome, Endereco endereco) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.cnpj);
        hash = 43 * hash + Objects.hashCode(this.inscricaoEstadual);
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
        final PessoaJuridica other = (PessoaJuridica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.inscricaoEstadual, other.inscricaoEstadual)) {
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }    
}
