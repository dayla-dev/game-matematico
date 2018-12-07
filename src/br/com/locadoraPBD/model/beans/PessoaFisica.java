package br.com.locadoraPBD.model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Dayla
 */
@Entity
@Table (name= "funcionario")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class PessoaFisica extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data_nasc;
    private  String cpf;
    private String sexo;

    public PessoaFisica() {
    }

    public PessoaFisica(Long id, String data_nasc, String cpf, String sexo) {
        this.id = id;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public PessoaFisica(Long id, String data_nasc, String cpf, String sexo, String nome) {
        super(nome);
        this.id = id;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public PessoaFisica(Long id, String data_nasc, String cpf, String sexo, String nome, Endereco endereco) {
        super(nome, endereco);
        this.id = id;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.data_nasc);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.sexo);
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
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.data_nasc, other.data_nasc)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "id=" + id + ", data_nasc=" + data_nasc + ", cpf=" + cpf + ", sexo=" + sexo + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
}
