
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class PencereSoruCevapEkle extends javax.swing.JFrame {

    
    public PencereSoruCevapEkle() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBaslik = new javax.swing.JLabel();
        pnlSorular = new javax.swing.JPanel();
        textFieldSorular = new javax.swing.JTextField();
        pnlCevaplar = new javax.swing.JPanel();
        textFieldCevaplar = new javax.swing.JTextField();
        btnOyna = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBaslik.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblBaslik.setText("OYUNA YENİ SORU VE CEVAP EKLE :)");

        pnlSorular.setBorder(javax.swing.BorderFactory.createTitledBorder("SORU"));

        textFieldSorular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSorularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSorularLayout = new javax.swing.GroupLayout(pnlSorular);
        pnlSorular.setLayout(pnlSorularLayout);
        pnlSorularLayout.setHorizontalGroup(
            pnlSorularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSorularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldSorular)
                .addContainerGap())
        );
        pnlSorularLayout.setVerticalGroup(
            pnlSorularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSorularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldSorular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlCevaplar.setBorder(javax.swing.BorderFactory.createTitledBorder("CEVAP"));

        textFieldCevaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCevaplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCevaplarLayout = new javax.swing.GroupLayout(pnlCevaplar);
        pnlCevaplar.setLayout(pnlCevaplarLayout);
        pnlCevaplarLayout.setHorizontalGroup(
            pnlCevaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCevaplarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldCevaplar)
                .addContainerGap())
        );
        pnlCevaplarLayout.setVerticalGroup(
            pnlCevaplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCevaplarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldCevaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnOyna.setText("OYNA");
        btnOyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOynaActionPerformed(evt);
            }
        });

        btnEkle.setText("EKLE");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(488, 488, 488)
                            .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                            .addComponent(btnOyna, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnlCevaplar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlSorular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlSorular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCevaplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOyna, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOynaActionPerformed
        PencereOyun oyun = new PencereOyun();//oyun oynama formuna geçmek için nesne oluşturuldu
        oyun.setVisible(true);//oyna butonuna basılınca 2. foruma geçecek
        
    }//GEN-LAST:event_btnOynaActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        //soruları ve cevapları string olarak al
        String sorular,cevaplar;
        sorular = textFieldSorular.getText();
        cevaplar = textFieldCevaplar.getText();
        if (kontrol(sorular,cevaplar)) 
        {
            dosyaYaz(sorular,cevaplar);
        } 
        if (sorular.isEmpty()==false) 
        {
            if (cevaplar.isEmpty()==false) 
            {
                JOptionPane.showMessageDialog(null, "Soru ve cevap dosyaya eklendi"); 
            }
              
        }
        
    }//GEN-LAST:event_btnEkleActionPerformed

    private void textFieldCevaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCevaplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCevaplarActionPerformed

    private void textFieldSorularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSorularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSorularActionPerformed
      
    private void dosyaYaz(String sorular,String cevaplar)
    {
     File dosya = new File(cevaplar.length()+"harfKelime.txt");
        if (dosya.exists()==false) //dosyanın var olup olmadığını kontrol et
        {
            try {
                dosya.createNewFile();//dosya yoksa oluştur
                
            } catch (Exception e) {
            }
        }
        try {
            FileWriter yaz = new FileWriter(dosya.getAbsoluteFile(),true);
            BufferedWriter yaz1 = new BufferedWriter(yaz);
            yaz1.write(cevaplar.toUpperCase()+"-"+sorular.toUpperCase()+"\n");
            yaz1.close();
            
        } catch (Exception e) {
        }
    
    }
    private boolean kontrol(String soru,String cevap)
    {
        if (soru.isEmpty()|| cevap.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Soru yada kelime boş olamaz");
            return false;
        }
        if (cevap.length()<4 || cevap.length()>10) 
        {
            JOptionPane.showMessageDialog(null, "kelime uzunluğu 4-10 arasında olmalıdır");
            return false;
        }
      return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new PencereSoruCevapEkle().setVisible(true);
            }
        });
         
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnOyna;
    private javax.swing.JLabel lblBaslik;
    private javax.swing.JPanel pnlCevaplar;
    private javax.swing.JPanel pnlSorular;
    private javax.swing.JTextField textFieldCevaplar;
    private javax.swing.JTextField textFieldSorular;
    // End of variables declaration//GEN-END:variables

    
}
