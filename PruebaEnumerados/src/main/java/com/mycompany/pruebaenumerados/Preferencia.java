/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaenumerados;

/**
 *
 * @author nicoc
 */
public class Preferencia {

    
    private enum Color{
        AMARILLO,
        VERDE,
        ROJO,
        AZUL
    }
    
    /*  Variables internas */
    Color c; // Esta variable almacena el color d nuestras preferencias
   
 
    
    /*
    * Si devuelve 0 es que todo ha ido bien.
    * Si devuelve -1 es que el color no era correcto
    */
    public int setColor(String c){
        if (c.equalsIgnoreCase("amarillo")){
            this.c=Color.AMARILLO;
        }
        else if (c.equalsIgnoreCase("verde")){
            this.c=Color.VERDE;
        }
        else if (c.equalsIgnoreCase("rojo")){
            this.c=Color.ROJO;
        }
        else if (c.equalsIgnoreCase("azul")){
            this.c=Color.AZUL;
        }
        else
        {
            return -1;
        }
        return 0;
    }
   public Preferencia() {
        
    }
    @Override
    public String toString() {
        return "Preferencias{" + "Color=" + this.c + "}";
    }  
}