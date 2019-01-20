package br.com.locadoraPBD.view;

import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.business.ModeloTabela;
import br.com.locadoraPBD.model.fachada.Fachada;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Dayla
 */
public class BuscarCategoria extends javax.swing.JDialog {
    
    private Fachada fachada;
    private int linha;

    public BuscarCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public BuscarCategoria(java.awt.Frame parent, boolean modal, Fachada fachada) {
        super(parent, modal);
        initComponents();
        this.fachada=fachada;
        panelCadCateg.setBackground(new Color(0,0,0,0));
        preencherTabela(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        panelPesq = new javax.swing.JPanel();
        pesqLabel = new javax.swing.JLabel();
        pesqField = new javax.swing.JTextField();
        panelCadCateg = new javax.swing.JPanel();
        cadCatLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar categoria");

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelPesq.setBackground(new java.awt.Color(241, 242, 198));

        pesqLabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        pesqLabel.setText("Pesquisar:");

        pesqField.setName("Digite o nome da categoria"); // NOI18N
        pesqField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesqFieldKeyReleased(evt);
            }
        });

        cadCatLabel.setBackground(new java.awt.Color(0, 51, 204));
        cadCatLabel.setForeground(new java.awt.Color(0, 51, 204));
        cadCatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/table_add.png"))); // NOI18N
        cadCatLabel.setText("Cadastrar categoria");

        javax.swing.GroupLayout panelCadCategLayout = new javax.swing.GroupLayout(panelCadCateg);
        panelCadCateg.setLayout(panelCadCategLayout);
        panelCadCategLayout.setHorizontalGroup(
            panelCadCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadCategLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadCatLabel)
                .addContainerGap())
        );
        panelCadCategLayout.setVerticalGroup(
            panelCadCategLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadCatLabel)
        );

        javax.swing.GroupLayout panelPesqLayout = new javax.swing.GroupLayout(panelPesq);
        panelPesq.setLayout(panelPesqLayout);
        panelPesqLayout.setHorizontalGroup(
            panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesqLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(pesqLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesqField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesqLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCadCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPesqLayout.setVerticalGroup(
            panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesqLabel)
                    .addComponent(pesqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        editButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(57, 57, 57))
            .addComponent(jScrollPane1)
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(cancelButton))
                .addGap(19, 19, 19))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesqFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesqFieldKeyReleased
        preencherTabela(1);
    }//GEN-LAST:event_pesqFieldKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
       linha = tabela.getSelectedRow();
    }//GEN-LAST:event_tabelaMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        AlterarCategoria alterarCat = null;
        
        try{
            alterarCat = new AlterarCategoria(new TelaInicialSuper(), true, fachada, fachada.getPessoaCategoriaPorId((Long) tabela.getValueAt(linha, 0)));
        }
        catch(Exception ex){
          Logger.getLogger(BuscarCategoria.class.getName()).log(Level.SEVERE, null, ex);              
        }
        alterarCat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void preencherTabela(int tipo){
        
        List<Categoria> categorias = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"NOME", "TIPO DE CATEGORIA", "PREÇO"};
        
        try{
            if(tipo==1){
                categorias = this.fachada.getCategoriaPorNomeCat(pesqField.getText().toUpperCase());
                for(Categoria cat: categorias){
                    dados.add(new Object[]{cat.getNomeCategoria(), cat.getTipoCategoria(), cat.getPrecoCat()});

                }
            }
            else if(tipo==2){
                categorias = this.fachada.getTodasCategorias();
                for(Categoria cat: categorias){
                    dados.add(new Object[]{cat.getNomeCategoria(), cat.getTipoCategoria(), cat.getPrecoCat()});

                }
            }
        }
        catch(Exception e){
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(210);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadCatLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCadCateg;
    private javax.swing.JPanel panelPesq;
    private javax.swing.JTextField pesqField;
    private javax.swing.JLabel pesqLabel;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
