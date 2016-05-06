/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Vista.VentanaMigración;
import Modelo.BD_Persona;
        
/**
 *
 * @author David
 */
public class Controlador_Personas implements ActionListener{
    
    private BD_Persona bdPersona;
    private Vista.VentanaMigración ventana;
    
    public Controlador_Personas(VentanaMigración migracion)
    {
    this.bdPersona=new BD_Persona();
    this.ventana=new VentanaMigración();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    if(e.getActionCommand().equals("Agregar")){
            bdPersona.guardarpersona(ventana.regresarNombre());//suabe
            ventana.setJlMensajes("Se agrego con exito");
            ventana.limpiar();
            System.out.println(" " + bdPersona.tamanioArreglo());
        }
    
    
}
