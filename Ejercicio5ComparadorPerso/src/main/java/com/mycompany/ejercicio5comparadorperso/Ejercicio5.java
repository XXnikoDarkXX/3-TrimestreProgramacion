/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5comparadorperso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Alumno> alumnos_clase = new PriorityQueue();
        
        Scanner sc = new Scanner(System.in);
        String opcion;
        float nota;
        String opcionAlumno;
        do {

         ArrayList<Float> notas=new ArrayList();

            System.out.println("Escribe un nombre para el alumno");
            String nombre = sc.nextLine();

            
            opcion = "s";
            while (opcion.equals("s")) {
            
                do{
                System.out.println("Escribe la calificacion nota");
                 nota = Float.parseFloat(sc.nextLine());
                 //nos aseguramos que este en la condicion las calificaciones
                    nota=(nota>=0&&nota<=10?nota:-1);
                    
                }while(nota==-1);
                notas.add(nota);
                System.out.println("Escribe s si quieres seguir añadiendo asignaturas o n para cancelar");
                
                opcion = sc.nextLine();

           

            }
            Alumno alumnoClase = new Alumno(nombre,notas);
            alumnos_clase.add(alumnoClase);
              
            System.out.println("Quieres añadir mas alumnos S/n");
            opcionAlumno=sc.nextLine();
        } while (opcionAlumno.equalsIgnoreCase("s"));

        System.out.println(alumnos_clase);

    }
}
