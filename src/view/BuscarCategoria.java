package view;

import java.awt.Color;

/**
 *
 * @author Dayla
 */
public class BuscarCategoria extends javax.swing.JDialog {

    public BuscarCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelCadCateg.setBackground(new Color(0,0,0,0));
        pesqField.setText("Digite aqui o nome da categoria");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar categoria");

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelPesq.setBackground(new java.awt.Color(240, 252, 252));

        pesqLabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        pesqLabel.setText("Pesquisar:");

        pesqField.setName("Digite o nome da categoria"); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panelPesqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesqLabel)
                    .addComponent(pesqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadCatLabel;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel panelCadCateg;
    private javax.swing.JPanel panelPesq;
    private javax.swing.JTextField pesqField;
    private javax.swing.JLabel pesqLabel;
    // End of variables declaration//GEN-END:variables
}
