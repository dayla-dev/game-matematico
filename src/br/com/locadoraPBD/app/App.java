package br.com.locadoraPBD.app;

//

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.DAO.EnderecoJpaController;
import br.com.locadoraPBD.model.DAO.PessoaJpaController;
import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.Pessoa;

//import br.com.locadoraPBD.JPAUtil.Conexao;
//import br.com.locadoraPBD.exceptions.NonexistentEntityException;
//import br.com.locadoraPBD.model.DAO.CidadeDAO;
//import br.com.locadoraPBD.model.DAO.EnderecoDAO;
//import br.com.locadoraPBD.model.DAO.EstadoDAO;
//import br.com.locadoraPBD.model.DAO.PessoaDAO;
//import br.com.locadoraPBD.model.beans.Cidade;
//import br.com.locadoraPBD.model.beans.Endereco;
//import br.com.locadoraPBD.model.beans.Estado;
//import br.com.locadoraPBD.model.beans.Pessoa;

/**
 * @author Dayla
 */
public class App {
    
    public static void main(String args[]) {
        
        PessoaJpaController pessoaDAO = new PessoaJpaController(Conexao.conexao());
        EnderecoJpaController enderecoDAO = new EnderecoJpaController(Conexao.conexao());
        
        Endereco end = new Endereco();
        end.setLogradouro("rua 1");
        end.setNumero("100");
        end.setBairro("centro");
        end.setCep("123");
        end.setCidade("Tavares");
        end.setEstado("paraiba");
        
        enderecoDAO.create(end);
        
        Pessoa p = new Pessoa();
        p.setNome("Datla");
        p.setEndereco(end);
        
        pessoaDAO.create(p);
        
//        CategoriaDAO catDAO = new CategoriaDAO(Conexao.conexao());
//        
//        Categoria categoria = new Categoria("c1", "carro passeio", 4, true, true, true, true);
//        
//        catDAO.create(categoria);
      
        
//        PessoaDAO pd = new PessoaDAO(Conexao.conexao());
//        
//        Pessoa pessoa = new Pessoa("Maria");
//        
//        pd.create(pessoa);

//        EstadoDAO ed = new EstadoDAO(Conexao.conexao());
//        
//        Estado es = new Estado();
//        es.setNome("pernambuco");
//        
//        ed.create(es);

//            CidadeDAO cd = new CidadeDAO(Conexao.conexao());
//            Cidade cidade = new Cidade();
//            cidade.setNome("Serra Talhada");
//            
//            cd.create(cidade);
//
//            EnderecoDAO endDAO = new EnderecoDAO(Conexao.conexao());
//            
//            Endereco end = new Endereco("rua 1", "12", "centro", "12345");
//            endDAO.create(end);
        

    }
    
}
