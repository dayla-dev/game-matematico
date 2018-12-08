
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.DAO.PessoaFisicaDAO;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.PessoaFisica;

/*
 * @author Dayla
 */
public class TestePerPessoaFis {
    
    public static void main(String args[]){
     
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO(Conexao.conexao());
        EnderecoDAO enderecoDAO = new EnderecoDAO(Conexao.conexao());
        
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Afonso Magalhaes");
        endereco.setNumero("690 - Ap 3");
        endereco.setBairro("Centro");
        endereco.setCep("58.753-000");
        endereco.setCidade("Serra Talhada");
        endereco.setEstado("Pernambuco");
        enderecoDAO.create(endereco);
        
        PessoaFisica ps = new PessoaFisica();
        
        ps.setNome("Lucas");
        ps.setData_nasc("11/11/2011");
        ps.setCpf("000.000.000-00");
        ps.setSexo("Masculino");
        ps.setEndereco(endereco);
        
        pessoaFisicaDAO.Salvar(ps);
        
    }    
}
