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
public class ejercico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        EJERCICIO 4
//Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
//igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú
//con estas opciones:
//a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
//b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
//c) Suma de una columna que se pedirá al usuario (controlar que elija una
//correcta)
//d) Sumar la diagonal principal
//e) Sumar la diagonal inversa
//f) La media de todos los valores de la matriz
//IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
//deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
//rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
//las opciones del menú.
        Scanner leer = new Scanner(System.in);
        int x = 0;
        int fila = 0;
        int sumaFila = 0;
        int columna = 0;
        int sumaColumna = 0;
        int sumaDiagonal = 0;
        int sumaDiagonalInvertida = 0;

        int sumaTotal = 0;
        int media = 0;
        do {
            System.out.println("ingrese un valor mayor o igual a 4 y menor o igual a 10");
            x = leer.nextInt();
        } while (x < 4 || x > 10);
        int[][] matriz = new int[x][x];

        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                matriz[f][c] = (int) (Math.random() * 10); //a)----------------------------
                sumaTotal = sumaTotal + matriz[f][c];
            }
        }
        System.out.println("------------------PUNTO A---------------------");
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------PUNTO B------------------------");

        do {
            System.out.println("ingrese una fila del 1 hasta " + x);
            fila = leer.nextInt();

        } while (fila < 0 || fila > x);

        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                if ((fila - 1) == f) {
                    sumaFila = sumaFila + matriz[f][c];//b)-------------------------------
                }
            }
        }
        System.out.println("-------------------MATRIZ----------------------");
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("la suma de la fila " + fila + " es iguala a " + sumaFila);
        System.out.println("-----------------------PUNTO C---------------------------");
        do {
            System.out.println("ingrese una columna del 1 hasta " + x);
            columna = leer.nextInt();

        } while (columna < 0 || columna > x);

        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                if (columna - 1 == c) {
                    sumaColumna = sumaColumna + matriz[f][c];//c)-------------------------------
                }
            }
        }
        System.out.println("-------------------MATRIZ----------------------");

        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("la suma de la columna " + columna + " es iguala a " + sumaColumna);

        System.out.println("-----------------------PUNTO D---------------------------");
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                if (f == c) {
                    sumaDiagonal = sumaDiagonal + matriz[f][c];//d)-------------------------------

                }

            }
        }
        System.out.println("-------------------MATRIZ CON DIAGONAL----------------------");

        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                if (f == c) {
                    System.out.print("(" + matriz[f][c] + ")");

                } else {
                    System.out.print(matriz[f][c]);

                }

            }
            System.out.println("");
        }

        System.out.println("la suma de la diagonal seleccionada es iguala a " + sumaDiagonal);
        System.out.println("-----------------------PUNTO D---------------------------");

        for (int f = 0; f < x; f++) {
            for (int c = x - 1; c >= 0; c--) {
                if (f == x - 1 - c) {
                    sumaDiagonalInvertida += matriz[f][c]; // e) Sumar la diagonal inversa
                }
            }
        }
        System.out.println("-------------------MATRIZ CON DIAGONAL INVETIDA----------------------");
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                if (f == x - 1 - c) {
                    System.out.print("(" + matriz[f][c] + ")");
                } else {
                    System.out.print(matriz[f][c]);
                }
            }
            System.out.println("");
        }

        System.out.println("la suma de la diagonal inversa es igual a " + sumaDiagonalInvertida);

        media = sumaTotal / (x * x);//f)---------------------------
        System.out.println("LA MEDIA DE LA MATRIZ ES " + media);
    }

}
