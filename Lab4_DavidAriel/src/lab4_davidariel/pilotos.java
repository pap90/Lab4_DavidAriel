/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_davidariel;

/**
 *
 * @author ariel
 */
public class pilotos {
    private String nombre;
    private int edad;
    private String familiar;
    private String encargado;
    private String escuela;
    private double sincronizacion;
    private String asignado;

    public pilotos() {
    }

    public pilotos(String nombre, int edad, String familiar, String encargado, String escuela, double sincronizacion, String asignado) {
        this.nombre = nombre;
        this.edad = edad;
        this.familiar = familiar;
        this.encargado = encargado;
        this.escuela = escuela;
        this.sincronizacion = sincronizacion;
        this.asignado = asignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFamiliar() {
        return familiar;
    }

    public void setFamiliar(String familiar) {
        this.familiar = familiar;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getSincronizacion() {
        return sincronizacion;
    }

    public void setSincronizacion(double sincronizacion) {
        this.sincronizacion = sincronizacion;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    @Override
    public String toString() {
        return "pilotos{" + "nombre=" + nombre + ", edad=" + edad + ", familiar=" + familiar + ", encargado=" + encargado + ", escuela=" + escuela + ", sincronizacion=" + sincronizacion + ", asignado=" + asignado + '}';
    }
    
    
    
    
}
