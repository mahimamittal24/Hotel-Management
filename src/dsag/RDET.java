package dsag;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RDET.java
 *
 * Created on Nov 24, 2014, 1:44:46 PM
 */

/**
 *
 * @author 4
 */
public class RDET extends javax.swing.JFrame {

    /** Creates new form RDET */
    public RDET() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        C1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        C1.setBackground(new java.awt.Color(0, 153, 204));
        C1.setFont(new java.awt.Font("Book Antiqua", 1, 12));
        C1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R NO", "R TYPE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(C1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 610, 280);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 16));
        jButton2.setText("<< BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 390, 120, 30);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24));
        jLabel2.setText("ROOM DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(244, 20, 160, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new menu().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 DefaultTableModel dm=(DefaultTableModel)C1.getModel();
        try
{
            Class.forName("java.sql.DriverManager");
            Connection c=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ABCD","root","RRMPS");
            Statement s=(Statement)c.createStatement();
            String q="SELECT * FROM ROOM_DETAILS ;";
ResultSet rs=s.executeQuery(q);
while(rs.next())
{
    int B_ID=rs.getInt("R_NO");
    String title=rs.getString("R_TYPE");

    String STATUS =rs.getString("BOOKED");
   Object ob[]={B_ID,title,STATUS};

   dm.addRow(ob);

        }
        }
        catch(Exception e) {

            JOptionPane.showMessageDialog(this,e.getMessage());
    }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RDET().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable C1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
