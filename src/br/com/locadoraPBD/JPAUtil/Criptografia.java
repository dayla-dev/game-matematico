package br.com.locadoraPBD.JPAUtil;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayla
 */
public class Criptografia {
    
        public static String encriptografar(String senha){
        String retorno = "";
        MessageDigest md;
        
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            retorno = hash.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
