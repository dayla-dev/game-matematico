package br.com.locadoraPBD.app;


import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.DAO.PessoaDAO;
import br.com.locadoraPBD.model.beans.Pessoa;

/**
 * @author Dayla
 */
public class App {
    
    public static void main(String args[]) throws NonexistentEntityException, Exception{
        
        PessoaDAO pd = new PessoaDAO(Conexao.conexao());
        
        Pessoa pessoa = new Pessoa("Maria");
        
        pd.create(pessoa);
        

    }
    
}
