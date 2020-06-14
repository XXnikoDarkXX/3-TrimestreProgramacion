/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author nicoc
 */
public class Bombilla {

    private boolean estado;//Dirá si esta apagado o encendida la bombilla (Por defecto esá apagdo)
    private int potencia;//Potencia en vatios
    private String color;//Color de la bombilla
    private float horas;//Horas que puede estar encendida la bombilla por defecto son 10

    /**
     * Constructor con todas las variables de Bombilla
     *
     * @param es estado de la bombilla
     * @param po potencia de la bobilla
     * @param co color de la bombilla
     * @param hr horas que tiene la bombilla por defecto lo ponemos a 10 hr
     */
    public Bombilla(boolean es, int po, String co, float hr) {
        this.estado = es;
        this.potencia = po;
        this.color = co;
        this.horas = hr;
        hr = 10f;

    }

    public boolean isEstado() {
        return estado;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getColor() {
        return color;
    }

    public float getHoras() {
        return horas;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    /**
     * Metodo que si quedan horas enciende la bombilla y resta las horas
     * encendidas por el parametro tiempo
     *
     * @param tiempo Tiempo que está encendido
     */
    public void encender(float tiempo) {
        this.setEstado(true);
        this.setHoras(horas - tiempo);
    }
    /**
     * Metodo para poner el estado a false (apagamos la bombilla)
     */
   public void apagar(){
       this.estado=false;
   }
   /**
    * Metodo para establecer la potencia de la bombilla
    * @param potente potencia de la bombilla
    */
   public void cambiaPotencia(int potente){
       this.potencia=potente;
              
   }
   /**
    * 
    * @param col 
    */
   public void cambiaColor(String col){
       if (this.isEstado()==true) {
           this.apagar();
            this.color=col;
       }else{
           this.color=col;
       }
   }
}
