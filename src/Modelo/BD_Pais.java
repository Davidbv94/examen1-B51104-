package Modelo;
import Modelo.Pais;
/**
 *
 * @author David
 */
public class BD_Pais {
private int aleatorio;
Pais pais=new Pais() {
    @Override
    public String nombrePais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String idP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public void crearRandom()
  {
    this.aleatorio=(int)(Math.random()*5);
    aleatorio=(aleatorio+1);
    
    if(aleatorio==1)
    {
    idP="Canada";
    }
    if(aleatorio==2)
    {
    idP="Alemania";
    }
    if(aleatorio==3)
    {
    idP="Dubai";
    }
    if(aleatorio==4)
    {
    idP="Argentina";
    }
    if(aleatorio==5)
    {
    idP="Costa Rica";
    }
  
  }//random





}
