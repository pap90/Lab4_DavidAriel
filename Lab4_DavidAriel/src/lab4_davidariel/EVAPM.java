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
public class EVAPM extends Evas {

    private int y;
    private int x;

    public EVAPM() {
    }

    public EVAPM(int y, int x, Color color, double anio, double altura, String alma, int ojos, String pais, pilotos pilot, int codigo, double porcentaje) {
        super(color, anio, altura, alma, ojos, pais, pilot, codigo, porcentaje);
        this.y = y;
        this.x = x;
    }

    

    @Override
    public String toString() {
        return "EVAPM" + super.toString();
    }

    @Override
    public void moverse(Object[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tip: solo puede mover un espacio");
        System.out.println("Ingrese coordenada x: ");
        int x = sc.nextInt();
        System.out.println("Ingrese la coordenada y: ");
        int y = sc.nextInt();

        matriz[this.y][this.x] = null;
        this.y = y;
        this.x = x;
        matriz[y][x] = this;
        ;
    }

}
