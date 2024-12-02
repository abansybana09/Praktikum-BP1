/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_m6_aban;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Suci Indah Lestari
 */
public class BP1_M6_aban {
    
    Connection con;

    public BP1_M6_aban (){
        String id, pass, driver, url;
        id = "root";
        pass ="";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/db_mhs";
        
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
        BP1_M6_aban m6=new BP1_M6_aban();
    }
}
