
package controller;

import javax.swing.JOptionPane;

public class ProductController {
    
    public static void AddProducts(String ProductID,String Name,String Quantity,String Price, String catogary){
    
                String message = "Do You Want Add New Product?";
                String title = "Confirmation";
                int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {
                    new model.AddProduct().AddProducts(ProductID, Name, Quantity, Price, catogary);
                }
    }
    
}
