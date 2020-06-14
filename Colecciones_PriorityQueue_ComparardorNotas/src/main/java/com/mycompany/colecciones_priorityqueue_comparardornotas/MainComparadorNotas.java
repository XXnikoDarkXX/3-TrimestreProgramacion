/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.colecciones_priorityqueue_comparardornotas;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author 34650
 */
public class MainComparadorNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
Vamos a crear una cola de alumnos donde el orden de prioridad sea su nota media. Para ello vamos a:
    *Crear una clase Alumno con tres variables internas: nombre (String), notas (colección de notas)
        y notaMedia. 
    *La información del nombre y las notas se piden por teclado al usuario. El número de notas es variable
        (usamos la colección que nos parezca más apropiada siguiendo el esquema).
    *Crear getters y setters.
    *Al crear el objeto alumno se calcula la nota media, luego será necesario un método que calcule 
        la nota media y llamarlo en el constructor.
    *Se añade a la cola con prioridad, luego habrá que hacer el compareTo en la clase para que ordene 
        en función de la nota media. notamedia media
    *Sacar por pantalla (necesito el toString).
      */
           
        Queue<Alumno> cola = new PriorityQueue<Alumno>();
       
        Scanner sc = new Scanner(System.in);
       
        int nAlumnos;
        do{
            System.out.println("Inserte numero de alumnos");
            nAlumnos = Integer.parseInt(sc.nextLine());
        }while(!(nAlumnos > 0));
      
        for (int i = 0; i < nAlumnos; i++) {
            List<Float> notas = new ArrayList<Float>();
            
            System.out.println("Introduzca nombre del alumno "+(i+1));
            String nombre = sc.nextLine();
            
            System.out.println("Introduzca las notoas del alumno, numero negativo para salir del bucle");
            boolean haFinalizado = false;
            do {
                System.out.println("Nota");
                float nota = Float.parseFloat(sc.nextLine());
                if(nota >= 0){
                    notas.add(nota);
                }else{
                    haFinalizado = true;
                }
            } while (!haFinalizado);
            
            Alumno alumno = new Alumno(nombre, notas);
            cola.add(alumno);//Justo aqui usara el compare TO y se necesita en alumno implementar la interfaz
            //Compable
        }
        System.out.println(cola);
    }
    
}
