/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/institutos1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
            Statement smt = con.createStatement();//Crear la consulta
          
            byte opcion;
            do {
                System.out.println("Escribe una de las siguientes opciones \n\t1- Mostrar módulos \n\t2-Insertar modulo nuevo"
                        + "\n\t3- Eliminar módulo\n\t4- Salir");
                opcion = Byte.parseByte(sc.nextLine());
                switch (opcion) {
                    case 1:
                        imprimirModulos(smt);//
                        break;
                    case 2:
                        imprimirModulos(smt);
                        System.out.println("Dime el nuevo modulo a insertar");
                        String nombre = sc.nextLine();
                        System.out.println("Dime la id del modulo");
                        String idModulo = sc.nextLine();
                        System.out.println("dime las horas del modulo");
                        String hrModulo = sc.nextLine();
                        int nfilas = smt.executeUpdate("insert into modulos values (" + idModulo + ",'" + nombre + "'," + hrModulo + ") ");
                        break;
                    case 3:
                       
                        imprimirModulos(smt);
                         System.out.println("Vamos a eliminar un modulo\n A continuacion dime el nombre del modulo a borrar");  
                        String nombreBorrar = sc.nextLine();
                        nfilas = smt.executeUpdate("delete from modulos where nombre= '" + nombreBorrar+"'");
                        imprimirModulos(smt);
                        break;
                    default:
                        System.out.println("Te equivocaste de numero");
                        break;
                    case 4:
                        System.out.println("Elegistes salir");
                        break;
                }
            } while (opcion != 4);

            //imprimirModulos(smt);
            smt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void imprimirModulos(Statement smt) throws SQLException {
        ResultSet rs = smt.executeQuery("select * from modulos");//almacenamos el resultado de la consulta
        while (rs.next()) {
            System.out.println(rs.getInt("id_modulo") + " : " + rs.getString("nombre") + " : " + rs.getInt("horas"));
        }
        rs.close();
    }
    public static void insertarModulo(Statement smt) throws SQLException{
        Scanner sc1=new Scanner (System.in);
        Scanner sc2=new Scanner (System.in);
        System.out.println("Introduce el identificador del módulo: ");
        int id_modulo=sc2.nextInt();
        System.out.println("Introudce el nombre del nombre");
        String nombre=sc1.nextLine();
        System.out.println("Introduce el numero de horas");
        int horas=sc1.nextInt();
        int nfilas=smt.executeUpdate("insert into modulos values("+id_modulo+",'"+nombre+"', "+horas+")");
        if (nfilas==1) {
            System.out.println("El modulo se ha insertado correctamente.");
            
            
        }else{
            System.out.println("Ha habido un error al insertar el modulo");
        }
        
    }

}
