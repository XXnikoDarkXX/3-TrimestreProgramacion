/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaenumerados;

import java.util.Random;
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
          Random rn=new Random();
          Scanner sc=new Scanner (System.in);
       //   System.out.println(nextNumber());
       
 
              int numero=2;
       assert numero!=2:String.format("Pasa por la condicion", numero);
       
       
     /*     System.out.println("Dime un numero");
        byte i=Byte.parseByte(sc.nextLine());
        assert i>=0 &&i<=25:String.format("El numero no está entre 0 y 25");
        assert i%2!=0: String.format("Lo siento, el %d es múltiplo de 2", i);
        assert i%3!=0: String.format("Lo siento, el %d es múltiplo de 3", i);
        assert i%5!=0: String.format("Lo siento, el %d es múltiplo de 5", i);
        assert i%7!=0: String.format("Lo siento, el %d es múltiplo de 7", i);
        assert i%11!=0: String.format("Lo siento, el %d es múltiplo de 11", i);
        assert i%13!=0: String.format("Lo siento, el %d es múltiplo de 13", i);*/
      
      // System.out.println( probandoAssert(numero));    
        
    }
    public static int nextNumber() {
        Random rn = new Random();
            int i = rn.nextInt(40);
        assert i >= 0 && i < 10: String.format("El número devuelto  no cumple la postcondición (%d)", i);
        return i;
    }
    
    public static byte probandoAssert(byte numero){
        assert numero>=0&&numero<=25:String.format("El numero no está entre 0 y 25",numero);
        assert numero%2!=0: String.format("Enhorabuena porque el numero es primo", numero);
        return numero;
    }

}
