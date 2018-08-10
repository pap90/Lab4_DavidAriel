/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_davidariel;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Lab4_DavidAriel {

    static Scanner leer = new Scanner(System.in);
    static int opcion;

    public static void main(String[] args) {
        char resp = 's';
        do {
            switch (menu()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Object mat[][] = new Object[11][11];
                    imprimir(mat);
                    

                    break;
                case 5:
                    System.out.println("Se termino todo");
                    break;
                default:
                    System.out.println("Ingreso una opcion equivocada");
            }//fin del switch
            System.out.println("Se desea salir[S/N]:");
            resp = leer.next().charAt(0);

        } while (resp == 'S' || resp == 's');

    }

    static void imprimir(Object[][] mat) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat[i][j] == (null)) {
                    System.out.print("[" + " " + "]");
                } else {
                    System.out.print("[" + mat[i][j] + "]");
                }
            }
            System.out.println();
        }
    }

    static int menu() {
        System.out.println("Bienvenido!!!!!!!!!!!!!");
        System.out.println("---------------------------");
        System.out.println("1.Listas de Evas");
        System.out.println("2.Lista de Angeles");
        System.out.println("3.CRUD");
        System.out.println("4.Simulacion");
        System.out.println("5.Salir");
        System.out.println("----------------------------");
        System.out.print("Ingrese una opcion: ");
        opcion = leer.nextInt();
        return opcion;

    }//Fin del menu

}
