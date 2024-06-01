package model;

import java.sql.Statement;


public class DBDelete {
    
            Statement stmt;
    public void deleteProduct(String ProductID){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("delete from product where ProductID='"+ProductID+"'");
            
        }catch (Exception e){
        e.printStackTrace();
    }
    
}
    
        public void deleteSeller(String Name){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("delete from seller where Name='"+Name+"'");
            
        }catch (Exception e){
        e.printStackTrace();
    }
    
}
        
                public void deleteStaff(String Staffname){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("delete from staff where Staffname='"+Staffname+"'");
            
        }catch (Exception e){
        e.printStackTrace();
    }
    
    
}
                
                
}

   