package br.com.locadoraPBD.model.fachada;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamioneteCarga;
import br.com.locadoraPBD.model.beans.CamionetePassageiros;
import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.Filial;
import br.com.locadoraPBD.model.beans.Pessoa;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import br.com.locadoraPBD.model.beans.PessoaJuridica;
import br.com.locadoraPBD.model.beans.Reserva;
import br.com.locadoraPBD.model.beans.Usuario;
import br.com.locadoraPBD.model.beans.Veiculo;
import java.util.List;

/**
 *
 * @author Dayla
 */
public interface IcoreFachada {
    
    public void SalvarUsuario(Usuario usuario);
    public void EditarUsuario(Usuario usuario) throws  NonexistentEntityException, Exception ;
    public void RemoverUsuario(Usuario usuario) throws  NonexistentEntityException;
    
    public void salvar(Pessoa pessoa);
    public void editar(Pessoa pessoa) throws NonexistentEntityException, Exception;
    public void remover(Long id)  throws NonexistentEntityException;
    public List<Pessoa> getPessoaPorNome(String nome);
    public Pessoa getPessoaId(Long id);
    public List<Pessoa> getTodasPessoas();
    
    public void SalvarPessoaFis(PessoaFisica pessoaFisica);
    public void EditarPessoaFis(PessoaFisica pessoaFisica) throws  NonexistentEntityException,Exception;
    public void RemoverPessoaFis(PessoaFisica pessoaFisica) throws  NonexistentEntityException;    
    public List<PessoaFisica> getPessoaFisicaPorNome(String nome)throws NonexistentEntityException;
    public List<PessoaFisica> getPessoaFisicaPorCPF(String cpf)throws NonexistentEntityException;    
    public PessoaFisica getPessoaFisicaPorId(Long id)throws NonexistentEntityException;
    public List<PessoaFisica> getTodasPessoaFisica();
    
    public void SalvarPessoaJur(PessoaJuridica pessoaJuridica);
    public void EditarPessoaJur(PessoaJuridica pessoaJuridica) throws  NonexistentEntityException, Exception ;
    public void RemoverPessoaJur(PessoaJuridica pessoaJuridica) throws  NonexistentEntityException;
    public List<PessoaJuridica> getPessoaJuridicaPorNome(String nome);
    public List<PessoaJuridica> getPessoaJuridicaPorCnpj(String cnpj);
    public List<PessoaJuridica> getPessoaFisicaPorInscEstadual(String inscricaoEstadual);
    public PessoaJuridica getPessoaJuridicaPorId(Long id);
    public List<PessoaJuridica> getTodasPessoasJuridicas();
    
    public void SalvarEndereco(Endereco endereco);
    public void EditarEndereco(Endereco endereco)  throws  NonexistentEntityException, Exception;
    public void RemoverEndereco(Long id) throws  NonexistentEntityException;    
    public Endereco getEnderecoPorId(Long id);
    
    public void SalvarFilial(Filial filial);
    public void EditarFilial(Filial filial) throws  NonexistentEntityException, Exception ;
    public void RemoverFilial(Filial filial) throws  NonexistentEntityException;
    public List<Filial> getFilialPorNome(String nome);
    public Filial getFilialPorId(Long id);
    public List<Filial> getTodasFiliais();
    
    public void SalvarCategoria(Categoria categoria);
    public void EditarCategoria(Categoria categoria) throws  NonexistentEntityException, Exception ;
    public void RemoverCategoria(Categoria categoria) throws  NonexistentEntityException;
    public List<Categoria> getCategoriaPorNomeCat(String nomeCategoria);
    public List<Categoria> getCategoriaPorTipo(String tipoCategoria);
    public Categoria getPessoaCategoriaPorId(Long id);    
    public List<Categoria> getTodasCategorias();
    
    public void SalvarVeiculo(Veiculo veiculo);
    public void EditarVeiculo(Veiculo veiculo) throws  NonexistentEntityException, Exception ;
    public void RemoverVeiculo(Veiculo veiculo) throws  NonexistentEntityException;
    public List<Veiculo> getVeiculoPorModelo(String modelo);
    public List<Veiculo> getVeiculoPorFabricante(String fabricante);
    public Veiculo getVeiculoPorId(Long id);
    
    public void SalvarCamioneteCarga(CamioneteCarga camioneteC);
    public void EditarCamioneteCarga(CamioneteCarga camioneteC) throws  NonexistentEntityException, Exception ;
    public void RemoverCamioneteCarga(CamioneteCarga camioneteC) throws  NonexistentEntityException;
    public CamioneteCarga getCamioneteCargaPorId(Long id);
    public List<CamioneteCarga> getTodosCamioneteCarga();
    
    public void SalvarCamionetePassageiros(CamionetePassageiros camionetePassageiros);
    public void EditarCamionetePassageiros(CamionetePassageiros camionetePassageiros) throws  NonexistentEntityException, Exception ;
    public void RemoverCamionetePassageiros(CamionetePassageiros camionetePassageiros) throws  NonexistentEntityException;
    public CamionetePassageiros getCamionetePassagPorId(Long id);
    public List<CamionetePassageiros> getTodosCamionetePassageiros();
    
    public void SalvarReserva(Reserva reserva);
    public void EditarReserva(Reserva reserva) throws  NonexistentEntityException, Exception ;
    public void RemoverReserva(Reserva reserva) throws  NonexistentEntityException;    
    public Reserva getReservaPorId(Long id);
    
    public List<Usuario> ValidarLogin(String login, String senha);
    
}
