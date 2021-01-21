

public class ArtStoryGUI extends javax.swing.JFrame {

    
    public ArtStoryGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        story_cerceve = new javax.swing.JLabel();
        story_scroll = new javax.swing.JScrollPane();
        story_area = new javax.swing.JTextArea();

        setTitle("Art Story");
        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));

        jPanel1.setMaximumSize(new java.awt.Dimension(550, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        story_cerceve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/artinfoscerceve.png"))); // NOI18N
        jPanel1.add(story_cerceve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        story_area.setEditable(false);
        story_area.setBackground(new java.awt.Color(53, 25, 82));
        story_area.setColumns(500);
        story_area.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        story_area.setForeground(new java.awt.Color(255, 255, 255));
        story_area.setLineWrap(true);
        story_area.setTabSize(500);
        story_area.setWrapStyleWord(true);
        story_scroll.setViewportView(story_area);

        jPanel1.add(story_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 280));

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

    
// FLYWEIGHT PATTERN |||||||||||||||||||||||||||||||||||||||||
   public void getStory(String artType)
   {    
       Arts arts = (Arts) ArtFactory.getArt(artType);
       story_area.setText(arts.getStory()); 
     // HASHMAPTE KAYITLI OLAN ARTTYPE GETART FONKSIYONU İLE YOLLANIP ART'IN BİLGİLERİ ELDE EDİLİYOR VE ARDINDAN STORY AREAYA ART.STORY BASTIRILIYOR.
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea story_area;
    private javax.swing.JLabel story_cerceve;
    private javax.swing.JScrollPane story_scroll;
    // End of variables declaration//GEN-END:variables
}
