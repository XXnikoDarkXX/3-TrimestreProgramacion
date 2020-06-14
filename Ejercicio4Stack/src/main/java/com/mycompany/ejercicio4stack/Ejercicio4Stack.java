/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio4stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author nicoc
 */
public class Ejercicio4Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String cadena = "[()()]";
        System.out.println("Esta cadena esta equilibrada");
        System.out.println(verificaParentesis(cadena));
        String cadena2 = "[()(])";
        System.out.println("Esta cadena no esta equilibrada");
         System.out.println(verificaParentesis(cadena2));
        String cadena3 = "[(()()]";
        System.out.println("Esta cadena no esta equilibrada");
        System.out.println(verificaParentesis(cadena3));
        String cadenaa = "[()[()]]";
        System.out.println("Esta cadena esta equilibrada");
        System.out.println(verificaParentesis(cadenaa));
        

    }

    private static boolean verificaParentesis(String cadena) {
        Stack<Character> pila = new Stack();

        try {

            for (int i = 0; i < cadena.length(); i++) {
                char c;
                switch (cadena.charAt(i)) {
                    case '(':
                    case '[':
                        pila.add(cadena.charAt(i));
                        break;
                    case ')':
                        c = pila.pop();
                        if (c != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        c = pila.pop();
                        if (c != '[') {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }

        } catch (EmptyStackException e) {
            return false;
        }

        return pila.empty();
    }
}
