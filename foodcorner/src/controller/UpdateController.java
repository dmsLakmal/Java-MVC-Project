package controller;

import javax.swing.JOptionPane;


public class UpdateController {
    
     public static void updateProduct(String ProductID,String Name,String Quantity,String Price, String catogary)
    { 
        
    new model.Update().upadateProduct(ProductID, Name, Quantity, Price, catogary);
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
  
    }
     
      public static void updateSeller(String SellerID,String Name,String Tele,String Province)
    { 
        
    new model.Update().upadateSeller(SellerID, Name, Tele, Province);
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
  
    } 
      
            public static void updateStaff(String StaffID,String Staffname,String Stafftele,String Staffadd)
    { 
        
    new model.Update().upadateStaff(StaffID, Staffname, Stafftele, Staffadd);
    JOptionPane.showMessageDialog(null, "Record has been updated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
  
    } 
    
}
