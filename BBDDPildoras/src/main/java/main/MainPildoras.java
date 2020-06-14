/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nicoc
 */
public class MainPildoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/institutos1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
            
            
        }catch(Exception e){
            
        }
      
       
    }
    
}
