
import javax.swing.JOptionPane;


public class ArtGalleryMain extends javax.swing.JFrame {
 
    DefineArtInfos define_art = new DefineArtInfos();
    
    public ArtGalleryMain() {

        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        ScrollPanel = new javax.swing.JScrollPane();
        ScrollBackground = new javax.swing.JPanel();
        BackgroundScroll = new javax.swing.JPanel();
        cikis_button_1 = new javax.swing.JLabel();
        AdminButton = new javax.swing.JLabel();
        ART1 = new javax.swing.JLabel();
        ART2 = new javax.swing.JLabel();
        ART3 = new javax.swing.JLabel();
        ART4 = new javax.swing.JLabel();
        ART5 = new javax.swing.JLabel();
        ART6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Art Gallery System");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanel.setAutoscrolls(true);

        ScrollBackground.setPreferredSize(new java.awt.Dimension(1280, 2500));

        BackgroundScroll.setPreferredSize(new java.awt.Dimension(1280, 3000));
        BackgroundScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cikis_button_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/exit_logo_2.png"))); // NOI18N
        cikis_button_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cikis_button_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikis_button_1MouseClicked(evt);
            }
        });
        BackgroundScroll.add(cikis_button_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, -1, -1));

        AdminButton.setBackground(new java.awt.Color(255, 255, 255));
        AdminButton.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminButton.setText("Admin Login");
        AdminButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.red));
        AdminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminButtonMouseClicked(evt);
            }
        });
        BackgroundScroll.add(AdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ART1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art_images/Leman Akpinar 2.jpg"))); // NOI18N
        ART1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ART1.setPreferredSize(new java.awt.Dimension(430, 430));
        ART1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ART1MouseClicked(evt);
            }
        });
        BackgroundScroll.add(ART1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 68, -1, -1));

        ART2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art_images/Leman Akpinar 1.jpg"))); // NOI18N
        ART2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ART2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ART2MouseClicked(evt);
            }
        });
        BackgroundScroll.add(ART2, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 59, 450, 448));

        ART3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art_images/Goksu Gul.jpg"))); // NOI18N
        ART3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ART3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ART3MouseClicked(evt);
            }
        });
        BackgroundScroll.add(ART3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 775, 431, 509));

        ART4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art_images/Goksu Gul 2.jpg"))); // NOI18N
        ART4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ART4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ART4MouseClicked(evt);
            }
        });
        BackgroundScroll.add(ART4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 780, 431, 498));

        ART5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art_images/Ali Kabas.jpg"))); // NOI18N
        ART5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ART5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ART5MouseClicked(evt);
            }
        });
        BackgroundScroll.add(ART5, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 1529, 431, 509));

        ART6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art_images/Seda Gazioglu.jpeg"))); // NOI18N
        ART6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ART6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ART6MouseClicked(evt);
            }
        });
        BackgroundScroll.add(ART6, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 1529, 431, 509));

        jLabel7.setFont(new java.awt.Font("Eras Light ITC", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Psisik Çöl");
        BackgroundScroll.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 242, 38));

        jLabel8.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Leman Akpınar");
        BackgroundScroll.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 180, 40));

        jLabel6.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Leman Akpınar");
        BackgroundScroll.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 180, 40));

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Daydreamer");
        BackgroundScroll.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, -1, 38));

        jLabel10.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Göksu Gül");
        BackgroundScroll.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Eras Light ITC", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("The Bear");
        BackgroundScroll.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 1310, -1, 38));

        jLabel12.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Göksu Gül");
        BackgroundScroll.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 1350, -1, 30));

        jLabel13.setFont(new java.awt.Font("Eras Light ITC", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Purity");
        BackgroundScroll.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 2050, -1, 38));

        jLabel14.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ali Kabas");
        BackgroundScroll.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2090, -1, 40));

        jLabel15.setFont(new java.awt.Font("Eras Light ITC", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Skull");
        BackgroundScroll.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 2040, -1, 38));

        jLabel16.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Seda Gazioglu");
        BackgroundScroll.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 2090, -1, 30));

        jLabel9.setFont(new java.awt.Font("Eras Light ITC", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Oyunbozan");
        BackgroundScroll.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1310, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/background4.jpg"))); // NOI18N
        BackgroundScroll.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 2610));

        javax.swing.GroupLayout ScrollBackgroundLayout = new javax.swing.GroupLayout(ScrollBackground);
        ScrollBackground.setLayout(ScrollBackgroundLayout);
        ScrollBackgroundLayout.setHorizontalGroup(
            ScrollBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScrollBackgroundLayout.createSequentialGroup()
                .addComponent(BackgroundScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ScrollBackgroundLayout.setVerticalGroup(
            ScrollBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 2604, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ScrollPanel.setViewportView(ScrollBackground);

        getContentPane().add(ScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  

  // EACH PAINTINGS HAS CERTAIN STRING TYPE
  // THESE EVENTS FOR EACH PAINTINGS EXECUTES A FUNCTION WITH SENDING A CERTAIN ART TYPE STRING
    
    
    private void ART1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ART1MouseClicked
  
        ArtClickFunction("Art1");
           
    }//GEN-LAST:event_ART1MouseClicked

    private void ART2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ART2MouseClicked

        ArtClickFunction("Art2");
    }//GEN-LAST:event_ART2MouseClicked

    private void ART3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ART3MouseClicked

        ArtClickFunction("Art3");
    }//GEN-LAST:event_ART3MouseClicked

    private void ART4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ART4MouseClicked

        ArtClickFunction("Art4");
    }//GEN-LAST:event_ART4MouseClicked

    private void ART5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ART5MouseClicked

        ArtClickFunction("Art5");
    }//GEN-LAST:event_ART5MouseClicked

    private void ART6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ART6MouseClicked
       ArtClickFunction("Art6");
    }//GEN-LAST:event_ART6MouseClicked

    private void AdminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminButtonMouseClicked
      
       //SINGLETON
       SingleGUIObject object = SingleGUIObject.getInstance();
       AdminLoginGUI admingui = (AdminLoginGUI) object.AdminLoginGUI();

       admingui.setVisible(true);
        
    }//GEN-LAST:event_AdminButtonMouseClicked

    private void cikis_button_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikis_button_1MouseClicked
        int cikis = JOptionPane.showConfirmDialog(null,"Do You Want to Close the System ?","Exit",JOptionPane.YES_NO_OPTION);
        if (cikis == JOptionPane.YES_NO_OPTION){
            setVisible(false);
            System.exit(0);
        }
    }//GEN-LAST:event_cikis_button_1MouseClicked

    public void ArtClickFunction(String artType) // THIS FUNCTION TAKES A STRING TYPE artType 
    {
       Arts arts = (Arts) ArtFactory.getArt(artType); // CREATING AN OBJECT arts DERIVED FROM Arts CLASS AND EXECUTING STATIC FUNCTION WITH TYPE CASTING
                                                      // FLYWEIGHT PATTERN 
       // SINGLETON PATTERN
       SingleGUIObject object = SingleGUIObject.getInstance();
       ArtInfosGUI art_infos_gui = (ArtInfosGUI) object.ArtInfosGUI();
       
       art_infos_gui.setArtType(artType);  // SENDING AN ARTTYPE WITH FUNCTION setArtType AND DETERMINING CERTAIN TYPE
       define_art.defineArtInfos(artType);  // define_art IS AN OBJECT DERIVED FROM DefineArtInfos CLASS AND WITH THIS OBJECT WE EXECUTE THE DefineArtInfos FUNCTION 
                                           // AND THANKS TO IT FOR EACH CERTAIN artType WE DETERMINE THEIR NECCESSARY PAINTING INFORMATIONS
       
       // flyeight
       ArtInfosGUI art_info = new ArtInfosGUI();
       art_info.setInformations (arts.getArtName(),arts.getArtist(),arts.getPrice()); // EXECUTING setInformations FUNCTION IN ArtInfosGUI CLASS AND SENDING THE 
                                                                                      // NECESSARY PAINTING INFORMATIONS THAT TAKEN FROM Arts CLASS WITH USING FLYWEIGHT PATTERN
       art_info.setVisible(true);
       
    }

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArtGalleryMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ART1;
    private javax.swing.JLabel ART2;
    private javax.swing.JLabel ART3;
    private javax.swing.JLabel ART4;
    private javax.swing.JLabel ART5;
    private javax.swing.JLabel ART6;
    private javax.swing.JLabel AdminButton;
    private javax.swing.JPanel BackgroundScroll;
    private javax.swing.JPanel ScrollBackground;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cikis_button_1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    // End of variables declaration//GEN-END:variables
}
