/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_davidariel;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ramiel extends Angel{

    public Ramiel() {
    super();
    }

    public Ramiel(Color color, String descripcion, String fechaencontrado, String nombre, String volar, int potenciaAT) {
        super(color, descripcion, fechaencontrado, nombre, volar, potenciaAT);
    }

    @Override
    public void moverse(String x, String y, Object[][] matriz){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la coordenada x: ");
        x=sc.next();
        System.out.println("Ingrese coordenada y: ");
        y=sc.next();
    }
    @Override
    public void atacar(){
    }
    
    
}
