package model;

import java.sql.Statement;

public class AddStaff {
    
    Statement stmt;
    
    public void AddStaffs(String StaffID,String Staffname,String Stafftele,String Staffadd){
    
            try{
                stmt = DBConnection.getStatementConnection();
                stmt.executeUpdate("INSERT INTO staff VALUES('"+StaffID+"','"+Staffname+"','"+Stafftele+"','"+Staffadd+"')");

            } catch (Exception e){
                e.printStackTrace();
            }
    
    
    }
    
}
