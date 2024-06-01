package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Update {
    Statement stmt;
    
    public void upadateProduct(String ProductID,String Name,String Quantity,String Price, String catogary){
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = DBConnection.getConnection();
            
            statement = connection.prepareStatement("UPDATE product SET ProductID=?, Name=?,Quantity= ?, Price=?, category=? WHERE ProductID=? ");

            statement.setString(1,ProductID);
            statement.setString(2,Name);            
            statement.setString(3,Quantity);
            statement.setString(4,Price);
            statement.setString(5,catogary);
            statement.setString(6,ProductID);
            statement.executeUpdate();
        
        
        } catch(SQLException e){
             System.out.println("SQLException: - " + e);
        } finally {
                        try {
                connection.close();              
                statement.close();
            } catch (SQLException e) {
                System.out.println("SQLException Finally: - " + e);
            }
        
        }
        
        
    }
    
    
        public void upadateSeller(String SellerID,String Name,String Tele,String Province){
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = DBConnection.getConnection();
            
            statement = connection.prepareStatement("UPDATE seller SET SellerID=?, Name=?, Tele=?, Province=? WHERE SellerID=? ");

            statement.setString(1,SellerID);
            statement.setString(2,Name);            
            statement.setString(3,Tele);
            statement.setString(4,Province);
            statement.setString(5,SellerID);
            statement.executeUpdate();
        
        
        } catch(SQLException e){
             System.out.println("SQLException: - " + e);
        } finally {
                        try {
                connection.close();              
                statement.close();
            } catch (SQLException e) {
                System.out.println("SQLException Finally: - " + e);
            }
        
        }
        
        
    }
        
        
        public void upadateStaff(String StaffID,String Staffname,String Stafftele,String Staffadd){
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = DBConnection.getConnection();
            
            statement = connection.prepareStatement("UPDATE staff SET StaffID=?, Staffname=?, Stafftele=?, Staffadd=? WHERE StaffID=? ");

            statement.setString(1,StaffID);
            statement.setString(2,Staffname);            
            statement.setString(3,Stafftele);
            statement.setString(4,Staffadd);
            statement.setString(5,StaffID);
            statement.executeUpdate();
        
        
        } catch(SQLException e){
             System.out.println("SQLException: - " + e);
        } finally {
                        try {
                connection.close();              
                statement.close();
            } catch (SQLException e) {
                System.out.println("SQLException Finally: - " + e);
            }
        
        }
        
        
    }
    
    
}
