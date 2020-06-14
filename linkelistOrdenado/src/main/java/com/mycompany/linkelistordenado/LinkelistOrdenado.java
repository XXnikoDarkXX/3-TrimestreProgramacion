/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linkelistordenado;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class LinkelistOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  /* Ejercicio: Crear un programa que genere 10 números aleatorios y los introduzca en una LinkedList de forma ordenada. */
Scanner sc=new Scanner (System.in);
LinkedList<Integer> numeros =new LinkedList<Integer>();
        Random r=new Random();
        int valor;
        byte j;
        
        for (byte i=0;i<10;i++){
            valor=r.nextInt(10)+1;
            j=0;
            while (j<numeros.size() && valor>numeros.get(j)){
                j++;
            }
            numeros.add(j,valor);      
        }
        
        
        for (byte i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        
          LinkedList <String> palabras=new LinkedList();
          String parada="S";
          String palabra;
          byte i;
          while (!parada.equalsIgnoreCase("N")){
              
        System.out.println("Introduce  una palabra:");
        palabra=sc.nextLine();
        i=0;
        while(i<palabras.size()&&(palabra.compareToIgnoreCase(palabras.get(i))>0) ){
            
        
        i++;
        }
        
        palabras.add(i,palabra);
              System.out.println("Quieres introducir otra palabra? (S/N)");
              parada=sc.nextLine();
        
          }
          for (int k = 0; k < palabras.size(); k++) {
              System.out.println(palabras.get(k));
        }
        
    
    
    
    
    /*
    Introduce palabras ya las guarda por orden alfabetico en un ArrayList
    Cadnea1.compareToIgnoreCase(cadena2):devuelve un valor negativo si la primera cadena 
    es alfabéticamente menor, un valor positivo si la segunda cadena es por orden alfabético o un
    valor de cero si las cadenas son iguales
    */
    

    }
    
  
    
    
    
    

    public static String mostrar(LinkedList<Integer> lista) {
        String listaString = "";
        for (int i = 0; i < lista.size(); i++) {
            listaString += lista.get(i) + "\n";
        }

        return listaString;
    }
}
