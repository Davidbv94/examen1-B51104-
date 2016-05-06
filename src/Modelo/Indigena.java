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
public class Indigena implements  Persona{

   
    private String nombre;
    private int cantidaDias;

    public Indigena(String nombre) 
    {
        this.nombre = nombre;
      
    }

    public Indigena(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    @Override
    public String id()
    {
    return id;//arreglar
    }
    
    public int cantidaDias()
    {
    return -1;
    }
    
    
}
