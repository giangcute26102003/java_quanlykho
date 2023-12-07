/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;


/**
 *
 * @author gjang
 */
public class connect {
    Connection con = null;
    public connect(){
        try
{
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/kho?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&useSSL=false";
    String user      = "root";
    String password  = "";
     
    // create a connection to the database
    con = DriverManager.getConnection(url, user, password);
    // more processing here
    // ...  
} 
  catch(SQLException e) {
   System.out.println(e.getMessage());
} 
    }


    
}
