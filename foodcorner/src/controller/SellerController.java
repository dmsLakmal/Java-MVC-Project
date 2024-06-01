package controller;

import javax.swing.JOptionPane;


public class SellerController {
    
public static void AddSellers (String SellerID,String Name, String Tele,String Province	){

        
                String message = "Do You Want Add New Seller?";
                String title = "Confirmation";
                int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {
                    new model.AddSeller().AddSellers(SellerID, Name, Tele, Province); 
                }
    
}

}