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
public class EVA01 extends Evas{

    public EVA01() {
    }

    public EVA01(Color color, double anio, double altura, String alma, int ojos, String pais, pilotos pilot, int codigo, double porcentaje) {
        super(color, anio, altura, alma, ojos, pais, pilot, codigo, porcentaje);
    }

    @Override
    public String toString() {
        return "EVA01"+super.toString();
    }
    
    @Override
    public void moverse(String x, String y, Object[][] matriz){
    }
    @Override
    public void atacar(){
    }
    
    
}
