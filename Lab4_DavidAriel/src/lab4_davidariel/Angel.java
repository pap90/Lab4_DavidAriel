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
public class Angel extends Ancestral{
    private Color color;
    private String descripcion;
    private Color sangre;
    private String fechaencontrado;
    private String nombre;
    private String volar;
    private int potenciaAT;

    public Angel() {
    }
    
    

    public Angel(Color color, String descripcion, String fechaencontrado, String nombre, String volar, int potenciaAT) {
        this.color = color;
        this.descripcion = descripcion;
        this.sangre = Color.BLUE;
        this.fechaencontrado = fechaencontrado;
        this.nombre = nombre;
        this.volar = volar;
        this.potenciaAT = potenciaAT;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Color getSangre() {
        return sangre;
    }

    public void setSangre(Color sangre) {
        this.sangre = sangre;
    }

    public String getFechaencontrado() {
        return fechaencontrado;
    }

    public void setFechaencontrado(String fechaencontrado) {
        this.fechaencontrado = fechaencontrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVolar() {
        return volar;
    }

    public void setVolar(String volar) {
        this.volar = volar;
    }

    public int getPotenciaAT() {
        return potenciaAT;
    }

    public void setPotenciaAT(int potenciaAT) {
        this.potenciaAT = potenciaAT;
    }

    @Override
    public String toString() {
        return "Angel{" + "color=" + color + ", descripcion=" + descripcion + ", sangre=" + sangre + ", fechaencontrado=" + fechaencontrado + ", nombre=" + nombre + ", volar=" + volar + ", potenciaAT=" + potenciaAT + '}';
    }

    @Override
    public void moverse(String x, String y, Object[][] matriz) {
        
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
