
package br.com.locadoraPBD.JPAUtil;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Dayla
 */
public class Conexao {
    
    private static EntityManagerFactory emf;

public static EntityManagerFactory conexao(){
    return emf = Persistence.createEntityManagerFactory("LocadoraPBDPU");
}
    
}
