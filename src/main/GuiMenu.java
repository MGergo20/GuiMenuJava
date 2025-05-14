package main;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GuiMenu extends javax.swing.JFrame {

    public GuiMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBoxHirlevel = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxSzakmaEleres = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuBetoltes = new javax.swing.JMenuItem();
        jMenuMentes = new javax.swing.JMenuItem();
        mnuPrgKilepes = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextField1.setText(" ");

        jCheckBoxHirlevel.setSelected(true);
        jCheckBoxHirlevel.setText("Hírlevél");

        jLabel2.setText("Név:");

        jLabel1.setText("Szakok:");

        jComboBoxSzakmaEleres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-== Kiválasztott szak ==-", "Szoftverfejlesztő- és Tesztelő", "Szoftverfejlesztő", "Rendszergazda", "Adatbázis-kezelő", "IT biztonsági szakértő", "Webfejlesztő" }));

        jMenu1.setText("Program");

        jMenuBetoltes.setText("Betöltés...");
        jMenuBetoltes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBetoltesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuBetoltes);

        jMenuMentes.setText("Mentés...");
        jMenuMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMentesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuMentes);

        mnuPrgKilepes.setText("Kilépés...");
        mnuPrgKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgKilepesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPrgKilepes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxSzakmaEleres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jCheckBoxHirlevel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxSzakmaEleres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxHirlevel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPrgKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuPrgKilepesActionPerformed

    private void kilepes() throws HeadlessException {
        String kerdes = "Biztosan kiszeretnél lépni?";
        String cim = "KILÉPÉS";
        int msgTip = JOptionPane.QUESTION_MESSAGE;
        int msgTip2 = JOptionPane.YES_NO_OPTION;
//        JOptionPane.showMessageDialog(null, "Biztosan kiszeretnél lépni?");
        int gomb = JOptionPane.showConfirmDialog(rootPane, kerdes, cim, msgTip2);
        if (gomb == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
//        System.out.println("gomb" + gomb);
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        System.out.println("Kilépés folyamatban...");
        kilepes();

    }//GEN-LAST:event_formWindowClosing

    private void jMenuMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMentesActionPerformed
        JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
        int gomb = jfc.showSaveDialog(rootPane);
        if (gomb == JFileChooser.APPROVE_OPTION){
            File kivalasztottFajl = jfc.getSelectedFile();
            String fajlElerese = kivalasztottFajl.getAbsolutePath();
            Path path = Path.of(fajlElerese); // Hova ijruk
            try {
                Files.writeString(path, tartalom());
            } catch (IOException ex) {
               String msg = "IO hiba:\n " + ex.getMessage();
               JOptionPane.showMessageDialog(rootPane, msg);
               Logger.getLogger(GuiMenu.class.getName()).log(Level.SEVERE,null,ex);
               
            } 
        }
        
       
        /*Mentés alapszerkezete*/
//        Path path = Path.of("kimenet.txt"); // Hova ijruk
//        byte[] bytes = jTextField1.getText().getBytes(); // Mit irunk
//        try {
//            Files.write(path, jTextField1.getText().getBytes());
//        } catch (IOException ex) {
//            Logger.getLogger(GuiMenu.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_jMenuMentesActionPerformed

    private void jMenuBetoltesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBetoltesActionPerformed
        JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
        int gomb = jfc.showSaveDialog(rootPane);
        if (gomb == JFileChooser.APPROVE_OPTION){
            File kivalasztottFajl = jfc.getSelectedFile();
            try {
                String sorok = Files.readString(kivalasztottFajl.toPath());
                System.out.println("A beolvasott fájl tartalma: ");
                System.out.println(sorok);
            } catch (IOException ex) {
               Logger.getLogger(GuiMenu.class.getName()).log(Level.SEVERE,null,ex);
               
            } 
        } 
    }//GEN-LAST:event_jMenuBetoltesActionPerformed
    private String tartalom(){
        String nev = jTextField1.getText();
        String szak = (String) jComboBoxSzakmaEleres.getSelectedItem();
        boolean hirlevelel = jCheckBoxHirlevel.isSelected();
        if (hirlevelel == true){
            System.out.println("Kapott hirlevelet");
        }else{
            System.out.println("Nem kapott hirlevelet!");
        }
        return "Beiratkozás a szakmára: "  +
                "Jelentkező neve: " + nev + "\n" +
                "A választott szakma " + szak + "\n" +
                "Hirlevél:: " + hirlevelel;
        
    }
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxHirlevel;
    private javax.swing.JComboBox<String> jComboBoxSzakmaEleres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBetoltes;
    private javax.swing.JMenuItem jMenuMentes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem mnuPrgKilepes;
    // End of variables declaration//GEN-END:variables
}
