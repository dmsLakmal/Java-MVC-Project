package controller;

import javax.swing.JOptionPane;


public class StaffController {
    
    
    
    
    public static void AddStaffs(String StaffID,String Staffname,String Stafftele,String Staffadd ){
        
        
                        String message = "Do You Want Add New Staff Member?";
                String title = "Confirmation";
                int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {
                    new model.AddStaff().AddStaffs(StaffID, Staffname, Stafftele, Staffadd);                }
    }
    
}
