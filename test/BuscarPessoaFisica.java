
import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.PessoaFisicaDAO;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Dayla
 */
public class BuscarPessoaFisica {
    
    public static void main(String args[]){
        
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO(Conexao.conexao());
        
        List<PessoaFisica> pessoasFisicas = new ArrayList<>();
        
        try{
            pessoasFisicas = pessoaFisicaDAO.getPessoaFisicaPorNome("Dayla");
            for(int i = 0; i<pessoasFisicas.size(); i++){
                System.out.println("Nome: " +pessoasFisicas.get(i).getNome()+
                                   "\nCPF:"+ pessoasFisicas.get(i).getCpf() +
                                   "\nData de Nasc.:"+pessoasFisicas.get(i).getData_nasc()+
                                   "\nSexo:"+pessoasFisicas.get(i).getSexo() +
                                   "\nEndereco:"+pessoasFisicas.get(i).getEndereco().getLogradouro() +
                                   "\nNumero:"+ pessoasFisicas.get(i).getEndereco().getNumero() +
                                   "\nBairro:"+pessoasFisicas.get(i).getEndereco().getBairro()+
                                   "\nCEP:" + pessoasFisicas.get(i).getEndereco().getCep()+
                                   "\nCidade:" + pessoasFisicas.get(i).getEndereco().getCidade()+
                                   "\nEstado:" + pessoasFisicas.get(i).getEndereco().getEstado());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }        
    }    
}
