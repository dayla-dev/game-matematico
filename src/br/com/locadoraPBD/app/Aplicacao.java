package br.com.locadoraPBD.app;

import br.com.locadoraPBD.model.fachada.Fachada;
import br.com.locadoraPBD.view.TelaLogin;

/**
 *
 * @author Dayla
 */
public class Aplicacao {
    
    public static void main(String args[]){
     
        Fachada fachada = new Fachada();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        
    }    
}
