/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;
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

        //Ejercicio 1 Assert
        //adivinaAleatorio();
   int numero=2;
       assert numero!=2:String.format("Pasa por la condicion", numero);
        
    }
    
    
    public static void adivinaAleatorio(){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int numeroAleatorio;//numero aleatorio
        int escribirNumero;//variable que usaremos para escribir el número
           numeroAleatorio=r.nextInt(5)+1;
           System.out.println("El numero aleatorio es "+numeroAleatorio);
         int contador=3;
        for (int i = 0; i < 3; i++) {
            System.out.println("Esribe un numero de 1 al 10 solo tienes 3 oportunidades");
            escribirNumero=Integer.parseInt(sc.nextLine());
            if (escribirNumero==numeroAleatorio) {
                System.out.println("Adivinistes el numero");
                break;
            }else{
                contador--;
                System.out.println("Quedan "+contador+" intentos");
            }
            if (contador==0&&escribirNumero!=numeroAleatorio) {
           
                assert escribirNumero!=numeroAleatorio:String.format("No has adivinado el numero", escribirNumero);
        /*assert numero>=0&&numero<=25:String.format("El numero no está entre 0 y 25",numero);
        assert numero%2!=0: String.format("Enhorabuena porque el numero es primo", numero);
        return numero;*/
                        
                        
            }
        }
        
        String mensaje="";
        
        
    }
    
}
