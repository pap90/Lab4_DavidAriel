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
public class Ramiel extends Angel {

    private int y;
    private int x;

    public Ramiel() {
        super();
    }

    public Ramiel(int y, int x, Color color, String descripcion, String fechaencontrado, String nombre, String volar, int potenciaAT) {
        super(color, descripcion, fechaencontrado, nombre, volar, potenciaAT);
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Ramiel{" + "y=" + y + ", x=" + x + '}';
    }

    @Override
    public void moverse(Object[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tip: solo puede mover un espacio");
        System.out.println("Ingrese coordenada x: ");
        int x = sc.nextInt();
        System.out.println("Ingrese la coordenada y: ");
        int y = sc.nextInt();
        if (x == (this.x) + 1 || (this.x) - 1 == x) {
            if (this.y + 1 == y || this.y - 1 == y) {
                matriz[this.y][this.x] = null;
                this.y = y;
                this.x = x;
                matriz[y][x] = this;
            }

        };
    }

    @Override
    public void atacar() {
    }

}
