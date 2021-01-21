

public class ArtInfosGUI extends javax.swing.JFrame {
    

    ArtStoryGUI story_gui = new ArtStoryGUI();
    
    public ArtInfosGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        story_button = new javax.swing.JLabel();
        exit_butonu = new javax.swing.JLabel();
        tf_artname = new javax.swing.JTextField();
        tf_artist = new javax.swing.JTextField();
        tf_price = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        artinfoscerceve = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setTitle("Art Informations");
        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(550, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        story_button.setForeground(new java.awt.Color(255, 255, 255));
        story_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/arama-logo.png"))); // NOI18N
        story_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        story_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                story_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(story_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        exit_butonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/admin_cikislogo.png"))); // NOI18N
        exit_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_butonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_butonuMouseClicked(evt);
            }
        });
        jPanel1.add(exit_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        tf_artname.setEditable(false);
        tf_artname.setBackground(new java.awt.Color(28, 0, 47));
        tf_artname.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        tf_artname.setForeground(new java.awt.Color(255, 255, 255));
        tf_artname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_artname.setAlignmentX(0.0F);
        tf_artname.setAlignmentY(0.0F);
        tf_artname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_artnameActionPerformed(evt);
            }
        });
        jPanel1.add(tf_artname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 230, 49));

        tf_artist.setEditable(false);
        tf_artist.setBackground(new java.awt.Color(28, 0, 47));
        tf_artist.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        tf_artist.setForeground(new java.awt.Color(255, 255, 255));
        tf_artist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_artist.setAlignmentX(0.0F);
        tf_artist.setAlignmentY(0.0F);
        tf_artist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_artistActionPerformed(evt);
            }
        });
        jPanel1.add(tf_artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 230, 49));

        tf_price.setEditable(false);
        tf_price.setBackground(new java.awt.Color(28, 0, 47));
        tf_price.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        tf_price.setForeground(new java.awt.Color(255, 255, 255));
        tf_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_price.setAlignmentX(0.0F);
        tf_price.setAlignmentY(0.0F);
        tf_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priceActionPerformed(evt);
            }
        });
        jPanel1.add(tf_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 230, 49));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARTIST");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 49));

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRICE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 49));

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ART NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 49));

        artinfoscerceve.setIcon(new javax.swing.ImageIcon("C:\\Users\\bugra\\Desktop\\artinfoscerceve.png")); // NOI18N
        jPanel1.add(artinfoscerceve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/background4.jpg"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(550, 300));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_artnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_artnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_artnameActionPerformed

    private void tf_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_priceActionPerformed

    private void tf_artistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_artistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_artistActionPerformed

    private void exit_butonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_butonuMouseClicked

        setVisible(false);
    }//GEN-LAST:event_exit_butonuMouseClicked

    private void story_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_story_buttonMouseClicked

        story_gui.getStory(artType); // WE DETERMINED THE ARTTYPE THANKS TO setArtType FUNCTION AND SENDING THE GETSTORY FUNCTION IN STORY GUI
        story_gui.setVisible(true); 

    }//GEN-LAST:event_story_buttonMouseClicked

     public static String artType  ;
    // HANGİ ART OBJESİNE GİRDİYSEK ONUN STORYSİNİ ÇEKMEMİZ GEREKTİĞİ İÇİN ART INFO GUISINE GIRIS YAPTIGIMIZDA BU FONKSIYONU AKTIVE ETMEMIZ GEREKIYOR.
    public void setArtType(String artType) // TAKES ARTTYPE AND DETERMINES THE ARTTYPE FOR SHOWING THE STORY GUI LATER
    {
        ArtInfosGUI.artType = artType  ;
    }
    
    public void setInformations (String artName,String artistName,String price) // TAKES INFORMATIONS AND FILLS THE BLANKS ( TEXT FIELDS )
    {
        tf_artname.setText(artName);
        tf_artist.setText(artistName);
        tf_price.setText(price);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artinfoscerceve;
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel story_button;
    private javax.swing.JTextField tf_artist;
    private javax.swing.JTextField tf_artname;
    private javax.swing.JTextField tf_price;
    // End of variables declaration//GEN-END:variables
}
