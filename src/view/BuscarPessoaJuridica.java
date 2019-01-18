package view;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.PessoaJuridicaDAO;
import br.com.locadoraPBD.model.beans.PessoaFisica;
import br.com.locadoraPBD.model.beans.PessoaJuridica;
import br.com.locadoraPBD.model.business.ModeloTabela;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dayla
 */
public class BuscarPessoaJuridica extends javax.swing.JDialog {

    PessoaJuridicaDAO pessoaJDAO = new PessoaJuridicaDAO(Conexao.conexao());
    private int linha;
    
    public BuscarPessoaJuridica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);       
        initComponents();
        panelCadPJ.setBackground(new Color(0,0,0,0));
         preencherTabela(2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPesq = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        panelPesquisa = new javax.swing.JPanel();
        pesqLabel = new javax.swing.JLabel();
        pesqField = new javax.swing.JTextField();
        pesqNome = new javax.swing.JRadioButton();
        pesqCNPJ = new javax.swing.JRadioButton();
        panelCadPJ = new javax.swing.JPanel();
        labelNovoCad = new javax.swing.JLabel();
        editbutton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar pessoa jurídica");

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelPesquisa.setBackground(new java.awt.Color(242, 242, 198));

        pesqLabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        pesqLabel.setText("Pesquisar:");

        pesqField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesqFieldKeyReleased(evt);
            }
        });

        grupoPesq.add(pesqNome);
        pesqNome.setText("Buscar por nome");

        grupoPesq.add(pesqCNPJ);
        pesqCNPJ.setText("Buscar por CNPJ");

        panelCadPJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCadPJMouseClicked(evt);
            }
        });

        labelNovoCad.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        labelNovoCad.setForeground(new java.awt.Color(0, 51, 204));
        labelNovoCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addPessoa.png"))); // NOI18N
        labelNovoCad.setText("Cadastrar uma nova empresa");

        javax.swing.GroupLayout panelCadPJLayout = new javax.swing.GroupLayout(panelCadPJ);
        panelCadPJ.setLayout(panelCadPJLayout);
        panelCadPJLayout.setHorizontalGroup(
            panelCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadPJLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNovoCad)
                .addContainerGap())
        );
        panelCadPJLayout.setVerticalGroup(
            panelCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadPJLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelNovoCad))
        );

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(pesqLabel)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(pesqNome)
                        .addGap(10, 10, 10)
                        .addComponent(pesqCNPJ))
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesqField, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesqLabel)
                    .addComponent(pesqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesqNome)
                    .addComponent(pesqCNPJ))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        editbutton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editbutton.setText("Editar");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
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

            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(panelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton)
                        .addGap(48, 48, 48))))
            .addComponent(jScrollPane2)
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelCadPJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCadPJMouseClicked
        CadastroPessoaJuridica cadPJ = new CadastroPessoaJuridica(new TelaInicialSuper(), true);
        cadPJ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panelCadPJMouseClicked

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void pesqFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesqFieldKeyReleased
        preencherTabela(1);
    }//GEN-LAST:event_pesqFieldKeyReleased

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        AlterarPessoaJur alterarPJ = new AlterarPessoaJur(new TelaInicialSuper(), true, 
                pessoaJDAO.getPessoaJuridicaPorId((Long) tabela.getValueAt(linha, 0)));

       alterarPJ.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_editbuttonActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        linha = tabela.getSelectedRow();
    }//GEN-LAST:event_tabelaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton editbutton;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoPesq;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNovoCad;
    private javax.swing.JPanel panelCadPJ;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JRadioButton pesqCNPJ;
    private javax.swing.JTextField pesqField;
    private javax.swing.JLabel pesqLabel;
    private javax.swing.JRadioButton pesqNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    
    private void preencherTabela(int tipo) {
      
        List<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"ID","NOME","CNPJ", "INSCRICAO"};
        
        try{
            if(tipo==1){
                if(pesqNome.isSelected()){
                    pessoasJuridicas = pessoaJDAO.getPessoaJuridicaPorNome(pesqField.getText().toUpperCase());
                    for(PessoaJuridica pj : pessoasJuridicas){
                        dados.add(new Object[]{pj.getId(), pj.getNome(), pj.getCnpj(), pj.getInscricaoEstadual()});
                    }
                }
                else if(pesqCNPJ.isSelected()){
                    pessoasJuridicas = pessoaJDAO.getPessoaJuridicaPorCnpj(pesqField.getText().toUpperCase());
                    for(PessoaJuridica pj : pessoasJuridicas){
                        dados.add(new Object[]{pj.getId(), pj.getNome(), pj.getCnpj(), pj.getInscricaoEstadual()});
                    }
                }
            }
            else if(tipo==2){
                pessoasJuridicas = pessoaJDAO.getTodasPessoasJuridicas();
                    for(PessoaJuridica pj : pessoasJuridicas){
                         dados.add(new Object[]{pj.getId(), pj.getNome(), pj.getCnpj(), pj.getInscricaoEstadual()});
                    }
            }
            
        }catch(Exception e){
            
        }
        
        
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(25);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
