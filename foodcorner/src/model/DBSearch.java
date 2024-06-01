/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;


public class DBSearch {
    
 Statement stmt;
 ResultSet rs;
public ResultSet searchLogin(String usName) {
 try {
    stmt = DBConnection.getStatementConnection();
    String name = usName;
    //Execute the Query
    rs = stmt.executeQuery("SELECT * FROM login where Username='" + name + "'");
    } catch (Exception e) {
    e.printStackTrace();
    }
 return rs;
 }

    public ResultSet searchProduct() {
         try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM product");
        }
        catch(Exception e){
            
            
        }
        return rs;
    }
    
    
        public ResultSet searchSeller() {
         try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM seller");
        }
        catch(Exception e){   
        }
        return rs;
    }
        
        
        public ResultSet SearchStaff(){
            try{
                stmt = DBConnection.getStatementConnection();
                rs = stmt.executeQuery("SELECT * FROM staff");
            
            } catch(Exception e){
                
            }
        return rs;
        } 
        

}

  
