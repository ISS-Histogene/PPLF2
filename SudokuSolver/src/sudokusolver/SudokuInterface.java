/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Gustavo
 */
public class SudokuInterface extends javax.swing.JFrame {

    private ArrayList<JTextField> posicoesmatriz = new ArrayList();
    
    public SudokuInterface() {
        initComponents();
        
        posicoesmatriz.add(a00);
        posicoesmatriz.add(a01);
        posicoesmatriz.add(a02);
        posicoesmatriz.add(a03);
        posicoesmatriz.add(a04);
        posicoesmatriz.add(a05);
        posicoesmatriz.add(a06);
        posicoesmatriz.add(a07);
        posicoesmatriz.add(a08);
        posicoesmatriz.add(a10);
        posicoesmatriz.add(a11);
        posicoesmatriz.add(a12);
        posicoesmatriz.add(a13);
        posicoesmatriz.add(a14);
        posicoesmatriz.add(a15);
        posicoesmatriz.add(a16);
        posicoesmatriz.add(a17);
        posicoesmatriz.add(a18);
        posicoesmatriz.add(a20);
        posicoesmatriz.add(a21);
        posicoesmatriz.add(a22);
        posicoesmatriz.add(a23);
        posicoesmatriz.add(a24);
        posicoesmatriz.add(a25);
        posicoesmatriz.add(a26);
        posicoesmatriz.add(a27);
        posicoesmatriz.add(a28);
        posicoesmatriz.add(a30);
        posicoesmatriz.add(a31);
        posicoesmatriz.add(a32);
        posicoesmatriz.add(a33);
        posicoesmatriz.add(a34);
        posicoesmatriz.add(a35);
        posicoesmatriz.add(a36);
        posicoesmatriz.add(a37);
        posicoesmatriz.add(a38);
        posicoesmatriz.add(a40);
        posicoesmatriz.add(a41);
        posicoesmatriz.add(a42);
        posicoesmatriz.add(a43);
        posicoesmatriz.add(a44);
        posicoesmatriz.add(a45);
        posicoesmatriz.add(a46);
        posicoesmatriz.add(a47);
        posicoesmatriz.add(a48);
        posicoesmatriz.add(a50);
        posicoesmatriz.add(a51);
        posicoesmatriz.add(a52);
        posicoesmatriz.add(a53);
        posicoesmatriz.add(a54);
        posicoesmatriz.add(a55);
        posicoesmatriz.add(a56);
        posicoesmatriz.add(a57);
        posicoesmatriz.add(a58);
        posicoesmatriz.add(a60);
        posicoesmatriz.add(a61);
        posicoesmatriz.add(a62);
        posicoesmatriz.add(a63);
        posicoesmatriz.add(a64);
        posicoesmatriz.add(a65);
        posicoesmatriz.add(a66);
        posicoesmatriz.add(a67);
        posicoesmatriz.add(a68);
        posicoesmatriz.add(a70);
        posicoesmatriz.add(a71);
        posicoesmatriz.add(a72);
        posicoesmatriz.add(a73);
        posicoesmatriz.add(a74);
        posicoesmatriz.add(a75);
        posicoesmatriz.add(a76);
        posicoesmatriz.add(a77);
        posicoesmatriz.add(a78);
        posicoesmatriz.add(a80);
        posicoesmatriz.add(a81);
        posicoesmatriz.add(a82);
        posicoesmatriz.add(a83);
        posicoesmatriz.add(a84);
        posicoesmatriz.add(a85);
        posicoesmatriz.add(a86);
        posicoesmatriz.add(a87);
        posicoesmatriz.add(a88);
        
        
        this.a00.setDocument(new IntegersOnlyDocument(1));
        this.a01.setDocument(new IntegersOnlyDocument(1));
        this.a02.setDocument(new IntegersOnlyDocument(1));
        this.a03.setDocument(new IntegersOnlyDocument(1));
        this.a04.setDocument(new IntegersOnlyDocument(1));
        this.a05.setDocument(new IntegersOnlyDocument(1));
        this.a06.setDocument(new IntegersOnlyDocument(1));
        this.a07.setDocument(new IntegersOnlyDocument(1));
        this.a08.setDocument(new IntegersOnlyDocument(1));
        
        this.a10.setDocument(new IntegersOnlyDocument(1));
        this.a11.setDocument(new IntegersOnlyDocument(1));
        this.a12.setDocument(new IntegersOnlyDocument(1));
        this.a13.setDocument(new IntegersOnlyDocument(1));
        this.a14.setDocument(new IntegersOnlyDocument(1));
        this.a15.setDocument(new IntegersOnlyDocument(1));
        this.a16.setDocument(new IntegersOnlyDocument(1));
        this.a17.setDocument(new IntegersOnlyDocument(1));
        this.a18.setDocument(new IntegersOnlyDocument(1));
        
        this.a20.setDocument(new IntegersOnlyDocument(1));
        this.a21.setDocument(new IntegersOnlyDocument(1));
        this.a22.setDocument(new IntegersOnlyDocument(1));
        this.a23.setDocument(new IntegersOnlyDocument(1));
        this.a24.setDocument(new IntegersOnlyDocument(1));
        this.a25.setDocument(new IntegersOnlyDocument(1));
        this.a26.setDocument(new IntegersOnlyDocument(1));
        this.a27.setDocument(new IntegersOnlyDocument(1));
        this.a28.setDocument(new IntegersOnlyDocument(1));
        
        this.a30.setDocument(new IntegersOnlyDocument(1));
        this.a31.setDocument(new IntegersOnlyDocument(1));
        this.a32.setDocument(new IntegersOnlyDocument(1));
        this.a33.setDocument(new IntegersOnlyDocument(1));
        this.a34.setDocument(new IntegersOnlyDocument(1));
        this.a35.setDocument(new IntegersOnlyDocument(1));
        this.a36.setDocument(new IntegersOnlyDocument(1));
        this.a37.setDocument(new IntegersOnlyDocument(1));
        this.a38.setDocument(new IntegersOnlyDocument(1));
        
        this.a40.setDocument(new IntegersOnlyDocument(1));
        this.a41.setDocument(new IntegersOnlyDocument(1));
        this.a42.setDocument(new IntegersOnlyDocument(1));
        this.a43.setDocument(new IntegersOnlyDocument(1));
        this.a44.setDocument(new IntegersOnlyDocument(1));
        this.a45.setDocument(new IntegersOnlyDocument(1));
        this.a46.setDocument(new IntegersOnlyDocument(1));
        this.a47.setDocument(new IntegersOnlyDocument(1));
        this.a48.setDocument(new IntegersOnlyDocument(1));
        
        this.a50.setDocument(new IntegersOnlyDocument(1));
        this.a51.setDocument(new IntegersOnlyDocument(1));
        this.a52.setDocument(new IntegersOnlyDocument(1));
        this.a53.setDocument(new IntegersOnlyDocument(1));
        this.a54.setDocument(new IntegersOnlyDocument(1));
        this.a55.setDocument(new IntegersOnlyDocument(1));
        this.a56.setDocument(new IntegersOnlyDocument(1));
        this.a57.setDocument(new IntegersOnlyDocument(1));
        this.a58.setDocument(new IntegersOnlyDocument(1));
        
        this.a60.setDocument(new IntegersOnlyDocument(1));
        this.a61.setDocument(new IntegersOnlyDocument(1));
        this.a62.setDocument(new IntegersOnlyDocument(1));
        this.a63.setDocument(new IntegersOnlyDocument(1));
        this.a64.setDocument(new IntegersOnlyDocument(1));
        this.a65.setDocument(new IntegersOnlyDocument(1));
        this.a66.setDocument(new IntegersOnlyDocument(1));
        this.a67.setDocument(new IntegersOnlyDocument(1));
        this.a68.setDocument(new IntegersOnlyDocument(1));
        
        this.a70.setDocument(new IntegersOnlyDocument(1));
        this.a71.setDocument(new IntegersOnlyDocument(1));
        this.a72.setDocument(new IntegersOnlyDocument(1));
        this.a73.setDocument(new IntegersOnlyDocument(1));
        this.a74.setDocument(new IntegersOnlyDocument(1));
        this.a75.setDocument(new IntegersOnlyDocument(1));
        this.a76.setDocument(new IntegersOnlyDocument(1));
        this.a77.setDocument(new IntegersOnlyDocument(1));
        this.a78.setDocument(new IntegersOnlyDocument(1));
        
        this.a80.setDocument(new IntegersOnlyDocument(1));
        this.a81.setDocument(new IntegersOnlyDocument(1));
        this.a82.setDocument(new IntegersOnlyDocument(1));
        this.a83.setDocument(new IntegersOnlyDocument(1));
        this.a84.setDocument(new IntegersOnlyDocument(1));
        this.a85.setDocument(new IntegersOnlyDocument(1));
        this.a86.setDocument(new IntegersOnlyDocument(1));
        this.a87.setDocument(new IntegersOnlyDocument(1));
        this.a88.setDocument(new IntegersOnlyDocument(1));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        a80 = new javax.swing.JTextField();
        a03 = new javax.swing.JTextField();
        a81 = new javax.swing.JTextField();
        a01 = new javax.swing.JTextField();
        a02 = new javax.swing.JTextField();
        a00 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        a10 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        a42 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a30 = new javax.swing.JTextField();
        a41 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a40 = new javax.swing.JTextField();
        a20 = new javax.swing.JTextField();
        a72 = new javax.swing.JTextField();
        a61 = new javax.swing.JTextField();
        a62 = new javax.swing.JTextField();
        a60 = new javax.swing.JTextField();
        a71 = new javax.swing.JTextField();
        a51 = new javax.swing.JTextField();
        a70 = new javax.swing.JTextField();
        a50 = new javax.swing.JTextField();
        a52 = new javax.swing.JTextField();
        a55 = new javax.swing.JTextField();
        a44 = new javax.swing.JTextField();
        a45 = new javax.swing.JTextField();
        a43 = new javax.swing.JTextField();
        a54 = new javax.swing.JTextField();
        a34 = new javax.swing.JTextField();
        a53 = new javax.swing.JTextField();
        a33 = new javax.swing.JTextField();
        a85 = new javax.swing.JTextField();
        a74 = new javax.swing.JTextField();
        a75 = new javax.swing.JTextField();
        a04 = new javax.swing.JTextField();
        a73 = new javax.swing.JTextField();
        a82 = new javax.swing.JTextField();
        a84 = new javax.swing.JTextField();
        a64 = new javax.swing.JTextField();
        a83 = new javax.swing.JTextField();
        a05 = new javax.swing.JTextField();
        a63 = new javax.swing.JTextField();
        a65 = new javax.swing.JTextField();
        a14 = new javax.swing.JTextField();
        a15 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a25 = new javax.swing.JTextField();
        a24 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a35 = new javax.swing.JTextField();
        a87 = new javax.swing.JTextField();
        a67 = new javax.swing.JTextField();
        a86 = new javax.swing.JTextField();
        a08 = new javax.swing.JTextField();
        a66 = new javax.swing.JTextField();
        a68 = new javax.swing.JTextField();
        a17 = new javax.swing.JTextField();
        a18 = new javax.swing.JTextField();
        a16 = new javax.swing.JTextField();
        a58 = new javax.swing.JTextField();
        a47 = new javax.swing.JTextField();
        a48 = new javax.swing.JTextField();
        a28 = new javax.swing.JTextField();
        a27 = new javax.swing.JTextField();
        a26 = new javax.swing.JTextField();
        a38 = new javax.swing.JTextField();
        a06 = new javax.swing.JTextField();
        a46 = new javax.swing.JTextField();
        a57 = new javax.swing.JTextField();
        a37 = new javax.swing.JTextField();
        a56 = new javax.swing.JTextField();
        a36 = new javax.swing.JTextField();
        a88 = new javax.swing.JTextField();
        a77 = new javax.swing.JTextField();
        a78 = new javax.swing.JTextField();
        a07 = new javax.swing.JTextField();
        a76 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Sudoku Solver");

        a80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a80ActionPerformed(evt);
            }
        });

        a02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a02ActionPerformed(evt);
            }
        });

        a00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a00ActionPerformed(evt);
            }
        });

        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32ActionPerformed(evt);
            }
        });

        a41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a41ActionPerformed(evt);
            }
        });

        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });

        a62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a62ActionPerformed(evt);
            }
        });

        a71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a71ActionPerformed(evt);
            }
        });

        a51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a51ActionPerformed(evt);
            }
        });

        a45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a45ActionPerformed(evt);
            }
        });

        a54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a54ActionPerformed(evt);
            }
        });

        a34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34ActionPerformed(evt);
            }
        });

        a75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a75ActionPerformed(evt);
            }
        });

        a04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a04ActionPerformed(evt);
            }
        });

        a84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a84ActionPerformed(evt);
            }
        });

        a64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a64ActionPerformed(evt);
            }
        });

        a15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a15ActionPerformed(evt);
            }
        });

        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });

        a87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a87ActionPerformed(evt);
            }
        });

        a67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a67ActionPerformed(evt);
            }
        });

        a18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a18ActionPerformed(evt);
            }
        });

        a48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a48ActionPerformed(evt);
            }
        });

        a27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a27ActionPerformed(evt);
            }
        });

        a57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a57ActionPerformed(evt);
            }
        });

        a37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a37ActionPerformed(evt);
            }
        });

        a78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a78ActionPerformed(evt);
            }
        });

        a07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a07ActionPerformed(evt);
            }
        });

        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(a80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(a71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(a72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(a81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(a82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a00, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a00, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a80ActionPerformed

    private void a02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a02ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a11ActionPerformed

    private void a32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a32ActionPerformed

    private void a41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a41ActionPerformed

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a21ActionPerformed

    private void a62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a62ActionPerformed

    private void a71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a71ActionPerformed

    private void a51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a51ActionPerformed

    private void a45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a45ActionPerformed

    private void a54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a54ActionPerformed

    private void a34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34ActionPerformed

    private void a75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a75ActionPerformed

    private void a04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a04ActionPerformed

    private void a84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a84ActionPerformed

    private void a64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a64ActionPerformed

    private void a15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a15ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a24ActionPerformed

    private void a87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a87ActionPerformed

    private void a67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a67ActionPerformed

    private void a18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a18ActionPerformed

    private void a48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a48ActionPerformed

    private void a27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a27ActionPerformed

    private void a57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a57ActionPerformed

    private void a37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a37ActionPerformed

    private void a78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a78ActionPerformed

    private void a07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a07ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[][] matriz = new String[9][9];
        matriz[0][0] = this.a00.getText();
        matriz[0][1] = this.a01.getText();
        matriz[0][2] = this.a02.getText();
        matriz[0][3] = this.a03.getText();
        matriz[0][4] = this.a04.getText();
        matriz[0][5] = this.a05.getText();
        matriz[0][6] = this.a06.getText();
        matriz[0][7] = this.a07.getText();
        matriz[0][8] = this.a08.getText();
        
        matriz[1][0] = this.a10.getText();
        matriz[1][1] = this.a11.getText();
        matriz[1][2] = this.a12.getText();
        matriz[1][3] = this.a13.getText();
        matriz[1][4] = this.a14.getText();
        matriz[1][5] = this.a15.getText();
        matriz[1][6] = this.a16.getText();
        matriz[1][7] = this.a17.getText();
        matriz[1][8] = this.a18.getText();
        
        matriz[2][0] = this.a20.getText();
        matriz[2][1] = this.a21.getText();
        matriz[2][2] = this.a22.getText();
        matriz[2][3] = this.a23.getText();
        matriz[2][4] = this.a24.getText();
        matriz[2][5] = this.a25.getText();
        matriz[2][6] = this.a26.getText();
        matriz[2][7] = this.a27.getText();
        matriz[2][8] = this.a28.getText();
        
        matriz[3][0] = this.a30.getText();
        matriz[3][1] = this.a31.getText();
        matriz[3][2] = this.a32.getText();
        matriz[3][3] = this.a33.getText();
        matriz[3][4] = this.a34.getText();
        matriz[3][5] = this.a35.getText();
        matriz[3][6] = this.a36.getText();
        matriz[3][7] = this.a37.getText();
        matriz[3][8] = this.a38.getText();
        
        matriz[4][0] = this.a40.getText();
        matriz[4][1] = this.a41.getText();
        matriz[4][2] = this.a42.getText();
        matriz[4][3] = this.a43.getText();
        matriz[4][4] = this.a44.getText();
        matriz[4][5] = this.a45.getText();
        matriz[4][6] = this.a46.getText();
        matriz[4][7] = this.a47.getText();
        matriz[4][8] = this.a48.getText();
        
        matriz[5][0] = this.a50.getText();
        matriz[5][1] = this.a51.getText();
        matriz[5][2] = this.a52.getText();
        matriz[5][3] = this.a53.getText();
        matriz[5][4] = this.a54.getText();
        matriz[5][5] = this.a55.getText();
        matriz[5][6] = this.a56.getText();
        matriz[5][7] = this.a57.getText();
        matriz[5][8] = this.a58.getText();
        
        matriz[6][0] = this.a60.getText();
        matriz[6][1] = this.a61.getText();
        matriz[6][2] = this.a62.getText();
        matriz[6][3] = this.a63.getText();
        matriz[6][4] = this.a64.getText();
        matriz[6][5] = this.a65.getText();
        matriz[6][6] = this.a66.getText();
        matriz[6][7] = this.a67.getText();
        matriz[6][8] = this.a68.getText();
      
        matriz[7][0] = this.a70.getText();
        matriz[7][1] = this.a71.getText();
        matriz[7][2] = this.a72.getText();
        matriz[7][3] = this.a73.getText();
        matriz[7][4] = this.a74.getText();
        matriz[7][5] = this.a75.getText();
        matriz[7][6] = this.a76.getText();
        matriz[7][7] = this.a77.getText();
        matriz[7][8] = this.a78.getText();
        
        matriz[8][0] = this.a80.getText();
        matriz[8][1] = this.a81.getText();
        matriz[8][2] = this.a82.getText();
        matriz[8][3] = this.a83.getText();
        matriz[8][4] = this.a84.getText();
        matriz[8][5] = this.a85.getText();
        matriz[8][6] = this.a86.getText();
        matriz[8][7] = this.a87.getText();
        matriz[8][8] = this.a88.getText();
        SudokuSolver.jogo(matriz, this);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void a00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a00ActionPerformed
    
    public void preencher(Celula[][] celulas){
        System.out.println("preenchendo");
        int valor = 0;
        for(int x=0; x<=8;x++){
            for(int y=0; y<=8;y++){
                posicoesmatriz.get(valor).setText(String.valueOf(celulas[x][y].getNumero()));
                valor++;
            }
        }
    }
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
            java.util.logging.Logger.getLogger(SudokuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SudokuInterface interfacee = new SudokuInterface();
                interfacee.initComponents();
                System.out.println(interfacee.a00.getText());
                interfacee.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a00;
    private javax.swing.JTextField a01;
    private javax.swing.JTextField a02;
    private javax.swing.JTextField a03;
    private javax.swing.JTextField a04;
    private javax.swing.JTextField a05;
    private javax.swing.JTextField a06;
    private javax.swing.JTextField a07;
    private javax.swing.JTextField a08;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a14;
    private javax.swing.JTextField a15;
    private javax.swing.JTextField a16;
    private javax.swing.JTextField a17;
    private javax.swing.JTextField a18;
    private javax.swing.JTextField a20;
    private javax.swing.JTextField a21;
    private javax.swing.JTextField a22;
    private javax.swing.JTextField a23;
    private javax.swing.JTextField a24;
    private javax.swing.JTextField a25;
    private javax.swing.JTextField a26;
    private javax.swing.JTextField a27;
    private javax.swing.JTextField a28;
    private javax.swing.JTextField a30;
    private javax.swing.JTextField a31;
    private javax.swing.JTextField a32;
    private javax.swing.JTextField a33;
    private javax.swing.JTextField a34;
    private javax.swing.JTextField a35;
    private javax.swing.JTextField a36;
    private javax.swing.JTextField a37;
    private javax.swing.JTextField a38;
    private javax.swing.JTextField a40;
    private javax.swing.JTextField a41;
    private javax.swing.JTextField a42;
    private javax.swing.JTextField a43;
    private javax.swing.JTextField a44;
    private javax.swing.JTextField a45;
    private javax.swing.JTextField a46;
    private javax.swing.JTextField a47;
    private javax.swing.JTextField a48;
    private javax.swing.JTextField a50;
    private javax.swing.JTextField a51;
    private javax.swing.JTextField a52;
    private javax.swing.JTextField a53;
    private javax.swing.JTextField a54;
    private javax.swing.JTextField a55;
    private javax.swing.JTextField a56;
    private javax.swing.JTextField a57;
    private javax.swing.JTextField a58;
    private javax.swing.JTextField a60;
    private javax.swing.JTextField a61;
    private javax.swing.JTextField a62;
    private javax.swing.JTextField a63;
    private javax.swing.JTextField a64;
    private javax.swing.JTextField a65;
    private javax.swing.JTextField a66;
    private javax.swing.JTextField a67;
    private javax.swing.JTextField a68;
    private javax.swing.JTextField a70;
    private javax.swing.JTextField a71;
    private javax.swing.JTextField a72;
    private javax.swing.JTextField a73;
    private javax.swing.JTextField a74;
    private javax.swing.JTextField a75;
    private javax.swing.JTextField a76;
    private javax.swing.JTextField a77;
    private javax.swing.JTextField a78;
    private javax.swing.JTextField a80;
    private javax.swing.JTextField a81;
    private javax.swing.JTextField a82;
    private javax.swing.JTextField a83;
    private javax.swing.JTextField a84;
    private javax.swing.JTextField a85;
    private javax.swing.JTextField a86;
    private javax.swing.JTextField a87;
    private javax.swing.JTextField a88;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
