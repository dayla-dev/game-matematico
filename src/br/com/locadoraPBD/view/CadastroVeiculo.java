package br.com.locadoraPBD.view;

import br.com.locadoraPBD.model.beans.Categoria;
import br.com.locadoraPBD.model.beans.Veiculo;
import br.com.locadoraPBD.model.business.ModeloTabela;
import br.com.locadoraPBD.model.fachada.Fachada;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Dayla
 */
public class CadastroVeiculo extends javax.swing.JDialog {
    
    private Fachada fachada;
    private Categoria categoria;
    private int linha;

    
    public CadastroVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CadastroVeiculo(java.awt.Frame parent, boolean modal, Fachada fachada) {
        super(parent, modal);
        initComponents();
        panelCat.setBackground(new Color(10,204,204,40));
        this.fachada=fachada;
        preencherTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoArCond = new javax.swing.ButtonGroup();
        grupoDVD = new javax.swing.ButtonGroup();
        grupoMP3 = new javax.swing.ButtonGroup();
        grupoRadio = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        panelInfVeiculo = new javax.swing.JPanel();
        modeloLB = new javax.swing.JLabel();
        modeloFD = new javax.swing.JTextField();
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
        panelDisponibilidade = new javax.swing.JPanel();
        statusLB = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        catLB = new javax.swing.JLabel();
        arCondLB = new javax.swing.JLabel();
        arSimGroup = new javax.swing.JRadioButton();
        arNaoGroup = new javax.swing.JRadioButton();
        mp3LB = new javax.swing.JLabel();
        mp3SimGroup = new javax.swing.JRadioButton();
        mp3NaoGroup = new javax.swing.JRadioButton();
        dvdLB = new javax.swing.JLabel();
        dvdSimGroup = new javax.swing.JRadioButton();
        dvdNaoGroup = new javax.swing.JRadioButton();
        radioLB = new javax.swing.JLabel();
        radioSimGroup = new javax.swing.JRadioButton();
        radioNaoGroup = new javax.swing.JRadioButton();
        panelCat = new javax.swing.JPanel();
        catFD = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de veículo");
        setMaximumSize(new java.awt.Dimension(496, 443));

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        panelInfVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        panelInfVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Informações do veículo"));

        modeloLB.setText("Modelo:");

        modeloFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloFDActionPerformed(evt);
            }
        });
        modeloFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modeloFDKeyPressed(evt);
            }
        });

        fabLB.setText("Fabricante:");

        fabFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fabFDKeyPressed(evt);
            }
        });

        anoFabLB.setText("Ano fabricação:");

        anoFabFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anoFabFDKeyPressed(evt);
            }
        });

        anoModLB.setText("Ano do modelo:");

        anoModFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anoModFDKeyPressed(evt);
            }
        });

        tamLB.setText("Tamanho:");

        numPortasLB.setText("Nº de portas:");

        comboTamFD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Mini", "Pequeno", "Médio", "Grande" }));
        comboTamFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboTamFDKeyPressed(evt);
            }
        });

        numPortasFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numPortasFDKeyPressed(evt);
            }
        });

        numPassLB.setText("Nº de passageiros:");

        numPassFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numPassFDKeyPressed(evt);
            }
        });

        corLB.setText("Cor:");

        corFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                corFDKeyPressed(evt);
            }
        });

        kmAtualLB.setText("Km atual:");

        kmAtualFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmAtualFDActionPerformed(evt);
            }
        });
        kmAtualFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kmAtualFDKeyPressed(evt);
            }
        });

        motorLB.setText("Motor:");

        motorFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                motorFDKeyPressed(evt);
            }
        });

        chassiLB.setText("Chassi:");

        chassiFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chassiFDKeyPressed(evt);
            }
        });

        torqueMotorLB.setText("Torque do motor:");

        torqueMotorFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                torqueMotorFDKeyPressed(evt);
            }
        });

        combLB.setText("Tipo de combustível:");

        combusFD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Gasolina", "Etanol", "Diesel" }));
        combusFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combusFDKeyPressed(evt);
            }
        });

        placaLB.setText("Placa:");

        placaFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placaFDKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelInfVeiculoLayout = new javax.swing.GroupLayout(panelInfVeiculo);
        panelInfVeiculo.setLayout(panelInfVeiculoLayout);
        panelInfVeiculoLayout.setHorizontalGroup(
            panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInfVeiculoLayout.createSequentialGroup()
                        .addComponent(torqueMotorLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(torqueMotorFD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combusFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(placaLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placaFD))
                    .addGroup(panelInfVeiculoLayout.createSequentialGroup()
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
                    .addGroup(panelInfVeiculoLayout.createSequentialGroup()
                        .addComponent(modeloLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modeloFD)
                        .addGap(18, 18, 18)
                        .addComponent(fabLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fabFD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfVeiculoLayout.createSequentialGroup()
                        .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfVeiculoLayout.createSequentialGroup()
                                .addComponent(anoFabLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anoFabFD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(anoModLB)
                                .addGap(2, 2, 2)
                                .addComponent(anoModFD, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfVeiculoLayout.createSequentialGroup()
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
                        .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corFD)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfVeiculoLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(tamLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTamFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelInfVeiculoLayout.setVerticalGroup(
            panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloLB)
                    .addComponent(modeloFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabLB)
                    .addComponent(fabFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anoFabLB)
                    .addComponent(anoFabFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoModLB)
                    .addComponent(anoModFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamLB)
                    .addComponent(comboTamFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPortasLB)
                    .addComponent(numPortasFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numPassLB)
                    .addComponent(numPassFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corLB)
                    .addComponent(corFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmAtualLB)
                    .addComponent(kmAtualFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motorLB)
                    .addComponent(motorFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chassiLB)
                    .addComponent(chassiFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(torqueMotorLB)
                    .addComponent(torqueMotorFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combLB)
                    .addComponent(combusFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placaLB)
                    .addComponent(placaFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDisponibilidade.setBackground(new java.awt.Color(255, 255, 255));
        panelDisponibilidade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Particularidades do veículo"));

        statusLB.setText("Status:");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Alugado", "Manutenção" }));
        comboStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboStatusKeyPressed(evt);
            }
        });

        catLB.setText("Categoria:");

        arCondLB.setText("Ar-condicionado:");

        grupoArCond.add(arSimGroup);
        arSimGroup.setText("Sim");

        grupoArCond.add(arNaoGroup);
        arNaoGroup.setText("Não");

        mp3LB.setText("MP3:");

        grupoMP3.add(mp3SimGroup);
        mp3SimGroup.setText("Sim");

        grupoMP3.add(mp3NaoGroup);
        mp3NaoGroup.setText("Não");

        dvdLB.setText("DVD:");

        grupoDVD.add(dvdSimGroup);
        dvdSimGroup.setText("Sim");

        grupoDVD.add(dvdNaoGroup);
        dvdNaoGroup.setText("Não");

        radioLB.setText("Rádio:");

        grupoRadio.add(radioSimGroup);
        radioSimGroup.setText("Sim");

        grupoRadio.add(radioNaoGroup);
        radioNaoGroup.setText("Não");

        panelCat.setBackground(new java.awt.Color(0, 204, 204));

        catFD.setEditable(false);

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
        jScrollPane2.setViewportView(tabelaCategoria);

        javax.swing.GroupLayout panelCatLayout = new javax.swing.GroupLayout(panelCat);
        panelCat.setLayout(panelCatLayout);
        panelCatLayout.setHorizontalGroup(
            panelCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCatLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(catFD, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelCatLayout.setVerticalGroup(
            panelCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(catFD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDisponibilidadeLayout = new javax.swing.GroupLayout(panelDisponibilidade);
        panelDisponibilidade.setLayout(panelDisponibilidadeLayout);
        panelDisponibilidadeLayout.setHorizontalGroup(
            panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                        .addComponent(statusLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(catLB))
                    .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                        .addComponent(arCondLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arSimGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arNaoGroup))
                    .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                        .addComponent(mp3LB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mp3SimGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mp3NaoGroup))
                    .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                        .addComponent(dvdLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dvdSimGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dvdNaoGroup))
                    .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                        .addComponent(radioLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioSimGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioNaoGroup)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDisponibilidadeLayout.setVerticalGroup(
            panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDisponibilidadeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusLB)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catLB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arCondLB)
                            .addComponent(arSimGroup)
                            .addComponent(arNaoGroup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mp3LB)
                            .addComponent(mp3SimGroup)
                            .addComponent(mp3NaoGroup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dvdLB)
                            .addComponent(dvdSimGroup)
                            .addComponent(dvdNaoGroup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioLB)
                            .addComponent(radioSimGroup)
                            .addComponent(radioNaoGroup)))
                    .addComponent(panelCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
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
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelInfVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDisponibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelInfVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(salvarButton))
                .addGap(243, 243, 243))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modeloFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloFDActionPerformed

    private void kmAtualFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmAtualFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmAtualFDActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void modeloFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            fabFD.requestFocus();
        }
    }//GEN-LAST:event_modeloFDKeyPressed

    private void fabFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fabFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
          anoFabFD.requestFocus();
        }
    }//GEN-LAST:event_fabFDKeyPressed

    private void anoFabFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoFabFDKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
            anoModFD.requestFocus();
        }
    }//GEN-LAST:event_anoFabFDKeyPressed

    private void anoModFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoModFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            comboTamFD.requestFocus();
        }
    }//GEN-LAST:event_anoModFDKeyPressed

    private void comboTamFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTamFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            numPortasFD.requestFocus();
        }
    }//GEN-LAST:event_comboTamFDKeyPressed

    private void numPortasFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numPortasFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            numPassFD.requestFocus();
        }
    }//GEN-LAST:event_numPortasFDKeyPressed

    private void corFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_corFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            motorFD.requestFocus();
        }
    }//GEN-LAST:event_corFDKeyPressed

    private void motorFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_motorFDKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
            chassiFD.requestFocus();
        }
    }//GEN-LAST:event_motorFDKeyPressed

    private void chassiFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chassiFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            kmAtualFD.requestFocus();
        }
    }//GEN-LAST:event_chassiFDKeyPressed

    private void kmAtualFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kmAtualFDKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
            torqueMotorFD.requestFocus();
        }
    }//GEN-LAST:event_kmAtualFDKeyPressed

    private void torqueMotorFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_torqueMotorFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            combusFD.requestFocus();
        }
    }//GEN-LAST:event_torqueMotorFDKeyPressed

    private void combusFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combusFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            placaFD.requestFocus();
        }
    }//GEN-LAST:event_combusFDKeyPressed

    private void comboStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboStatusKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            catFD.requestFocus();
        }
    }//GEN-LAST:event_comboStatusKeyPressed

    private void numPassFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numPassFDKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
            corFD.requestFocus();
        }
    }//GEN-LAST:event_numPassFDKeyPressed

    private void placaFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaFDKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            comboStatus.requestFocus();
        }
    }//GEN-LAST:event_placaFDKeyPressed

    private void tabelaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCategoriaMouseClicked
        linha = tabelaCategoria.getSelectedRow();
        
        try{
            categoria = fachada.getPessoaCategoriaPorId((Long) tabelaCategoria.getValueAt(linha, 0));
            catFD.setText(categoria.getNomeCategoria());
        }
        catch(Exception ex){
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaCategoriaMouseClicked

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        
//        String letraCategoria = categoria.getNomeCategoria().substring(0, 1);
            Veiculo veiculo = new Veiculo();
            
            veiculo.setModelo(modeloFD.getText().toUpperCase());
            veiculo.setFabricante(fabFD.getText().toUpperCase());
            veiculo.setAnoFabricacao(anoFabFD.getText().toUpperCase());
            veiculo.setAnoModelo(anoModFD.getText().toUpperCase());
            veiculo.setTamanho(comboTamFD.getSelectedItem().toString().toUpperCase());
            veiculo.setNumeroPortas(Integer.valueOf(numPortasFD.getText()));
            veiculo.setNumPassageiros(Integer.valueOf(numPassFD.getText()));
            veiculo.setCor(corFD.getText().toUpperCase());
            veiculo.setMotor(motorFD.getText().toUpperCase());
            veiculo.setChassi(chassiFD.getText().toUpperCase());
            veiculo.setKmAtual(Double.valueOf(kmAtualFD.getText().toUpperCase()));
            veiculo.setTorqueMotor(torqueMotorFD.getText().toUpperCase());
            veiculo.setTipoCombustivel(combusFD.getSelectedItem().toString().toUpperCase());
            veiculo.setPlaca(placaFD.getText().toUpperCase());
//            veiculo.setStatus(comboStatus.getSelectedItem().toString().toUpperCase());
//            veiculo.setStatus(Boolean.valueOf(string));
            
            veiculo.setCategoria(categoria);
            
            fachada.SalvarVeiculo(veiculo);
            JOptionPane.showMessageDialog(this, "Salvo com sucesso");
            this.dispose();
        
    }//GEN-LAST:event_salvarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoFabFD;
    private javax.swing.JLabel anoFabLB;
    private javax.swing.JTextField anoModFD;
    private javax.swing.JLabel anoModLB;
    private javax.swing.JLabel arCondLB;
    private javax.swing.JRadioButton arNaoGroup;
    private javax.swing.JRadioButton arSimGroup;
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
    private javax.swing.JLabel dvdLB;
    private javax.swing.JRadioButton dvdNaoGroup;
    private javax.swing.JRadioButton dvdSimGroup;
    private javax.swing.JTextField fabFD;
    private javax.swing.JLabel fabLB;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoArCond;
    private javax.swing.ButtonGroup grupoDVD;
    private javax.swing.ButtonGroup grupoMP3;
    private javax.swing.ButtonGroup grupoRadio;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kmAtualFD;
    private javax.swing.JLabel kmAtualLB;
    private javax.swing.JTextField modeloFD;
    private javax.swing.JLabel modeloLB;
    private javax.swing.JTextField motorFD;
    private javax.swing.JLabel motorLB;
    private javax.swing.JLabel mp3LB;
    private javax.swing.JRadioButton mp3NaoGroup;
    private javax.swing.JRadioButton mp3SimGroup;
    private javax.swing.JTextField numPassFD;
    private javax.swing.JLabel numPassLB;
    private javax.swing.JTextField numPortasFD;
    private javax.swing.JLabel numPortasLB;
    private javax.swing.JPanel panelCat;
    private javax.swing.JPanel panelDisponibilidade;
    private javax.swing.JPanel panelInfVeiculo;
    private javax.swing.JTextField placaFD;
    private javax.swing.JLabel placaLB;
    private javax.swing.JLabel radioLB;
    private javax.swing.JRadioButton radioNaoGroup;
    private javax.swing.JRadioButton radioSimGroup;
    private javax.swing.JButton salvarButton;
    private javax.swing.JLabel statusLB;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JLabel tamLB;
    private javax.swing.JTextField torqueMotorFD;
    private javax.swing.JLabel torqueMotorLB;
    // End of variables declaration//GEN-END:variables


    public void preencherTabela(){
        List<Categoria> categorias = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"ID", "NOME"};
        
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
