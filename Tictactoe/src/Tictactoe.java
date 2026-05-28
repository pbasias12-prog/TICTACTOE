
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



/**
 *
 * @author Panos Mpasias
 */
public class Tictactoe extends javax.swing.JFrame {
    
      private String startGame = "X";
      private int xCount = 0;
      private int oCount = 0;
      private javax.swing.Timer gameTimer;
      private int Seconds = 0;
      private javax.swing.JLabel Timer;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tictactoe.class.getName());

   
    public Tictactoe() {
        initComponents();
        initTimer();
        Seconds = 0;
    Timer.setText("Time: 0s");
    gameTimer.start();
    }
    private void initTimer() {
    
    Timer = new JLabel("Time: 0s", SwingConstants.CENTER);
    Timer.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 36));
    Timer.setForeground(Color.BLACK);
    
    jtimer.setLayout(new java.awt.BorderLayout());
    jtimer.add(Timer, java.awt.BorderLayout.CENTER);

    
    gameTimer = new Timer(1000, e -> {
        Seconds++;
        Timer.setText("Time: " + Seconds + "s");
    });
}
     
    private void gameScore() {
        jcountX.setText(String.valueOf(xCount));
        jcountO.setText(String.valueOf(oCount));
    }
            
     private void choose_a_Player() {
        if (startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
     } else
             {
                  startGame = "X";
             }
    }
     private void winningGame()
     {
         String b1 = jtic1.getText();
         String b2 = jtic2.getText();
         String b3 = jtic3.getText();
         String b4 = jtic4.getText();
         String b5 = jtic5.getText();
         String b6 = jtic6.getText();
         String b7 = jtic7.getText();
         String b8 = jtic8.getText();
         String b9 = jtic9.getText();
         
       if (b1 ==("X") &&  b2 ==("X") && b3 ==("X") )
       {
             new WinningJFrame("Player X Wins!").setVisible(true);   
    
       jtic1.setBackground(Color.GRAY);
       jtic2.setBackground(Color.GRAY);
       jtic3.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
}
       
       }
       if (b4 ==("X") &&  b5 ==("X") && b6 ==("X") )
       {
             new WinningJFrame("Player X Wins!").setVisible(true); 
       jtic4.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic6.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b7 ==("X") &&  b8 ==("X") && b9 ==("X") )
       {
              new WinningJFrame("Player X Wins!").setVisible(true); 
       jtic7.setBackground(Color.GRAY);
       jtic8.setBackground(Color.GRAY);
       jtic9.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b1 ==("X") &&  b4 ==("X") && b7 ==("X") )
       {
              new WinningJFrame("Player X Wins!").setVisible(true); 
       jtic1.setBackground(Color.GRAY);
       jtic4.setBackground(Color.GRAY);
       jtic7.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b2 ==("X") &&  b5 ==("X") && b8 ==("X") )
       {
              new WinningJFrame("Player X Wins!").setVisible(true); 
       jtic2.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic8.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b3 ==("X") &&  b6 ==("X") && b9 ==("X") )
       {
              new WinningJFrame("Player X Wins!").setVisible(true); 
       jtic3.setBackground(Color.GRAY);
       jtic6.setBackground(Color.GRAY);
       jtic9.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b1 ==("X") &&  b5 ==("X") && b9 ==("X") )
       {
              new WinningJFrame("Player X Wins!").setVisible(true); 
       jtic1.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic9.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b3 ==("X") &&  b5 ==("X") && b7 ==("X") )
       {
              new WinningJFrame("Player X Wins!").setVisible(true); 
       jtic3.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic7.setBackground(Color.GRAY);
             xCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       
       
       
       
       
       
       
       
       if (b1 ==("O") &&  b2 ==("O") && b3 ==("O") )
       {
              new WinningJFrame("Player Ο Wins!").setVisible(true); 
       jtic1.setBackground(Color.GRAY);
       jtic2.setBackground(Color.GRAY);
       jtic3.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b4 ==("O") &&  b5 ==("O") && b6 ==("O") )
       {
             new WinningJFrame("Player Ο Wins!").setVisible(true);
       jtic4.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic6.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b7 ==("O") &&  b8 ==("O") && b9 ==("O") )
       {
             new WinningJFrame("Player Ο Wins!").setVisible(true);
       jtic7.setBackground(Color.GRAY);
       jtic8.setBackground(Color.GRAY);
       jtic9.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b1 ==("O") &&  b4 ==("O") && b7 ==("O") )
       {
             new WinningJFrame("Player Ο Wins!").setVisible(true);
       jtic1.setBackground(Color.GRAY);
       jtic4.setBackground(Color.GRAY);
       jtic7.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b2 ==("O") &&  b5 ==("O") && b8 ==("O") )
       {
             new WinningJFrame("Player Ο Wins!").setVisible(true);
       jtic2.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic8.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b3 ==("O") &&  b6 ==("O") && b9 ==("O") )
       {
             new WinningJFrame("Player Ο Wins!").setVisible(true);
       jtic3.setBackground(Color.GRAY);
       jtic6.setBackground(Color.GRAY);
       jtic9.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b1 ==("O") &&  b5 ==("O") && b9 ==("O") )
       {
             new WinningJFrame("Player Ο Wins!").setVisible(true);
       jtic1.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic9.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
           }
       
       }
       if (b3 ==("O") &&  b5 ==("O") && b7 ==("O") )
       {
             new WinningJFrame("Player Ο Wins!").setVisible(true);
       jtic3.setBackground(Color.GRAY);
       jtic5.setBackground(Color.GRAY);
       jtic7.setBackground(Color.GRAY);
             oCount++;
             gameScore();
             if (gameTimer != null) {
             gameTimer.stop();
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
        jticgame = new javax.swing.JPanel();
        jtic1 = new javax.swing.JButton();
        jtic2 = new javax.swing.JButton();
        jtic3 = new javax.swing.JButton();
        jtic4 = new javax.swing.JButton();
        jtic5 = new javax.swing.JButton();
        jtic6 = new javax.swing.JButton();
        jtic7 = new javax.swing.JButton();
        jtic8 = new javax.swing.JButton();
        jtic9 = new javax.swing.JButton();
        jtimer = new javax.swing.JPanel();
        jmenu = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jnewgame = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jtitle = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpointO = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcountO = new javax.swing.JLabel();
        jpointX = new javax.swing.JPanel();
        jcountX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jticgame.setBackground(new java.awt.Color(0, 102, 255));
        jticgame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jticgame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtic1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic1ActionPerformed(evt);
            }
        });
        jticgame.add(jtic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 130));

        jtic2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic2ActionPerformed(evt);
            }
        });
        jticgame.add(jtic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 140, 130));

        jtic3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic3ActionPerformed(evt);
            }
        });
        jticgame.add(jtic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 140, 130));

        jtic4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic4ActionPerformed(evt);
            }
        });
        jticgame.add(jtic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 130));

        jtic5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic5ActionPerformed(evt);
            }
        });
        jticgame.add(jtic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 140, 130));

        jtic6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic6ActionPerformed(evt);
            }
        });
        jticgame.add(jtic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 140, 130));

        jtic7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic7ActionPerformed(evt);
            }
        });
        jticgame.add(jtic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 140, 130));

        jtic8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic8ActionPerformed(evt);
            }
        });
        jticgame.add(jtic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 140, 130));

        jtic9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jtic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jtic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jtic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jtic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtic9ActionPerformed(evt);
            }
        });
        jticgame.add(jtic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 140, 130));

        jPanel1.add(jticgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 590, 460));

        jtimer.setBackground(new java.awt.Color(255, 255, 255));
        jtimer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jtimer.setForeground(new java.awt.Color(255, 51, 51));
        jtimer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jtimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 810, 340, 100));

        jmenu.setBackground(new java.awt.Color(0, 102, 255));
        jmenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jmenu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 140, 130));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton11.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jmenu.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 140, 130));

        jnewgame.setBackground(new java.awt.Color(0, 0, 0));
        jnewgame.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jnewgame.setForeground(new java.awt.Color(255, 255, 255));
        jnewgame.setText("New Game");
        jnewgame.setMaximumSize(new java.awt.Dimension(200, 158));
        jnewgame.setMinimumSize(new java.awt.Dimension(200, 158));
        jnewgame.setPreferredSize(new java.awt.Dimension(200, 158));
        jnewgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnewgameActionPerformed(evt);
            }
        });
        jmenu.add(jnewgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 240, 70));

        jreset.setBackground(new java.awt.Color(0, 0, 0));
        jreset.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jreset.setForeground(new java.awt.Color(255, 255, 255));
        jreset.setText("Reset");
        jreset.setMaximumSize(new java.awt.Dimension(200, 158));
        jreset.setMinimumSize(new java.awt.Dimension(200, 158));
        jreset.setPreferredSize(new java.awt.Dimension(200, 158));
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        jmenu.add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 70));

        jexit.setBackground(new java.awt.Color(0, 0, 0));
        jexit.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jexit.setForeground(new java.awt.Color(255, 255, 255));
        jexit.setText("Exit");
        jexit.setMaximumSize(new java.awt.Dimension(200, 158));
        jexit.setMinimumSize(new java.awt.Dimension(200, 158));
        jexit.setPreferredSize(new java.awt.Dimension(200, 158));
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        jmenu.add(jexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 240, 70));

        jPanel1.add(jmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 770, 510, 180));

        jtitle.setBackground(new java.awt.Color(0, 102, 255));
        jtitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jtitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TicTacToe Game");
        jLabel3.setOpaque(true);
        jtitle.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 380, 60));

        jPanel1.add(jtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 570, 80));

        jpointO.setBackground(new java.awt.Color(0, 102, 255));
        jpointO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jpointO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("O Player:");
        jpointO.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 60));

        jcountO.setBackground(new java.awt.Color(0, 0, 0));
        jcountO.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jcountO.setForeground(new java.awt.Color(255, 255, 255));
        jcountO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jcountO.setText("0");
        jcountO.setOpaque(true);
        jpointO.add(jcountO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, 40));

        jPanel1.add(jpointO, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 320, 60));

        jpointX.setBackground(new java.awt.Color(0, 102, 255));
        jpointX.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jpointX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcountX.setBackground(new java.awt.Color(0, 0, 0));
        jcountX.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jcountX.setForeground(new java.awt.Color(255, 255, 255));
        jcountX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jcountX.setText("0");
        jcountX.setOpaque(true);
        jpointX.add(jcountX, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X Player:");
        jpointX.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 60));

        jPanel1.add(jpointX, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 320, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1160, 990));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "TicTacToe",
            JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }

    }//GEN-LAST:event_jexitActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
        Seconds = 0;
    Timer.setText("Time: 0s");
    if (gameTimer != null) {
        gameTimer.start();
    }
        
        
        
        jtic1.setEnabled(true);
        jtic2.setEnabled(true);
        jtic3.setEnabled(true);
        jtic4.setEnabled(true);
        jtic5.setEnabled(true);
        jtic6.setEnabled(true);
        jtic7.setEnabled(true);
        jtic8.setEnabled(true);
        jtic9.setEnabled(true);

        jtic1.setText("");
        jtic2.setText("");
        jtic3.setText("");
        jtic4.setText("");
        jtic5.setText("");
        jtic6.setText("");
        jtic7.setText("");
        jtic8.setText("");
        jtic9.setText("");

        jtic1.setBackground(Color.white);
        jtic2.setBackground(Color.white);
        jtic3.setBackground(Color.white);
        jtic4.setBackground(Color.white);
        jtic5.setBackground(Color.white);
        jtic6.setBackground(Color.white);
        jtic7.setBackground(Color.white);
        jtic8.setBackground(Color.white);
        jtic9.setBackground(Color.white);

    }//GEN-LAST:event_jresetActionPerformed

    private void jnewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnewgameActionPerformed
