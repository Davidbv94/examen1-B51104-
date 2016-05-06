/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;
import Modelo.Cuidadano;
import Modelo.Indigena;
import Modelo.Migrante;
import Modelo.Refugiado;
import Modelo.Persona;
/**
 *
 * @author David
 */
public class Fabrica_Persona {
    
    private Persona visitante;
    
    public Persona getPersona(String nombre)
    {
    switch(nombre){
            case "Cuidadano":
                visitante=new Cuidadano (nombre);
             break;
            case "Indigena":
                visitante= new Indigena(nombre);
                break;
            case "Migrante":
                visitante= new Migrante(nombre);
                break;
            case "Refigiado":
                visitante=new Refugiado(nombre);
        }
        return visitante;
    }
    
}
