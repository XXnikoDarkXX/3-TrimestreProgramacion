/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcularnotas;

/**
 * Clase Alumno donde alojaremos diferentes variables que tenga que ver con el alumno asi, como una clase interna
 * de notas
 *
 * @author nicoc
 */

public class Alumno implements Calificaciones {
    
    
    
    
    /**
     * Enumerados de Asignatura
     */
            enum Asignatura {
            bbdd,
            programacion,
            vacio//etiqueta de BBDD
            
        }

    /**
     * Clase interna de alumno en la cual usaremos asignatura y calificacion
     */
    private  class Nota {

        /**
         * Enumerado de Asignatura el cual contiene las etiquetas bbdd y
         * programacion
         */

        Asignatura asig;// variable de tipo enum usada para asignatura del alumno

        private byte calificacion;//calificacion valor entre 0 - 10
        
        /*
        Constructor de Nota vacio
        */
        Nota() {

        }

        public Asignatura devuelveAsignatura(String asignatura) {

            if (asignatura.equalsIgnoreCase("bbdd")) {

                return Asignatura.bbdd;
            } else {
                return Asignatura.programacion;
            }

        }

        /**
         * Getter de asignatura
         *
         * @return la asignatura
         */
        /*  public String getAsignatura() {
            return asignatura;
/
        /**
         * Getter de calificación
         *
         * @return la calificación
         */
        public byte getCalificacion() {
            return calificacion;

        }

        /**
         * Setter de asignatura
         *
         * @param asignatura asignatura a cambiar
         */
        public void setAsignatura(String asignatura) {
            if (asignatura.equalsIgnoreCase("bbdd")) {
                this.asig = Asignatura.bbdd;
            }
            if (asignatura.equalsIgnoreCase("programacion")) {
                this.asig = Asignatura.programacion;
            }
            if (!(asignatura.equalsIgnoreCase("programacion") || asignatura.equalsIgnoreCase("bbdd"))) {
                this.asig = Asignatura.vacio;
            }
        }

        /**
         * Setter de calificacion 
         * @param calificacion byte a establecer
         * @return 0 si esta bien -1 si esta mal
         */
     public int setCalificacion(byte calificacion) {
            if (calificacion >= 0 && calificacion <= 10) {
                this.calificacion = calificacion;
                return 0;
            } else {
                return -1;
            }
        }

    }

    /*
    
     */
    private String nombre;//Nombre de la persona
    private int edad;//Edad de la persona entre 18 y 99
    private Nota notas[];//Array de objeto de notas

    /**
     * Contructor Alumnos con todas sus variables
     *
     * @param n nombre del alumno
     * @param e edad del alumno
     * @param no array[] notas de alumno
     */
    public Alumno(String n, int e, Nota no[]) {
        this.nombre = n;
        this.edad = e;
        this.notas = no;
        no = notas; //No me deja instanciarlo así probar primero con su propio constructor privado

        // this.notas=new Nota(asignatura,calificacion);
    }

    /**
     * Constructo Alumno vacio
     */
    public Alumno() {

    }

    /**
     * Getter de nombre
     *
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getter de edad
     *
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Getter de notas
     *
     * @return
     */
    public Nota[] getNotas() {
        return notas;
    }

    /**
     * Setter de nombre
     *
     * @param nombre nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter de edad
     *
     * @param edad edad de la persona debe de ser de 18 a 99 Gestión de
     * errores--> nos devolverá 0 en caso de estar bien y -1 si está mal
     */
    public byte setEdad(int edad) {
        this.edad = edad;
        if (edad >= 18 && edad <= 99) {
            return 0;
        }
        return -1;

    }

 

