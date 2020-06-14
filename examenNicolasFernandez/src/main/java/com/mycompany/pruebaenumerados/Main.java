/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaenumerados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author nicoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio 1 Assert
        adivinaAleatorio();

        TreeMap<Byte, AgendaMensual> actividadesOrdenadas = new TreeMap<Byte, AgendaMensual>();

        byte opcion;
        do {
            AgendaMensual agenda = new AgendaMensual();
            System.out.println("Escribe una de las siguientes opciones \n\t1-Insertar Actividad\n\t2-Mostrar Actividades"
                    + "\n\t3-Insertar en base de datos\n\t4-Salir");
            opcion = Byte.parseByte(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Dime el dia que quieres insertar la actividad recuerda que debe ser del 1 al 31");
                    byte dia = Byte.parseByte(sc.nextLine());
                    while (dia <= 0 || dia > 31) {
                        System.out.println("Dime el dia que quieres insertar la actividad recuerda que debe ser del 1 al 31");
                        dia = Byte.parseByte(sc.nextLine());
                    }

                    System.out.println("Dime el nombre de la activiad");

                    String actividad = sc.nextLine();

                    System.out.println("Dime la descripcion de la actividad");
                    String descripcion = sc.nextLine();
                    System.out.println("Dime si esta confimado si o no");
                    String confirmacion = sc.nextLine();

                    agenda.setActividad(actividad);
                    agenda.setDiaDelMes(dia);
                    agenda.setDescripcion(descripcion);
                    if (confirmacion.equalsIgnoreCase("si")) {
                        agenda.setConfirmado(true);
                    } else if (confirmacion.equalsIgnoreCase("no")) {
                        agenda.setConfirmado(false);
                    }

                    actividadesOrdenadas.put(dia, agenda);

                    break;

                case 2:

                    System.out.println(actividadesOrdenadas.toString());

                    break;

                case 3:
                    añadirBaseDatos(actividadesOrdenadas);
                    break;
                case 4:
                    System.out.println("Salistes del programa");
                    break;

            }

        } while (opcion != 4);

    }

    /**
     * Funcion para adivinar un nhumero, en la cual usamos un contador para
     * saber cuantos intentos tiene cuando haya 0 intentos pasara por un if y
     * mediante un assert se cancelara el programa
     */
    public static void adivinaAleatorio() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int numeroAleatorio;//numero aleatorio
        int escribirNumero;//variable que usaremos para escribir el número
        numeroAleatorio = r.nextInt(9) + 1;
        System.out.println("El numero aleatorio es " + numeroAleatorio);
        int contador = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("Esribe un numero de 1 al 10 solo tienes 3 oportunidades");
            escribirNumero = Integer.parseInt(sc.nextLine());
            if (escribirNumero == numeroAleatorio) {
                System.out.println("Adivinistes el numero");
                break;
            } else {
                contador--;
                System.out.println("Quedan " + contador + " intentos");
            }

            if (contador == 0 && escribirNumero != numeroAleatorio) {

                assert escribirNumero == numeroAleatorio : String.format("No has adivinado el numero", escribirNumero);

            }
        }

        String mensaje = "";

    }

        /**
         * He intenado hacer esta funcion pero me ha sido imposible si no puedo iterar en el treemap 
         * @param agenda
         * @throws SQLException 
         */
    public static void añadirBaseDatos(TreeMap<Byte, AgendaMensual> agenda) throws SQLException {
        //Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
        //   Statement smt = con.createStatement();//Crear la consulta
        AgendaMensual objeto = new AgendaMensual();

        Collection c = agenda.values();
        
        Iterator itr = c.iterator();
         TreeMap<Object, Object> foo = new TreeMap<Object, Object>();
    
        
        
        while (itr.hasNext()) {
           
          
           
           System.out.println(itr.next());

            //   smt.close();
            //   con.close();
        }

    }
}
