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
public class Celador {

    String saludar() {
        return "Buenos dias";
    }

    String saludar(boolean ebrio, boolean genero, boolean gafas) {

        if (gafas == true) {
            if (genero == true) {
                if (ebrio == true) {
                    return "TLR y no se le olviden las gafas";
                } else {
                    return "TLR y no se le olviden las gafas";
                }
            } else {
                if (ebrio == true) {
                    return "fuera de aquí y no se le olviden las gafas!!";
                } else {
                    return "hola doctor, no se le olviden las gafas";
                }
            }
        } else {
            if (genero == true) {
                if (ebrio == true) {
                    return "TLR";
                } else {
                    return "TLR";
                }
            } else {
                if (ebrio == true) {
                    return "fuera de aquí!!";
                } else {
                    return "hola doctor";
                }
            }
        }

    }
}
