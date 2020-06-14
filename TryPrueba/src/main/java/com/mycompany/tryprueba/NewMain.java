/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tryprueba;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nicoc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
 
int numerador;
        int denominador;
        int division;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el numerador:");
        numerador=sc.nextInt();
        System.out.println("Introduce el denominador:");
        denominador=sc.nextInt();
        
        try{
            comprobarValores(numerador,denominador);
            division=numerador/denominador;
            System.out.println("División: "+division);
        }catch(ArithmeticException ex){
            System.out.println("La división es infinita.");
            ex.printStackTrace();
        }catch(NullPointerException ex){
            System.out.println("Error: Alguno de los valores es null.");
            ex.printStackTrace();
        }catch(miExcepcion3 ex){
            System.out.println("Error: Los valores no están entre 0 y 50");
            ex.printStackTrace();
        }finally{
            System.out.println("El programa ha terminado correctamente.");
        }
        
           
           
        
        
    
        
    }

 private static void comprobarValores(int numerador, int denominador) throws Exception{
        if (numerador<0 || numerador>50 || denominador<0 || denominador>50){
            miExcepcion3 miError=new miExcepcion3("Los valores son incorrectos.");
                throw miError;
        }
    }
    
    
}
