/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Fabrica.Fabrica_Persona;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author David
 */
public class BD_Persona {
    ArrayList<Persona>arregloPersonas;
    private Fabrica_Persona fabrica;

    public BD_Persona( ) {
        arregloPersonas=new ArrayList<Persona>();
        fabrica=new Fabrica_Persona();
    }
    
       public void guardarpersona(String nombre) {
        arregloPersonas.add(fabrica.getPersona(nombre));
        System.out.println("No hay error");
    }
    public int tamanioArreglo(){
        return arregloPersonas.size();
    }
    public Persona regresaPersona(int posicion){
       
        return arregloPersonas.get(posicion);
    }
    public ArrayList arregloPersonas(){
        return arregloPersonas;
    }
    public void setPresona(ArrayList object){
        if(object!=null)
        arregloPersonas=object;
    }
    
    
    
    
    
}
