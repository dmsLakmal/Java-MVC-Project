/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DeleteController;
import controller.ProductController;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.DBConnection;
import model.DBSearch;

/**
 *
 * @author Sujit
 */
public class product extends javax.swing.JFrame {

    /**
     * Creates new form product1
     */
    public product() {
        initComponents();
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTbl = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        priceTF = new javax.swing.JTextField();
        quanTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productIdTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        catCMB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backLbl = new javax.swing.JLabel();
        homeLbl = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        productTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "Price", "CATOGARY"
            }
        ));
        productTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 430, 370));

        addBtn.setBackground(new java.awt.Color(102, 102, 102));
        addBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        deleteBtn.setBackground(new java.awt.Color(102, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        deleteBtn.setText("CLEAR");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        jPanel1.add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 240, 39));

        quanTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanTFActionPerformed(evt);
            }
        });
        jPanel1.add(quanTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 240, 41));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("QUANTITY :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 121, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Price :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, 37));
        jPanel1.add(productIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 240, 39));
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 240, 39));

        catCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Bevarage", "Meat", "Vegitable" }));
        jPanel1.add(catCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 187, 43));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("CATEGORY :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("NAME :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 93, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PRODUCT ID : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 138, 38));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("MANAGE PRODUCTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        backLbl.setBackground(new java.awt.Color(255, 255, 51));
        backLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLbl.setText("GO BACK");
        backLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
        });
        jPanel1.add(backLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 11, 50, -1));

        homeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home logo.png"))); // NOI18N
        homeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLblMouseClicked(evt);
            }
        });
        jPanel1.add(homeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 11, 31, 23));

        viewBtn.setBackground(new java.awt.Color(102, 102, 102));
        viewBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewBtn.setText("VIEW PRODUCT");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 180, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setText("This software designed by Sujith Lakmal.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel7)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1000, 30));

        backBtn.setBackground(new java.awt.Color(102, 102, 102));
        backBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Product");

        jMenuItem1.setText("ADD Product");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("View Product");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Seller");

        jMenuItem3.setText("ADD Sellers");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("View Sellers");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Staff");

        jMenuItem5.setText("ADD Staff");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("View Staff");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Others");

        jMenuItem7.setText("About Us");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Help");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Contact Us");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Log Out");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu7.setText("Exit");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       clearField();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTFActionPerformed

    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        // TODO add your handling code here:
        selection selct = new selection();
        selct.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_backLblMouseClicked

    private void homeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLblMouseClicked
        // TODO add your handling code here:
        mainPage mp = new mainPage();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeLblMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        try{
            String catogary = catCMB.getSelectedItem().toString();
            String ProductID = productIdTF.getText();
            String Name = nameTF.getText();
            String Quantity = quanTF.getText();
            String Price = priceTF.getText();
            
            if(ProductID.equals("") && Name.equals("") && Quantity.equals("") && Price.equals("")){
                JOptionPane.showMessageDialog(null,"Enter All fields","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                ProductController.AddProducts(ProductID, Name, Quantity, Price, catogary);
                
                clearField();
                refresh();
            }
        
        } catch (Exception e){ 
            
            JOptionPane.showMessageDialog(null,"Enter valid details","Error",JOptionPane.ERROR_MESSAGE);
        }
        
                ResultSet r = new DBSearch().searchProduct();
       DefaultTableModel dtm = (DefaultTableModel) productTbl.getModel();
       dtm.setRowCount(0); //set the number of rows in the model
       try{
           Vector v;
           while (r.next()){
               v = new Vector();
               v.add(r.getString("ProductID"));
               v.add(r.getString("Name"));
               v.add(r.getString("Quantity"));
               v.add(r.getString("Price"));
               v.add(r.getString("category"));
               dtm.addRow(v); //adds a row to the end of the table
           }
           DBConnection.closeCon();
           
       }
       catch(Exception e)
       {
           
       }
        
       
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void productTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTblMouseClicked
        // TODO add your handling code here:
        
        int i = productTbl.getSelectedRow();
        TableModel model = productTbl.getModel();
        productIdTF.setText(model.getValueAt(i,0).toString());
        priceTF.setText(model.getValueAt(i,3).toString());
        nameTF.setText(model.getValueAt(i,1).toString());
        quanTF.setText(model.getValueAt(i,2).toString());
        


        
        String catogary = model.getValueAt(i,4).toString();
        switch(catogary){
            case "Bevarage":
                catCMB.setSelectedIndex(1);
                break;

            case "Meat":
                catCMB.setSelectedIndex(2);
                break;  
                
            case "Vegitable":
                catCMB.setSelectedIndex(3);
                break;  
             
        }
    }//GEN-LAST:event_productTblMouseClicked

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
      this.dispose();
      new product_Display().setVisible(true);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void quanTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quanTFActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new selection().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        product.getFrames()[0].dispose();
        new product().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        product_Display.getFrames()[0].dispose();
        new product_Display().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        seller.getFrames()[0].dispose();
        new seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        seller_Display.getFrames()[0].dispose();
        new seller_Display().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        staff.getFrames()[0].dispose();
        new staff().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        staff_Display.getFrames()[0].dispose();
        new staff_Display().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        aboutus.getFrames()[0].dispose();
        new aboutus().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        help.getFrames()[0].dispose();
        new help().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        contact.getFrames()[0].dispose();
        new contact().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new login().setVisible(true);

    }//GEN-LAST:event_jMenu5MouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new selection().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu7MouseClicked

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
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backLbl;
    private javax.swing.JComboBox<String> catCMB;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel homeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField productIdTF;
    private javax.swing.JTable productTbl;
    private javax.swing.JTextField quanTF;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
        productIdTF.setText("");
        nameTF.setText("");
        priceTF.setText("");
        quanTF.setText("");
        catCMB.setSelectedIndex(0);
    }

    private void refresh() {
          ResultSet r = new DBSearch().searchProduct();
        DefaultTableModel dtm = (DefaultTableModel) productTbl.getModel();
       dtm.setRowCount(0);
       
        try{
           Vector v;
           while (r.next()){
               v = new Vector();
               v.add(r.getString("ProductID"));
               v.add(r.getString("Name"));
               v.add(r.getString("Quantity"));
               v.add(r.getString("Price"));
               v.add(r.getString("category"));
               dtm.addRow(v); //adds a row to the end of the table
           }
           DBConnection.closeCon();
           
       }
       catch(Exception e)
       {
           
       }
    }
}
