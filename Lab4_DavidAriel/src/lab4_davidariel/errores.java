/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_davidariel;

import java.awt.Color;

/**
 *
 * @author ariel
 */
public class errores extends Exception {

    private Color color;

    public errores() {
        super();
    }

    public errores(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "errores{" + "color=" + color + '}';
    }

}//fin de la clase
