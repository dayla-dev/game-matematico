package br.com.locadoraPBD.view;

import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.fachada.Fachada;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayla
 */
public class AlterarCategoria extends javax.swing.JDialog {
    
    private Fachada fachada;
    private Categoria categoria;
    
    public AlterarCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public AlterarCategoria(java.awt.Frame parent, boolean modal, Fachada fachada, Categoria categoria){
        super(parent, modal);
        initComponents();
        this.fachada=fachada;
        this.categoria=categoria;   
        preencherFormulario();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        panelDadosCat = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        tipoCatLabel = new javax.swing.JLabel();
        tipoCatField = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        valorFiel = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar categoria");

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelDadosCat.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosCat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados da Categoria"));

        nomeLabel.setText("Nome:");

        tipoCatLabel.setText("Tipo de categoria:");

        valorLabel.setText("Valor:");

        javax.swing.GroupLayout panelDadosCatLayout = new javax.swing.GroupLayout(panelDadosCat);
        panelDadosCat.setLayout(panelDadosCatLayout);
        panelDadosCatLayout.setHorizontalGroup(
            panelDadosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosCatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosCatLayout.createSequentialGroup()
                        .addComponent(tipoCatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoCatField))
                    .addGroup(panelDadosCatLayout.createSequentialGroup()
                        .addGroup(panelDadosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosCatLayout.createSequentialGroup()
                                .addComponent(valorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorFiel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDadosCatLayout.createSequentialGroup()
                                .addComponent(nomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDadosCatLayout.setVerticalGroup(
            panelDadosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosCatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoCatLabel)
                    .addComponent(tipoCatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorLabel)
                    .addComponent(valorFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

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
                    .addComponent(panelDadosCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton)
                    .addComponent(cancelarButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        try{
            categoria.setNomeCategoria(nomeField.getText().toUpperCase());
            categoria.setTipoCategoria(tipoCatField.getText().toUpperCase());
            categoria.setPrecoCat(Double.valueOf(valorFiel.getText().toUpperCase()));
            fachada.EditarCategoria(categoria);
        }
        catch(Exception ex){
            Logger.getLogger(AlterarCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showConfirmDialog(this, "Salvo com sucesso!!");
        this.dispose();        
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JPanel fundo;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel panelDadosCat;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField tipoCatField;
    private javax.swing.JLabel tipoCatLabel;
    private javax.swing.JTextField valorFiel;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables


    public void preencherFormulario(){

        nomeField.setText(categoria.getNomeCategoria().toUpperCase());
        tipoCatField.setText(categoria.getTipoCategoria().toUpperCase());
        valorFiel.setText(String.valueOf(categoria.getPrecoCat()));
}
}
