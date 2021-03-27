/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> diccionario = new HashMap();
        diccionario.put("hola", "buenos días");
        diccionario.put("adios", "hasta luego");
        diccionario.put("saludos", "me marcho");
        diccionario.put("cierra", "nos vemos!");
        System.out.println("Escribe una frase recueda usar hola, adios,saludos o cierra y se cambiara tu frase");
        String texto = sc.nextLine();
        texto = buscarDiccionario(texto, diccionario);

        System.out.println(texto);
    }
/**
 * Mediante esta funcion creamos un array separando por palabras que ha escrito el usuario
 * en un for iteramos dicho array  y comprobamos si nuestro HashMap contiene esa palabra
 * Si lo contiene cambiaremos la iteracion del array de la palabra por el valor de la key del HashMap
 * @param text texto que introduce el usuario
 * @param dicci HashMap del diccionario
 * @return texto cambiado por el diccionario
 */
    public static String buscarDiccionario(String text, HashMap<String, Stri    ng> dicci) {
        String textoOriginal = text;
        String[] palabras = text.split("\\W+");
        for (int i = 0; i < palabras.length; i++) {
            if (dicci.containsKey(palabras[i])) {
                palabras[i] = dicci.get(palabras[i]);
            }
        }
        text = "";
        for (int i = 0; i < palabras.length; i++) {
            text += palabras[i] + " ";
        }

        if (text == textoOriginal) {
            return textoOriginal;
        } else {
            return text;
        }
    }

}
