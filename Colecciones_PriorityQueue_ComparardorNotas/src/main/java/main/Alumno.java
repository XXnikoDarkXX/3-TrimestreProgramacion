/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 34650
 */

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
        en función de la nota media.
    *Sacar por pantalla (necesito el toString).
      */
public class Alumno implements Comparable{
    private String nombre;
    private List<Float> notas;
    private float notaMedia;

    public Alumno(String nombre, List<Float> notas) {
        this.nombre = nombre;
        this.notas = notas;
        this.notaMedia = calcularNotaMedia();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public void setNotas(List<Float> notas) {
        this.notas = notas;
        this.notaMedia = calcularNotaMedia();
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    private float calcularNotaMedia(){
        Iterator<Float> it = notas.iterator();
        float suma = 0;
        while (it.hasNext()) {            
            suma = suma + it.next();
        }
        return suma / notas.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + ", notaMedia=" + notaMedia + '}';
    }

    @Override
    public int compareTo(Object obj) {
        boolean esInstancia = obj instanceof Alumno;//Si el objeto pasado por parametro esta instanciado como Alumno
        if(esInstancia){//por defecto el booleano es true
            Alumno alu = (Alumno) obj;//CASTING objeto debe ser tipo alumno crea una variable de tipo alumno
            if(this.notaMedia > alu.notaMedia){
                return 1;
            } else if(notaMedia < alu.notaMedia){
                return -1;
            }else{
                return 0;
            } 
        }else{
            throw new RuntimeException();
        }  
    }
}
