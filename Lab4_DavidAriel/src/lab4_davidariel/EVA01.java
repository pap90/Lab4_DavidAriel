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
public class EVA01 extends Evas{
    
    private int x;
    private int y;
    
    public EVA01() {
    }

    public EVA01(int x, int y, Color color, double anio, double altura, String alma, int ojos, String pais, pilotos pilot, int codigo, double porcentaje) {
        super(color, anio, altura, alma, ojos, pais, pilot, codigo, porcentaje);
        this.x = x;
        this.y = y;
    }

    

    @Override
    public String toString() {
        return "EVA01"+super.toString();
    }
    
    @Override
    public void moverse(Object[][] matriz){
        Scanner sc=new Scanner(System.in);
        System.out.println("tip: solo puede mover un espacio");
        System.out.println("Ingrese coordenada x: ");
        int x=sc.nextInt();
        System.out.println("Ingrese la coordenada y: ");
        int y=sc.nextInt();
        if (x==(this.x)+1||(this.x)-1==x) {
            if (this.y+1==y||this.y-1==y) {
                matriz[this.y][this.x]=null;
                this.y=y;
                this.x=x;
                matriz[y][x]=this;
            }
            
        };        
    }
    @Override
    public void atacar(){
    }
    
    
}
