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
        try {
            crear();
            char resp = 's';
            do {
                switch (menu()) {
                    case 1:
                        for (int i = 0; i < e.size(); i++) {
                            System.out.println(e.get(i).toString());
                        }
                        break;
                    case 2:
                        for (int i = 0; i < a.size(); i++) {
                            System.out.println(a.get(i).toString());
                        }

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
                                    int cont = 0;
                                    for (int i = 0; i < pilot.size(); i++) {
                                        System.out.println("piloto numero " + cont + pilot.get(i).toString());
                                        cont++;
                                    }
                                    System.out.println("Que piloto desea modificar?: ");
                                    int p = leer.nextInt();
                                    System.out.println("Es hora de modificar algo:");
                                    System.out.println("Ingrese lo que desee modificar:");
                                    System.out.println("1.Nombre");
                                    System.out.println("2.Edad");
                                    System.out.println("3.familiar");
                                    System.out.println("4.encargado");
                                    System.out.println("5.escuela");
                                    System.out.println("6.porcentaje");
                                    System.out.println("7.eva asiganado");
                                    System.out.println("Lea la opcion:");
                                    int pe = leer.nextInt();
                                    switch (pe) {
                                        case 1:
                                            System.out.println("Ingrese nuevo nombre: ");
                                            String nn = leer.next();
                                            pilot.get(p).setNombre(nn);
                                            break;
                                        case 2:
                                            System.out.println("ingrese nueva edad: ");
                                            int ne = leer.nextInt();
                                            pilot.get(p).setEdad(ne);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese nuevo familiar: ");
                                            String nf = leer.next();
                                            pilot.get(p).setFamiliar(nf);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el nuevo encargado: ");
                                            String nen = leer.next();
                                            pilot.get(p).setEncargado(nen);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese nueva escuela: ");
                                            String nes = leer.next();
                                            pilot.get(p).setEscuela(nes);
                                            break;
                                        case 6:
                                            System.out.println("Ingrese nuevo porcentaje de compatibilidad: ");
                                            double np = leer.nextDouble();
                                            pilot.get(p).setSincronizacion(np);
                                            break;
                                        case 7:
                                            System.out.println("asignele un eva prro :v ");
                                            String nev = leer.next();
                                            pilot.get(p).setAsignado(nev);
                                            break;
                                        default:

                                    }
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
                        for (Evas l : e) {
                            if (l instanceof EVA00) {
                                mat[((EVA00)l).getY()][((EVA00)l).getX()]=l;
                            }
                            if (l instanceof EVA01) {
                                mat[((EVA01)l).getY()][((EVA01)l).getX()]=l;
                            }if (l instanceof EVA02) {
                                mat[((EVA02)l).getY()][((EVA02)l).getX()]=l;
                            }if (l instanceof EVAPM) {
                                mat[((EVAPM)l).getY()][((EVAPM)l).getX()]=l;
                            }
                        }
                        /*mat[0][2] = 'R';
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
                        mat[9][9] = 'P';*/
                        imprimir(mat);
                        break;
                    case 5:
                        System.out.println("Se termino todo :(");
                        break;
                    default:
                        System.out.println("Ingreso una opcion equivocada");
                }//fin del switch

                System.out.println("desea quedarse en el programa?[S/N]:");

                System.out.println("desea seguir? [S/N]:");
                resp = leer.next().charAt(0);

            } while (resp == 'S' || resp == 's');
        } catch (Exception e) {

        }
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
        a.add(new Ramiel(0, 2, Color.yellow, "Un angel muy fuerte", "2/ago/1998", "rammy", "si", 200));
        a.add(new Ramiel(0, 7, Color.LIGHT_GRAY, "legendario", "3/sep/2003", "randy", "si", 400));
        a.add(new Sachiel(1, 4, Color.RED, "hijo de el mismo adan", "4/ene/2007", "sachy", "si", 600));
        a.add(new Sachiel(1, 5, Color.yellow, "te destruyen", "20/septiembre/1994", "sach", "si", 100));

        a.add(new Zeruel(1, 1, Color.yellow, "fox", "21/marzo/2000", "zezima", "si", 4000));
        a.add(new Zeruel(3, 2, Color.yellow, "fox", "21/marzo/2000", "zezima", "si", 4000));
        a.add(new Zeruel(3, 7, Color.yellow, "fox", "21/marzo/2000", "zezima", "si", 4000));
        a.add(new Zeruel(1, 8, Color.yellow, "fox", "21/marzo/2000", "zezima", "si", 4000));

        e.add(new EVAPM(9, 0, Color.yellow, 1997, 200, "shinji", 10, "Honduras", null, 203, 0));
        e.add(new EVAPM(9, 2, Color.yellow, 1997, 200, "shinji", 10, "Honduras", null, 203, 0));
        e.add(new EVAPM(9, 7, Color.yellow, 1997, 200, "shinji", 10, "Honduras", null, 203, 0));
        e.add(new EVAPM(9, 9, Color.yellow, 1997, 200, "shinji", 10, "Honduras", null, 203, 0));

        e.add(new EVA00(7, 2, Color.yellow, 1997, 200, "zelda", 3, "japon", null, 205, 0));
        e.add(new EVA00(9, 6, Color.yellow, 1997, 200, "zelda", 3, "japon", null, 205, 0));

        e.add(new EVA01(9, 4, Color.yellow, 1995, 400, "link", 4, "estados", null, 507, 0));

    }

    static void validar(int x, int y) throws errores {
        if (x < 0 || y < 0) {
            throw new errores(Color.ORANGE);
        }
    }
}
