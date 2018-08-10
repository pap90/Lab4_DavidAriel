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
public class Zeruel extends Angel{

    public Zeruel() {
        super();
    }

    public Zeruel(Color color, String descripcion, String fechaencontrado, String nombre, String volar, int potenciaAT) {
        super(color, descripcion, fechaencontrado, nombre, volar, potenciaAT);
    }

    @Override
    public void moverse(Object[][] matriz){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la coordenada x: ");
        
        System.out.println("Ingrese coordenada y: ");
        
    }
    @Override
    public void atacar(){
        
    }
    
    
    
}
