

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminPanel extends javax.swing.JFrame {

    
    public AdminPanel() {
    initComponents();
    setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        button_group = new javax.swing.ButtonGroup();
        button_group2 = new javax.swing.ButtonGroup();
        solpanel = new javax.swing.JPanel();
        baslik = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        idnumber = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_surname = new javax.swing.JTextField();
        tf_phonenumber = new javax.swing.JTextField();
        tf_idnumber = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        confirm_butonu = new javax.swing.JButton();
        guncelle_butonu = new javax.swing.JButton();
        silme_butonu = new javax.swing.JButton();
        database_kaydet = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        logo_solpanel = new javax.swing.JLabel();
        radio_female = new javax.swing.JRadioButton();
        radio_male = new javax.swing.JRadioButton();
        sagpanel = new javax.swing.JPanel();
        baslik2 = new javax.swing.JLabel();
        artname = new javax.swing.JLabel();
        artist = new javax.swing.JLabel();
        comboartname = new javax.swing.JComboBox();
        comboartist = new javax.swing.JComboBox();
        combopaying = new javax.swing.JComboBox();
        data_butonu = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        logo_sagpanel = new javax.swing.JLabel();
        payingmethod = new javax.swing.JLabel();
        baslikpanel = new javax.swing.JPanel();
        Baslik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        art_table = new javax.swing.JTable();
        soru_isareti_logo = new javax.swing.JLabel();
        cikis_butonu = new javax.swing.JLabel();
        cerceve = new javax.swing.JLabel();
        arka_plan = new javax.swing.JLabel();

        setTitle("Rent a Car System");
        setBackground(new java.awt.Color(102, 102, 102));
        setBounds(new java.awt.Rectangle(470, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(935, 850));
        setPreferredSize(new java.awt.Dimension(945, 880));
        setResizable(false);
        setSize(new java.awt.Dimension(945, 880));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Baslik, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), this, org.jdesktop.beansbinding.BeanProperty.create("undecorated"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        solpanel.setBackground(new java.awt.Color(0, 11, 31));
        solpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), java.awt.Color.black));
        solpanel.setForeground(new java.awt.Color(255, 0, 0));
        solpanel.setAutoscrolls(true);
        solpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        solpanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        solpanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        solpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baslik.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        baslik.setForeground(new java.awt.Color(0, 209, 209));
        baslik.setText("USER INFORMATIONS");
        solpanel.add(baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        surname.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        surname.setForeground(new java.awt.Color(102, 255, 255));
        surname.setText("Surname            ");
        solpanel.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 80));

        phonenumber.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        phonenumber.setForeground(new java.awt.Color(102, 255, 255));
        phonenumber.setText("Phone Number  ");
        solpanel.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 80));

        idnumber.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        idnumber.setForeground(new java.awt.Color(102, 255, 255));
        idnumber.setText("ID Number        ");
        solpanel.add(idnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 80));

        name1.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(102, 255, 255));
        name1.setText("Name                 ");
        solpanel.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 80));

        tf_name.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        solpanel.add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 150, -1));

        tf_surname.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tf_surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_surnameActionPerformed(evt);
            }
        });
        solpanel.add(tf_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 150, -1));

        tf_phonenumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        solpanel.add(tf_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 150, -1));

        tf_idnumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tf_idnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idnumberActionPerformed(evt);
            }
        });
        solpanel.add(tf_idnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 150, -1));

        mesaj_yazisi.setBackground(new java.awt.Color(255, 230, 235));
        mesaj_yazisi.setFont(new java.awt.Font("Eras Light ITC", 1, 15)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(0, 255, 255));
        solpanel.add(mesaj_yazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 380, 20));

        confirm_butonu.setBackground(new java.awt.Color(0, 51, 51));
        confirm_butonu.setFont(new java.awt.Font("Eras Light ITC", 1, 17)); // NOI18N
        confirm_butonu.setForeground(new java.awt.Color(255, 255, 255));
        confirm_butonu.setText("CONFIRM");
        confirm_butonu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        confirm_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_butonuActionPerformed(evt);
            }
        });
        solpanel.add(confirm_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 110, 30));

        guncelle_butonu.setBackground(new java.awt.Color(0, 51, 51));
        guncelle_butonu.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        guncelle_butonu.setForeground(new java.awt.Color(255, 255, 255));
        guncelle_butonu.setText("UPDATE");
        guncelle_butonu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        guncelle_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guncelle_butonu.setMaximumSize(new java.awt.Dimension(139, 37));
        guncelle_butonu.setMinimumSize(new java.awt.Dimension(139, 37));
        guncelle_butonu.setPreferredSize(new java.awt.Dimension(139, 37));
        guncelle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonuActionPerformed(evt);
            }
        });
        solpanel.add(guncelle_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 110, 30));

        silme_butonu.setBackground(new java.awt.Color(0, 51, 51));
        silme_butonu.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        silme_butonu.setForeground(new java.awt.Color(255, 255, 255));
        silme_butonu.setText("DELETE");
        silme_butonu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        silme_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        silme_butonu.setMaximumSize(new java.awt.Dimension(139, 37));
        silme_butonu.setMinimumSize(new java.awt.Dimension(139, 37));
        silme_butonu.setPreferredSize(new java.awt.Dimension(139, 37));
        silme_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silme_butonuActionPerformed(evt);
            }
        });
        solpanel.add(silme_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, 30));

        database_kaydet.setBackground(new java.awt.Color(0, 51, 51));
        database_kaydet.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        database_kaydet.setForeground(new java.awt.Color(255, 255, 255));
        database_kaydet.setText("SAVE DB");
        database_kaydet.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        database_kaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        database_kaydet.setMaximumSize(new java.awt.Dimension(139, 37));
        database_kaydet.setMinimumSize(new java.awt.Dimension(139, 37));
        database_kaydet.setPreferredSize(new java.awt.Dimension(139, 37));
        database_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                database_kaydetActionPerformed(evt);
            }
        });
        solpanel.add(database_kaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 110, 30));
        solpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 440, 10));
        solpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 440, 20));

        logo_solpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerceve3.png"))); // NOI18N
        solpanel.add(logo_solpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, -1, -1));

        radio_female.setBackground(new java.awt.Color(0, 11, 31));
        button_group2.add(radio_female);
        radio_female.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        radio_female.setForeground(new java.awt.Color(255, 255, 255));
        radio_female.setText("Female");
        radio_female.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        radio_female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_femaleActionPerformed(evt);
            }
        });
        solpanel.add(radio_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 100, 50));

        radio_male.setBackground(new java.awt.Color(0, 11, 31));
        button_group2.add(radio_male);
        radio_male.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        radio_male.setForeground(new java.awt.Color(255, 255, 255));
        radio_male.setText("Male");
        solpanel.add(radio_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 100, 50));

        getContentPane().add(solpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 440, 520));

        sagpanel.setBackground(new java.awt.Color(0, 11, 31));
        sagpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), java.awt.Color.black));
        sagpanel.setForeground(new java.awt.Color(255, 0, 0));
        sagpanel.setAutoscrolls(true);
        sagpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sagpanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sagpanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sagpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baslik2.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        baslik2.setForeground(new java.awt.Color(0, 209, 209));
        baslik2.setText("ART INFORMATIONS");
        sagpanel.add(baslik2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 50));

        artname.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        artname.setForeground(new java.awt.Color(102, 255, 255));
        artname.setText("Art Name");
        sagpanel.add(artname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 70));

        artist.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        artist.setForeground(new java.awt.Color(102, 255, 255));
        artist.setText("Artist");
        sagpanel.add(artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 90));

        comboartname.setBackground(new java.awt.Color(3, 86, 86));
        comboartname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comboartname.setForeground(new java.awt.Color(255, 255, 255));
        comboartname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Psisik Çöl", "Daydreamer", "Oyunbozan", "The Bear", "Purity", "Skull" }));
        comboartname.setAlignmentX(0.3F);
        comboartname.setAlignmentY(0.3F);
        comboartname.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        comboartname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboartname.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        comboartname.setPreferredSize(new java.awt.Dimension(70, 20));
        comboartname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboartnameActionPerformed(evt);
            }
        });
        sagpanel.add(comboartname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 170, 30));

        comboartist.setBackground(new java.awt.Color(3, 86, 86));
        comboartist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comboartist.setForeground(new java.awt.Color(255, 255, 255));
        comboartist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Leman Akpınar", "Göksu Gül", "Ali Kabas", "Seda Gazioglu" }));
        comboartist.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        comboartist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboartist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboartistActionPerformed(evt);
            }
        });
        sagpanel.add(comboartist, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 170, 30));

        combopaying.setBackground(new java.awt.Color(3, 86, 86));
        combopaying.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        combopaying.setForeground(new java.awt.Color(255, 255, 255));
        combopaying.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Credit Card", "Bitcoin" }));
        combopaying.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        combopaying.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combopaying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopayingActionPerformed(evt);
            }
        });
        sagpanel.add(combopaying, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 170, 30));

        data_butonu.setBackground(new java.awt.Color(0, 51, 51));
        data_butonu.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        data_butonu.setForeground(new java.awt.Color(255, 255, 255));
        data_butonu.setText("SHOW THE DATABASE");
        data_butonu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray));
        data_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        data_butonu.setMaximumSize(new java.awt.Dimension(139, 37));
        data_butonu.setMinimumSize(new java.awt.Dimension(139, 37));
        data_butonu.setPreferredSize(new java.awt.Dimension(139, 37));
        data_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_butonuActionPerformed(evt);
            }
        });
        sagpanel.add(data_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 300, 50));
        sagpanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 258, 440, -1));
        sagpanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 440, 10));

        logo_sagpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerceve3.png"))); // NOI18N
        sagpanel.add(logo_sagpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -10, -1, -1));

        payingmethod.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        payingmethod.setForeground(new java.awt.Color(102, 255, 255));
        payingmethod.setText("Paying Method");
        sagpanel.add(payingmethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 90));

        getContentPane().add(sagpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 440, 520));

        baslikpanel.setBackground(new java.awt.Color(0, 11, 31));
        baslikpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), new java.awt.Color(0, 0, 0)));
        baslikpanel.setForeground(new java.awt.Color(0, 11, 31));
        baslikpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Baslik.setBackground(new java.awt.Color(249, 249, 249));
        Baslik.setFont(new java.awt.Font("Eras Light ITC", 1, 44)); // NOI18N
        Baslik.setForeground(new java.awt.Color(0, 209, 209));
        Baslik.setText("Art Gallery System");
        baslikpanel.add(Baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 370, 80));

        getContentPane().add(baslikpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 390, 60));

        art_table.setBackground(new java.awt.Color(6, 57, 57));
        art_table.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        art_table.setForeground(new java.awt.Color(255, 255, 255));
        art_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Surname", "Gender", "Phone Number", "ID Number", "Art Name", "Artist", "Paying Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        art_table.setSelectionBackground(new java.awt.Color(0, 11, 31));
        art_table.setSelectionForeground(new java.awt.Color(51, 255, 255));
        art_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                art_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(art_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 900, 240));

        soru_isareti_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/soru_isareti.png"))); // NOI18N
        soru_isareti_logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        soru_isareti_logo.setName(""); // NOI18N
        soru_isareti_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soru_isareti_logoMouseClicked(evt);
            }
        });
        getContentPane().add(soru_isareti_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 40));

        cikis_butonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/admin_cikislogo.png"))); // NOI18N
        cikis_butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cikis_butonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikis_butonuMouseClicked(evt);
            }
        });
        getContentPane().add(cikis_butonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 30, 40));

        cerceve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cerceve.png"))); // NOI18N
        getContentPane().add(cerceve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        arka_plan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/background4.jpg"))); // NOI18N
        getContentPane().add(arka_plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -6, 970, 910));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboartnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboartnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboartnameActionPerformed

    private void comboartistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboartistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboartistActionPerformed

    private void confirm_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_butonuActionPerformed
     
     mesaj_yazisi.setText("");
    
     
     String cinsiyet = "";
     if(radio_male.isSelected()){
         cinsiyet = "Male";
     }
     if(radio_female.isSelected()){
         cinsiyet = "Female";
     }
     

     if ( tf_name.getText().trim().equals("") || tf_surname.getText().trim().equals("") || cinsiyet.trim().equals("") || tf_phonenumber.getText().trim().equals("") || tf_idnumber.getText().trim().equals("") ){
         mesaj_yazisi.setText("                            Please Fill All the Blanks !");
     }
     else {
         
         BuilderFunction(); // USING THE BUILDER FUNCTION FOR FILLING THE BLANKS AFTER CONTROLLING THE TEXT FIELDS
       
     }
 
    }//GEN-LAST:event_confirm_butonuActionPerformed
  
    
