/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcularnotas;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Main {

    /**
     * Main de de Calcular notas donde haremos los diferentes puntos del ejercicio
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   Scanner sc=new Scanner(System.in);
      Alumno pepe=new Alumno();
      
        System.out.println("Dime el nombre");
        
        String nombre=sc.nextLine();
        
        assert !nombre.equals(""):String.format("No has escrito nada",nombre);
        assert !nombre.equals(" "):String.format("Has escrito solo un espacio",nombre);
        pepe.setNombre(nombre);
        byte edad=2;
       
         while(pepe.setEdad(edad)!=0){
         try{
        
    
         

            
      
        System.out.println("Escribir la edad debe ser en un rango desde 18 hasta 99");
       edad =Byte.parseByte(sc.nextLine());
      
       pepe.setEdad(edad);
          }
        catch( NumberFormatException ex){
             System.out.println("Te equivocaste!!");
           
         }
      }
 String nombreAsignauta="";
          
            byte cantidad=0;
            do{
                
            
            try{
               System.out.println("Dime cuantas asignaturas tienes maximo 10");//HACERLE TRY CATCH
            cantidad=Byte.parseByte(sc.nextLine());
            
            }
             catch( NumberFormatException ex){
             System.out.println("Te equivocaste!! maximo de notas son 10");
           
         }
            }while(cantidad>10||cantidad<=0);
            pepe.establecerCantidadNotas(cantidad); 
           String [] asig=new String [cantidad];//Asignatura que pedimos por teclado
             byte[] calificacion=new byte[cantidad];//Calificacion de la asignatura que pedimos por teclado
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Dime una asignatura recuerda que debe ser bbdd o programacion,"
                    + " si lo escribes mal no se contara la asignatura");
            asig[i]=sc.nextLine();
           
           
            do{
                try{
                    
            
                 System.out.println("Dime una calificacion recuerda que debe de ser entre 0 y 10 ");
                calificacion[i]=Byte.parseByte(sc.nextLine());
                  }
                catch(NumberFormatException ex){
                    System.out.println("Te equivocastes revisa que se cumpla el rango!!!");
                    calificacion[i]=11;
                }
            }while(calificacion[i]<0||calificacion[i]>10);
             
        }
         pepe.establecerNotas(pepe.getNotas(), asig, calificacion);
       
        
        
        //Luego ajustamos el array de asignaturas en caso de que esten mal esctrito dichas asignaturas
        pepe.ajustarNotas();
        String media="";
        float mediaTotal=-1;
               // while(mediaTotal==-1){
                   
           System.out.println("Dieme que media de asignatura quieres hacer");
          media=sc.nextLine();
         try{
             
         
         
           mediaTotal= pepe.calcularNotas(media);
       // assert mediaTotal>5:String.format("La nota media es menor de 5, has sacado un %.2f", mediaTotal);
           }
         catch(Exception es){
             System.out.println("Error");
             es.printStackTrace();
         }
        //   }
      
      
        System.out.println((mediaTotal<=4)?"":"La media es: "+mediaTotal);

               
          System.out.println(pepe);

    }
}