Seconds = 0;
    Timer.setText("Time: 0s");
    if (gameTimer != null) {
        gameTimer.start();
    }




        jtic1.setEnabled(true);
        jtic2.setEnabled(true);
        jtic3.setEnabled(true);
        jtic4.setEnabled(true);
        jtic5.setEnabled(true);
        jtic6.setEnabled(true);
        jtic7.setEnabled(true);
        jtic8.setEnabled(true);
        jtic9.setEnabled(true);
        
        
        jcountO.setText("0");
        jcountX.setText("0");
        
        
        xCount = 0;
        oCount = 0;
        

        jtic1.setText("");
        jtic2.setText("");
        jtic3.setText("");
        jtic4.setText("");
        jtic5.setText("");
        jtic6.setText("");
        jtic7.setText("");
        jtic8.setText("");
        jtic9.setText("");

        jtic1.setBackground(Color.white);
        jtic2.setBackground(Color.white);
        jtic3.setBackground(Color.white);
        jtic4.setBackground(Color.white);
        jtic5.setBackground(Color.white);
        jtic6.setBackground(Color.white);
        jtic7.setBackground(Color.white);
        jtic8.setBackground(Color.white);
        jtic9.setBackground(Color.white);
    }//GEN-LAST:event_jnewgameActionPerformed

    private void jtic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic1ActionPerformed
         if (!jtic1.getText().isEmpty()) {
        return;
    }
        jtic1.setText(startGame);
        
        
        choose_a_Player();
        winningGame();
       
    }//GEN-LAST:event_jtic1ActionPerformed

    private void jtic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic2ActionPerformed
         if (!jtic2.getText().isEmpty()) {
        return;
    }
        jtic2.setText(startGame);
        
        
        
        
        choose_a_Player();
        winningGame();        
    }//GEN-LAST:event_jtic2ActionPerformed

    private void jtic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic3ActionPerformed
         if (!jtic3.getText().isEmpty()) {
        return;
    }
        jtic3.setText(startGame);
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jtic3ActionPerformed

    private void jtic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic4ActionPerformed
         if (!jtic4.getText().isEmpty()) {
        return;
    }
        jtic4.setText(startGame);
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jtic4ActionPerformed

    private void jtic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic5ActionPerformed
         if (!jtic5.getText().isEmpty()) {
        return;
    }
        jtic5.setText(startGame);
       
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jtic5ActionPerformed

    private void jtic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic6ActionPerformed
         if (!jtic6.getText().isEmpty()) {
        return;
    }
        jtic6.setText(startGame);
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jtic6ActionPerformed

    private void jtic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic7ActionPerformed
        if (!jtic7.getText().isEmpty()) {
        return;
    }
        jtic7.setText(startGame);
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jtic7ActionPerformed

    private void jtic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic8ActionPerformed
        if (!jtic8.getText().isEmpty()) {
        return;
    }
        jtic8.setText(startGame);
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jtic8ActionPerformed

    private void jtic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtic9ActionPerformed
         if (!jtic9.getText().isEmpty()) {
        return;
    }
        jtic9.setText(startGame);
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jtic9ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Tictactoe().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jcountO;
    private javax.swing.JLabel jcountX;
    private javax.swing.JButton jexit;
    private javax.swing.JPanel jmenu;
    private javax.swing.JButton jnewgame;
    private javax.swing.JPanel jpointO;
    private javax.swing.JPanel jpointX;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jtic1;
    private javax.swing.JButton jtic2;
    private javax.swing.JButton jtic3;
    private javax.swing.JButton jtic4;
    private javax.swing.JButton jtic5;
    private javax.swing.JButton jtic6;
    private javax.swing.JButton jtic7;
    private javax.swing.JButton jtic8;
    private javax.swing.JButton jtic9;
    private javax.swing.JPanel jticgame;
    private javax.swing.JPanel jtimer;
    private javax.swing.JPanel jtitle;
    // End of variables declaration//GEN-END:variables
}
