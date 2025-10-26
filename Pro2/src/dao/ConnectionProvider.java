/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author user
 */
//import java.sql.*;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/InsurenceSystem?useSSL=false","root","Prajakta@0302");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
