
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AdminLoginGUI extends javax.swing.JFrame {
    
            
    public AdminLoginGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        cikis_butonu = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        giris_butonu = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        admin_cerceve = new javax.swing.JLabel();
        admin_background = new javax.swing.JLabel();

        setTitle("Register / Login ");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(600, 300, 0, 0));
        setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, username, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), this, org.jdesktop.beansbinding.BeanProperty.create("undecorated"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cikis_butonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/admin_cikislogo.png"))); // NOI18N
        cikis_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cikis_butonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikis_butonuMouseClicked(evt);
            }
        });
        getContentPane().add(cikis_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        tf_username.setFont(new java.awt.Font("Eras Medium ITC", 1, 17)); // NOI18N
        tf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 72, 138, -1));

        pf_password.setFont(new java.awt.Font("Eras Medium ITC", 1, 17)); // NOI18N
        pf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 144, 138, -1));

        giris_butonu.setBackground(new java.awt.Color(0, 21, 21));
        giris_butonu.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        giris_butonu.setForeground(new java.awt.Color(255, 255, 255));
        giris_butonu.setText("SIGN IN");
        giris_butonu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        giris_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giris_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonuActionPerformed(evt);
            }
        });
        giris_butonu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                giris_butonuKeyPressed(evt);
            }
        });
        getContentPane().add(giris_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 30));

        mesaj_yazisi.setBackground(new java.awt.Color(255, 230, 235));
        mesaj_yazisi.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(mesaj_yazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 180, 30));

        password.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 105, 90, 40));

        username.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 30, 90, 40));

        admin_cerceve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/admin_cerceve.png"))); // NOI18N
        getContentPane().add(admin_cerceve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        admin_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/adminbackground.png"))); // NOI18N
        getContentPane().add(admin_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -120, 890, 700));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giris_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonuActionPerformed

        
    String kullanici_adi = tf_username.getText();
    String parola = new String(pf_password.getPassword());
    AdminLoginGUI signuplogin = new AdminLoginGUI();
    
    boolean girisbasarili = false;
    String dosya_yolu = "Admin_Database.txt";
    File file = new File(dosya_yolu);
    
    String giris_ad = "";
    String giris_sifre = "";
    String dogru_sifre = "";
    
        try {
            
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[\t\n]");
        
        while( scanner.hasNext() && !girisbasarili) {
                
           giris_ad = scanner.next();
           giris_sifre = scanner.next();
           
           if ( giris_ad.equals(kullanici_adi) ) {
                   
                dogru_sifre = giris_sifre.trim();
                
                if (dogru_sifre.equals(parola)){
                    girisbasarili = true ;
                }
           } 
        }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminLoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR!");
        }
  

        
    if(girisbasarili && !kullanici_adi.equals("") && !parola.equals("")){
        
        tf_username.setText("");
        pf_password.setText("");
        mesaj_yazisi.setText("  Login Successful !");
        JOptionPane.showMessageDialog(null,"Welcome "+kullanici_adi+" !");
        setVisible(false);
        AdminPanel admin = new AdminPanel();
        admin.setVisible(true);
 
    } else {
        mesaj_yazisi.setText("Login Unsuccessful !");
    }

    }//GEN-LAST:event_giris_butonuActionPerformed

    private void tf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usernameActionPerformed

    private void pf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_passwordActionPerformed

    private void giris_butonuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giris_butonuKeyPressed
 
    }//GEN-LAST:event_giris_butonuKeyPressed

    private void cikis_butonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikis_butonuMouseClicked

           int cikis = JOptionPane.showConfirmDialog(null,"Do You Want to Close the System ?","Exit",JOptionPane.YES_NO_OPTION);
        if (cikis == JOptionPane.YES_NO_OPTION){
            setVisible(false);
        }
        
    }//GEN-LAST:event_cikis_butonuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_background;
    private javax.swing.JLabel admin_cerceve;
    private javax.swing.JLabel cikis_butonu;
    private javax.swing.JButton giris_butonu;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_username;
    private javax.swing.JLabel username;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
