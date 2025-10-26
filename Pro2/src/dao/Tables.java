/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String args[]) {
        Connection con = null;
        Statement st = null;

        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//          st.executeUpdate("create table aapuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(50), name varchar(100),mobileNumber varchar(50),email varchar(100),password varchar(50),address varchar(200),status varchar(50));");
//            st.executeUpdate("insert into aapuser(userRole,name,mobileNumber,email,password,address,status) values('SuperAdmin','Super Admin','12345','superadmin@testemail.com','admin','India','Active')");

            st.executeUpdate("create table Customer(Cus_ID int AUTO_INCREMENT primary key, Cus_name varchar(50), Cus_ADD varchar(100),Cus_email varchar(50),Cus_MobileNo varchar(100),Cus_dob varchar(50));");

            JOptionPane.showMessageDialog(null, "Table Created Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (st != null) {
//                con.close();
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }
}
