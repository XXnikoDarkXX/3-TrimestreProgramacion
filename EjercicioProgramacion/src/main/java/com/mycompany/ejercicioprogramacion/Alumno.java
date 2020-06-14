/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioprogramacion;

/**
 *
 * @author nicoc
 */
public class Alumno {
    private String nombre;
    private int edad;
    private boolean matriculado;
    
    public Alumno(String n,int ed,boolean ma){
        this.nombre=n;
        this.edad=ed;
        this.matriculado=ma;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", matriculado=" + matriculado + '}';
    }
    
    
}
