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
public class Evas extends Ancestral {

    private Color color;
    private double anio;
    private double altura;
    private String alma;
    private int ojos;
    private String pais;
    private pilotos pilot;
    private int codigo;
    private double porcentaje;

    public Evas() {
    }

    public Evas(Color color, double anio, double altura, String alma, int ojos, String pais, pilotos pilot, int codigo, double porcentaje) {
        this.color = color;
        this.anio = anio;
        this.altura = altura;
        this.alma = alma;
        this.ojos = ojos;
        this.pais = pais;
        this.pilot = pilot;
        this.codigo = codigo;
        this.porcentaje = porcentaje;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getAnio() {
        return anio;
    }

    public void setAnio(double anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public pilotos getPilot() {
        return pilot;
    }

    public void setPilot(pilotos pilot) {
        this.pilot = pilot;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    

    @Override
    public void moverse(Object[][] matriz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Evas{" + "color=" + color + ", anio=" + anio + ", altura=" + altura + ", alma=" + alma + ", ojos=" + ojos + ", pais=" + pais + ", pilot=" + pilot + ", codigo=" + codigo + ", porcentaje=" + porcentaje + '}';
    }
    
    


}//fin de la clase
