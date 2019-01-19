package br.com.locadoraPBD.view;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.JPAUtil.Criptografia;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.DAO.UsuarioDAO;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.Usuario;
import br.com.locadoraPBD.model.fachada.Fachada;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayla
 */
public class CadastroUsuario extends javax.swing.JDialog {
    
    private Fachada fachada;

    
    public CadastroUsuario(java.awt.Frame parent, boolean modal, Fachada fachada) {
        super(parent, modal);
        initComponents();
        this.fachada=fachada;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dadosPessoais = new javax.swing.JPanel();
        nomeUser = new javax.swing.JLabel();
        tipoUser = new javax.swing.JLabel();
        nomeUserFd = new javax.swing.JTextField();
        comboUsuarios = new javax.swing.JComboBox<>();
        loginLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        confSenhaLabel = new javax.swing.JLabel();
        notificacao = new javax.swing.JLabel();
        senhaField = new javax.swing.JPasswordField();
        confSenhaField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        celField = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        lograLabel = new javax.swing.JLabel();
        lograField = new javax.swing.JTextField();
        numLabel = new javax.swing.JLabel();
        numField = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroField = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        cepField = new javax.swing.JFormattedTextField();
        estadoLabel = new javax.swing.JLabel();
        estadosCombo = new javax.swing.JComboBox<>();
        cidadeLabel = new javax.swing.JLabel();
        cidadeField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de usuário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dadosPessoais.setBackground(new java.awt.Color(255, 255, 255));
        dadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados pessoais"));
        dadosPessoais.setToolTipText("Dados pessoais do usuário");
        dadosPessoais.setName("Dados Pessoais"); // NOI18N

        nomeUser.setText("Nome:*");

        tipoUser.setText("Tipo de usuário:");

        nomeUserFd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nomeUserFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserFdActionPerformed(evt);
            }
        });

        comboUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Atendente" }));
        comboUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        loginLabel.setText("Login:*");

        loginField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        senhaLabel.setText("Senha:*");

        confSenhaLabel.setText("Confirmar senha:*");

        senhaField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        confSenhaField.setToolTipText("senha de 6 à 11 caracteres");
        confSenhaField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout dadosPessoaisLayout = new javax.swing.GroupLayout(dadosPessoais);
        dadosPessoais.setLayout(dadosPessoaisLayout);
        dadosPessoaisLayout.setHorizontalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(nomeUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeUserFd))
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addComponent(tipoUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addComponent(senhaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(senhaField)))
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(loginLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginField))
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(confSenhaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confSenhaField)))))
                .addGap(10, 10, 10))
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(notificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dadosPessoaisLayout.setVerticalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUser)
                    .addComponent(nomeUserFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoUser)
                    .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(confSenhaLabel)
                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confSenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notificacao, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados para contato"));
        jPanel2.setToolTipText("Dados para contato do usuário");

        jLabel1.setText("E-mail:");

        emailField.setToolTipText("Cadastrar contato");
        emailField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone:");

        telField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            telField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Celular:");

        celField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            celField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(celField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(celField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));
        jPanel3.setToolTipText("Endereço do usuário");

        lograLabel.setText("Logradouro:");

        lograField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lograField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lograFieldActionPerformed(evt);
            }
        });

        numLabel.setText("Número:");

        numField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bairroLabel.setText("Bairro:");

        bairroField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cepLabel.setText("CEP:");

        cepField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            cepField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        estadoLabel.setText("Estado:");

        estadosCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alagoas", "Bahia", "Ceará", "Maranhão", "Paraíba", "Pernambuco", "Piauí", "Rio Grande do Norte", "Sergipe", " " }));
        estadosCombo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cidadeLabel.setText("Cidade:");

        cidadeField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lograLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lograField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bairroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(estadoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cidadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lograLabel)
                    .addComponent(lograField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLabel)
                    .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroLabel)
                    .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLabel)
                    .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estadosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoLabel)))
        );

        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.setToolTipText("Salvar cadastro");
        salvarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.setToolTipText("Cancelar cadastro");
        cancelarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeUserFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUserFdActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFieldActionPerformed

    private void lograFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lograFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lograFieldActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        Endereco endereco = new Endereco();
        
        endereco.setLogradouro(lograField.getText().toUpperCase());
        endereco.setNumero(numField.getText().toUpperCase());
        endereco.setBairro(bairroField.getText().toUpperCase());
        endereco.setCep(cepField.getText().toUpperCase());
        endereco.setEstado(estadosCombo.getSelectedItem().toString().toUpperCase());
        endereco.setCidade(cidadeField.getText().toUpperCase());
        
        fachada.SalvarEndereco(endereco);       
        
        
        Usuario user = new Usuario();
        user.setNome(nomeUserFd.getText().toUpperCase());
        user.setTipoUsuario(comboUsuarios.getSelectedItem().toString().toUpperCase());
        user.setLogin(loginField.getText().toUpperCase());
        String senha= senhaField.getText().toUpperCase();
        user.setSenha(Criptografia.encriptografar(senha));

        user.setEmail(emailField.getText().toUpperCase());
        user.setTelefone(telField.getText().toUpperCase());
        user.setCelular(celField.getText().toUpperCase());
        user.setEndereco(endereco);
        
        fachada.SalvarUsuario(user);
        JOptionPane.showMessageDialog(this, "Salvo com sucesso");
        this.dispose();
          
    }//GEN-LAST:event_salvarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroField;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JFormattedTextField celField;
    private javax.swing.JFormattedTextField cepField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JPasswordField confSenhaField;
    private javax.swing.JLabel confSenhaLabel;
    private javax.swing.JPanel dadosPessoais;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JComboBox<String> estadosCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField lograField;
    private javax.swing.JLabel lograLabel;
    private javax.swing.JLabel nomeUser;
    private javax.swing.JTextField nomeUserFd;
    private javax.swing.JLabel notificacao;
    private javax.swing.JTextField numField;
    private javax.swing.JLabel numLabel;
    private javax.swing.JButton salvarButton;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JFormattedTextField telField;
    private javax.swing.JLabel tipoUser;
    // End of variables declaration//GEN-END:variables
}