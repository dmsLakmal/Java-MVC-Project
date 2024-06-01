package controller;

import javax.swing.JOptionPane;


public class DeleteController {
    
        public static void deleteproduct(String ProductID){
        new model.DBDelete().deleteProduct(ProductID);
        JOptionPane.showMessageDialog(null, "The Record has been deleted.");
        
    }
        
        public static void deleteSeller(String Name){
        new model.DBDelete().deleteSeller(Name);
        JOptionPane.showMessageDialog(null, "The Record has been deleted.");
        
    }
        
        public static void deleteStaff(String Staffname){
        new model.DBDelete().deleteStaff(Staffname);
        JOptionPane.showMessageDialog(null, "The Record has been deleted.");
        
    }
    
}
