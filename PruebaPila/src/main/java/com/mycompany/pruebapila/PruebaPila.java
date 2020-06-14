/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebapila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @author nicoc
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadenano = "( Cadena no equilibrada en paréntesis () () () )))";
        System.out.println("Esta cadena no esta equilibrada: ");
        System.out.println(verificaPrentesis(cadenano));
        String cadenasi = "( Cadena equilibrada en paréntesis () )";
        System.out.println("Esta cadena está equilibrada en paréntesis");
        System.out.println(verificaPrentesis(cadenasi));

        //Ejemplos de cola con prioridad
        //Ejemplo 1: cadenas (ya implementan la interfaz comparable)
        PriorityQueue<String> colaCadenas = new PriorityQueue<String>();

        colaCadenas.add("hola");
        colaCadenas.add("adios");
        colaCadenas.add("buenos días");
        colaCadenas.add("hasta luego");

        while (!colaCadenas.isEmpty()) {
            System.out.println(colaCadenas.remove());//Saca el primer elemento de la cola y nos lo devuelve
        }

        //Ejemplo 2: enteros (ya implementan la interfaz comparable)
        PriorityQueue<Integer> colaEnteros = new PriorityQueue<Integer>();

        colaEnteros.add(34);
        colaEnteros.add(12);
        colaEnteros.add(25);
        colaEnteros.add(1);
        while (!colaEnteros.isEmpty()) {
            System.out.println(colaEnteros.remove());//Saca el primer elemento de la cola y nos lo devuelve
        }

        //Ejemplo 3 Crear una cola con prioridad con nuestro propio comparador (sin objetos)
        Comparator<String> longitudComparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               return s1.length()-s2.length();
            }

        };
        
        PriorityQueue<String>cadenaCola=new PriorityQueue<String>(longitudComparador);
        
        
        cadenaCola.add("hola");     
        cadenaCola.add("adios");
        cadenaCola.add("buenos dias");  
        cadenaCola.add("hasta luego");
                
         while (!cadenaCola.isEmpty()) {
            System.out.println(cadenaCola.remove());//Saca el primer elemento de la cola y nos lo devuelve
        }
       
                
                
    }

    private static boolean verificaPrentesis(String cadena) {
        Stack<String> pila = new Stack<String>();

        int i = 0;
        while (i < cadena.length()) {
            if (cadena.charAt(i) == '(') {//Si tenemos un parentesis de apertura, lo apilamos
                pila.add("(");
            } else if (cadena.charAt(i) == ')');
            if (!pila.empty()) {//Si la pila no esta vacia sacamos el parentesis de apertura
                pila.pop();
            } else {//Si la pila esta vacia, los paréntesis no están equilibrados
                pila.add(")");
                break;
            }

            i++;
        }
        return pila.empty();
    }

}
