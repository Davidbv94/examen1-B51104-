/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author David
 */
public class Cuidadano implements Persona{
 
    private String nombre;
    private int cantidaDias;

    public Cuidadano(String nombre,int cantidaadDias) {
        this.nombre = nombre;
        this.cantidaDias=cantidaadDias;
    }

    public Cuidadano(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidaDias() {
        return cantidaDias;
    }

    public void setCantidaDias(int cantidaDias) {
        this.cantidaDias = cantidaDias;
    }
    
    
   public String id()
   {    
   return id;//corrrgir
   }
   
   public int cantidadDias()
   {
   return 30;
   }
    
}
