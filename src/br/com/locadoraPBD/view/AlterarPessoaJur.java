package br.com.locadoraPBD.view;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.EnderecoDAO;
import br.com.locadoraPBD.model.DAO.PessoaJuridicaDAO;
import br.com.locadoraPBD.model.beans.Endereco;
import br.com.locadoraPBD.model.beans.PessoaJuridica;
import br.com.locadoraPBD.model.fachada.Fachada;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayla
 */
public class AlterarPessoaJur extends javax.swing.JDialog {
    
    private Fachada fachada;
    private PessoaJuridica pessoaJuridica;
    private Endereco endereco;

    
    public AlterarPessoaJur(java.awt.Frame parent, boolean modal, Fachada fachada, PessoaJuridica pessoaJuridica) {
        super(parent, modal);
        initComponents();
        this.fachada=fachada;
        this.pessoaJuridica=pessoaJuridica;
        preencherFormulario();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        panelDadosEmpresa = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        cnpjLabel = new javax.swing.JLabel();
        cnpjField = new javax.swing.JTextField();
        inscEstLabel = new javax.swing.JLabel();
        inscEstField = new javax.swing.JTextField();
        panelContato = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        telLabel = new javax.swing.JLabel();
        telField = new javax.swing.JFormattedTextField();
        celLabel = new javax.swing.JLabel();
        celField = new javax.swing.JFormattedTextField();
        panelEndereco = new javax.swing.JPanel();
        lograLabel = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        lograField = new javax.swing.JTextField();
        numField = new javax.swing.JTextField();
        bairroField = new javax.swing.JTextField();
        cepField = new javax.swing.JFormattedTextField();
        comboEstado = new javax.swing.JComboBox<>();
        cidadeField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelDadosEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados da empresa"));

        nomeLabel.setText("Nome:");

        nomeField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nomeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeFieldKeyPressed(evt);
            }
        });

        cnpjLabel.setText("CNPJ:*");

        cnpjField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cnpjField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnpjFieldKeyPressed(evt);
            }
        });

        inscEstLabel.setText("Insc. Estadual:*");

        inscEstField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inscEstField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inscEstFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelDadosEmpresaLayout = new javax.swing.GroupLayout(panelDadosEmpresa);
        panelDadosEmpresa.setLayout(panelDadosEmpresaLayout);
        panelDadosEmpresaLayout.setHorizontalGroup(
            panelDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosEmpresaLayout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeField))
                    .addGroup(panelDadosEmpresaLayout.createSequentialGroup()
                        .addComponent(cnpjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inscEstLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inscEstField)))
                .addContainerGap())
        );
        panelDadosEmpresaLayout.setVerticalGroup(
            panelDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjLabel)
                    .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inscEstLabel)
                    .addComponent(inscEstField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContato.setBackground(new java.awt.Color(255, 255, 255));
        panelContato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contato"));

        emailLabel.setText("E-mail:");

        emailField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailFieldKeyPressed(evt);
            }
        });

        telLabel.setText("Telefone:");

        telField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            telField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telFieldKeyPressed(evt);
            }
        });

        celLabel.setText("Celular:");

        celField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            celField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                celFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelContatoLayout = new javax.swing.GroupLayout(panelContato);
        panelContato.setLayout(panelContatoLayout);
        panelContatoLayout.setHorizontalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContatoLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField))
                    .addGroup(panelContatoLayout.createSequentialGroup()
                        .addComponent(telLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(celLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelContatoLayout.setVerticalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telLabel)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celLabel)
                    .addComponent(celField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        lograLabel.setText("Logradouro:");

        numLabel.setText("Número:");

        bairroLabel.setText("Bairro:");

        cepLabel.setText("CEP:");

        estadoLabel.setText("Estado:");

        cidadeLabel.setText("Cidade:");

        lograField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lograField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lograFieldKeyPressed(evt);
            }
        });

        numField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numFieldKeyPressed(evt);
            }
        });

        bairroField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bairroField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bairroFieldKeyPressed(evt);
            }
        });

        cepField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            cepField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cepFieldKeyPressed(evt);
            }
        });

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alagoas", "Bahia", "Ceará", "Maranhão", "Paraíba", "Pernambuco", "Piauí", "Rio Grande do Norte", "Sergipe" }));
        comboEstado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboEstadoKeyPressed(evt);
            }
        });

        cidadeField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cidadeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cidadeFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(estadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lograLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lograField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(bairroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lograLabel)
                    .addComponent(lograField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLabel)
                    .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroLabel)
                    .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLabel)
                    .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoLabel)
                    .addComponent(cidadeLabel)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        salvarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salvarButtonKeyPressed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDadosEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarButton)
                .addGap(24, 24, 24))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton)
                    .addComponent(cancelarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cnpjField.requestFocus();
        }
    }//GEN-LAST:event_nomeFieldKeyPressed

    private void cnpjFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpjFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            inscEstField.requestFocus();
        }
    }//GEN-LAST:event_cnpjFieldKeyPressed

    private void inscEstFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inscEstFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            emailField.requestFocus();
        }
    }//GEN-LAST:event_inscEstFieldKeyPressed

    private void emailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            telField.requestFocus();
        }
    }//GEN-LAST:event_emailFieldKeyPressed

    private void telFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            celField.requestFocus();
        }
    }//GEN-LAST:event_telFieldKeyPressed

    private void celFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            lograField.requestFocus();
        }
    }//GEN-LAST:event_celFieldKeyPressed

    private void lograFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lograFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            numField.requestFocus();
        }
    }//GEN-LAST:event_lograFieldKeyPressed

    private void numFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            bairroField.requestFocus();
        }
    }//GEN-LAST:event_numFieldKeyPressed

    private void bairroFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bairroFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cepField.requestFocus();
        }
    }//GEN-LAST:event_bairroFieldKeyPressed

    private void cepFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            comboEstado.requestFocus();
        }
    }//GEN-LAST:event_cepFieldKeyPressed

    private void comboEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboEstadoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cidadeField.requestFocus();
        }
    }//GEN-LAST:event_comboEstadoKeyPressed

    private void cidadeFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidadeFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            salvarButton.requestFocus();
        }
    }//GEN-LAST:event_cidadeFieldKeyPressed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        try{
                  
            endereco = fachada.getEnderecoPorId(pessoaJuridica.getEndereco().getId());
            endereco.setLogradouro(lograField.getText().toUpperCase());
            endereco.setNumero(numField.getText().toUpperCase());
            endereco.setBairro(bairroField.getText().toUpperCase());
            endereco.setCep(cepField.getText().toUpperCase());
            endereco.setCidade(cidadeField.getText().toUpperCase());
            endereco.setEstado(comboEstado.getSelectedItem().toString().toUpperCase());
            fachada.EditarEndereco(endereco);
            
            pessoaJuridica.setNome(nomeField.getText().toUpperCase());
            pessoaJuridica.setCnpj(cnpjField.getText().toUpperCase());
            pessoaJuridica.setInscricaoEstadual(inscEstField.getText().toUpperCase());
            pessoaJuridica.setEmail(emailField.getText().toUpperCase());
            pessoaJuridica.setTelefone(telField.getText().toUpperCase());
            pessoaJuridica.setCelular(celField.getText().toUpperCase());
            pessoaJuridica.setEndereco(endereco);
            
            fachada.EditarPessoaJur(pessoaJuridica);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(this, "Salvo com sucesso!!!");
        this.dispose();
        
        
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void salvarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salvarButtonKeyPressed

    }//GEN-LAST:event_salvarButtonKeyPressed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroField;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JFormattedTextField celField;
    private javax.swing.JLabel celLabel;
    private javax.swing.JFormattedTextField cepField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cnpjField;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JPanel fundo;
    private javax.swing.JTextField inscEstField;
    private javax.swing.JLabel inscEstLabel;
    private javax.swing.JTextField lograField;
    private javax.swing.JLabel lograLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField numField;
    private javax.swing.JLabel numLabel;
    private javax.swing.JPanel panelContato;
    private javax.swing.JPanel panelDadosEmpresa;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JButton salvarButton;
    private javax.swing.JFormattedTextField telField;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables

    private void preencherFormulario() {
     
       
        lograField.setText(pessoaJuridica.getEndereco().getLogradouro().toUpperCase());
        numField.setText(pessoaJuridica.getEndereco().getNumero().toUpperCase());
        bairroField.setText(pessoaJuridica.getEndereco().getBairro().toUpperCase());
        cepField.setText(pessoaJuridica.getEndereco().getCep().toUpperCase());
        cidadeField.setText(pessoaJuridica.getEndereco().getCidade().toUpperCase());
        comboEstado.setSelectedItem(pessoaJuridica.getEndereco().getEstado().toUpperCase());
        
        nomeField.setText(pessoaJuridica.getNome().toUpperCase());
        cnpjField.setText(pessoaJuridica.getCnpj().toUpperCase());
        inscEstField.setText(pessoaJuridica.getInscricaoEstadual().toUpperCase());
        emailField.setText(pessoaJuridica.getEmail().toUpperCase());
        telField.setText(pessoaJuridica.getTelefone().toUpperCase());
        celField.setText(pessoaJuridica.getCelular().toUpperCase());
        
    }
}
