package model;

import java.sql.Statement;


public class AddSeller {
    
        Statement stmt;


    
    public void AddSellers (String SellerID, String Name, String Tele, String Province){
        try{
            
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate
        ("INSERT INTO seller VALUES ('"+SellerID+"','"+Name+"','"+Tele+"','"+Province+"')");
    }
        catch (Exception e){
            e.printStackTrace();
        }
    
}
    
}
