/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_davidariel;

import java.awt.Color;

/**
 *
 * @author david
 */
public class EVA02 extends Evas{

    public EVA02() {
    }

    public EVA02(Color color, double anio, double altura, String alma, int ojos, String pais, pilotos pilot, int codigo, double porcentaje) {
        super(color, anio, altura, alma, ojos, pais, pilot, codigo, porcentaje);
    }

    @Override
    public String toString() {
        return "EVA02"+super.toString();
    }
    
}
