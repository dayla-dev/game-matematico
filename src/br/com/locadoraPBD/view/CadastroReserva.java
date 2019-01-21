package br.com.locadoraPBD.view;

import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Pessoa;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import br.com.locadoraPBD.model.business.ModeloTabela;
import br.com.locadoraPBD.model.fachada.Fachada;
import java.util.ArrayList;
import java.util.List;
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
        nomeField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNome = new javax.swing.JTable();
        panelMotorista = new javax.swing.JPanel();
        motoristaField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMotorista = new javax.swing.JTable();
        dataResLabel = new javax.swing.JLabel();
        dataHoraReserva = new javax.swing.JFormattedTextField();
        horaResLabel = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        dataLocLabel = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        horaLocLabel = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        categoriaLabel = new javax.swing.JLabel();
        panelCategoria = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        categoriaField = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        valorResField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        jScrollPane1.setViewportView(tabelaNome);

        javax.swing.GroupLayout panelNomeLayout = new javax.swing.GroupLayout(panelNome);
        panelNome.setLayout(panelNomeLayout);
        panelNomeLayout.setHorizontalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        panelNomeLayout.setVerticalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jScrollPane2.setViewportView(tabelaMotorista);

        javax.swing.GroupLayout panelMotoristaLayout = new javax.swing.GroupLayout(panelMotorista);
        panelMotorista.setLayout(panelMotoristaLayout);
        panelMotoristaLayout.setHorizontalGroup(
            panelMotoristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(motoristaField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelMotoristaLayout.setVerticalGroup(
            panelMotoristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMotoristaLayout.createSequentialGroup()
                .addComponent(motoristaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dataResLabel.setText("Data da reserva:");

        try {
            dataHoraReserva.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        horaResLabel.setText("Horário da reserva:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dataLocLabel.setText("Data da locação:");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        horaLocLabel.setText("Horário da locação:");

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
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
        jScrollPane3.setViewportView(tabelaCategoria);

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(categoriaField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoriaLayout.createSequentialGroup()
                .addComponent(categoriaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        valorLabel.setText("Valor:");

        statusLabel.setText("Status:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativada", "Desativada" }));

        javax.swing.GroupLayout panelDeDadosLayout = new javax.swing.GroupLayout(panelDeDados);
        panelDeDados.setLayout(panelDeDadosLayout);
        panelDeDadosLayout.setHorizontalGroup(
            panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(motoristaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addComponent(categoriaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorResField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDeDadosLayout.createSequentialGroup()
                                .addComponent(dataLocLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDeDadosLayout.createSequentialGroup()
                                .addComponent(dataResLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataHoraReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(horaResLabel)
                            .addComponent(horaLocLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDeDadosLayout.setVerticalGroup(
            panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeLabel)
                        .addComponent(motoristaLabel))
                    .addComponent(panelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataResLabel)
                    .addComponent(dataHoraReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaResLabel)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataLocLabel)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaLocLabel)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(categoriaLabel))
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDeDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelDeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorLabel)
                            .addComponent(valorResField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salvarButton.setText("Salvar");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarButton)
                .addGap(61, 61, 61))
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField categoriaField;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JFormattedTextField dataHoraReserva;
    private javax.swing.JLabel dataLocLabel;
    private javax.swing.JLabel dataResLabel;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel horaLocLabel;
    private javax.swing.JLabel horaResLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField motoristaField;
    private javax.swing.JLabel motoristaLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelDeDados;
    private javax.swing.JPanel panelMotorista;
    private javax.swing.JPanel panelNome;
    private javax.swing.JButton salvarButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JTable tabelaMotorista;
    private javax.swing.JTable tabelaNome;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JTextField valorResField;
    // End of variables declaration//GEN-END:variables


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
        String[] coluna = new String[]{"Cód.", "Nome"};
        
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
    
}
