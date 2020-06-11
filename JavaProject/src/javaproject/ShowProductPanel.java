/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author utkus
 */
public class ShowProductPanel extends javax.swing.JFrame {
    public static Object Button6;
    ArrayList<Product> newList;
    ArrayList<Product> searchList;
    JavaProject ins = new JavaProject();
    DefaultTableModel tabModel;
    public static int pos = 0;
    boolean opos = false;
    static String[] imageList;
    ArrayList<Product> ImList;
    boolean bol = false;
    Loginpanel loginObj = new Loginpanel();
    boolean newStats = true;
    
    /**
     * Creates new form ShowProductPanel
     */
    public ShowProductPanel() { // admin
        
        
        
        initComponents();
    //    showImage();
        addRowsToJtable();
    //    jProduct.setEnabled(bol);  
        jSearchButton.setEnabled(false);
        jsearchBox.setEnabled(false);
        jButton3.setEnabled(false);  
        jButton1.setEnabled(false);
        jComboBox.setEnabled(false);
        addButton.setEnabled(false);
        jButton2.setEnabled(false);
        jButton6.setEnabled(true);
        
        
        
    }
    
    
    public ShowProductPanel(boolean getStats){ // customer enterance
        initComponents();
        addRowsToJtable();
        this.newStats = getStats;
        System.out.println("geldimm");
        if(newStats){
            System.out.println("adminlaaaa");
        } 
        jButton6.setEnabled(false);
        jSearchButton.setEnabled(newStats);
        jsearchBox.setEnabled(newStats);
        jButton3.setEnabled(newStats);  
        jButton1.setEnabled(newStats);
        jComboBox.setEnabled(newStats);
        addButton.setEnabled(newStats);
        jButton2.setEnabled(newStats);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myjTable = new javax.swing.JTable();
        jmyCheckBox = new javax.swing.JCheckBox();
        myImage = new javax.swing.JLabel();
        jsearchBox = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jSearchButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Product", "Type", "Stock", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myjTable.setRowHeight(30);
        myjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myjTable);

