/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author kushalgevaria
 */
public class RealTest extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public RealTest() {
        initComponents();
        buttons();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excel.png"))); // NOI18N
        jButton1.setText("Choose Excel File");
        jButton1.setMaximumSize(new java.awt.Dimension(160, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(160, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 210, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open.png"))); // NOI18N
        jButton2.setText("Choose Folder");
        jButton2.setMaximumSize(new java.awt.Dimension(160, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(160, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(780, 10, 210, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submit.png"))); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 510, 210, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/run.png"))); // NOI18N
        jButton4.setText("Run");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 510, 210, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(760, 510, 210, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fifa.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1100, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(1100, 700));
        jLabel2.setPreferredSize(new java.awt.Dimension(1100, 700));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -50, 1100, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
JFileChooser chooser1,chooser2;
String filepath="/home/saurabh/projects/football/Fixtures/2014.xlsx";
String folderpath="/home/saurabh/projects/football/MatchDays/2014";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        chooser1 = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XLSX files", "xlsx");
        chooser1.setCurrentDirectory(new java.io.File("."));
        chooser1.setDialogTitle("choosertitle");
        //chooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser1.setFileFilter(filter);
        chooser1.setAcceptAllFileFilterUsed(true);
        if (chooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            filepath=chooser1.getSelectedFile().toString();
            //filepath=chooser1.getCurrentDirectory().toString();
            //filepath="/home/saurabh/projects/football/Fixtures/2014.xlsx";
            System.out.println(filepath);
        }else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        chooser2 = new JFileChooser();
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("XLS files", "xlsb");
        chooser2.setCurrentDirectory(new java.io.File("."));
        chooser2.setDialogTitle("choosertitle");
        chooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //chooser.setFileFilter(filter);
        chooser2.setAcceptAllFileFilterUsed(true);
        if (chooser2.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            folderpath=chooser2.getSelectedFile().toString();
            //folderpath="/home/saurabh/projects/football/MatchDays/2014";
            System.out.println(folderpath);
        }else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            String cmd="python /home/saurabh/projects/football/test.py "+filepath+" "+folderpath;
            //System.out.println(cmd);
            Process p= Runtime.getRuntime().exec(cmd);
            p.waitFor();
            JOptionPane.showMessageDialog(null, "Process Completed");
        }catch (InterruptedException ex) {
            Logger.getLogger(RealTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RealTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            String[] cmd = {
            "/bin/sh",
            "-c",
            "java -cp /home/saurabh/Downloads/weka-3-6-13/weka.jar weka.classifiers.meta.Vote -l /home/saurabh/finalgui/votemodel.model -T /home/saurabh/projects/football/wekarealtest.arff > /home/saurabh/Desktop/analysis.txt"
            };
            Process p= Runtime.getRuntime().exec(cmd);
            
           p.waitFor();
           /*
           String s=null;
           String output="";
           BufferedReader stdin = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					while ((s = stdin.readLine()) != null) {
						output+=s+"\n";
					}
					System.out.println("Output:\n"+output);
            
            //int exitval= p.exitValue();
            
            /*InputStream error = p.getErrorStream();
   for (int i = 0; i < error.available(); i++) {
   System.out.println("" + error.read());
   }*/
            String[] cmd2={
              "/bin/sh",
            "-c",
            "java -cp /home/saurabh/Downloads/weka-3-6-13/weka.jar weka.classifiers.meta.Vote -l /home/saurabh/finalgui/votemodel.model -T /home/saurabh/projects/football/wekarealtest.arff -p 0 > /home/saurabh/Desktop/pred.txt"
              
            };
            Process q=Runtime.getRuntime().exec(cmd2);
            q.waitFor();
            JOptionPane.showMessageDialog(null, "Output saved");
        } catch (IOException ex) {
            Logger.getLogger(RealTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(RealTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Index e = new Index();
        e.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(RealTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void buttons() {
        //jButton1.setBackground(new Color(59, 89, 182));
        jButton1.setForeground(null);
        jButton1.setFocusPainted(false);
        jButton1.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        jButton2.setForeground(null);
        jButton2.setFocusPainted(false);
        jButton2.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        jButton3.setForeground(null);
        jButton3.setFocusPainted(false);
        jButton3.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        jButton4.setForeground(null);
        jButton4.setFocusPainted(false);
        jButton4.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        jButton5.setForeground(null);
        jButton5.setFocusPainted(false);
        jButton5.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
        
            
        public void mousePressed(MouseEvent e) {
            // Not working :(
            jButton1.setBackground(new Color(59, 89, 182));
            jButton1.setForeground(Color.WHITE);
            jButton1.setFocusPainted(false);
            jButton1.setFont(new Font("Tahoma", Font.BOLD, 12)); 
        }
      
        
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton1.setBackground(new Color(59, 89, 182));
            jButton1.setForeground(Color.WHITE);
            jButton1.setFocusPainted(false);
            jButton1.setFont(new Font("Tahoma", Font.BOLD, 12));      
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            //jButton1.setBackground(new Color(59, 89, 182));
            jButton1.setBackground(null);
            jButton1.setForeground(null);
            jButton1.setFocusPainted(false);
            jButton1.setFont(new Font("Tahoma", Font.BOLD, 12));        
        }
        });
        
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            
        public void mousePressed(MouseEvent e) {
            // Not working :(
            jButton2.setBackground(new Color(59, 89, 182));
            jButton2.setForeground(Color.WHITE);
            jButton2.setFocusPainted(false);
            jButton2.setFont(new Font("Tahoma", Font.BOLD, 12)); 
        }
      
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton2.setBackground(new Color(59, 89, 182));
            jButton2.setForeground(Color.WHITE);
            jButton2.setFocusPainted(false);
            jButton2.setFont(new Font("Tahoma", Font.BOLD, 12));      
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            //jButton1.setBackground(new Color(59, 89, 182));
            jButton2.setBackground(null);
            jButton2.setForeground(null);
            jButton2.setFocusPainted(false);
            jButton2.setFont(new Font("Tahoma", Font.BOLD, 12));        
        }
        });
        
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton3.setBackground(new Color(59, 89, 182));
            jButton3.setForeground(Color.WHITE);
            jButton3.setFocusPainted(false);
            jButton3.setFont(new Font("Tahoma", Font.BOLD, 12));      
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            //jButton1.setBackground(new Color(59, 89, 182));
            jButton3.setBackground(null);
            jButton3.setForeground(null);
            jButton3.setFocusPainted(false);
            jButton3.setFont(new Font("Tahoma", Font.BOLD, 12));        
        }
        });
        
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton4.setBackground(new Color(59, 89, 182));
            jButton4.setForeground(Color.WHITE);
            jButton4.setFocusPainted(false);
            jButton4.setFont(new Font("Tahoma", Font.BOLD, 12));      
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            //jButton1.setBackground(new Color(59, 89, 182));
            jButton4.setBackground(null);
            jButton4.setForeground(null);
            jButton4.setFocusPainted(false);
            jButton4.setFont(new Font("Tahoma", Font.BOLD, 12));        
        }
        });
        
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton5.setBackground(new Color(59, 89, 182));
            jButton5.setForeground(Color.WHITE);
            jButton5.setFocusPainted(false);
            jButton5.setFont(new Font("Tahoma", Font.BOLD, 12));      
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            //jButton1.setBackground(new Color(59, 89, 182));
            jButton5.setBackground(null);
            jButton5.setForeground(null);
            jButton5.setFocusPainted(false);
            jButton5.setFont(new Font("Tahoma", Font.BOLD, 12));        
        }
        });
    }
}
