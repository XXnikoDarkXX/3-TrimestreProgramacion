/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collecciones_srack_parentesis;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author 34650
 */
public class MainParentesisCorchetes {
    public static void main(String[] args) {
        String cadenano="[()]]()()]()]";
        System.out.println("Esta cadena no está equilibrada en paréntesis:");
        System.out.println(verificaParentesis(cadenano));
        
        String cadenasi="([]) ";
        System.out.println("Esta cadena está equilibrada en paréntesis:");
        System.out.println(verificaParentesis(cadenasi));
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
                    if (c != '(') return false;
                    break;
                case ']':
                    c = pila.pop();
                    if (c != '[') return false;
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
