/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Admin
 */
public class conexion {
    
    
    Connection con;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ejemplo", "root","123456");
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return con;
    }
    
   
   
}
