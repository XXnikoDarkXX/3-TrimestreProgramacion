/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agendalinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class mainAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        
        byte opcion = 0;
        //Creamos un LinkedList que contendrá una clase Contacto
        LinkedList<Contacto> agenda = new LinkedList();
        do{
            try {
                System.out.println("Escribre una de las siguientes opciones\n\t1- Introducir contacto\n\t2- Modificar contacto\n\t3- Borrar contacto"
                + "\n\t4- Mostrar contactos\n\t0- Salir");

opcion = Byte.parseByte(sc.nextLine());
            switch (opcion) {
                case 0:
                    System.out.println("Saliste!!!");
                    break;
                case 1:
                    //Añadimos el nombre y telefono del contacto declarando una variable de tipo contacto
                    //y luego en el Linkedlist se lo añadimos
                    System.out.println("Escribe el nombre que quieres introducir para el contacto");
                    String nombre = sc.nextLine();
                    System.out.println("Escribe su telefono");
                    String telefono = sc.nextLine();
                    Contacto objeto = new Contacto(nombre, telefono);
                    agenda.add(objeto);

                    break;
                case 2:
                    //Usaremos una id de los contacto
                    //que empieza desde 0 hasta el ultimo contacto añadido
                    //solo habra que elegir que contacto (id) se desa modificar
                    System.out.println("Estos son los contactos");
                    for (int i = 0; i < agenda.size(); i++) {
                        System.out.println("ID: "+i+" "+agenda.get(i));
                    }
                    System.out.println("Escribe el contacto (ID) que deseas mofificar:");
                    byte numero=Byte.parseByte(sc.nextLine());//el numero del array del contacto
                    modificarContacto(numero,agenda);
                    
                    break;
                case 3:
                    System.out.println("Estos son los contactos: ");
                    for (int i = 0; i < agenda.size(); i++) {
                        System.out.println(agenda.get(i));
                    }
                   System.out.println("Escribe el telefono del contacto que deseas elminar");
                    telefono=sc.nextLine();
                    System.out.println("Asi te ha quedado la agenda:");
                    borrarContacto(telefono,agenda);
                    for (int i = 0; i < agenda.size(); i++) {
                        System.out.println(agenda.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Estos son los contactos:");
                    for (int i = 0; i < agenda.size(); i++) {
                        System.out.println(agenda.get(i));
                    }
                    
                    break;
                    
            }
                
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }


        }while(opcion!=0);

    }
    /**
     * En esta funcion vamos a borrar un contacto por medio del telefono
     * mediante un for iremos comprobando que la collecion contenga ese telefono y si en una iteracion lo contine
     * dicho contacto sera borrado
     * @param telefono telefono del contacto
     * @param cont LinkedList con todos los contactos
     */
    public static void borrarContacto(String telefono,LinkedList cont){
        LinkedList <Contacto> contactoDevuelto=new LinkedList();
        contactoDevuelto=cont;
        for (int i = 0; i < cont.size(); i++) {
           
               if (contactoDevuelto.get(i).getTelefono().equalsIgnoreCase(telefono)) {
                contactoDevuelto.remove(i);
            }
        
        }
        cont=contactoDevuelto;
    }
    /**
     * Mediante esta funcion lo que hacemos es buscar la id de contacto elegido
     * y luego en do while poder ir cambiando todo acerca de ese contacto
     * @param numero id del contacto que deseamos modificar
     * @param cont Linkedlis donde tendremos los contactos
     */
    public static void modificarContacto(byte numero,LinkedList cont){
        Scanner sc=new Scanner (System.in);
         LinkedList <Contacto> contactoDevuelto=new LinkedList();
         contactoDevuelto=cont;
         byte opcion;
         int comprobacion=0;
        for (int i = 0; i < cont.size(); i++) {
            
            if (numero==i) {//Tiene que coincider el numero del contacto elegido con la iteracion del for
                comprobacion=1;
               do{
                   System.out.println("Escribe una de las siguiens opciones para modificar el contacto\n\t1- Nombre"
                           + "\n\t2-telefono\n\t0-Salir");
                   opcion=Byte.parseByte(sc.nextLine());
                   switch(opcion){
                       case 1:
                           System.out.println("Escribe el nuevo nombre ");
                           String nombre=sc.nextLine();
                           contactoDevuelto.get(i).setNombre(nombre);
                           break;
                           
                       case 2:
                           System.out.println("Escribe el nuevo telefono");
                           String telefono=sc.nextLine();
                           contactoDevuelto.get(i).setTelefono(telefono);
                           break;
                       case 3:
                           System.out.println("terminanstes de modificar");
                           break;
                   }
               }while(opcion!=0);
            }
        }
        
        if (comprobacion==0) {
            System.out.println("El contacto no existe");
        }
        cont=contactoDevuelto;
        
        
    }
            

}
