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
public class EVAPM extends Evas{

    public EVAPM() {
    }

    public EVAPM(Color color, double anio, double altura, String alma, int ojos, String pais, pilotos pilot, int codigo, double porcentaje) {
        super(color, anio, altura, alma, ojos, pais, pilot, codigo, porcentaje);
    }

    @Override
    public String toString() {
        return "EVAPM" +super.toString();
    }
    
}
