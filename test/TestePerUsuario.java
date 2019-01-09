
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.JPAUtil.Criptografia;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.DAO.UsuarioDAO;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.Usuario;

/**
 *
 * @author Dayla
 */
public class TestePerUsuario {
    
    public static void main(String args[]){
        
       
        UsuarioDAO usuarioDAO = new UsuarioDAO(Conexao.conexao());
        EnderecoDAO enderecoDAO = new EnderecoDAO(Conexao.conexao());
       
        Endereco end = new Endereco();
        end.setLogradouro("Rua 1");
        end.setNumero("502  - ap 1");
        end.setBairro("Centro");
        end.setCep("55.750-000");
        end.setCidade("Serra Talhada");
        end.setEstado("Pernambuco");
        enderecoDAO.create(end);
        
         
        Usuario user = new Usuario();
        user.setNome("Luana");
        user.setLogin("atendente");
        user.setSenha("54321");
        user.setSenha(Criptografia.encriptografar(user.getSenha()));
        
        System.out.println(user.getSenha());
        
        user.setSenha(Criptografia.descriptografar(user.getSenha()));
        System.out.println(user.getSenha());
        
        user.setTipoUsuario("super usuario");
        user.setEndereco(end);
        usuarioDAO.Salvar(user);          
                
    }    
}
