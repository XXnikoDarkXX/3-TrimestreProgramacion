/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linkelidstprueba;

import java.util.LinkedList;

/**
 *
 * @author nicoc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Películas */
        LinkedList<String> peliculas1 = new LinkedList<String>();
        peliculas1.add("Interestelar");
        peliculas1.add("El marciano");
        peliculas1.add("Matrix");

        System.out.println("Mi primera lista:");
        System.out.println(mostrar(peliculas1));

        LinkedList<String> peliculas2 = new LinkedList<String>();
        peliculas2.add("La llegada");
        peliculas2.add("El bosque");
        System.out.println("Mi segunda lista:");
       
        System.out.println(mostrar(peliculas2));

        peliculas1.addAll(1, peliculas2);
        System.out.println("Mis listas unidas:");
        mostrar(peliculas1);
        System.out.println(mostrar(peliculas1));

        String[] miArray = new String[peliculas1.size()];
        miArray = peliculas1.toArray(miArray);
        System.out.println("Ahora tengo un array con " + miArray.length + " elementos.");
        for (byte i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }

    }
    public static String mostrar(LinkedList<String> lista){
        String listaString="";
        for (int i = 0; i < lista.size(); i++) {
            listaString+=lista.get(i)+"\n";
        }
        
        return listaString;
}

}
