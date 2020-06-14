/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaenumerados;

/**
 *
 * @author nicoc
 */
public class AgendaMensual {
    private byte diaDelMes;//dia del mes valor numeérico entre 1 y 31
    private String actividad;//actividad
    private String descripcion;//Descripcion
    private boolean confirmado;//Confirmacion
    
   /**
    * Contructor de Agenda con todos los parametros
    * @param dia dia del mes debe de ser entre 0 y 31
    * @param ac actividad
    * @param des descripcion
    * @param con confirmacion
    */
    public AgendaMensual(byte dia,String ac,String des,boolean con){
     
        this.diaDelMes=dia;
        this.actividad=ac;
        this.descripcion=des;
        this.confirmado=con;
        
    }
    /**
     * Contructor AgendaMensual vacio
     */
    public AgendaMensual(){
        
    }
    
    /**
     * Getter diaDelMes
     * @return el dia del mes
     */
    public byte getDiaDelMes() {
        return diaDelMes;
    }
    
    /**
     * Getter de Actividad
     * @return la actividad
     */
    public String getActividad() {
        return actividad;
    }
    
    /**
     * Getter de Descripcion
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Getter del Confirmado
     * @return Confirmado
     */
    public boolean isConfirmado() {
        return confirmado;
    }
    
    /**
     * Setter del dia del mes
     * @param diaDelMes a cambiar
     */
    public void setDiaDelMes(byte diaDelMes) {
        this.diaDelMes = diaDelMes;
    }
    
    /**
     * Setter de actividad
     * @param actividad a cambiar
     */
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    /**
     * Setter de Descripcion
     * @param descripcion a cambiar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Setter de Confimado
     * @param confirmado True si esta confirmado y false si no
     */
    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    @Override
    public String toString() {
        return "AgendaMensual{" + "diaDelMes=" + diaDelMes + ", actividad=" + actividad + ", descripcion=" + descripcion + ", confirmado=" + confirmado + '}'+"\n";
    }
    
    
    
    
}
