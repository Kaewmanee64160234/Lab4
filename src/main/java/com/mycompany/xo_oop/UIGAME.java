/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.xo_oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class UIGAME extends javax.swing.JFrame {

    Player x;
    Player o;
    Table table;
    String[][] t;
    int row, col;
    boolean isEnd;

    /**
     * Creates new form UIGAME
     */
    public UIGAME() {
        initComponents();
        this.x = new Player("X", 0, 0, 0);
        this.o = new Player("O", 0, 0, 0);
        lode();
        showWelcome();
        newBoard();
        showBoard();
        showTurn();
    }

    public void lode() {
        FileInputStream fis = null;
        try {
            File file = new File("player.dat");
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.o = (Player) ois.readObject();
            this.x = (Player) ois.readObject();
        } catch (Exception ex) {
            System.out.println("Load Error");

        } finally {
            try {
                if (fis != null) {
                    fis.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(UIGAME.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTable1 = new javax.swing.JButton();
        btnTable2 = new javax.swing.JButton();
        btnTable3 = new javax.swing.JButton();
        btnTable4 = new javax.swing.JButton();
        btnTable5 = new javax.swing.JButton();
        btnTable7 = new javax.swing.JButton();
        btnTable8 = new javax.swing.JButton();
        btnTable9 = new javax.swing.JButton();
        btnTable6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NewGame = new javax.swing.JButton();
        textWinX = new javax.swing.JLabel();
        textLoseX = new javax.swing.JLabel();
        textDrawX = new javax.swing.JLabel();
        textDrawO = new javax.swing.JLabel();
        textWinO = new javax.swing.JLabel();
        textLoseO = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnTable1.setFont(btnTable1.getFont().deriveFont(btnTable1.getFont().getSize()+12f));
        btnTable1.setText("-");
        btnTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable1ActionPerformed(evt);
            }
        });

        btnTable2.setFont(btnTable2.getFont().deriveFont(btnTable2.getFont().getSize()+12f));
        btnTable2.setText("-");
        btnTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable2ActionPerformed(evt);
            }
        });

        btnTable3.setFont(btnTable3.getFont().deriveFont(btnTable3.getFont().getSize()+12f));
        btnTable3.setText("-");
        btnTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable3ActionPerformed(evt);
            }
        });

        btnTable4.setFont(btnTable4.getFont().deriveFont(btnTable4.getFont().getSize()+12f));
        btnTable4.setText("-");
        btnTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable4ActionPerformed(evt);
            }
        });

        btnTable5.setFont(btnTable5.getFont().deriveFont(btnTable5.getFont().getSize()+12f));
        btnTable5.setText("-");
        btnTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable5ActionPerformed(evt);
            }
        });

        btnTable7.setFont(btnTable7.getFont().deriveFont(btnTable7.getFont().getSize()+12f));
        btnTable7.setText("-");
        btnTable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable7ActionPerformed(evt);
            }
        });

        btnTable8.setFont(btnTable8.getFont().deriveFont(btnTable8.getFont().getSize()+12f));
        btnTable8.setText("-");
        btnTable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable8ActionPerformed(evt);
            }
        });

        btnTable9.setFont(btnTable9.getFont().deriveFont(btnTable9.getFont().getSize()+12f));
        btnTable9.setText("-");
        btnTable9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable9ActionPerformed(evt);
            }
        });

        btnTable6.setFont(btnTable6.getFont().deriveFont(btnTable6.getFont().getSize()+12f));
        btnTable6.setText("-");
        btnTable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTable6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTable8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Player X");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Player O");

        NewGame.setFont(NewGame.getFont().deriveFont(NewGame.getFont().getSize()+12f));
        NewGame.setText("New Game\n");
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });

        textWinX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textWinX.setText("win : 0");

        textLoseX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textLoseX.setText("lose : 0");

        textDrawX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDrawX.setText("draw : 0");

        textDrawO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDrawO.setText("draw : 0");

        textWinO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textWinO.setText("win : 0");

        textLoseO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textLoseO.setText("lose : 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textWinX, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLoseX, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDrawX, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textWinO, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLoseO, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDrawO, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWinX)
                    .addComponent(textLoseX)
                    .addComponent(textDrawX))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWinO)
                    .addComponent(textLoseO)
                    .addComponent(textDrawO))
                .addGap(18, 18, 18)
                .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        txtMessage.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtMessage.setText("Welcome to XO Game");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable1ActionPerformed
        // TODO add your handling code here:
        row = 1;
        col = 1;

        process();
    }//GEN-LAST:event_btnTable1ActionPerformed

    private void process() {

        if (!isEnd) {
            NewGame.setVisible(false);
            showBoard();

            if (table.setRowCol(row, col)) {
                showBoard();

                if (checkWin()) {
                    showBoard();
                    showResult();
                    isEnd = true;
                } else {
                    table.changePlayer();
                    showTurn();
                }
            }
        }

    }

    private boolean checkWin() {
        return table.checkDraw() || table.checkColumn() || table.checkRow() || table.checkDiagonal();
    }


    private void btnTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable2ActionPerformed
        // TODO add your handling code here:
        row = 1;
        col = 2;
        process();
    }//GEN-LAST:event_btnTable2ActionPerformed

    private void btnTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable3ActionPerformed
        // TODO add your handling code here:
        row = 1;
        col = 3;
        process();
    }//GEN-LAST:event_btnTable3ActionPerformed

    private void btnTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable4ActionPerformed
        // TODO add your handling code here:
        row = 2;
        col = 1;
        process();
    }//GEN-LAST:event_btnTable4ActionPerformed

    private void btnTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable5ActionPerformed
        // TODO add your handling code here:
        row = 2;
        col = 2;
        process();
    }//GEN-LAST:event_btnTable5ActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        // TODO add your handling code here:
        String[][] t_ = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        table.setTable(t_);
        isEnd = false;
        t = table.getTable();
        table.setCurrentPlay(x);
        showBoard();
        showTurn();
    }//GEN-LAST:event_NewGameActionPerformed

    private void btnTable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable7ActionPerformed
        row = 3;
        col = 1;
        process();
    }//GEN-LAST:event_btnTable7ActionPerformed

    private void btnTable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable8ActionPerformed
        row = 3;
        col = 2;
        process();
    }//GEN-LAST:event_btnTable8ActionPerformed

    private void btnTable9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable9ActionPerformed

        row = 3;
        col = 3;
        process();
    }//GEN-LAST:event_btnTable9ActionPerformed

    private void btnTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTable6ActionPerformed
        // TODO add your handling code here:
        row = 2;
        col = 3;
        process();
    }//GEN-LAST:event_btnTable6ActionPerformed
    private void showWelcome() {
        txtMessage.setText("Welcome XO Game");
    }

    private void newBoard() {
        this.table = new Table(x, x, o);
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
            java.util.logging.Logger.getLogger(UIGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIGAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewGame;
    private javax.swing.JButton btnTable1;
    private javax.swing.JButton btnTable2;
    private javax.swing.JButton btnTable3;
    private javax.swing.JButton btnTable4;
    private javax.swing.JButton btnTable5;
    private javax.swing.JButton btnTable6;
    private javax.swing.JButton btnTable7;
    private javax.swing.JButton btnTable8;
    private javax.swing.JButton btnTable9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel textDrawO;
    private javax.swing.JLabel textDrawX;
    private javax.swing.JLabel textLoseO;
    private javax.swing.JLabel textLoseX;
    private javax.swing.JLabel textWinO;
    private javax.swing.JLabel textWinX;
    private javax.swing.JLabel txtMessage;
    // End of variables declaration//GEN-END:variables

    private void showBoard() {
        t = table.getTable();
        btnTable1.setText(t[0][0]);
        btnTable2.setText(t[0][1]);
        btnTable3.setText(t[0][2]);
        btnTable4.setText(t[1][0]);
        btnTable5.setText(t[1][1]);
        btnTable6.setText(t[1][2]);
        btnTable7.setText(t[2][0]);
        btnTable8.setText(t[2][1]);
        btnTable9.setText(t[2][2]);

    }

    private void showTurn() {
        txtMessage.setText("Your " + table.getCurrentPlay().getSymbol() + " Turn !!");
    }

    private void showResult() {
        if (table.checkDraw()) {

            txtMessage.setText("Draw!!");
            x.plusDraw();
            o.plusDraw();
            isEnd = true;
            textDrawX.setText("Draw : " + x.getDrawCount());
            textDrawO.setText("Draw : " + o.getDrawCount());
            textWinX.setText("Win : " + x.getWinCount());
            textWinO.setText("Win : " + o.getWinCount());
            textLoseX.setText("Lose : " + x.getLoseCount());
            textLoseO.setText("Lose : " + o.getLoseCount());
            NewGame.setVisible(true);
        } else if (table.checkColumn() || table.checkRow() || table.checkDiagonal()) {
            txtMessage.setText(table.getCurrentPlay().getSymbol() + " Win!!!");
            if (table.getCurrentPlay().getSymbol().equals("X")) {
                o.plusLose();
                x.plusWin();
                textDrawX.setText("Draw : " + x.getDrawCount());
                textDrawO.setText("Draw : " + o.getDrawCount());
                textWinX.setText("Win : " + x.getWinCount());
                textWinO.setText("Win : " + o.getWinCount());
                textLoseX.setText("Lose : " + x.getLoseCount());
                textLoseO.setText("Lose : " + o.getLoseCount());
            } else {
                o.plusWin();
                x.plusLose();
                textDrawX.setText("Draw : " + x.getDrawCount());
                textDrawO.setText("Draw : " + o.getDrawCount());
                textWinX.setText("Win : " + x.getWinCount());
                textWinO.setText("Win : " + o.getWinCount());
                textLoseX.setText("Lose : " + x.getLoseCount());
                textLoseO.setText("Lose : " + o.getLoseCount());
            }
            isEnd = true;
            NewGame.setVisible(true);

        }
    }
}
