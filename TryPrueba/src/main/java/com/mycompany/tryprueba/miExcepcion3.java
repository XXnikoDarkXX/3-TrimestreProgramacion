/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tryprueba;

/**
 *
 * @author nicoc
 */
public class miExcepcion3 extends Exception{
    


    public miExcepcion3() {
        super();
    }

    public miExcepcion3(String string) {
        super(string);
    }

private static void comprobarValores(int numerador, int denominador) throws Exception{
        if (numerador<0 || numerador>50 || denominador<0 || denominador>50){
            miExcepcion3 miError=new miExcepcion3("Los valores son incorrectos.");
                throw miError;
        }
    }
    
}
            
    

