package dsag;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ABOUT.java
 *
 * Created on Nov 24, 2014, 1:45:09 PM
 */

/**
 *
 * @author 4
 */
public class ABOUT extends javax.swing.JFrame {

    /** Creates new form ABOUT */
    public ABOUT() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SPECIFICATIONS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 110, 130, 20);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADDRESS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 240, 90, 20);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-MAIL ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 360, 90, 17);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 20));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FOR MORE DETAILS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 410, 290, 20);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT NO.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 470, 140, 20);

        jTextArea1.setColumns(10);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(2);
        jTextArea1.setText("1. GREENARY LAND\n2. SWIMMING POOL\n3. SHOPPING MALL\n4. SPORTS FACILITIES\n5. HEALTH CENTER");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 90, 190, 100);

        jTextArea2.setColumns(10);
        jTextArea2.setEditable(false);
        jTextArea2.setRows(2);
        jTextArea2.setText("NEAR GREEN COMPLEX PARK\nGREEN LAND,MYSORE\nINDIA");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(320, 220, 190, 100);

        jTextField1.setEditable(false);
        jTextField1.setText("stardust@gmail.com");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 350, 260, 20);

        jTextField2.setEditable(false);
        jTextField2.setText("9876789890,9865434567");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 460, 260, 20);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 280, 90, 29);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ABOUT OUR HOTEL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 210, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsag/10.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 860, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
new menu().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABOUT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
