/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_davidariel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Lab4_DavidAriel {

    static ArrayList<Evas> e = new ArrayList();
    static ArrayList<Angel> a = new ArrayList();
    static ArrayList<pilotos> pilot = new ArrayList();
    static Scanner leer = new Scanner(System.in);
    static int opcion;

    public static void main(String[] args) {
        crear();
        char resp = 's';
        do {
            switch (menu()) {
                case 1:
                    //lista de evas
                    break;
                case 2:
                    //lista de angeles

                    break;
                case 3:
                    //crud de los pilotos
                    char res = 's';
                    do {
                        System.out.println("Ingrese una opcion:");
                        System.out.println("-------------------");
                        System.out.println("1.Crear");
                        System.out.println("2.Modificar");
                        System.out.println("3.Eliminar");
                        System.out.println("4.Listar");
                        System.out.println("-------------------");
                        int op = leer.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Ingrese el nombre:");
                                String nombre = leer.next();
                                System.out.println("Ingrese la edad:");
                                int edad = leer.nextInt();
                                System.out.println("Ingrese nombre del familiar:");
                                String familia = leer.next();
                                System.out.println("Ingrese el encargado del nerv");
                                String nerv = leer.next();
                                System.out.println("Ingrese la escuela a la que asiste:");
                                String escuela = leer.next();
                                System.out.println("Ingrese el porcentaje de Eva:");
                                double por = leer.nextDouble();
                                System.out.println("Ingrese el eva asignado");
                                String asignado = leer.next();
                                pilot.add(new pilotos(nombre, edad, familia, nerv, escuela, por, asignado));
                                System.out.println("Se ha creado un nuevo piloto");
                                break;
                            case 2:
                                System.out.println("Es hora de modificar algo:");
                                System.out.println("Ingrese lo que desee modificar:");
                                System.out.println("1.Nombre");
                                System.out.println("2.Edad");
                                System.out.println("3.familiar");
                                System.out.println("4.encargado");
                                System.out.println("5.escuela");
                                System.out.println("6.porcentaje");
                                System.out.println("7.eva asiganado");

                                break;
                            case 3:

                                for (pilotos angel : pilot) {
                                    System.out.println("Pilotos:" + angel);
                                }
                                System.out.println("Ingrese un numero para poder eliminarlo:");
                                int posi = leer.nextInt();
                                pilot.remove(posi);
                                System.out.println("Ya se ha eliminado de la lista");

                                break;
                            case 4:
                                System.out.println("Estos son todos los pilotos que tiene agregados");
                                for (pilotos angel : pilot) {
                                    System.out.println("Pilotos:" + angel);
                                }
                                break;
                            default:
                                System.out.println("Esta mala esa opcion:");
                        }
                        System.out.println("Quiere seguir[S/N]:");
                        res = leer.next().charAt(0);
                    } while (res == 's' || res == 'S');
                    break;
                case 4:
                    Object mat[][] = new Object[10][10];
                    mat[0][2] = 'R';
                    mat[0][7] = 'R';
                    mat[1][1] = 'Z';
                    mat[1][8] = 'Z';
                    mat[1][4] = 'S';
                    mat[1][5] = 'S';
                    mat[3][7] = 'Z';
                    mat[7][2] = 'E';
                    mat[9][0] = 'P';
                    mat[9][2] = 'P';
                    mat[9][4] = 'E';
                    mat[9][6] = 'E';
                    mat[9][7] = 'P';
                    mat[9][9] = 'P';
                    imprimir(mat);
                    break;
                case 5:
                    System.out.println("Se termino todo");
                    break;
                default:
                    System.out.println("Ingreso una opcion equivocada");
            }//fin del switch

            System.out.println("desea quedarse en el programa?[S/N]:");

            System.out.println("desea seguir? [S/N]:");
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

    public static void crear() {
        a.add(new Ramiel(Color.yellow, "Un angel muy fuerte", "2/ago/1998", "rammy", "si", 200));
        a.add(new Ramiel(Color.LIGHT_GRAY, "legendario", "3/sep/2003", "randy", "si", 400));
        a.add(new Sachiel(Color.RED, "hijo de el mismo adan", "4/ene/2007", "sachy", "si", 600));
        a.add(new Sachiel(Color.yellow, "te destruyen", "20/septiembre/1994", "sach", "si", 100));
        for (int i = 0; i < 4; i++) {
            a.add(new Zeruel(Color.yellow, "fox", "21/marzo/2000", "zezima", "si", 4000));
        }

    }
}
