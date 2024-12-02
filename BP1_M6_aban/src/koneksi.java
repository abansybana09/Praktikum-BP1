/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Suci Indah Lestari
 */
public class koneksi {
    
    public Connection con;

    public koneksi (){
        String id, pass, driver, url;
        id = "root";
        pass ="";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/form_mahasiswa";
        
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url,id,pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }
        catch(Exception e){
            System.out.println("" + e.getLocalizedMessage());
        }
    }
    public static void main(String []args){
        koneksi kon=new koneksi();
    }
}
