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
        panelAcessoRapido.setBackground(new Color(255,0,0,100));
        panelCadReserva.setBackground(new Color(0,0,0,100));
        panelBusReserva.setBackground(new Color(0,0,0,100));
        panelCadLocacao.setBackground(new Color(0,0,0,100));
        panelBusLocacao.setBackground(new Color(0,0,0,100));
        panelCadPF.setBackground(new Color(0,0,0,100));
        panelBusPF.setBackground(new Color(0,0,0,100));
        panelCadPJ.setBackground(new Color(0,0,0,100));
        panelBusPJ.setBackground(new Color(0,0,0,100));
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
        imageBusLoc = new javax.swing.JLabel();
        panelCadPF = new javax.swing.JPanel();
        cadPFjl = new javax.swing.JLabel();
        cadPFlb1 = new javax.swing.JLabel();
        imageAddPF = new javax.swing.JLabel();
        panelBusPF = new javax.swing.JPanel();
        busPfLB = new javax.swing.JLabel();
        busPfLB1 = new javax.swing.JLabel();
        imageBuscaPF = new javax.swing.JLabel();
        panelCadPJ = new javax.swing.JPanel();
        cadPjLB = new javax.swing.JLabel();
        cadPjLB1 = new javax.swing.JLabel();
        imageAddPJ = new javax.swing.JLabel();
        panelBusPJ = new javax.swing.JPanel();
        busPjLB = new javax.swing.JLabel();
        busPjLB1 = new javax.swing.JLabel();
        imageBusPJ = new javax.swing.JLabel();
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
        alocarVeiculo = new javax.swing.JMenuItem();
        configuracoes = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super usuário");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(640, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAcessoRapido.setBackground(new java.awt.Color(255, 0, 0));
        panelAcessoRapido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acesso rápido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        panelCadReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
            .addGroup(panelCadReservaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(iconeReserva)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadReservaLayout.setVerticalGroup(
            panelCadReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconeReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(realizarResLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        panelBusReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusReservaLayout.setVerticalGroup(
            panelBusReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(busReservaLabel)
                .addGap(21, 21, 21))
        );

        panelCadLocacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCadLocacao.setPreferredSize(new java.awt.Dimension(109, 86));
        panelCadLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCadLocacaoMouseClicked(evt);
            }
        });

        realizarLocacaoLb.setBackground(new java.awt.Color(255, 255, 255));
        realizarLocacaoLb.setForeground(new java.awt.Color(255, 255, 255));
        realizarLocacaoLb.setText(" Realizar Locação");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car.png"))); // NOI18N

        javax.swing.GroupLayout panelCadLocacaoLayout = new javax.swing.GroupLayout(panelCadLocacao);
        panelCadLocacao.setLayout(panelCadLocacaoLayout);
        panelCadLocacaoLayout.setHorizontalGroup(
            panelCadLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadLocacaoLayout.createSequentialGroup()
                .addComponent(realizarLocacaoLb)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(panelCadLocacaoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadLocacaoLayout.setVerticalGroup(
            panelCadLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadLocacaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(realizarLocacaoLb)
                .addGap(21, 21, 21))
        );

        panelBusLocacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBusLocacao.setPreferredSize(new java.awt.Dimension(109, 86));
        panelBusLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBusLocacaoMouseClicked(evt);
            }
        });

        busLocLabel.setBackground(new java.awt.Color(255, 255, 255));
        busLocLabel.setForeground(new java.awt.Color(255, 255, 255));
        busLocLabel.setText("  Buscar Locação");

        imageBusLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarLoc.png"))); // NOI18N

        javax.swing.GroupLayout panelBusLocacaoLayout = new javax.swing.GroupLayout(panelBusLocacao);
        panelBusLocacao.setLayout(panelBusLocacaoLayout);
        panelBusLocacaoLayout.setHorizontalGroup(
            panelBusLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusLocacaoLayout.createSequentialGroup()
                .addComponent(busLocLabel)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(panelBusLocacaoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(imageBusLoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusLocacaoLayout.setVerticalGroup(
            panelBusLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusLocacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageBusLoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busLocLabel)
                .addGap(21, 21, 21))
        );

        panelCadPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCadPF.setPreferredSize(new java.awt.Dimension(109, 86));
        panelCadPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCadPFMouseClicked(evt);
            }
        });

        cadPFjl.setBackground(new java.awt.Color(255, 255, 255));
        cadPFjl.setForeground(new java.awt.Color(255, 255, 255));
        cadPFjl.setText(" Cadastrar pessoa");

        cadPFlb1.setBackground(new java.awt.Color(255, 255, 255));
        cadPFlb1.setForeground(new java.awt.Color(255, 255, 255));
        cadPFlb1.setText("física");

        imageAddPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addPf.png"))); // NOI18N

        javax.swing.GroupLayout panelCadPFLayout = new javax.swing.GroupLayout(panelCadPF);
        panelCadPF.setLayout(panelCadPFLayout);
        panelCadPFLayout.setHorizontalGroup(
            panelCadPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadPFLayout.createSequentialGroup()
                .addGroup(panelCadPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadPFjl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addGroup(panelCadPFLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cadPFlb1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelCadPFLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imageAddPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadPFLayout.setVerticalGroup(
            panelCadPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadPFLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(imageAddPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadPFjl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadPFlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBusPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBusPF.setPreferredSize(new java.awt.Dimension(109, 86));
        panelBusPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBusPFMouseClicked(evt);
            }
        });

        busPfLB.setBackground(new java.awt.Color(255, 255, 255));
        busPfLB.setForeground(new java.awt.Color(255, 255, 255));
        busPfLB.setText("Buscar pessoa ");

        busPfLB1.setBackground(new java.awt.Color(255, 255, 255));
        busPfLB1.setForeground(new java.awt.Color(255, 255, 255));
        busPfLB1.setText("física");

        imageBuscaPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarPF.png"))); // NOI18N

        javax.swing.GroupLayout panelBusPFLayout = new javax.swing.GroupLayout(panelBusPF);
        panelBusPF.setLayout(panelBusPFLayout);
        panelBusPFLayout.setHorizontalGroup(
            panelBusPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusPFLayout.createSequentialGroup()
                .addGroup(panelBusPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusPFLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(busPfLB, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addGroup(panelBusPFLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(busPfLB1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelBusPFLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imageBuscaPF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusPFLayout.setVerticalGroup(
            panelBusPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusPFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageBuscaPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busPfLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busPfLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCadPJ.setPreferredSize(new java.awt.Dimension(109, 86));
        panelCadPJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCadPJMouseClicked(evt);
            }
        });

        cadPjLB.setBackground(new java.awt.Color(255, 255, 255));
        cadPjLB.setForeground(new java.awt.Color(255, 255, 255));
        cadPjLB.setText(" Cadastrar pessoa");

        cadPjLB1.setBackground(new java.awt.Color(255, 255, 255));
        cadPjLB1.setForeground(new java.awt.Color(255, 255, 255));
        cadPjLB1.setText("jurídica");

        imageAddPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addPJ.png"))); // NOI18N

        javax.swing.GroupLayout panelCadPJLayout = new javax.swing.GroupLayout(panelCadPJ);
        panelCadPJ.setLayout(panelCadPJLayout);
        panelCadPJLayout.setHorizontalGroup(
            panelCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadPjLB, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
            .addGroup(panelCadPJLayout.createSequentialGroup()
                .addGroup(panelCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadPJLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(cadPjLB1))
                    .addGroup(panelCadPJLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(imageAddPJ)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadPJLayout.setVerticalGroup(
            panelCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadPJLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageAddPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadPjLB)
                .addGap(1, 1, 1)
                .addComponent(cadPjLB1)
                .addContainerGap())
        );

        panelBusPJ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBusPJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBusPJMouseClicked(evt);
            }
        });

        busPjLB.setBackground(new java.awt.Color(255, 255, 255));
        busPjLB.setForeground(new java.awt.Color(255, 255, 255));
        busPjLB.setText("  Buscar pessoa");

        busPjLB1.setBackground(new java.awt.Color(255, 255, 255));
        busPjLB1.setForeground(new java.awt.Color(255, 255, 255));
        busPjLB1.setText("jurídica");

        imageBusPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarPJ.png"))); // NOI18N

        javax.swing.GroupLayout panelBusPJLayout = new javax.swing.GroupLayout(panelBusPJ);
        panelBusPJ.setLayout(panelBusPJLayout);
        panelBusPJLayout.setHorizontalGroup(
            panelBusPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusPJLayout.createSequentialGroup()
                .addGroup(panelBusPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busPjLB)
                    .addGroup(panelBusPJLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(busPjLB1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelBusPJLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(imageBusPJ)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBusPJLayout.setVerticalGroup(
            panelBusPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusPJLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageBusPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busPjLB)
                .addGap(1, 1, 1)
                .addComponent(busPjLB1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAcessoRapidoLayout = new javax.swing.GroupLayout(panelAcessoRapido);
        panelAcessoRapido.setLayout(panelAcessoRapidoLayout);
        panelAcessoRapidoLayout.setHorizontalGroup(
            panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcessoRapidoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAcessoRapidoLayout.createSequentialGroup()
                        .addComponent(panelCadPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBusPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBusPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(panelAcessoRapidoLayout.createSequentialGroup()
                        .addComponent(panelCadReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBusReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCadLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBusLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelAcessoRapidoLayout.setVerticalGroup(
            panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcessoRapidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCadReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBusReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(panelCadLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(panelBusLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCadPF, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(panelBusPF, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(panelCadPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(panelBusPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelAcessoRapido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 540, 240));

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
        veiculoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoCadActionPerformed(evt);
            }
        });
        cadastro.add(veiculoCad);

        CamionteCargaCad.setText("Camionete carga");
        CamionteCargaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamionteCargaCadActionPerformed(evt);
            }
        });
        cadastro.add(CamionteCargaCad);

        camionetePassCad.setText("Camionete passageiros");
        camionetePassCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camionetePassCadActionPerformed(evt);
            }
        });
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
        bPessoaFis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPessoaFisActionPerformed(evt);
            }
        });
        buscas.add(bPessoaFis);

        bPessoaJur.setText("Pessoa Jurídica");
        bPessoaJur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPessoaJurActionPerformed(evt);
            }
        });
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

        alocarVeiculo.setText("Alocar Veículo");
        servicos.add(alocarVeiculo);

        jMenuBar1.add(servicos);

        configuracoes.setText("Configurações");

        sair.setText("Sair");
        configuracoes.add(sair);

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
        BuscarCategoria buscarCat = new BuscarCategoria(this, true);
        buscarCat.setVisible(true);
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

    private void veiculoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoCadActionPerformed
        CadastroVeiculo cadVeiculo = new CadastroVeiculo(this, true);
        cadVeiculo.setVisible(true);
    }//GEN-LAST:event_veiculoCadActionPerformed

    private void CamionteCargaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamionteCargaCadActionPerformed
        CadastroCamioneteCarga cadCamCarga = new CadastroCamioneteCarga(this, true);
        cadCamCarga.setVisible(true);
    }//GEN-LAST:event_CamionteCargaCadActionPerformed

    private void camionetePassCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camionetePassCadActionPerformed
        CadastroCamionetePass cadCamPassageiros = new CadastroCamionetePass(this, true);
        cadCamPassageiros.setVisible(true);
    }//GEN-LAST:event_camionetePassCadActionPerformed

    private void bPessoaFisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPessoaFisActionPerformed
        BuscarPessoaFisica buscarPF = new BuscarPessoaFisica(this, true);
        buscarPF.setVisible(true);
    }//GEN-LAST:event_bPessoaFisActionPerformed

    private void bPessoaJurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPessoaJurActionPerformed
        BuscarPessoaJuridica buscarPJ = new BuscarPessoaJuridica(this, true);
        buscarPJ.setVisible(true);
    }//GEN-LAST:event_bPessoaJurActionPerformed

    private void panelCadPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCadPFMouseClicked
        CadastroPessoaFisica cadPF = new CadastroPessoaFisica(this, true);
        cadPF.setVisible(true);
    }//GEN-LAST:event_panelCadPFMouseClicked

    private void panelBusPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBusPFMouseClicked
        BuscarPessoaFisica buscaPF = new BuscarPessoaFisica(this, true);
        buscaPF.setVisible(true);
    }//GEN-LAST:event_panelBusPFMouseClicked

    private void panelCadPJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCadPJMouseClicked
        CadastroPessoaJuridica cadPJ = new CadastroPessoaJuridica(this, true);
        cadPJ.setVisible(true);
    }//GEN-LAST:event_panelCadPJMouseClicked

    private void panelBusPJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBusPJMouseClicked
        BuscarPessoaJuridica buscarPJ = new BuscarPessoaJuridica(this, true);
        buscarPJ.setVisible(true);
    }//GEN-LAST:event_panelBusPJMouseClicked

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/car.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CamionteCargaCad;
    private javax.swing.JMenuItem alocarVeiculo;
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
    private javax.swing.JLabel busPfLB;
    private javax.swing.JLabel busPfLB1;
    private javax.swing.JLabel busPjLB;
    private javax.swing.JLabel busPjLB1;
    private javax.swing.JLabel busReservaLabel;
    private javax.swing.JMenu buscas;
    private javax.swing.JLabel cadPFjl;
    private javax.swing.JLabel cadPFlb1;
    private javax.swing.JLabel cadPjLB;
    private javax.swing.JLabel cadPjLB1;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem camionetePassCad;
    private javax.swing.JMenuItem categoriaCad;
    private javax.swing.JMenu configuracoes;
    private javax.swing.JMenuItem filialCad;
    private javax.swing.JLabel iconeReserva;
    private javax.swing.JLabel imageAddPF;
    private javax.swing.JLabel imageAddPJ;
    private javax.swing.JLabel imageBusLoc;
    private javax.swing.JLabel imageBusPJ;
    private javax.swing.JLabel imageBuscaPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelAcessoRapido;
    private javax.swing.JPanel panelBusLocacao;
    private javax.swing.JPanel panelBusPF;
    private javax.swing.JPanel panelBusPJ;
    private javax.swing.JPanel panelBusReserva;
    private javax.swing.JPanel panelCadLocacao;
    private javax.swing.JPanel panelCadPF;
    private javax.swing.JPanel panelCadPJ;
    private javax.swing.JPanel panelCadReserva;
    private javax.swing.JMenuItem pessoaFisCad;
    private javax.swing.JMenuItem pessoaJurCad;
    private javax.swing.JLabel realizarLocacaoLb;
    private javax.swing.JLabel realizarResLabel;
    private javax.swing.JMenuItem reservarCategoria;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenu servicos;
    private javax.swing.JMenuItem usuariosCad;
    private javax.swing.JMenuItem veiculoCad;
    // End of variables declaration//GEN-END:variables

   

}