    /**
     * Comprobamos si las notas son programacion o bbdd y si no lo son le
     * ponenmos a la asignatura un ""
     *
     * @param notas
     */
    public void setNotas(Nota[] notas) {
        this.notas = notas;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i].asig.equals(notas[i].asig.bbdd) || notas[i].asig.equals(notas[i].asig.programacion)) {

            } else {
                notas[i].asig = notas[i].asig.vacio;
            }

        }

    }

    /**
     *Metodo para establecer las notas[] creamos un nuevo objeto de tipo nota y le vamos cargando 
     * usando los arrays[]de los parametros
     * @param no objeto Nota a la cual vamos a usar su longitud
     * @param asignaturas arrays de asignaturas
     * @param calificacion arrays de calificaiones
     */
    public void establecerNotas(Nota[] no, String[] asignaturas, byte[] calificacion) {

        for (int i = 0; i < no.length; i++) {
            Nota objeto = new Nota();//Creamos el nuevo objeto de tipo nota
            objeto.setAsignatura(asignaturas[i]); //le vamnos asignando los valores de los arrays
            objeto.setCalificacion(calificacion[i]);
            this.notas[i] = objeto;//al finalizar se lo asignamos a nota
        }

    }
/**
 * Metodo para establecer la cantidad de nuestra variable interna this.nota
 * @param cantidad cantidad a establecer
 */
    public void establecerCantidadNotas(byte cantidad) {
        this.notas = new Nota[cantidad];
    }

    public void ajustarNotas() {
        byte cantidad = 0;
        for (int i = 0; i < this.notas.length; i++) {
            if (notas[i].asig.equals(notas[i].asig.bbdd) || notas[i].asig.equals(notas[i].asig.programacion)) {
                cantidad++;
            }
        }
        Nota[] notaAjustada = new Nota[cantidad];
        byte contador = 0;
        for (int i = 0; i < notas.length; i++) {
           
            if (notas[i].asig.equals(notas[i].asig.bbdd) || notas[i].asig.equals(notas[i].asig.programacion)) {
                notaAjustada[contador] = notas[i];
                contador++;
            }
        }
        this.notas = notaAjustada;
    }

    @Override
    public String toString() {
        
        String datosNotas = " ";
        for (int i = 0; i < this.getNotas().length; i++) {
        
           
            if (notas[i].asig.equals(this.notas[i].asig.bbdd)) {
                datosNotas+="BBDD : ";
            }else{
                datosNotas+="Programacion : ";
            }
             datosNotas += notas[i].calificacion + "\n";
        }
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad +"\n"+ datosNotas+"}";
    }

    /**
     * Metodo para calcular nota pedido por parametros debe de ser programacion o bbdd
     * en caso de que no sea ninguna de esa condicion devolverá un -1 de error
     * @param asignaturas asignatura pedido por parametros
     * @return la nota media de la asignatura
     */
    @Override
    public float calcularNotas(String asignaturas) throws Exception{

        float media = 0;

        byte indice = 0;
       
        switch (asignaturas) {
            case "bbdd":
            case "BBDD":

                for (int i = 0; i < notas.length; i++) {
                     if (this.notas[i].asig == this.notas[i].asig.bbdd) {
                         if (this.notas[i].getCalificacion()>=5) {
                             media = media + this.notas[i].getCalificacion();//total la suma de la calificacion por ejemplo de bbdd
                        indice++;//cuantas hay por ejemplo de bbdd
                         }else{
                             Exception miError=new Exception("Error el alumno tiene alguna nota susensa, no se podrá hacer la nota media");
                             throw  miError ;
                         }
                        
                    }
                }
                break;
            case "programacion":
            case "PROGRAMACION":
                for (int i = 0; i < notas.length; i++) {
                    if (this.notas[i].asig == this.notas[i].asig.programacion) {
                        if (notas[i].getCalificacion()>5) {
                             media = media + this.notas[i].getCalificacion();//total la suma de la calificacion por ejemplo de bbdd
                        indice++;//cuantas hay por ejemplo de bbdd
                        }else{
                             Exception miError=new Exception("Error el alumno tiene alguna nota susensa, no se podrá hacer la nota media");
                             throw  miError ;
                         }
                       
                    }
                                    
        }
                break;
            default:
                return -1;
        }  
                   
                   
        if (indice==0) {
            return -1;
        }
                media = media / indice;
                
                return media;

        }
    

    }
