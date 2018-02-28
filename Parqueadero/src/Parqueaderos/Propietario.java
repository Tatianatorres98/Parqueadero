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
public class Propietario {

    int nivelAlcohol;
    boolean genero;
    boolean gafas;

    boolean estadoAlcohol(int nivelAlcohol) {

        if (nivelAlcohol > 1) {
            return true;
        } else {
            return false;
        }
    }

    public Propietario(int nivelAlcohol, boolean genero, boolean gafas) {
        this.nivelAlcohol = nivelAlcohol;
        this.genero = genero;
        this.gafas = gafas;
    }

    public int getNivelAlcohol() {
        return nivelAlcohol;
    }

    public boolean isGenero() {
        return genero;
    }

    public boolean isGafas() {
        return gafas;
    }


    
    

}
