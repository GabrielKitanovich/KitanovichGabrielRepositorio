/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tpmatrices;

import java.util.Scanner;

/**
 *
 * @author Luciano Losada
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        EJERCICIO 5
//Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina
//expendedora de golosinas donde la columna 1 es la golosina, la columna 2 el precio
//y la columna 3 la cantidad (stock) actual de golosinas
//    Tendremos un pequeño menú con las siguientes opciones:
//a. Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina
//tiene golosinas en cada posición, identificados por su fila y columna, que
//será lo que introduzca el usuario al pedir una golosina, por ejemplo si el
//usuario teclea 2 significa que está pidiendo la golosina que está en la fila 2.
//Al seleccionar una golosina debe disminuir la cantidad disponible de la
//golosina. En caso de agotar el stock de la golosina deberá informar de la
//situación al cliente y solicitarle que seleccione otra golosina.
//b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual
//disponible.
//c. Rellenar golosinas: esta es una función exclusiva de un técnico por lo que
//para su ejecución nos pedirá una contraseña, si el usuario escribe
//“AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a
//recargar. La cantidad ingresada se sumara a la cantidad actual existente.
//d. Apagar maquina: sale del programa, antes de salir mostrara las ventas
//totales durante la ejecución del programa. Es decir la suma de todos los
//precios de las golosinas seleccionadas desde el inicio del programa.    

        Scanner scanner = new Scanner(System.in);
        String[][] golosinas = {
            {"KitKat", "32", "10"},
            {"Chicles", "2", "50"},
            {"Caramelos de Menta", "2", "50"},
            {"Huevo Kinder", "25", "10"},
            {"Chetos", "30", "10"},
            {"Twix", "26", "10"},
            {"M&M'S", "35", "10"},
            {"Papas Lays", "40", "20"},
            {"Milkybar", "30", "10"},
            {"Alfajor Tofi", "20", "15"},
            {"Lata Coca", "50", "20"},
            {"Chitos", "45", "10"}
        };

        int ventasTotales = 0;
        boolean maquinaEncendida = true;

        while (maquinaEncendida) {
            System.out.println("Menú:");
            System.out.println("a. Pedir golosina");
            System.out.println("b. Mostrar golosinas");
            System.out.println("c. Rellenar golosinas");
            System.out.println("d. Apagar máquina");

            System.out.print("Elija una opción: ");
            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.print("Ingrese el número de golosina que desea (1-" + golosinas.length + "): ");
                    int seleccion = scanner.nextInt();
                    seleccion--; // Ajustamos al índice del arreglo
                    if (seleccion >= 0 && seleccion < golosinas.length) {
                        int cantidadActual = Integer.parseInt(golosinas[seleccion][2]);
                        if (cantidadActual > 0) {
                            int precio = Integer.parseInt(golosinas[seleccion][1]);
                            System.out.println("Ha seleccionado " + golosinas[seleccion][0] + ". Precio: " + precio);
                            ventasTotales += precio;
                            cantidadActual--;
                            golosinas[seleccion][2] = Integer.toString(cantidadActual);
                        } else {
                            System.out.println("Lo sentimos, esta golosina está agotada. Por favor, elija otra.");
                        }
                    } else {
                        System.out.println("Opción inválida. Por favor, elija un número entre 1 y " + golosinas.length + ".");
                    }
                    break;
                case 'b':
                    System.out.println("Golosinas disponibles:");
                    for (int i = 0; i < golosinas.length; i++) {
                        System.out.println((i + 1) + ". " + golosinas[i][0] + " - Precio: " + golosinas[i][1] + " - Cantidad: " + golosinas[i][2]);
                    }
                    break;
                case 'c':
                    System.out.print("Ingrese la contraseña de técnico: ");
                    String contraseña = scanner.next();
                    if (contraseña.equals("123")) {
                        System.out.print("Ingrese el número de golosina a rellenar (1-" + golosinas.length + "): ");
                        int golosinaRellenar = scanner.nextInt();
                        golosinaRellenar--; // Ajustamos al índice del arreglo
                        if (golosinaRellenar >= 0 && golosinaRellenar < golosinas.length) {
                            System.out.print("Ingrese la cantidad a rellenar: ");
                            int cantidadRellenar = scanner.nextInt();
                            int cantidadActual = Integer.parseInt(golosinas[golosinaRellenar][2]);
                            cantidadActual += cantidadRellenar;
                            golosinas[golosinaRellenar][2] = Integer.toString(cantidadActual);
                            System.out.println("Se han rellenado " + cantidadRellenar + " unidades de " + golosinas[golosinaRellenar][0] + ".");
                        } else {
                            System.out.println("Opción inválida. Por favor, elija un número entre 1 y " + golosinas.length + ".");
                        }
                    } else {
                        System.out.println("Contraseña incorrecta. Acceso denegado.");
                    }
                    break;
                case 'd':
                    maquinaEncendida = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }

        System.out.println("Ventas totales: $" + ventasTotales);
        System.out.println("¡Gracias por utilizar la máquina expendedora!");
    }
}
