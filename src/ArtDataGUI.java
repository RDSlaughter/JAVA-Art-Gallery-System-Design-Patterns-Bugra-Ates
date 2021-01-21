
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public final class ArtDataGUI extends javax.swing.JDialog {

    DefaultTableModel model ;
   
    public ArtDataGUI(java.awt.Frame parent, boolean modal) {
 
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) database_tablosu.getModel();
        DataBaseGoruntule();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        database_tablosu = new javax.swing.JTable();
        arama_alani = new javax.swing.JTextField();
        arama_logosu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Art Database");
        setBounds(new java.awt.Rectangle(487, 200, 0, 0));

        database_tablosu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        database_tablosu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        database_tablosu.setModel(new javax.swing.table.DefaultTableModel(
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
        database_tablosu.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(database_tablosu);

        arama_alani.setBackground(new java.awt.Color(0, 153, 153));
        arama_alani.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        arama_alani.setForeground(new java.awt.Color(255, 255, 255));
        arama_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_alaniActionPerformed(evt);
            }
        });
        arama_alani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_alaniKeyReleased(evt);
            }
        });

        arama_logosu.setFont(new java.awt.Font("Berlin Sans FB", 0, 21)); // NOI18N
        arama_logosu.setForeground(new java.awt.Color(4, 87, 87));
        arama_logosu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/arama-logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(arama_logosu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arama_alani))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arama_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arama_logosu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_alaniActionPerformed

    public void AramaYapma(String ara){
        
        TableRowSorter<DefaultTableModel> table_sorter = new TableRowSorter<>(model);
        database_tablosu.setRowSorter(table_sorter);
        table_sorter.setRowFilter(RowFilter.regexFilter(ara.toLowerCase()));
    }
    
    private void arama_alaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_alaniKeyReleased
    
        
        String ara = arama_alani.getText();
        if(ara.equalsIgnoreCase(ara)){
            AramaYapma(ara);
        }
        else
        {
           ara = ara.toLowerCase();
        }
        AramaYapma(ara);
    }//GEN-LAST:event_arama_alaniKeyReleased


    public void DataBaseGoruntule() {
        
        model.setRowCount(0);
        String dosya_yolu = "Art_Database.txt";
        File file = new File(dosya_yolu);
        
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Object[] lines = br.lines().toArray();
            
            for (Object line : lines) {
                String[] row = line.toString().split("\t");
                model.addRow(row);
            }
         
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Art_Database.txt not Found !");
 
        }      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_alani;
    private javax.swing.JLabel arama_logosu;
    private javax.swing.JTable database_tablosu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
