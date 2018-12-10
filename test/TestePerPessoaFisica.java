
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
        endereco.setLogradouro("Rua Z");
        endereco.setNumero("897");
        endereco.setBairro("Centro");
        endereco.setCep("58.753-000");
        endereco.setCidade("Tavares");
        endereco.setEstado("Paraiba");
        enderecoDAO.create(endereco);
        
        PessoaFisica ps = new PessoaFisica();
        
        ps.setNome("Dani");
        ps.setData_nasc("18/02/1993");
        ps.setCpf("111.111.111-11");
        ps.setSexo("Feminino");
        ps.setNum_hab("9287-65");
        ps.setData_venc("12/12/2020");
        ps.setEndereco(endereco);
        
        pessoaFisicaDAO.Salvar(ps);
        
    }    
}
