package br.com.locadoraPBD.view;

import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Pessoa;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import br.com.locadoraPBD.model.beans.Reserva;
import br.com.locadoraPBD.model.business.ModeloTabela;
import br.com.locadoraPBD.model.fachada.Fachada;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Dayla
 */
public class CadastroReserva extends javax.swing.JDialog {

    private Fachada fachada;
    private Pessoa pessoaReservante;
    private PessoaFisica motorista;
    private Categoria categoria;
    private int linha;
    
    public CadastroReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CadastroReserva(java.awt.Frame parent, boolean modal, Fachada fachada) {
        super(parent, modal);
        initComponents();
        this.fachada=fachada;
       
      preencherTabelaMotorista();
      preencherCategoria();            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        panelDeDados = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        motoristaLabel = new javax.swing.JLabel();
        panelNome = new javax.swing.JPanel();
        panelMotorista = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMotorista = new javax.swing.JTable();
        dataResLabel = new javax.swing.JLabel();
        dataLocLabel = new javax.swing.JLabel();
        dtLocField = new javax.swing.JFormattedTextField();
        categoriaLabel = new javax.swing.JLabel();
        panelCategoria = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        valorLabel = new javax.swing.JLabel();
        valorResField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        nomeField = new javax.swing.JTextField();
        motoristaField = new javax.swing.JTextField();
        categoriaField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNome = new javax.swing.JTable();
        filialLabel = new javax.swing.JLabel();
        filialField = new javax.swing.JTextField();
        panelFilial = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaFilial = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        hrRetField = new javax.swing.JFormattedTextField();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Efetuar reserva");

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelDeDados.setBackground(new java.awt.Color(255, 255, 255));
        panelDeDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados da reserva"));

        nomeLabel.setText("Nome:");

        motoristaLabel.setText("Motorista:");

        panelNome.setBackground(new java.awt.Color(255, 255, 255));
        panelNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelNomeLayout = new javax.swing.GroupLayout(panelNome);
        panelNome.setLayout(panelNomeLayout);
        panelNomeLayout.setHorizontalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );
        panelNomeLayout.setVerticalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        panelMotorista.setBackground(new java.awt.Color(255, 255, 255));
        panelMotorista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMotoristaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaMotorista);

        javax.swing.GroupLayout panelMotoristaLayout = new javax.swing.GroupLayout(panelMotorista);
        panelMotorista.setLayout(panelMotoristaLayout);
        panelMotoristaLayout.setHorizontalGroup(
            panelMotoristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        panelMotoristaLayout.setVerticalGroup(
            panelMotoristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        dataResLabel.setText("Dt. da reserva:");

        dataLocLabel.setText("Dt. da locação:");

        try {
            dtLocField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        categoriaLabel.setText("Categoria:");

        panelCategoria.setBackground(new java.awt.Color(255, 255, 255));
        panelCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaCategoria);

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        valorLabel.setText("Valor:");

        valorResField.setEditable(false);

        statusLabel.setText("Status:");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativada", "Desativada" }));

        nomeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeFieldKeyPressed(evt);
            }
        });

        motoristaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                motoristaFieldKeyReleased(evt);
            }
        });

        categoriaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoriaFieldKeyPressed(evt);
            }
        });

        tabelaNome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaNomeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaNome);

        filialLabel.setText("Filial:");

        tabelaFilial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabelaFilial);

        javax.swing.GroupLayout panelFilialLayout = new javax.swing.GroupLayout(panelFilial);
        panelFilial.setLayout(panelFilialLayout);
        panelFilialLayout.setHorizontalGroup(
            panelFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelFilialLayout.setVerticalGroup(
            panelFilialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jLabel1.setText("Hr retirada:");

        try {
            hrRetField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelDeDadosLayout = new javax.swing.GroupLayout(panelDeDados);
        panelDeDados.setLayout(panelDeDadosLayout);
        panelDeDadosLayout.setHorizontalGroup(
            panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(categoriaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDeDadosLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dataLocLabel)
                                            .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelDeDadosLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(panelMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelDeDadosLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dtLocField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hrRetField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(motoristaLabel)
                                            .addGroup(panelDeDadosLayout.createSequentialGroup()
                                                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(categoriaField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                                    .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(65, 65, 65)
                                                .addComponent(filialLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(panelFilial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(filialField)
                                            .addComponent(motoristaField)))))
                            .addGroup(panelDeDadosLayout.createSequentialGroup()
                                .addComponent(valorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorResField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(statusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addComponent(dataResLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        panelDeDadosLayout.setVerticalGroup(
            panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motoristaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motoristaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categoriaLabel)
                        .addComponent(categoriaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filialLabel)
                        .addComponent(filialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataResLabel)
                    .addComponent(dataLocLabel)
                    .addComponent(dtLocField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(hrRetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorResField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarButton)
                .addGap(50, 50, 50))
            .addGroup(fundoLayout.createSequentialGroup()
                .addComponent(panelDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addComponent(panelDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void tabelaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaNomeMouseClicked
        linha = tabelaNome.getSelectedRow();
        
        try{
            pessoaReservante = fachada.getPessoaId((Long) tabelaNome.getValueAt(linha, 0));
            nomeField.setText(pessoaReservante.getNome());
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_tabelaNomeMouseClicked

    private void nomeFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFieldKeyPressed

        preencherTabelaPessoaRes();
          
    }//GEN-LAST:event_nomeFieldKeyPressed

    private void tabelaMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMotoristaMouseClicked
        linha = tabelaMotorista.getSelectedRow();
        
        try{
            motorista = fachada.getPessoaFisicaPorId((Long) tabelaMotorista.getValueAt(linha, 0));
            motoristaField.setText(motorista.getNome());
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_tabelaMotoristaMouseClicked

    private void motoristaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_motoristaFieldKeyReleased
       preencherTabelaMotorista();
       
    }//GEN-LAST:event_motoristaFieldKeyReleased

    private void tabelaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCategoriaMouseClicked
        linha = tabelaCategoria.getSelectedRow();
        
        try{
            categoria = fachada.getPessoaCategoriaPorId((Long) tabelaCategoria.getValueAt(linha, 0));
            categoriaField.setText(categoria.getNomeCategoria());
            preencherValor();
        }
        catch(Exception e){
            
        }
       
    }//GEN-LAST:event_tabelaCategoriaMouseClicked

    private void categoriaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriaFieldKeyPressed
      
        preencherCategoria();
    }//GEN-LAST:event_categoriaFieldKeyPressed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        
        Reserva reserva = new Reserva();
        try{
//        reserva.setValorEntrada(Double.valueOf(valorResField.getText()));
//        reserva.setPessoa(pessoaReservante);
//        reserva.setPessoaFisica(motorista);
//        reserva.setCategoria(categoria);
        reserva.setStatus(comboStatus.getSelectedItem().toString().toUpperCase());
      
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("HH:mm");
        
        try {
            Date data = format.parse(dtLocField.getText());
            reserva.setDataHrLocacao(data);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Date hora = format1.parse(hrRetField.getText());
            reserva.setHr_locacao(hora);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        fachada.SalvarReserva(reserva);
        JOptionPane.showMessageDialog(this, "Reserva cadastrada com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Reserva ERRADA!");
           this.dispose(); 
        }
       
    }//GEN-LAST:event_salvarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField categoriaField;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel dataLocLabel;
    private javax.swing.JLabel dataResLabel;
    private javax.swing.JFormattedTextField dtLocField;
    private javax.swing.JTextField filialField;
    private javax.swing.JLabel filialLabel;
    private javax.swing.JPanel fundo;
    private javax.swing.JFormattedTextField hrRetField;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField motoristaField;
    private javax.swing.JLabel motoristaLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelDeDados;
    private javax.swing.JPanel panelFilial;
    private javax.swing.JPanel panelMotorista;
    private javax.swing.JPanel panelNome;
    private javax.swing.JButton salvarButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JTable tabelaFilial;
    private javax.swing.JTable tabelaMotorista;
    private javax.swing.JTable tabelaNome;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JTextField valorResField;
    // End of variables declaration//GEN-END:variables


    public void preencherTabelaPessoaRes(){
        List<Pessoa> pessoas = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"",""};
        
        
        try{
            pessoas = fachada.getPessoaPorNome(nomeField.getText().toUpperCase());
            for(Pessoa pesReservante:pessoas){
                dados.add(new Object[]{pesReservante.getId(), pesReservante.getNome()});
            }
        }
        catch(Exception ex){
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        tabelaNome.setModel(modelo);
        tabelaNome.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaNome.getColumnModel().getColumn(0).setResizable(false);
        tabelaNome.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabelaNome.getColumnModel().getColumn(1).setResizable(false);
        tabelaNome.setAutoResizeMode(tabelaNome.AUTO_RESIZE_OFF);
        tabelaNome.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        
    }
    
    public void preencherTabelaMotorista(){
        
         List<PessoaFisica> motoristas = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"COD.","NOME"};
        
        try{
            motoristas = fachada.getTodasPessoaFisica();
            for(PessoaFisica mot: motoristas){
                dados.add(new Object[]{mot.getId(), mot.getNome()});
            }
        }
        catch(Exception ex){
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        tabelaMotorista.setModel(modelo);
        tabelaMotorista.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaMotorista.getColumnModel().getColumn(0).setResizable(false);
        tabelaMotorista.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabelaMotorista.getColumnModel().getColumn(1).setResizable(false);
        tabelaMotorista.setAutoResizeMode(tabelaMotorista.AUTO_RESIZE_OFF);
        tabelaMotorista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void preencherCategoria(){
        
        List<Categoria> categorias = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"", ""};
        
        try{
            categorias = fachada.getTodasCategorias();
            for(Categoria cat: categorias){
                dados.add(new Object[]{cat.getId(), cat.getNomeCategoria()});
            }
        }
        catch(Exception ex){
            
        }
                 
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        tabelaCategoria.setModel(modelo);
        tabelaCategoria.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaCategoria.getColumnModel().getColumn(0).setResizable(false);
        tabelaCategoria.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaCategoria.getColumnModel().getColumn(1).setResizable(false);
        tabelaCategoria.setAutoResizeMode(tabelaCategoria.AUTO_RESIZE_OFF);
        tabelaCategoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void preencherValor(){
        
         Double metValorCat;
         
         metValorCat= categoria.getPrecoCat()/2;
         valorResField.setText(String.valueOf(metValorCat));
    }
}
