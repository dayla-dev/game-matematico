package br.com.locadoraPBD.model.fachada;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.CamioneteCarga;
import br.com.locadoraPBD.model.beans.CamionetePassageiros;
import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.Filial;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import br.com.locadoraPBD.model.beans.PessoaJuridica;
import br.com.locadoraPBD.model.beans.Reserva;
import br.com.locadoraPBD.model.beans.Usuario;
import br.com.locadoraPBD.model.beans.Veiculo;
import br.com.locadoraPBD.model.business.CamioneteCargaBusiness;
import br.com.locadoraPBD.model.business.CamionetePassageiroBusiness;
import br.com.locadoraPBD.model.business.CategoriaBusiness;
import br.com.locadoraPBD.model.business.EnderecoBusiness;
import br.com.locadoraPBD.model.business.FilialBusiness;
import br.com.locadoraPBD.model.business.IcoreCamioneteCargaBusiness;
import br.com.locadoraPBD.model.business.IcoreCamionetePassBusiness;
import br.com.locadoraPBD.model.business.IcoreCategoriaBusiness;
import br.com.locadoraPBD.model.business.IcoreEnderecoBusiness;
import br.com.locadoraPBD.model.business.IcoreFilialBusiness;
import br.com.locadoraPBD.model.business.IcorePessoaFisBusiness;
import br.com.locadoraPBD.model.business.IcorePessoaJurBusiness;
import br.com.locadoraPBD.model.business.IcoreReservaBusiness;
import br.com.locadoraPBD.model.business.IcoreUsuarioBusiness;
import br.com.locadoraPBD.model.business.IcoreValidacaoBusiness;
import br.com.locadoraPBD.model.business.IcoreVeiculoBusiness;
import br.com.locadoraPBD.model.business.PessoaFisicaBusiness;
import br.com.locadoraPBD.model.business.PessoaJurBusiness;
import br.com.locadoraPBD.model.business.ReservaBusiness;
import br.com.locadoraPBD.model.business.UsuarioBusiness;
import br.com.locadoraPBD.model.business.ValidacaoBusiness;
import br.com.locadoraPBD.model.business.VeiculoBusiness;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class Fachada implements IcoreFachada{
    
    IcorePessoaFisBusiness pessoaFisBusiness;
    IcorePessoaJurBusiness pessoaJurBusiness;
    IcoreUsuarioBusiness usuarioBusiness;
    IcoreEnderecoBusiness enderecoBusiness;
    IcoreFilialBusiness filialBusiness;
    IcoreCategoriaBusiness categoriaBusiness;
    IcoreVeiculoBusiness veiculoBusiness;
    IcoreCamioneteCargaBusiness camioneteCargaBusiness;
    IcoreCamionetePassBusiness camionetePassBusiness;
    IcoreReservaBusiness reservaBusiness;
    IcoreValidacaoBusiness validacaoBusiness;

    public Fachada(){
        this.pessoaFisBusiness = new PessoaFisicaBusiness();
        this.pessoaJurBusiness = new PessoaJurBusiness();
        this.usuarioBusiness = new UsuarioBusiness();
        this.enderecoBusiness = new EnderecoBusiness();
        this.filialBusiness = new FilialBusiness();
        this.categoriaBusiness = new CategoriaBusiness();
        this.veiculoBusiness = new VeiculoBusiness();
        this.camioneteCargaBusiness = new CamioneteCargaBusiness();
        this.camionetePassBusiness = new CamionetePassageiroBusiness();
        this.reservaBusiness = new ReservaBusiness();
        this.validacaoBusiness = new ValidacaoBusiness();
    } 

    @Override
    public void SalvarUsuario(Usuario usuario) {

        usuarioBusiness.Salvar(usuario);
    }

    @Override
    public void EditarUsuario(Usuario usuario) throws NonexistentEntityException, Exception {
    
        usuarioBusiness.Editar(usuario);
    }

    @Override
    public void RemoverUsuario(Usuario usuario) throws NonexistentEntityException {

        usuarioBusiness.Remover(usuario);
    }

    @Override
    public void SalvarPessoaFis(PessoaFisica pessoaFisica) {

        pessoaFisBusiness.Salvar(pessoaFisica);
    }

    @Override
    public void EditarPessoaFis(PessoaFisica pessoaFisica) throws NonexistentEntityException, Exception {
    
        pessoaFisBusiness.Editar(pessoaFisica);
    }

    @Override
    public void RemoverPessoaFis(PessoaFisica pessoaFisica) throws NonexistentEntityException {

        pessoaFisBusiness.Remover(pessoaFisica);
    }

    @Override
    public List<PessoaFisica> getPessoaFisicaPorNome(String nome) throws NonexistentEntityException {
 
        return pessoaFisBusiness.getPessoaFisicaPorNome(nome);
    }

    @Override
    public List<PessoaFisica> getPessoaFisicaPorCPF(String cpf) throws NonexistentEntityException {

        return pessoaFisBusiness.getPessoaFisicaPorCPF(cpf);
    }

    @Override
    public PessoaFisica getPessoaFisicaPorId(Long id) throws NonexistentEntityException {

        return pessoaFisBusiness.getPessoaFisicaPorId(id);
    }

    @Override
    public List<PessoaFisica> getTodasPessoaFisica() {
    
        return pessoaFisBusiness.getTodasPessoaFisica();
    }

    @Override
    public void SalvarPessoaJur(PessoaJuridica pessoaJuridica) {
 
        pessoaJurBusiness.Salvar(pessoaJuridica);
    }

    @Override
    public void EditarPessoaJur(PessoaJuridica pessoaJuridica) throws NonexistentEntityException, Exception {
    
        pessoaJurBusiness.Editar(pessoaJuridica);
    }

    @Override
    public void RemoverPessoaJur(PessoaJuridica pessoaJuridica) throws NonexistentEntityException {
    
        pessoaJurBusiness.Remover(pessoaJuridica);
    }
    
     @Override
    public List<PessoaJuridica> getPessoaJuridicaPorNome(String nome) {
   
        return pessoaJurBusiness.getPessoaJuridicaPorNome(nome);
    }

    @Override
    public List<PessoaJuridica> getPessoaJuridicaPorCnpj(String cnpj) {
    
        return pessoaJurBusiness.getPessoaJuridicaPorCnpj(cnpj);
    }

    @Override
    public List<PessoaJuridica> getPessoaFisicaPorInscEstadual(String inscricaoEstadual) {
    
        return pessoaJurBusiness.getPessoaFisicaPorInscEstadual(inscricaoEstadual);
    }

    @Override
    public PessoaJuridica getPessoaJuridicaPorId(Long id) {
    
        return pessoaJurBusiness.getPessoaJuridicaPorId(id);
    }

    @Override
    public List<PessoaJuridica> getTodasPessoasJuridicas() {

        return pessoaJurBusiness.getTodasPessoasJuridicas();
    }

    @Override
    public void SalvarEndereco(Endereco endereco) {

        enderecoBusiness.Salvar(endereco);
    }

    @Override
    public void EditarEndereco(Endereco endereco) throws NonexistentEntityException, Exception {
    
        enderecoBusiness.Editar(endereco);
    }

    @Override
    public void RemoverEndereco(Long id) throws NonexistentEntityException {

        enderecoBusiness.Remover(id);
    }

    @Override
    public Endereco getEnderecoPorId(Long id) {
    
        return enderecoBusiness.getEnderecoPorId(id);
    }

    @Override
    public void SalvarFilial(Filial filial) {

        filialBusiness.Salvar(filial);
    }

    @Override
    public void EditarFilial(Filial filial) throws NonexistentEntityException, Exception {

        filialBusiness.Editar(filial);
    }

    @Override
    public void RemoverFilial(Filial filial) throws NonexistentEntityException {

        filialBusiness.Remover(filial);
    }

    @Override
    public List<Filial> getFilialPorNome(String nome) {

        return filialBusiness.getFilialPorNome(nome);
    }

    @Override
    public Filial getFilialPorId(Long id) {

        return filialBusiness.getFilialPorId(id);
    }

    @Override
    public List<Filial> getTodasFiliais() {
    
        return filialBusiness.getTodasFiliais();
    }

    @Override
    public void SalvarCategoria(Categoria categoria) {

        categoriaBusiness.Salvar(categoria);
    }

    @Override
    public void EditarCategoria(Categoria categoria) throws NonexistentEntityException, Exception {
    
        categoriaBusiness.Editar(categoria);
    }

    @Override
    public void RemoverCategoria(Categoria categoria) throws NonexistentEntityException {
 
        categoriaBusiness.Remover(categoria);
    }

    @Override
    public List<Categoria> getCategoriaPorNomeCat(String nomeCategoria) {
    
        return categoriaBusiness.getCategoriaPorNomeCat(nomeCategoria);
    }

    @Override
    public List<Categoria> getCategoriaPorTipo(String tipoCategoria) {

        return categoriaBusiness.getCategoriaPorTipo(tipoCategoria);
    }

    @Override
    public Categoria getPessoaCategoriaPorId(Long id) {
    
        return categoriaBusiness.getPessoaCategoriaPorId(id);
    }

    @Override
    public List<Categoria> getTodasCategorias() {

        return categoriaBusiness.getTodasCategorias();
    }

    @Override
    public void SalvarVeiculo(Veiculo veiculo) {
    
        veiculoBusiness.Salvar(veiculo);
    }

    @Override
    public void EditarVeiculo(Veiculo veiculo) throws NonexistentEntityException, Exception {

        veiculoBusiness.Editar(veiculo);
    }

    @Override
    public void RemoverVeiculo(Veiculo veiculo) throws NonexistentEntityException {

        veiculoBusiness.Remover(veiculo);
    }

    @Override
    public List<Veiculo> getVeiculoPorModelo(String modelo) {

        return veiculoBusiness.getVeiculoPorModelo(modelo);
    }

    @Override
    public List<Veiculo> getVeiculoPorFabricante(String fabricante) {

        return veiculoBusiness.getVeiculoPorFabricante(fabricante);
    }

    @Override
    public Veiculo getVeiculoPorId(Long id) {

        return veiculoBusiness.getVeiculoPorId(id);
    }

    @Override
    public void SalvarCamioneteCarga(CamioneteCarga camioneteC) {
 
        camioneteCargaBusiness.Salvar(camioneteC);
    }

    @Override
    public void EditarCamioneteCarga(CamioneteCarga camioneteC) throws NonexistentEntityException, Exception {

        camioneteCargaBusiness.Editar(camioneteC);
    }

    @Override
    public void RemoverCamioneteCarga(CamioneteCarga camioneteC) throws NonexistentEntityException {

        camioneteCargaBusiness.Remover(camioneteC);
    }

    @Override
    public CamioneteCarga getCamioneteCargaPorId(Long id) {
    
        return camioneteCargaBusiness.getCamioneteCargaPorId(id);
    }

    @Override
    public List<CamioneteCarga> getTodosCamioneteCarga() {

        return camioneteCargaBusiness.getTodosCamioneteCarga();
    }

    @Override
    public void SalvarCamionetePassageiros(CamionetePassageiros camionetePassageiros) {

        camionetePassBusiness.Salvar(camionetePassageiros);
    }

    @Override
    public void EditarCamionetePassageiros(CamionetePassageiros camionetePassageiros) throws NonexistentEntityException, Exception {

        camionetePassBusiness.Editar(camionetePassageiros);
    }

    @Override
    public void RemoverCamionetePassageiros(CamionetePassageiros camionetePassageiros) throws NonexistentEntityException {
    
        camionetePassBusiness.Remover(camionetePassageiros);
    }

    @Override
    public CamionetePassageiros getCamionetePassagPorId(Long id) {
    
        return camionetePassBusiness.getCamionetePassagPorId(id);
    }

    @Override
    public List<CamionetePassageiros> getTodosCamionetePassageiros() {
    
        return  camionetePassBusiness.getTodosCamionetePassageiros();
    }

    @Override
    public void SalvarReserva(Reserva reserva) {

        reservaBusiness.Salvar(reserva);
    }

    @Override
    public void EditarReserva(Reserva reserva) throws NonexistentEntityException, Exception {
    
        reservaBusiness.Editar(reserva);
    }

    @Override
    public void RemoverReserva(Reserva reserva) throws NonexistentEntityException {

        reservaBusiness.Remover(reserva);
    }

    @Override
    public Reserva getReservaPorId(Long id) {

        return reservaBusiness.getReservaPorId(id);
    }

    @Override
    public List<Usuario> ValidarLogin(String login, String senha) {

        return validacaoBusiness.ValidarLogin(login, senha);
    }

   
    
}
