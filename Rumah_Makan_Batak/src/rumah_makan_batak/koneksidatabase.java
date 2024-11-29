/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rumah_makan_batak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



/**
 *
 * @author LENOVO
 */
public class koneksidatabase {
    private String url = "jdbc:mysql://localhost/db_rumahmakanbatak";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username_xampp,password_xampp );
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
            
        }
        
    }

    public Connection getCon() {
        return con;
    }

    class getCon {

        static PreparedStatement prepareStatement(String select__form_masakan) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public getCon() {
        }
    }
    
    
     
}
