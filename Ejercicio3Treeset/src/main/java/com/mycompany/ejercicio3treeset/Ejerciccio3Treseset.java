/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3treeset;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author nicoc
 */
public class Ejerciccio3Treseset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el Treeset de loteria
        TreeSet<Integer> loteria = new TreeSet();
        Random r = new Random();
        int numero;
        //mediante un bucle vamos sacando 6 numeros aleatorios y en do while en caso
       //de que el aleatorio ya lo contenga la loteria volver a sacar un numero aleatorio
        for (int i = 0; i < 6; i++) {
            do {
                numero = r.nextInt(59) + 1;

            } while (loteria.contains(numero));
            loteria.add(numero);//Añadimos el numero random al Treeset
        }
//Con el iterador lo vamos a imprimir
        Iterator it = loteria.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
