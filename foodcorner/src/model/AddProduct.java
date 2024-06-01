package model;

import java.sql.Statement;

public class AddProduct {
    
    Statement stmt;
    
    public void AddProducts(String ProductID,String Name,String Quantity,String Price, String catogary){
    
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO product VALUES ('"+ProductID+"','"+Name+"','"+Quantity+"','"+Price+"','"+catogary+"')");
         
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
   
    
}
