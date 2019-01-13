
package view;

import br.com.locadoraPBD.JPAUtil.Criptografia;
import br.com.locadoraPBD.model.DAO.ValidacaoDAO;
import br.com.locadoraPBD.model.beans.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayla
 */
public class TelaLogin extends javax.swing.JFrame {

    ArrayList<Usuario> usuarios = new ArrayList<>();
  
   private ValidacaoDAO validacao;
   private JFrame tela;
   
    public TelaLogin() {
        initComponents();
        setIcon();
        panelLogin.setBackground(new java.awt.Color(0,0,0,150));
        panelTituloLogin.setBackground(new java.awt.Color(109,86,0,170));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaField = new javax.swing.JPasswordField();
        entrarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        panelTituloLogin = new javax.swing.JPanel();
        notificacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(640, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(255, 0, 51));

        LoginLabel.setBackground(new java.awt.Color(255, 255, 255));
        LoginLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setText("Login:");

        loginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginFieldActionPerformed(evt);
            }
        });
        loginField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginFieldKeyPressed(evt);
            }
        });

        senhaLabel.setBackground(new java.awt.Color(255, 255, 255));
        senhaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(255, 255, 255));
        senhaLabel.setText("Senha:");

        senhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFieldActionPerformed(evt);
            }
        });
        senhaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaFieldKeyPressed(evt);
            }
        });

        entrarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        entrarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarButtonKeyPressed(evt);
            }
        });

        sairButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senhaLabel)
                            .addComponent(LoginLabel))
                        .addGap(18, 18, 18)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senhaField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(loginField)))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(entrarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sairButton)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarButton)
                    .addComponent(sairButton))
                .addGap(53, 53, 53))
        );

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 310, 210));

        panelTituloLogin.setBackground(new java.awt.Color(221, 221, 6));

        notificacao.setBackground(new java.awt.Color(0, 102, 0));
        panelTituloLogin.add(notificacao);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dados para acesso");
        panelTituloLogin.add(jLabel1);

        getContentPane().add(panelTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 310, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/telaBack.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFieldActionPerformed

    private void senhaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaFieldActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
       
        if(loginField.getText().equals("super")&&senhaField.getText().equals("super")){
            TelaInicialSuper telaSuper = new TelaInicialSuper();
            telaSuper.setVisible(true);
            this.dispose();            
        }
        else{
            List<Usuario> usuarios = validacao.ValidarLogin(loginField.getText());
            if(usuarios.size() == 0){
                notificacao.setText("Login Errado!");
            }
              else{
                   for(Usuario user: usuarios){
                       if(senhaField.getText().equals(user.getSenha())){
                          notificacao.setText("Logado com sucesso!");
                        }
                       else{
                           notificacao.setText("Senha Errado!");
                       }
                    }
                }
        }
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void loginFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginFieldKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
            senhaField.requestFocus();
        }
    }//GEN-LAST:event_loginFieldKeyPressed

    private void senhaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            entrarButton.requestFocus();
        }
    }//GEN-LAST:event_senhaFieldKeyPressed

    private void entrarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarButtonKeyPressed
        
    }//GEN-LAST:event_entrarButtonKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
    
     private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/locadora.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel background;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel notificacao;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelTituloLogin;
    private javax.swing.JButton sairButton;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
