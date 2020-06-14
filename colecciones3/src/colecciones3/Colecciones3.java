/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @author PatriciaLibertad
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ejemplo con Stack (LIFO) 
        
        /*String cadenano="( Cadena no equilirada en paréntesis () () () )))";
        System.out.println("Esta cadena no está equilibrada en paréntesis:");
        System.out.println(verificaParentesis(cadenano));
        String cadenasi="( Cadena equilibrada en paréntesis () )";
        System.out.println("Esta cadena está equilibrada en paréntesis:");
        System.out.println(verificaParentesis(cadenasi));*/

        // Ejemplos de cola con prioridad
        
        // Ejemplo 1: cadenas (ya implementan la interfaz comparable)
        /*PriorityQueue<String> colaCadenas=new PriorityQueue<String>();
        
        colaCadenas.add("hola");
        colaCadenas.add("adios");
        colaCadenas.add("buenos días");
        colaCadenas.add("hasta luego");
        
        while (!colaCadenas.isEmpty()){
            System.out.println(colaCadenas.remove()); // Saca el primer elemento de la cola y nos lo devuelve
        }*/
        
        // Ejemplo 2: enteros (ya implementan la interfaz comparable)
        
        /*PriorityQueue<Integer> colaEnteros=new PriorityQueue<Integer>();
        
        colaEnteros.add(34);
        colaEnteros.add(12);
        colaEnteros.add(25);
        colaEnteros.add(1);
        
        while (!colaEnteros.isEmpty()){
            System.out.println(colaEnteros.remove()); // Saca el primer elemento de la cola y nos lo devuelve
        }*/
                    
        // Ejemplo 3: crear una cola con prioridad con nuestro propio comparador (sin objetos)
        
        /*Comparator<String> longitudComparador=new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
  
                return s1.length()-s2.length();
            }   
        };
        
        PriorityQueue<String> colaCadenas=new PriorityQueue<String>(longitudComparador);
        
        colaCadenas.add("hola");
        colaCadenas.add("adios");
        colaCadenas.add("buenos días");
        colaCadenas.add("hasta luego");
        
        while (!colaCadenas.isEmpty()){
            System.out.println(colaCadenas.remove()); // Saca el primer elemento de la cola y nos lo devuelve
        }*/
   
        // Ejemplo 4: cola con prioridad de objetos 
        
        PriorityQueue<alumno> colaAlumnos=new PriorityQueue<alumno>();
        
        colaAlumnos.add(new alumno("María",13));
        colaAlumnos.add(new alumno("Pepe",22));
        colaAlumnos.add(new alumno("Miguel",12));
        colaAlumnos.add(new alumno("Patri",10));
        
        while(!colaAlumnos.isEmpty()){
            System.out.println(colaAlumnos.remove());
        }
        
    }

    private static boolean verificaParentesis(String cadena) {
        
        Stack<String> pila=new Stack<String>();
        int i=0;
        while (i<cadena.length()){
            if (cadena.charAt(i)=='('){ //Si tenemos un paréntesis de apertura, lo apilamos
                pila.add("(");
            }else if (cadena.charAt(i)==')'){
                if (!pila.empty()){ // Si la pila no está vacía, sacamos un paréntesis de apertura
                    pila.pop();
                }else {    // Si la pila está vacía, los paréntesis no están equilibrados
                    pila.add(")");
                    break;
                }
                
            }
            
            i++;
        }
        
        return pila.empty();
    }


        
}
