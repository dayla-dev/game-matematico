package view;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Dayla
 */
public class TelaInicialSuper extends javax.swing.JFrame {

    public TelaInicialSuper() {
        initComponents();
        setIcon();
        panelAcessoRapido.setBackground(new Color(0,0,0,50));
        panelCadReserva.setBackground(new Color(0,0,0,100));
        panelBusReserva.setBackground(new Color(0,0,0,100));
        panelCadLocacao.setBackground(new Color(0,0,0,100));
        panelBusLocacao.setBackground(new Color(0,0,0,100));
        
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TelaInicialSuper().setVisible(true);
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAcessoRapido = new javax.swing.JPanel();
        panelCadReserva = new javax.swing.JPanel();
        realizarResLabel = new javax.swing.JLabel();
        iconeReserva = new javax.swing.JLabel();
        panelBusReserva = new javax.swing.JPanel();
        busReservaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelCadLocacao = new javax.swing.JPanel();
        realizarLocacaoLb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelBusLocacao = new javax.swing.JPanel();
        busLocLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        usuariosCad = new javax.swing.JMenuItem();
        pessoaFisCad = new javax.swing.JMenuItem();
        pessoaJurCad = new javax.swing.JMenuItem();
        filialCad = new javax.swing.JMenuItem();
        categoriaCad = new javax.swing.JMenuItem();
        veiculoCad = new javax.swing.JMenuItem();
        CamionteCargaCad = new javax.swing.JMenuItem();
        camionetePassCad = new javax.swing.JMenuItem();
        buscas = new javax.swing.JMenu();
        bUsuario = new javax.swing.JMenuItem();
        bPessoaFis = new javax.swing.JMenuItem();
        bPessoaJur = new javax.swing.JMenuItem();
        bFilial = new javax.swing.JMenuItem();
        bCategoria = new javax.swing.JMenuItem();
        bVeiculo = new javax.swing.JMenuItem();
        bCamioneteCar = new javax.swing.JMenuItem();
        bCamionetePas = new javax.swing.JMenuItem();
        servicos = new javax.swing.JMenu();
        reservarCategoria = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        configuracoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super usuário");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(640, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAcessoRapido.setBackground(new java.awt.Color(255, 255, 255));
        panelAcessoRapido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acesso rápido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        panelCadReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCadReservaMouseClicked(evt);
            }
        });

        realizarResLabel.setBackground(new java.awt.Color(255, 255, 255));
        realizarResLabel.setForeground(new java.awt.Color(255, 255, 255));
        realizarResLabel.setText(" Realizar Reserva");
        realizarResLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                realizarResLabelMouseClicked(evt);
            }
        });

        iconeReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar (5).png"))); // NOI18N
        iconeReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeReservaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCadReservaLayout = new javax.swing.GroupLayout(panelCadReserva);
        panelCadReserva.setLayout(panelCadReservaLayout);
        panelCadReservaLayout.setHorizontalGroup(
            panelCadReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(realizarResLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconeReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCadReservaLayout.setVerticalGroup(
            panelCadReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconeReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(realizarResLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBusReserva.setFocusTraversalPolicyProvider(true);
        panelBusReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBusReservaMouseClicked(evt);
            }
        });

        busReservaLabel.setBackground(new java.awt.Color(255, 255, 255));
        busReservaLabel.setForeground(new java.awt.Color(255, 255, 255));
        busReservaLabel.setText("  Buscar Reserva");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar (6).png"))); // NOI18N

        javax.swing.GroupLayout panelBusReservaLayout = new javax.swing.GroupLayout(panelBusReserva);
        panelBusReserva.setLayout(panelBusReservaLayout);
        panelBusReservaLayout.setHorizontalGroup(
            panelBusReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(busReservaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
            .addGroup(panelBusReservaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusReservaLayout.setVerticalGroup(
            panelBusReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busReservaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCadLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCadLocacaoMouseClicked(evt);
            }
        });

        realizarLocacaoLb.setBackground(new java.awt.Color(255, 255, 255));
        realizarLocacaoLb.setForeground(new java.awt.Color(255, 255, 255));
        realizarLocacaoLb.setText("  Realizar Locação");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car.png"))); // NOI18N

        javax.swing.GroupLayout panelCadLocacaoLayout = new javax.swing.GroupLayout(panelCadLocacao);
        panelCadLocacao.setLayout(panelCadLocacaoLayout);
        panelCadLocacaoLayout.setHorizontalGroup(
            panelCadLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadLocacaoLayout.createSequentialGroup()
                .addComponent(realizarLocacaoLb)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadLocacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
        );
        panelCadLocacaoLayout.setVerticalGroup(
            panelCadLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(realizarLocacaoLb)
                .addGap(21, 21, 21))
        );

        panelBusLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBusLocacaoMouseClicked(evt);
            }
        });

        busLocLabel.setBackground(new java.awt.Color(255, 255, 255));
        busLocLabel.setForeground(new java.awt.Color(255, 255, 255));
        busLocLabel.setText("Buscar Locação");

        javax.swing.GroupLayout panelBusLocacaoLayout = new javax.swing.GroupLayout(panelBusLocacao);
        panelBusLocacao.setLayout(panelBusLocacaoLayout);
        panelBusLocacaoLayout.setHorizontalGroup(
            panelBusLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(busLocLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusLocacaoLayout.setVerticalGroup(
            panelBusLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusLocacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(busLocLabel)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelAcessoRapidoLayout = new javax.swing.GroupLayout(panelAcessoRapido);
        panelAcessoRapido.setLayout(panelAcessoRapidoLayout);
        panelAcessoRapidoLayout.setHorizontalGroup(
            panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcessoRapidoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelCadReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panelBusReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelCadLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelBusLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        panelAcessoRapidoLayout.setVerticalGroup(
            panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcessoRapidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCadReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCadLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(panelAcessoRapido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 620, 230));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/telaBack.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 640, 490));

        cadastro.setText("Cadastrar");

        usuariosCad.setText("Usuarios");
        usuariosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosCadActionPerformed(evt);
            }
        });
        cadastro.add(usuariosCad);

        pessoaFisCad.setText("Pessoas físicas");
        pessoaFisCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaFisCadActionPerformed(evt);
            }
        });
        cadastro.add(pessoaFisCad);

        pessoaJurCad.setText("Pessoas jurídicas");
        pessoaJurCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaJurCadActionPerformed(evt);
            }
        });
        cadastro.add(pessoaJurCad);

        filialCad.setText("Filial");
        filialCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filialCadActionPerformed(evt);
            }
        });
        cadastro.add(filialCad);

        categoriaCad.setText("Categoria");
        categoriaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaCadActionPerformed(evt);
            }
        });
        cadastro.add(categoriaCad);

        veiculoCad.setText("Veículo");
        cadastro.add(veiculoCad);

        CamionteCargaCad.setText("Camionete carga");
        cadastro.add(CamionteCargaCad);

        camionetePassCad.setText("Camionete passageiros");
        cadastro.add(camionetePassCad);

        jMenuBar1.add(cadastro);

        buscas.setText("Buscar");

        bUsuario.setText("Usuario");
        bUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioActionPerformed(evt);
            }
        });
        buscas.add(bUsuario);

        bPessoaFis.setText("Pessoa Física");
        buscas.add(bPessoaFis);

        bPessoaJur.setText("Pessoa Jurídica");
        buscas.add(bPessoaJur);

        bFilial.setText("Filial");
        buscas.add(bFilial);

        bCategoria.setText("Categoria");
        bCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCategoriaActionPerformed(evt);
            }
        });
        buscas.add(bCategoria);

        bVeiculo.setText("Veiculo");
        bVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVeiculoActionPerformed(evt);
            }
        });
        buscas.add(bVeiculo);

        bCamioneteCar.setText("Camionete Carga");
        buscas.add(bCamioneteCar);

        bCamionetePas.setText("Camionete Passageiros");
        buscas.add(bCamionetePas);

        jMenuBar1.add(buscas);

        servicos.setText("Serviços");

        reservarCategoria.setText("Reservar Categoria");
        servicos.add(reservarCategoria);

        jMenuItem1.setText("Alocar Veículo");
        servicos.add(jMenuItem1);

        jMenuBar1.add(servicos);

        configuracoes.setText("Configurações");
        jMenuBar1.add(configuracoes);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categoriaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaCadActionPerformed
        CadastroCategoria cadCategoria = new CadastroCategoria(this, true);
        cadCategoria.setVisible(true);
    }//GEN-LAST:event_categoriaCadActionPerformed

    private void bVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVeiculoActionPerformed

    private void bUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bUsuarioActionPerformed

    private void bCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCategoriaActionPerformed

    private void usuariosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosCadActionPerformed
       CadastroUsuario cadUsuario = new CadastroUsuario(this, true);
       cadUsuario.setVisible(true);
    }//GEN-LAST:event_usuariosCadActionPerformed

    private void pessoaFisCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaFisCadActionPerformed
        CadastroPessoaFisica cadPessoaFisica = new CadastroPessoaFisica(this, true);
        cadPessoaFisica.setVisible(true);
    }//GEN-LAST:event_pessoaFisCadActionPerformed

    private void pessoaJurCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaJurCadActionPerformed
        CadastroPessoaJuridica cadPessoaJur = new CadastroPessoaJuridica(this, true);
        cadPessoaJur.setVisible(true);
    }//GEN-LAST:event_pessoaJurCadActionPerformed

    private void filialCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filialCadActionPerformed
        CadastroFilial cadFilial = new CadastroFilial(this, true);
        cadFilial.setVisible(true);
    }//GEN-LAST:event_filialCadActionPerformed

    private void realizarResLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realizarResLabelMouseClicked
      
    }//GEN-LAST:event_realizarResLabelMouseClicked

    private void iconeReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeReservaMouseClicked
      ;
    }//GEN-LAST:event_iconeReservaMouseClicked

    private void panelBusReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBusReservaMouseClicked
        BuscarReserva buscRes = new BuscarReserva(this, true);
        buscRes.setVisible(true);
    }//GEN-LAST:event_panelBusReservaMouseClicked

    private void panelCadReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCadReservaMouseClicked
        CadastroReserva cr = new CadastroReserva(this, true);
      cr.setVisible(true);
    }//GEN-LAST:event_panelCadReservaMouseClicked

    private void panelCadLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCadLocacaoMouseClicked
        CadastroLocacao cl = new CadastroLocacao(this, true);
        cl.setVisible(true);
    }//GEN-LAST:event_panelCadLocacaoMouseClicked

    private void panelBusLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBusLocacaoMouseClicked
        BuscarLocacao busLoc = new BuscarLocacao(this, true);
        busLoc.setVisible(true);
    }//GEN-LAST:event_panelBusLocacaoMouseClicked

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/car.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CamionteCargaCad;
    private javax.swing.JMenuItem bCamioneteCar;
    private javax.swing.JMenuItem bCamionetePas;
    private javax.swing.JMenuItem bCategoria;
    private javax.swing.JMenuItem bFilial;
    private javax.swing.JMenuItem bPessoaFis;
    private javax.swing.JMenuItem bPessoaJur;
    private javax.swing.JMenuItem bUsuario;
    private javax.swing.JMenuItem bVeiculo;
    private javax.swing.JLabel background;
    private javax.swing.JLabel busLocLabel;
    private javax.swing.JLabel busReservaLabel;
    private javax.swing.JMenu buscas;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem camionetePassCad;
    private javax.swing.JMenuItem categoriaCad;
    private javax.swing.JMenu configuracoes;
    private javax.swing.JMenuItem filialCad;
    private javax.swing.JLabel iconeReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panelAcessoRapido;
    private javax.swing.JPanel panelBusLocacao;
    private javax.swing.JPanel panelBusReserva;
    private javax.swing.JPanel panelCadLocacao;
    private javax.swing.JPanel panelCadReserva;
    private javax.swing.JMenuItem pessoaFisCad;
    private javax.swing.JMenuItem pessoaJurCad;
    private javax.swing.JLabel realizarLocacaoLb;
    private javax.swing.JLabel realizarResLabel;
    private javax.swing.JMenuItem reservarCategoria;
    private javax.swing.JMenu servicos;
    private javax.swing.JMenuItem usuariosCad;
    private javax.swing.JMenuItem veiculoCad;
    // End of variables declaration//GEN-END:variables

   

}
