/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import clases.Coche;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void mostrarMenu() {
        System.out.println("\n*----------------------------------------*");
        System.out.println("|       *-----Menú JDM Dealer -----*       |");
        System.out.println("| 1- Alta Vehiculo                         |");
        System.out.println("| 2- Listado Completo                      |");
        System.out.println("| 3- Consultar coche por ID                |");
        System.out.println("| 4- Actualizar datos de un coche por ID   |");
        System.out.println("| 5- Listado de todos los coches           |");
        System.out.println("| 0- Salir                                 |");
        System.out.println("|       *-----Menú JDM Dealer -----*       |");
        System.out.println("*------------------------------------------*");
        System.out.println("Introduzca opción: ");
    }

//    public static void mostrarSubMenu() {
//        System.out.println("\n*-------------------------------*");
//        System.out.println("|      *-----Menú JDM Dealer -----*       |");
//        System.out.println("| 1- |");
//        System.out.println("| 2- |");
//        System.out.println("|      *-----Menú JDM Dealer -----*       |");
//        System.out.println("*---------------------------------*");
//        System.out.println("Introduzca el tipo de dispositivo:");
//    }
    public static void main(String[] args) {
        ConectaDB conexion = new ConectaDB();
        Coche miCoche;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int opcion = -1, id, caballos;
        String marca;
        boolean turbo;
        while (opcion != 0) {
            mostrarMenu();
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 0:
                        System.out.println("!!Hasta la proxima¡¡");
                        break;
                    case 1:
                        break;
                    case 2:
                        System.out.println("Introduzca la marca del vehiculo:");
                        marca = sc.next();
                        System.out.println("Tiene turbo (true/false):");
                        turbo = sc.nextBoolean();
                        System.out.println("Numero de CV:");
                        caballos = sc.nextInt();
                        miCoche = new Coche(marca, turbo, caballos);
                        if (conexion.addCoche(miCoche)) {
                            System.out.println("Vehiculo añadido correctamente.");
                        } else {
                            System.out.println("El vehiculo no se ha podido añadir.");
                        }
                        break;
                    case 3:
                        System.out.println("Introduce el ID del vehiculo:");
                        id = sc.nextInt();
                        Coche datosCoche = conexion.getCoche(id);
                        if (conexion.getCoche(id) == null) {
                            System.out.println("El ID no coincide con ningun vehiculo de la base de datos.");
                        } else {
                            System.out.println(datosCoche);
                        }
                        break;
                    case 4:
                        System.out.println("Introduce el ID del coche a actualizar:");
                        id = sc.nextInt();
                        if (conexion.getCoche(id) == null) {
                            System.out.println("El ID no coincide con ningun vehiculo de la base de datos.");
                        } else {
                            System.out.println("Introduce la marca nueva:");
                            marca = sc.next();
                            System.out.println("Tiene turbo (true/false):");
                            turbo = sc.nextBoolean();
                            System.out.println("Numero de CV:");
                            caballos = sc.nextInt();
                            conexion.actualizarCoche(id, marca, turbo, caballos);
                        }
                        break;
                    case 5:
                        if (conexion.getCoches().isEmpty()) {
                            System.out.println("La tabla esta vacia.");
                        } else {
                            for (Coche coche : conexion.getCoches()) {
                                System.out.println(coche);
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Introduzca el ID del vehiculo a eliminar:");
                        id = sc.nextInt();
                        if (conexion.getCoche(id) == null) {
                            System.out.println("El ID no coincide con ningun vehiculo de la base de datos.");
                        } else {
                            conexion.borrarCoche(id);
                            System.out.println("Vehiculo borrado correctamente.");
                        }
                        break;
                    default:
                        System.out.println("Introduzca un número entre 0-6");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Error. Solo se pueden introducir números.");
                sc.next();
            } catch (Exception exception) {
                System.out.println("Error.");
                sc.next();
            }

        }

        sc.close();
    }
}
