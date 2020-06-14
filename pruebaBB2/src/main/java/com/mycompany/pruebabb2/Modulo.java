/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebabb2;

/**
 *
 * @author nicoc
 */
public class Modulo {
    /* variables internas*/
    private int id_modulo;
    private String nombre;
    private int horas;
    
    /*   Constructor*/
    public Modulo(int id_modulo, String no,int hr){
        this.id_modulo=id_modulo;
        this.nombre=no;
        this.horas=hr;
        
        /* Getters */

    }

    public int getId_modulo() {
        return id_modulo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }
/* Setter */
    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Modulo{"  + id_modulo + ", "+ nombre  + horas + '}';
    }
    
    
    
    
    
}
    

