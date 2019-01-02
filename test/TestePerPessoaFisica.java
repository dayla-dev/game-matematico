
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
        endereco.setLogradouro("Rua dois");
        endereco.setNumero("100");
        endereco.setBairro("Centro");
        endereco.setCep("51.412-000");
        endereco.setCidade("Tavares");
        endereco.setEstado("Paraiba");
        enderecoDAO.create(endereco);
        
        PessoaFisica ps = new PessoaFisica();
        
        ps.setNome("Cecilia");
        ps.setData_nasc("22/03/1983");
        ps.setCpf("222.222.222-22");
        ps.setSexo("Feminino");
        ps.setNum_hab("1233-00");
        ps.setData_venc("12/12/2022");
        ps.setEndereco(endereco);
        
        pessoaFisicaDAO.Salvar(ps);
        
    }    
}
