package br.com.locadoraPBD.JPAUtil;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dayla
 */
public class Criptografia {
    
    private static String mensagem;
     
    public static String encriptografar(String senha){
        
        mensagem = Base64.getEncoder().encodeToString(senha.getBytes());
        
        return mensagem;
    }
    public static void descriptografar(String senha){
        
        byte[] arrayByteDescriptografado = Base64.getDecoder().decode(mensagem);
        senha = new String(arrayByteDescriptografado);
        
    }
}
