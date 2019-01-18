package br.com.locadoraPBD.view;

/**
 *
 * @author Dayla
 */
public class CadastroCamionetePass extends javax.swing.JDialog {

    
    public CadastroCamionetePass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCinto = new javax.swing.ButtonGroup();
        grupoDirecaoAss = new javax.swing.ButtonGroup();
        grupoRodas = new javax.swing.ButtonGroup();
        grupoContPol = new javax.swing.ButtonGroup();
        grupoAr = new javax.swing.ButtonGroup();
        grupoDVD = new javax.swing.ButtonGroup();
        grupoMP3 = new javax.swing.ButtonGroup();
        grupoRadio = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        panelInfCamPass = new javax.swing.JPanel();
        modeloLB2 = new javax.swing.JLabel();
        modeloFD2 = new javax.swing.JTextField();
        fabLB = new javax.swing.JLabel();
        fabFD = new javax.swing.JTextField();
        anoFabLB = new javax.swing.JLabel();
        anoFabFD = new javax.swing.JTextField();
        anoModLB = new javax.swing.JLabel();
        anoModFD = new javax.swing.JTextField();
        tamLB = new javax.swing.JLabel();
        numPortasLB = new javax.swing.JLabel();
        comboTamFD = new javax.swing.JComboBox<>();
        numPortasFD = new javax.swing.JTextField();
        numPassLB = new javax.swing.JLabel();
        numPassFD = new javax.swing.JTextField();
        corLB = new javax.swing.JLabel();
        corFD = new javax.swing.JTextField();
        kmAtualLB = new javax.swing.JLabel();
        kmAtualFD = new javax.swing.JTextField();
        motorLB = new javax.swing.JLabel();
        motorFD = new javax.swing.JTextField();
        chassiLB = new javax.swing.JLabel();
        chassiFD = new javax.swing.JTextField();
        torqueMotorLB = new javax.swing.JLabel();
        torqueMotorFD = new javax.swing.JTextField();
        combLB = new javax.swing.JLabel();
        combusFD = new javax.swing.JComboBox<>();
        placaLB = new javax.swing.JLabel();
        placaFD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        panelDisponibilidade = new javax.swing.JPanel();
        statusLB = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        catLB = new javax.swing.JLabel();
        catFD = new javax.swing.JTextField();
        panelAcessoriosPass = new javax.swing.JPanel();
        arCondLB3 = new javax.swing.JLabel();
        arSimGroup3 = new javax.swing.JRadioButton();
        arNaoGroup3 = new javax.swing.JRadioButton();
        dvdLB3 = new javax.swing.JLabel();
        dvdSimGroup3 = new javax.swing.JRadioButton();
        dvdNaoGroup3 = new javax.swing.JRadioButton();
        mp3LB3 = new javax.swing.JLabel();
        mp3SimGroup3 = new javax.swing.JRadioButton();
        mp3NaoGroup3 = new javax.swing.JRadioButton();
        radioLB3 = new javax.swing.JLabel();
        radioSimGroup3 = new javax.swing.JRadioButton();
        radioNaoGroup3 = new javax.swing.JRadioButton();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela cadastro camionete de passageiros");

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelInfCamPass.setBackground(new java.awt.Color(255, 255, 255));
        panelInfCamPass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Informações da camionete de passageiros"));

        modeloLB2.setText("Modelo:");

        modeloFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloFD2ActionPerformed(evt);
            }
        });

        fabLB.setText("Fabricante:");

        anoFabLB.setText("Ano fabricação:");

        anoModLB.setText("Ano do modelo:");

        tamLB.setText("Tamanho:");

        numPortasLB.setText("Nº de portas:");

        comboTamFD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Mini", "Pequeno", "Médio", "Grande" }));

        numPassLB.setText("Nº de passageiros:");

        corLB.setText("Cor:");

        kmAtualLB.setText("Km atual:");

        kmAtualFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmAtualFDActionPerformed(evt);
            }
        });

        motorLB.setText("Motor:");

        chassiLB.setText("Chassi:");

        torqueMotorLB.setText("Torque do motor:");

        combLB.setText("Tipo de combustível:");

        combusFD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Etanol", "Diesel" }));

        placaLB.setText("Placa:");

        jLabel1.setText("Airbag:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simples-dianteira", "Duplo-dianteira", "Total" }));

        jLabel2.setText("Direção assistida:");

        grupoDirecaoAss.add(jRadioButton1);
        jRadioButton1.setText("Sim");

        grupoDirecaoAss.add(jRadioButton2);
        jRadioButton2.setText("Não");

        jLabel3.setText("Cintos de segurança:");

        grupoCinto.add(jRadioButton3);
        jRadioButton3.setText("Sim");

        grupoCinto.add(jRadioButton4);
        jRadioButton4.setText("Não");

        jLabel4.setText("Rodas de liga leve:");

        grupoRodas.add(jRadioButton5);
        jRadioButton5.setText("Sim");

        grupoRodas.add(jRadioButton6);
        jRadioButton6.setText("Não");

        jLabel5.setText("Controle de poluição do ar:");

        grupoContPol.add(jRadioButton7);
        jRadioButton7.setText("Sim");

        grupoContPol.add(jRadioButton8);
        jRadioButton8.setText("Não");

        javax.swing.GroupLayout panelInfCamPassLayout = new javax.swing.GroupLayout(panelInfCamPass);
        panelInfCamPass.setLayout(panelInfCamPassLayout);
        panelInfCamPassLayout.setHorizontalGroup(
            panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfCamPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfCamPassLayout.createSequentialGroup()
                        .addComponent(torqueMotorLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(torqueMotorFD, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combusFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(placaLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placaFD))
                    .addGroup(panelInfCamPassLayout.createSequentialGroup()
                        .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelInfCamPassLayout.createSequentialGroup()
                                    .addComponent(motorLB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(motorFD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(chassiLB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chassiFD, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(kmAtualLB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kmAtualFD))
                                .addGroup(panelInfCamPassLayout.createSequentialGroup()
                                    .addComponent(modeloLB2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modeloFD2)
                                    .addGap(18, 18, 18)
                                    .addComponent(fabLB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fabFD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelInfCamPassLayout.createSequentialGroup()
                                    .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfCamPassLayout.createSequentialGroup()
                                            .addComponent(anoFabLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(anoFabFD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(anoModLB)
                                            .addGap(2, 2, 2)
                                            .addComponent(anoModFD, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelInfCamPassLayout.createSequentialGroup()
                                            .addComponent(numPortasLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(numPortasFD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(numPassLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(numPassFD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corLB)
                                            .addGap(6, 6, 6)))
                                    .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(corFD)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfCamPassLayout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(tamLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboTamFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelInfCamPassLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(panelInfCamPassLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton6))
                            .addGroup(panelInfCamPassLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInfCamPassLayout.setVerticalGroup(
            panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfCamPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloLB2)
                    .addComponent(modeloFD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabLB)
                    .addComponent(fabFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anoFabLB)
                    .addComponent(anoFabFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoModLB)
                    .addComponent(anoModFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamLB)
                    .addComponent(comboTamFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPortasLB)
                    .addComponent(numPortasFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numPassLB)
                    .addComponent(numPassFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corLB)
                    .addComponent(corFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmAtualLB)
                    .addComponent(kmAtualFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motorLB)
                    .addComponent(motorFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chassiLB)
                    .addComponent(chassiFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(torqueMotorLB)
                    .addComponent(torqueMotorFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combLB)
                    .addComponent(combusFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placaLB)
                    .addComponent(placaFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(5, 5, 5)
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfCamPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        panelDisponibilidade.setBackground(new java.awt.Color(255, 255, 255));
        panelDisponibilidade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Disponibilidade do veículo"));

        statusLB.setText("Status:");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Alugado", "Manutenção" }));

        catLB.setText("Categoria:");

        javax.swing.GroupLayout panelDisponibilidadeLayout = new javax.swing.GroupLayout(panelDisponibilidade);
        panelDisponibilidade.setLayout(panelDisponibilidadeLayout);
        panelDisponibilidadeLayout.setHorizontalGroup(
            panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(catLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catFD, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        panelDisponibilidadeLayout.setVerticalGroup(
            panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLB)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catLB)
                    .addComponent(catFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAcessoriosPass.setBackground(new java.awt.Color(255, 255, 255));
        panelAcessoriosPass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acessórios"));

        arCondLB3.setText("Ar-condicionado:");

        grupoAr.add(arSimGroup3);
        arSimGroup3.setText("Sim");

        grupoAr.add(arNaoGroup3);
        arNaoGroup3.setText("Não");

        dvdLB3.setText("DVD:");

        grupoDVD.add(dvdSimGroup3);
        dvdSimGroup3.setText("Sim");

        grupoDVD.add(dvdNaoGroup3);
        dvdNaoGroup3.setText("Não");

        mp3LB3.setText("MP3:");

        grupoMP3.add(mp3SimGroup3);
        mp3SimGroup3.setText("Sim");

        grupoMP3.add(mp3NaoGroup3);
        mp3NaoGroup3.setText("Não");

        radioLB3.setText("Rádio:");

        grupoRadio.add(radioSimGroup3);
        radioSimGroup3.setText("Sim");

        grupoRadio.add(radioNaoGroup3);
        radioNaoGroup3.setText("Não");

        javax.swing.GroupLayout panelAcessoriosPassLayout = new javax.swing.GroupLayout(panelAcessoriosPass);
        panelAcessoriosPass.setLayout(panelAcessoriosPassLayout);
        panelAcessoriosPassLayout.setHorizontalGroup(
            panelAcessoriosPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcessoriosPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcessoriosPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAcessoriosPassLayout.createSequentialGroup()
                        .addComponent(arCondLB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arSimGroup3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arNaoGroup3))
                    .addGroup(panelAcessoriosPassLayout.createSequentialGroup()
                        .addComponent(mp3LB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mp3SimGroup3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mp3NaoGroup3)))
                .addGap(60, 60, 60)
                .addGroup(panelAcessoriosPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAcessoriosPassLayout.createSequentialGroup()
                        .addComponent(dvdLB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dvdSimGroup3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dvdNaoGroup3))
                    .addGroup(panelAcessoriosPassLayout.createSequentialGroup()
                        .addComponent(radioLB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioSimGroup3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioNaoGroup3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAcessoriosPassLayout.setVerticalGroup(
            panelAcessoriosPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcessoriosPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcessoriosPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arCondLB3)
                    .addComponent(arSimGroup3)
                    .addComponent(arNaoGroup3)
                    .addComponent(dvdLB3)
                    .addComponent(dvdSimGroup3)
                    .addComponent(dvdNaoGroup3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAcessoriosPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mp3LB3)
                    .addComponent(mp3SimGroup3)
                    .addComponent(mp3NaoGroup3)
                    .addComponent(radioLB3)
                    .addComponent(radioSimGroup3)
                    .addComponent(radioNaoGroup3))
                .addContainerGap(17, Short.MAX_VALUE))
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
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfCamPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAcessoriosPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarButton)
                .addGap(41, 41, 41))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfCamPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAcessoriosPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modeloFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloFD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloFD2ActionPerformed

    private void kmAtualFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmAtualFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmAtualFDActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCamionetePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCamionetePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCamionetePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCamionetePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroCamionetePass dialog = new CadastroCamionetePass(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoFabFD;
    private javax.swing.JLabel anoFabLB;
    private javax.swing.JTextField anoModFD;
    private javax.swing.JLabel anoModLB;
    private javax.swing.JLabel arCondLB3;
    private javax.swing.JRadioButton arNaoGroup3;
    private javax.swing.JRadioButton arSimGroup3;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField catFD;
    private javax.swing.JLabel catLB;
    private javax.swing.JTextField chassiFD;
    private javax.swing.JLabel chassiLB;
    private javax.swing.JLabel combLB;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JComboBox<String> comboTamFD;
    private javax.swing.JComboBox<String> combusFD;
    private javax.swing.JTextField corFD;
    private javax.swing.JLabel corLB;
    private javax.swing.JLabel dvdLB3;
    private javax.swing.JRadioButton dvdNaoGroup3;
    private javax.swing.JRadioButton dvdSimGroup3;
    private javax.swing.JTextField fabFD;
    private javax.swing.JLabel fabLB;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoAr;
    private javax.swing.ButtonGroup grupoCinto;
    private javax.swing.ButtonGroup grupoContPol;
    private javax.swing.ButtonGroup grupoDVD;
    private javax.swing.ButtonGroup grupoDirecaoAss;
    private javax.swing.ButtonGroup grupoMP3;
    private javax.swing.ButtonGroup grupoRadio;
    private javax.swing.ButtonGroup grupoRodas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JTextField kmAtualFD;
    private javax.swing.JLabel kmAtualLB;
    private javax.swing.JTextField modeloFD2;
    private javax.swing.JLabel modeloLB2;
    private javax.swing.JTextField motorFD;
    private javax.swing.JLabel motorLB;
    private javax.swing.JLabel mp3LB3;
    private javax.swing.JRadioButton mp3NaoGroup3;
    private javax.swing.JRadioButton mp3SimGroup3;
    private javax.swing.JTextField numPassFD;
    private javax.swing.JLabel numPassLB;
    private javax.swing.JTextField numPortasFD;
    private javax.swing.JLabel numPortasLB;
    private javax.swing.JPanel panelAcessoriosPass;
    private javax.swing.JPanel panelDisponibilidade;
    private javax.swing.JPanel panelInfCamPass;
    private javax.swing.JTextField placaFD;
    private javax.swing.JLabel placaLB;
    private javax.swing.JLabel radioLB3;
    private javax.swing.JRadioButton radioNaoGroup3;
    private javax.swing.JRadioButton radioSimGroup3;
    private javax.swing.JButton salvarButton;
    private javax.swing.JLabel statusLB;
    private javax.swing.JLabel tamLB;
    private javax.swing.JTextField torqueMotorFD;
    private javax.swing.JLabel torqueMotorLB;
    // End of variables declaration//GEN-END:variables
}
