/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueaderos;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main(String[] args){
        
        Celador celador=new Celador();
        Propietario propietario1=new Propietario(0,false,false);
        Propietario propietario2=new Propietario(5,true,false);
        Propietario propietario3=new Propietario(0,false,false);
        Propietario propietario4=new Propietario(0,true,false);
        
        boolean gradoAlcohol;
        boolean genero;
        boolean gafas;
        int x;
        String respuesta;
        x=propietario1.getNivelAlcohol();
        gradoAlcohol=propietario1.estadoAlcohol(x);
        genero=propietario1.isGenero();
        gafas=propietario1.isGafas();
        
        respuesta=celador.saludar(gradoAlcohol, genero, gafas);
        System.out.println(respuesta);
        
        x=propietario2.getNivelAlcohol();
        gradoAlcohol=propietario2.estadoAlcohol(x);
        genero=propietario2.isGenero();
        gafas=propietario2.isGafas();
        
        respuesta=celador.saludar(gradoAlcohol, genero, gafas);
        System.out.println(respuesta);
        
        x=propietario3.getNivelAlcohol();
        gradoAlcohol=propietario3.estadoAlcohol(x);
        genero=propietario3.isGenero();
        gafas=propietario3.isGafas();
        
        respuesta=celador.saludar(gradoAlcohol, genero, gafas);
        System.out.println(respuesta);
        x=propietario4.getNivelAlcohol();
        gradoAlcohol=propietario4.estadoAlcohol(x);
        genero=propietario4.isGenero();
        gafas=propietario4.isGafas();
        
        respuesta=celador.saludar(gradoAlcohol, genero, gafas);
        System.out.println(respuesta);
        
    }
    
}
