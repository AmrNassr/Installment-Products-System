/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author amnassar
 */
public class DBConnect {
    
    public static Connection con;
    
     public static void connect()  
     {
         
	try {
            
            
		Class.forName("com.mysql.jdbc.Driver");
		DBConnect.con=(Connection)DriverManager.getConnection ("jdbc:mysql://192.168.1.27/hany", "root", "root43442244");
                 
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
        }
	
	}
    //root1692000
    
}
