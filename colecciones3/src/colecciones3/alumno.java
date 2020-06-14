/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

/**
 *
 * @author PatriciaLibertad
 */
public class alumno implements Comparable {
    
    String nombre;
    int edad;

    public alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Object t) {
        if (edad<((alumno)t).edad){
            return -1;
        }
        if (edad>((alumno)t).edad){
            return 1;
        }
        return 0;  
    }
    
    
    
}
