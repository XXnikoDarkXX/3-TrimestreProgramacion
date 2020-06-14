/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcularnotas;

/**
 *Interfaz usada para implementar medodos a una clase sobre las calificaciones
 * @author nicoc
 */
public interface Calificaciones {
    /**
    * Metodo para calcular la nota media de una asignatura
     * @param asginatura asignatura el cual pedimos calcular
     * @return la nota media de la asignatura
     * @throws Exception segun la nota de la asignatura;
     */
  
     
    public float calcularNotas(String asginatura)throws Exception;
    
}