        jmyCheckBox.setText("Enable Editing");
        jmyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmyCheckBoxActionPerformed(evt);
            }
        });

        jsearchBox.setToolTipText("");
        jsearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchBoxActionPerformed(evt);
            }
        });

        addButton.setText("Buy");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jSearchButton.setText("Search");
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Show All");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Upload Photo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jButton2.setText("Update ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Login");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmyCheckBox))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmyCheckBox))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        jButton2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myjTableMouseClicked
        jSearchButton.setEnabled(false);
        jsearchBox.setEnabled(false);
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        addButton.setEnabled(false);
        jmyCheckBox.setSelected(false);
        jComboBox.setEnabled(false);
        jButton2.setEnabled(false);
        jButton6.setEnabled(newStats);
        int indx = getSelectedtableRow();
        showImage();
        ArrayList<Product> newL = ins.loadListWithDB();
        int row = myjTable.getSelectedRow();
        Loginpanel value = new Loginpanel();
       
        
            

        
    }//GEN-LAST:event_myjTableMouseClicked

    private void jmyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmyCheckBoxActionPerformed
        
       
        if(jButton3.isEnabled() ){
            jButton2.setEnabled(false);
            jSearchButton.setEnabled(false);
            jsearchBox.setEnabled(false);
            addButton.setEnabled(false);
            jButton3.setEnabled(false);
            jComboBox.setEnabled(false);
            jButton1.setEnabled(false);
            jButton6.setEnabled(newStats);
            
            
        }else{
            jButton2.setEnabled(true);
            jSearchButton.setEnabled(true);
            jsearchBox.setEnabled(true);
            jComboBox.setEnabled(true);
            jButton3.setEnabled(true);
            addButton.setEnabled(true);
            jButton1.setEnabled(true);
            jButton6.setEnabled(newStats); 

            
        }
        
        /*  ArrayList<Product> newL = ins.loadListWithDB();
        int row = getSelectedtableRow();
        try{
            if(newL.get(row).getStock() == 0){
            ins.deleteProduct(newL.get(row).getProductName());           
            addRowsToJtable();
            JOptionPane.showMessageDialog(null, "Empty product delete succesfully");
            jmyCheckBox.setSelected(false);
             }else{
                JOptionPane.showMessageDialog(null, "Selected product's stock is not empty");
                
             }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Selected product's stock is not empty");
                
        }
        jmyCheckBox.setSelected(false); */
    }//GEN-LAST:event_jmyCheckBoxActionPerformed

    private void jsearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsearchBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    
        int comboValue = Integer.parseInt(jComboBox.getSelectedItem().toString());
        try{
            int selectd = getSelectedtableRow();
            Product p = new Product();
            ArrayList<Product> newL = ins.loadListWithDB();
     //       p = ins.buyItem(getSelectedtableRow(), comboValue);
            if(newL.get(selectd).getStock() > 0){
                ins.buyItem(getSelectedtableRow(), comboValue);
                addRowsToJtable();
            }else{
                JOptionPane.showMessageDialog(null, "Empty Stock ");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Empty Stock ");
        } 
    }//GEN-LAST:event_addButtonActionPerformed

    private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButtonActionPerformed
        searchList = ins.getSpecificRecord(jsearchBox.getText());
        tabModel = (DefaultTableModel)myjTable.getModel();
        Object rowData[] = new Object[4];
        try{
            clearetable();
            for (int i = 0; i < newList.size(); i++) {
            tabModel.insertRow(tabModel.getRowCount(), new Object[]{searchList.get(i).getProductId(), searchList.get(i).getProductName(), searchList.get(i).getProductType(), searchList.get(i).getStock(), searchList.get(i).getPrice()});
            }  
        }catch(Exception e){
             
        }
        
        
    }//GEN-LAST:event_jSearchButtonActionPerformed
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete", JOptionPane.YES_NO_OPTION); // are you sure pop-up window initializing
        if(p == 0){
            ArrayList<Product> pList = ins.loadListWithDB();
            int i = getSelectedtableRow();
        
            try{
            ins.deleteProduct(pList.get(i).getProductName());
            addRowsToJtable();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please Select product ");
            }
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        addRowsToJtable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        this.setVisible(false);
        new ProductEditPanel(newStats).setVisible(true);
        /*        
        ArrayList<Product> pList = ins.loadListWithDB();
        String newProduct;
        String newType;
        int newPrice;
        int newStock;
        int i = getSelectedtableRow();
        boolean bool = false;
        String temp1 = jPrice.getText();
        String temp2 = jStock.getText(); 
        
               try{
                   if(pList.get(i).getProductName() != jProduct.getText()){
                    newProduct = jProduct.getText();
                   }else{
                    newProduct = pList.get(i).getProductName(); 
                   } 
                   if(pList.get(i).getPrice() != Integer.parseInt(temp1)){
                        newPrice = Integer.parseInt(temp1);          
                    }else{
                    newPrice =  pList.get(i).getPrice();
               
                   }  
                   if(pList.get(i).getStock() != Integer.parseInt(temp2)){
                    
                    newStock =  Integer.parseInt(temp2);
                    pList.get(i).setStock(newStock);
                   }else{
                        newStock =  pList.get(i).getStock();
                   }
                    if(pList.get(i).getProductType() != jType.getText()){
                     newType = jType.getText();
                   }else{
                      newType =  pList.get(i).getProductType(); 
                   } 
               
                 
               ins.UpdateAll(pList.get(i).getProductId(),newProduct, newType, newPrice, newStock);;  
               addRowsToJtable();  
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Please Select product ");
             }     */
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DynamicImageUpload();
        addRowsToJtable();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed

    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
        new ProductEditPanel(newStats).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Loginpanel().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
    
    Product ImaAdress = new Product();
    public String DynamicImageUpload(){
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        String path = "99.jpg";
        int result = file.showSaveDialog(null);
        try{
            if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            path = selectedFile.getAbsolutePath();
          //  System.out.println(path);
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
            myImage.setIcon(new ImageIcon(image));
            ImList = ins.loadListWithDB();
            int selectedIndex = myjTable.getSelectedRow();
            ImList.get(selectedIndex).setImageId(path);
            ImaAdress = ImList.get(selectedIndex);
            System.out.println("" + ImaAdress.getImageId());
            System.out.println("" + ImaAdress.getProductName());
            ins.updateImageId(ImaAdress);
            }else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Plaease, sellect product to change image ");
        }  
        return path;
    }
    
    
        
     public String[] getImages(){
        File file = new File(getClass().getResource("/JAVA/Images").getFile());
        String[] imageList = file.list();
        return imageList;
    }
    
    public void showImage(){
        
        ArrayList<Product> pList = ins.loadListWithDB();
        int rowCount = myjTable.getRowCount();
        int selectedIndex = myjTable.getSelectedRow();
        String[] imageList = getImages(); //image pool from images folder
    //    String imageName = imageList[index];
        String nullImage = imageList[0]; //4.jpg eg.
        System.out.println("ccccccc");
        try{
            if(pList.get(selectedIndex).getImageId() != null){
                 ImageIcon icon = new ImageIcon(pList.get(selectedIndex).getImageId());
                 Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
                 myImage.setIcon(new ImageIcon(image));
            }else{
                 System.out.println("bbbbbbbb");
                 ImageIcon icon = new ImageIcon(getClass().getResource("/JAVA/Images/" + imageList[0]));
                 Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
                 myImage.setIcon(new ImageIcon(image));
            }
        }catch(Exception e){
                 System.out.println("hata");   
        }
        
        
  //      for (int i = 0; i < pList.size(); i++) {
       /*    if(ImList.get(selectedIndex).getImageId() != null){
               System.out.println("null değil");
               ImageIcon icon = new ImageIcon(ImList.get(selectedIndex).getImageId());
               Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
               myImage.setIcon(new ImageIcon(image));
      //         break;
           }else{
               System.out.println("null");
               ImageIcon icon = new ImageIcon(getClass().getResource("/JAVA/Images/" + imageList[0]));
           } */
    //    }
        
        try{
     /*       for (int i = 0; i < imageList.length; i++) {
            String x = new StringBuilder().append(pList.get(selectedIndex).getProductName()).append(".jpg").toString();
            System.out.println(x.toString() + "   " + imageList[i] + "   " + pList.get(selectedIndex).getProductId() );
            if(imageList[i].equals(x) ){
                System.out.println("inside");
                System.out.println(x);
                ImageIcon icon = new ImageIcon(getClass().getResource("/JAVA/Images/" + imageList[i]));
                Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
                myImage.setIcon(new ImageIcon(image));
                break;
            }else{
                System.out.println("nuldaaaaaa");
                ImageIcon icon = new ImageIcon(getClass().getResource("/JAVA/Images/" + nullImage));
                Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
                myImage.setIcon(new ImageIcon(image));
            } 
            
            } */
        }catch(Exception e){
            /*   ImageIcon icon = new ImageIcon(getClass().getResource("/JAVA/Images/" + nullImage));
               Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
               myImage.setIcon(new ImageIcon(image)); */
        }
        
        
        
     /*   if(imageList[pList.get(index).getImageId()] != null  ){
            I
        }else{
            ImageIcon icon = new ImageIcon(getClass().getResource("/JAVA/Images/" + nullImage));
            Image image = icon.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
            myImage.setIcon(new ImageIcon(image));
        } */
        
        
        
    }
    
    public int getSelectedtableRow(){
       //  tabModel = (DefaultTableModel)tblMovies.getModel();
         int selectedRowIndex = myjTable.getSelectedRow();
         return selectedRowIndex;
    }
    
    public void addRowsToJtable(){
        tabModel = (DefaultTableModel)myjTable.getModel();
        Object rowData[] = new Object[4];
            
        newList = ins.loadListWithDB();
        clearetable();
        for (int i = 0; i < newList.size(); i++) {
            tabModel.insertRow(tabModel.getRowCount(), new Object[]{newList.get(i).getProductId(), newList.get(i).getProductName(), newList.get(i).getProductType(), newList.get(i).getStock(), newList.get(i).getPrice()});
        } 
    }
    
   public void clearetable(){
       tabModel = (DefaultTableModel)myjTable.getModel();
       int countRows = tabModel.getRowCount();
       for (int i = countRows - 1; i >= 0; i--) {
           tabModel.removeRow(i);
       }
   } 
    
    public void TextField(){
        System.out.println(opos);
        opos = !opos;
        jsearchBox.setEnabled(opos);        
    }
    
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
            java.util.logging.Logger.getLogger(ShowProductPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowProductPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowProductPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowProductPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ShowProductPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JCheckBox jmyCheckBox;
    private javax.swing.JTextField jsearchBox;
    private javax.swing.JLabel myImage;
    private javax.swing.JTable myjTable;
    // End of variables declaration//GEN-END:variables
}