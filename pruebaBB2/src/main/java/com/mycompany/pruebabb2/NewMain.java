/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebabb2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/institutos1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
            Statement smt = con.createStatement();//Crear la consulta
            ResultSet rs = smt.executeQuery("select * from modulos");
            Modulo[] modulos = new Modulo[3];
            int i=0;
            while (rs.next()) {
                Modulo m = new Modulo(rs.getInt("id_modulo"), rs.getString("nombre"), rs.getInt("horas"));
                modulos[i]=m;
                System.out.println(m);
                i++;
            }
            System.out.println("Introduce el identificador del modulo al que le quires cambiar las horas");
            int id=sc.nextInt();
            System.out.println("Introduce el numero de horas");
            int horas = sc.nextInt();
            
           int nfilas=smt.executeUpdate("update modulos set horas="+horas+" where id_modulo="+id);

            
            
            
            
            
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
