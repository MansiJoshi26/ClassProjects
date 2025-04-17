/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
/*import java.awt.events.*;*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*import java.util.Random;*/
/**
 *
 * @author Ajayk
 */
public class PLAY extends JFrame {

   /* private JLabel defineLabel;
    private JTextField answerField;
    private JTextArea resultArea;
    private JButton playBotton,submitButton;*/
  int score=0;
    private String correctAnswer=" ";
    private final String url="jdbc:mysql://localhost:3306/game";
     private final String user="root";
     private final String password="Root";
    /**
     * Creates new form PLAY
     */
    public PLAY() {
        setTitle("The word hoard");
        setSize(600,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        playButton =new JButton("Play");
        
        defineLabel = new JLabel("Definition will appear here");
        defineLabel.setPreferredSize(new Dimension(550,30));
        
        answerField=new JTextField(20);
        answerField.setVisible(false);
        
        submitButton=new JButton("Submit");
        submitButton.setVisible(false);
        
        resultArea=new JTextArea(3,50);
        resultArea.setEditable(false);
        resultArea.setVisible(true);
        
        scoreLabel=new JLabel("Score :0");
        scoreLabel.setFont(new Font("Arial",Font.BOLD,14));
        scoreLabel.setForeground(Color.BLUE);
        scoreLabel.setBounds(50, 300, 200, 30);
        
        
        add(playButton);
        add(defineLabel);
        add(answerField);
        add(submitButton);
        add(resultArea);
        add(scoreLabel);
        
        
        playButton.addActionListener(e->{
            try {
                fetchRandomWord();
            } catch (Exception ex) {
                Logger.getLogger(PLAY.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        submitButton.addActionListener(e->checkAnswer());
       initComponents();
       JPanel testPanel=new JPanel();
       testPanel.setPreferredSize(new Dimension(400,400));
       getContentPane().add(testPanel);
       pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        exploreButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        defineLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MAIN.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOARD.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        playButton.setBackground(new java.awt.Color(0, 153, 153));
        playButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("PLAY");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 153, 153));
        backButton.setText("BACK");

        exploreButton.setBackground(new java.awt.Color(0, 153, 153));
        exploreButton.setText("EXPLORE");
        exploreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exploreButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("CLICK HERE TO EXPLORE MORE :");

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("your answer :");

        answerField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(0, 153, 153));
        submitButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 0, 0));
        submitButton.setText(">");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resultArea.setColumns(20);
        resultArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultArea.setRows(5);
        jScrollPane1.setViewportView(resultArea);

        defineLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exploreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(defineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(defineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(answerField)
                                    .addComponent(submitButton))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exploreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exploreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreButtonActionPerformed
        // TODO add your handling code here:
        new ADDPLAY().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exploreButtonActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_answerFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
       checkAnswer();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
      try {
          // TODO add your handling code here:
          fetchRandomWord();
      } catch (Exception ex) {
          Logger.getLogger(PLAY.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_playButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void fetchRandomWord() throws java.sql.SQLException{
    
    try(Connection con=DriverManager.getConnection(url,user,password)){
    
        String query="SELECT word,definition FROM words ORDER BY RAND() LIMIT 1";
        
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        if(rs.next()){
        correctAnswer=rs.getString("word");
        String define=rs.getString("definition");
            System.out.println("Word :"+correctAnswer);
            System.out.println("Define :"+define);
        defineLabel.setText("definition :"+define);
        answerField.setVisible(true);
        submitButton.setVisible(true);
        defineLabel.setVisible(true);
        resultArea.setVisible(true);
        answerField.requestFocusInWindow();
        resultArea.setText("");
        answerField.setText("");
        
        revalidate();
        repaint();
        
        
        }
        else{
        
        defineLabel.setText("no data found!!");
        
        }
        
    }
    catch(Exception ex){
    ex.printStackTrace();
    resultArea.setText("Database error:"+ex.getMessage());
    
    }
    
    }
    private void checkAnswer(){
    String userInput=answerField.getText().trim();
    if(userInput.equalsIgnoreCase(correctAnswer)){
    resultArea.setText("you won!!!");
    score++;
    scoreLabel.setText("Score :"+score);
    }
    else{
    
    resultArea.setText("try again   THE CORRECT ANSWER IS : "+correctAnswer);
    }
    
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("center".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        SwingUtilities.invokeLater(()->new PLAY().setVisible(true));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel defineLabel;
    private javax.swing.JButton exploreButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton playButton;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