// THIS FUNCTION HAS BUILDER PATTERN IN INSIDE IT ////////// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
    
    public void BuilderFunction() 
    {
           String cinsiyet = "";
     if(radio_male.isSelected()){
         cinsiyet = "Male";
     }
     if(radio_female.isSelected()){
         cinsiyet = "Female";
     }
        
         String artname1 = comboartname.getSelectedItem().toString();
         String artist1  = comboartist.getSelectedItem().toString();
         String payingmethod1 = combopaying.getSelectedItem().toString();
         
    // BUILDER PATTERN
    // USING BUILDER PATTERN AND BUILDING THE OBJECT WITH CERTAIN INFORMATIONS.
     Infos x = new Infos.InfoBuilder().name(tf_name.getText()).surname(tf_surname.getText()).gender(cinsiyet).phoneNumber(tf_phonenumber.getText()).idNumber(tf_idnumber.getText()).artName(artname1).artist(artist1).payingMethod(payingmethod1).Build();  
     Object[] eklenecek = {x.getName(),x.getSurname(),x.getGender(),x.getPhoneNumber(),x.getIdNumber(),x.getArtName(),x.getArtist(),x.getPayingMethod()};
     //CREATING OBJECT ARRAY WITH CERTAIN VARIABLES FROM THE x OBJECT WHICH IS DESIGNED WITH USING BUILDER PATTERN
     DefaultTableModel model = (DefaultTableModel) art_table.getModel();
     model.addRow(eklenecek);
     // ADDING THE OBJECT IN Model OBJECT WHICH IS OUR TABLE IN ADMIN PANEL , SO WE FILLED THE BLANKS IN TABLE
    }
    
    
    
    private void guncelle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_butonuActionPerformed
        mesaj_yazisi.setText("");
       
        
        String cinsiyet = "";
        if(radio_male.isSelected()){
         cinsiyet = "Male";
         }
        if(radio_female.isSelected()){
        cinsiyet = "Female";
        }
        
        DefaultTableModel model = (DefaultTableModel) art_table.getModel();
        int secili_row  = art_table.getSelectedRow();
        if ( secili_row == -1 ) {
            if (art_table.getRowCount() == 0 ) {
                mesaj_yazisi.setText("                                 The Table is Empty !");
            } else {
                mesaj_yazisi.setText("Please Choose the Line That You Want to UPDATE !");
            }
        } 
        else {
            model.setValueAt(tf_name.getText(),secili_row,0);
            model.setValueAt(tf_surname.getText(),secili_row,1);
            model.setValueAt(cinsiyet,secili_row,2);
            model.setValueAt(tf_phonenumber.getText(),secili_row,3);
            model.setValueAt(tf_idnumber.getText(),secili_row,4);
            model.setValueAt(comboartname.getSelectedItem().toString(),secili_row,5);
            model.setValueAt(comboartist.getSelectedItem().toString(),secili_row,6);
            model.setValueAt(combopaying.getSelectedItem().toString(),secili_row,7);
            mesaj_yazisi.setText("                          Line UPDATED Successfully !");
        }
        
    }//GEN-LAST:event_guncelle_butonuActionPerformed


    private void silme_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silme_butonuActionPerformed
       
       DefaultTableModel model = (DefaultTableModel) art_table.getModel();
        int secili_row  = art_table.getSelectedRow();
        if ( secili_row == -1 ) {
            if (art_table.getRowCount() == 0 ) {
                mesaj_yazisi.setText("                                 The Table is Empty !");
            } else {
                mesaj_yazisi.setText("Please Choose the Line That You Want to DELETE !");
            }
        } 
        else {
            model.removeRow(secili_row);
            mesaj_yazisi.setText("                          Line DELETED Successfully !");
        } 
    }//GEN-LAST:event_silme_butonuActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void cikis_butonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikis_butonuMouseClicked
        
        int cikis = JOptionPane.showConfirmDialog(null,"Do You Want to Close the System ?","Exit",JOptionPane.YES_NO_OPTION);
        if (cikis == JOptionPane.YES_NO_OPTION){
            setVisible(false);
        }
    }//GEN-LAST:event_cikis_butonuMouseClicked

    private void radio_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_femaleActionPerformed

    private void soru_isareti_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soru_isareti_logoMouseClicked
     
     
        JOptionPane.showMessageDialog(null, "                               Coders :\n         Buğra ATEŞ - Batuhan ERÇETİN \n                               Mentors :\nAssoc. Prof Dr. Taner ÇEVİK - RA. Çağdaş ÖZER");
    }//GEN-LAST:event_soru_isareti_logoMouseClicked

    private void tf_surnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_surnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_surnameActionPerformed

    private void tf_idnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idnumberActionPerformed

    private void combopayingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopayingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combopayingActionPerformed

    private void database_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_database_kaydetActionPerformed
        
        String cinsiyet = "" ;
        if(radio_male.isSelected())
        {
            cinsiyet = "Male";
        }
        if(radio_female.isSelected())
        {
            cinsiyet = "Female";
        }

        String name = tf_name.getText();
        String surname = tf_surname.getText();
        String phone_number = tf_phonenumber.getText();
        String id_number = tf_idnumber.getText();
        String artname = comboartname.getSelectedItem().toString();
        String artist = comboartist.getSelectedItem().toString();
        String payingmethod = combopaying.getSelectedItem().toString();

        if ( tf_name.getText().trim().equals("") || tf_surname.getText().trim().equals("") ||cinsiyet.trim().equals("")|| tf_phonenumber.getText().trim().equals("") || tf_idnumber.getText().trim().equals("") || artname.trim().equals("") || artist.trim().equals("") || payingmethod.trim().equals("") ) {

            mesaj_yazisi.setText("             Please Choose One Line from The Table !");
        }
        else {

            try {

                String dosya_yolu = "Art_Database.txt";
                File file = new File(dosya_yolu);

                String yazilacak = name+"\t"+surname+"\t"+cinsiyet+"\t"+phone_number+"\t"+id_number+"\t"+artname+"\t"+artist+"\t"+payingmethod+"\r\n" ;

                FileWriter fw = new FileWriter(dosya_yolu,true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(yazilacak);
                bw.close();
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            mesaj_yazisi.setText("                    The Informations Saved to Database !");
        }
        
    }//GEN-LAST:event_database_kaydetActionPerformed

    private void data_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_butonuActionPerformed

        ArtDataGUI art_data = new ArtDataGUI(this,true);
        art_data.setVisible(true);

    }//GEN-LAST:event_data_butonuActionPerformed

    private void art_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_art_tableMouseClicked

       DefaultTableModel model = (DefaultTableModel) art_table.getModel();
       int secili_row = art_table.getSelectedRow();
       
       tf_name.setText(model.getValueAt(secili_row,0).toString());
       tf_surname.setText(model.getValueAt(secili_row,1).toString());
       tf_phonenumber.setText(model.getValueAt(secili_row,3).toString());
       tf_idnumber.setText(model.getValueAt(secili_row,4).toString());
       comboartname.setSelectedItem(model.getValueAt(secili_row,5).toString());
       comboartist.setSelectedItem(model.getValueAt(secili_row,6).toString());
       combopaying.setSelectedItem(model.getValueAt(secili_row,7).toString());
        
    }//GEN-LAST:event_art_tableMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Baslik;
    private javax.swing.JLabel arka_plan;
    private javax.swing.JTable art_table;
    private javax.swing.JLabel artist;
    private javax.swing.JLabel artname;
    private javax.swing.JLabel baslik;
    private javax.swing.JLabel baslik2;
    private javax.swing.JPanel baslikpanel;
    private javax.swing.ButtonGroup button_group;
    private javax.swing.ButtonGroup button_group2;
    private javax.swing.JLabel cerceve;
    private javax.swing.JLabel cikis_butonu;
    private javax.swing.JComboBox comboartist;
    private javax.swing.JComboBox comboartname;
    private javax.swing.JComboBox combopaying;
    private javax.swing.JButton confirm_butonu;
    private javax.swing.JButton data_butonu;
    private javax.swing.JButton database_kaydet;
    private javax.swing.JButton guncelle_butonu;
    private javax.swing.JLabel idnumber;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo_sagpanel;
    private javax.swing.JLabel logo_solpanel;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel payingmethod;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JRadioButton radio_female;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JPanel sagpanel;
    private javax.swing.JButton silme_butonu;
    private javax.swing.JPanel solpanel;
    private javax.swing.JLabel soru_isareti_logo;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField tf_idnumber;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phonenumber;
    private javax.swing.JTextField tf_surname;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
