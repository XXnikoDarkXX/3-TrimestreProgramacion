/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5comparadorperso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author nicoc
 */
public class Alumno implements Comparable {

    private String nombre;//Nombre del alumno
    private ArrayList<Float> notas = new ArrayList();//Coleccion de notas
    private float notaMedia;//Nota media de la asignatura pedida

   /**
    * Constructor de Alumno dentro pasaremos el metodo de calcularNotaMedia del array de notas
    * @param n nombre del alumno
    * @param not arrayList de notas
    */
    public Alumno(String n,ArrayList<Float> not) {
        
        this.nombre=n;
        this.notas=not;
        calcularNotaMedia(this.notas);
    }

    /**
     * Getter de alumno
     *
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    /**
     * Getter de notaMedia
     *
     * @return la notaMedia
     */
    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(float notas) {
        this.notas.add(notas);
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
/**
 * Funcion para calcular la nota media del alumno
 * @param notas ArrayList con todas las calificaciones de un alumno
 * @return la nota media del alumno
 */
    public float calcularNotaMedia(ArrayList<Float> notas) {

        Iterator it = notas.iterator();
        float totalSuma=0;
        while (it.hasNext()) {
            totalSuma+=  (float)it.next();
            
        }
        this.notaMedia=totalSuma/notas.size();
        return notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + ", notaMedia=" + notaMedia + '}';
    }
    
    
    
    
    
    
/**
 * Interfaz para ordenar los alumnos en funcion de la nota media
 * Declaramos una nueva variable de tipo Alumno que sera igual al alumno pasado por parametro ya 
 * al añadirlo al queue se hara automaticamente este metodo
 * @param t el Objeto de tipo Alumno
 * @return 
 */
    @Override
    public int compareTo(Object t) {
        Alumno siguiente = (Alumno) t;
         if(this.notaMedia > siguiente.notaMedia){
                return 1;
            } else if(notaMedia < siguiente.notaMedia){
                return -1;
            }else{
                return 0;
            }
    }
}
