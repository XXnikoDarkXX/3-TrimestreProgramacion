/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listacompra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class ListaCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here
     ArrayList<String> carrito = new ArrayList<String>();
      byte opcion;
        do{
         
                 System.out.println("Elije una se las siguientes opciones\n\t-1 Mostrar productos\n\t2 -Añadir productos"
                + "\n\t-3 Eliminar producto\n\t-4 Buscar producto\n\t-5 Salir"); 
                 opcion = Byte.parseByte(sc.nextLine());
       switch(opcion){
    
           case 1:
               Iterator<String> iterador = carrito.iterator();
        while(iterador.hasNext()){
            String producto = iterador.next();
            System.out.println(producto);
        }
               break;
           case 2:
                System.out.println("Introduce un nuevo producto: ");
            carrito.add(sc.nextLine());   
               break;
           case 3:
               System.out.println("¿Cual prodcuto deseas remover?");
               carrito.remove(sc.nextLine());
               break;
           case 4:
               System.out.println("¿Escribe el producto que quieres buscar?");
               String prodBuscado=sc.nextLine();
               System.out.println((carrito.contains(prodBuscado))?prodBuscado+"Esta en la lista":"No esta el producto");
               break;
               
           case 5:
               System.out.println("Elegistes salir");
               break;
           default:
               System.out.println("Opcion no encontrada te has equivocado!!");
               break;
       }
       
  
}while(opcion!=5);
        }
}

        