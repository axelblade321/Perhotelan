/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perhotelan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class dbConnect {
    private static Connection con;
    
    public static Connection databaseConnect(){
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost/applikasi_hotel";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = (Connection) DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "gagal koneksi");
            }
        }
        return con;
    }
    
    public static void main(String[] args) {
    }
}
