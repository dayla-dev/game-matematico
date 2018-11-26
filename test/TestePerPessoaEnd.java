
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.PessoaDAO;
import br.com.locadoraPBD.model.beans.Contato;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.Pessoa;


public class TestePerPessoaEnd {
    
    
    public static void main(String args[]){
        
        PessoaDAO pessoaDAO = new PessoaDAO(Conexao.conexao());
        
        Contato contato = new Contato("123", "456", "dayla.r@");
        
        Endereco endereco = new Endereco("rua chave", "320", "luna", "58759-000");
        
        Pessoa pessoa = new Pessoa("Daniela");
        pessoa.addEndereco(endereco);
        
        pessoa.addContato(contato);
        pessoa.addEndereco(endereco);
        
        pessoaDAO.create(pessoa);
//        
//        Contato cont = new Contato();
//        cont.setTipo("Contato");
//        cont.setDescricao("111111");
//        
//        Endereco end = new Endereco();
//        end.setBairro("Carmo");
//        end.setCep(1223);
//        end.setLogradouro("Manoel Mendes");
//        end.setNumero("65");
//        
//        Pessoa p = new Pessoa();
//        p.setNome("André Luiz");
//        p.setCpf("111.444.111-33");
//        p.addEndereco(end);
//        p.addContato(cont);
//        pcon.create(p);
        
    }
}
