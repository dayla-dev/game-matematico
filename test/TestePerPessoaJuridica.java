
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.DAO.PessoaJuridicaDAO;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.PessoaJuridica;

/**
 *
 * @author Dayla
 */
public class TestePerPessoaJuridica {
    
    public static void main(String args[]){
        
        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO(Conexao.conexao());
        EnderecoDAO enderecoDAO = new EnderecoDAO(Conexao.conexao());
        
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Enock");
        endereco.setNumero("402");
        endereco.setBairro("Centro");
        endereco.setCep("58.987-123");
        endereco.setCidade("Serra Talhada");
        endereco.setEstado("Pernambuco");
        enderecoDAO.create(endereco);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        
        pessoaJuridica.setNome("Loja 1");
        pessoaJuridica.setCnpj("9731-8/35");
        pessoaJuridica.setInscricaoEstadual("11.111.111/0111-00");
        pessoaJuridica.setEndereco(endereco);
        
        pessoaJuridicaDAO.Salvar(pessoaJuridica);
    }    
}
