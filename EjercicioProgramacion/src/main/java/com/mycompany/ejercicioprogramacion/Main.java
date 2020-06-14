/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioprogramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crear una tabla llamada alumnos en la base de datos institutos (directamente en el workvench)
        nombre varchar (30)
        edad int
        matriculado boolean
        2. Crear la clasae alumno: variales internas, contructor, getter y setter, toString
        3. Main:
        - Pedir alumnos al usuario y guardarlos en objetos
        -los objetos alumnos se guardan en un array (10) llamado clase como maximo 10 puede ser 10 en un array y
        se va metiende de uno en uno si el usuario dice quuiere mas alumno s, mete otro y vuelve a preguntar
        -Cuando el usuario termine de introducir los alumnos, estos se insertan en la base de datos (recorriendo el array)
        - se hace un select
        -imprimimos por pantalla lo recibido del select
        */
         Scanner sc = new Scanner(System.in);
         boolean matricula=true;
         int edad;
        try {
            
            
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/institutos1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
            Statement smt = con.createStatement();//Crear la consulta
        Alumno[] clase=new Alumno[10];
              ResultSet rs = smt.executeQuery("select * from alumnos");//Creamos el select
        int i=0;
        String ampliarAlumno="s";
        String matri="";
     
        while(ampliarAlumno.equalsIgnoreCase("s")){
            System.out.println("Dime el nombre del alumno");
       String nombre=sc.nextLine();
            System.out.println("Dime la edad del alumno");
             edad=Integer.parseInt(sc.nextLine());
            do{
                
            
            System.out.println("Esta matriculao? si/no");
             matri=sc.nextLine();
            
                if (matri.equalsIgnoreCase("si")) {
                    matricula=true;
                }else if(matri.equalsIgnoreCase("no")){
                    matricula=false;
                }
            }while(!(matri.equalsIgnoreCase("si")||matri.equalsIgnoreCase("no")));
            Alumno objeto =new Alumno(nombre,edad,matricula);
            clase[i]=objeto;
            
            System.out.println("Quieres añadir otro alumna escribe s para agregar o escribe cualquier tecla");
            ampliarAlumno=sc.nextLine();
         //Con este codigo podemos crear mas consultas. mediante el smt.executeUpdate   
    int nfilas = smt.executeUpdate("insert into alumnos values (" +"'"+ clase[i].getNombre() + "' ," + clase[i].getEdad() + ", " + clase[i].isMatriculado() + ") ");//Insertamos los datos 
        i++;
        }
        //Imprimimos por pantalla los datos
        for (Alumno cl: clase){
            System.out.println((cl==null)?"":cl);
        }
        
            /* TO DO REVIASR A PARTIR DE AQUI LO QUE HACE ES IGUALAR LOS ALUMNOS POR LOS ARRAYS ESCRITOS while (rs.next()) {
                Alumno a = new Alumno(rs.getString("nombre"),rs.getInt("edad"),rs.getBoolean("matriculado"));
                clase[i]=a;
                System.out.println(a);
                i++;
            }*/
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    
}
