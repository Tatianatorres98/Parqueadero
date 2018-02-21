
package Parqueaderos;

import Vehiculos.Camion;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;


public class Parqueadero {
    public static void main(String[] args) {
        
        Vehiculo vehi;
        vehi=new Vehiculo();
        
        Moto moto1;
        moto1=new Moto();
        
        Camion cami;
        cami=new Camion();
        
        Fichavehiculo mificha;
        mificha=new Fichavehiculo();
        mificha.setVisible(true);
        mificha.mimoto=moto1;
        
        
       
    }
}
