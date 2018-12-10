
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.DAO.PessoaFisicaDAO;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.PessoaFisica;

/*
 * @author Dayla
 */
public class TestePerPessoaFisica {
    
    public static void main(String args[]){
     
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO(Conexao.conexao());
        EnderecoDAO enderecoDAO = new EnderecoDAO(Conexao.conexao());
        
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua 2");
        endereco.setNumero("540");
        endereco.setBairro("Centro");
        endereco.setCep("58.753-000");
        endereco.setCidade("Serra Talhada");
        endereco.setEstado("Pernambuco");
        enderecoDAO.create(endereco);
        
        PessoaFisica ps = new PessoaFisica();
        
        ps.setNome("Dayla");
        ps.setData_nasc("10/12/2018");
        ps.setCpf("111.111.111-11");
        ps.setSexo("Feminino");
        ps.setEndereco(endereco);
        
        pessoaFisicaDAO.Salvar(ps);
        
    }    
}
