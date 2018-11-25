
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.beans.Endereco;

public class TestePerEndereco {

    public static void main(String args[]) throws Exception{
        
        EnderecoDAO enderecoDAO = new EnderecoDAO(Conexao.conexao());
        
            Endereco end = new Endereco("Batista", "200", "Agua", "0000-000");
            enderecoDAO.create(end);
            
           Endereco end1 = new Endereco();
           end1 = enderecoDAO.findEndereco(new Long(1));
           System.out.println(end.toString());
           
           end.setLogradouro("Junqueira");
           end.setBairro("Laranjeira");
           enderecoDAO.edit(end);
           System.out.println(end.toString());
           
        
    }    
}
