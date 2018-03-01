/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomallocation1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abbya
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("connection successful");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("connection failed" + cnfe);  
        }
        String url = "jdbc:msql://localhost:3306/roomallocation";
        try{
            DBConnection = (Connection) DriverManager.getConnection(url, "root","Oppolo123");
            System.out.print("Database connected");
        }
        catch (SQLException se) {
            System.out.println("No Database" + se);
        }
        return DBConnection;
}
    public static void main (String [] args){
        
    }
        
    }
    

