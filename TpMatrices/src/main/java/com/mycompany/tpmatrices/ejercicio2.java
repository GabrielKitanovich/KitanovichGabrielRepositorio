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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       EJERCICIO 2
//Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
//primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
//entero que deberá ser ingresado por el usuario. A continuación cree un segundo
//array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
//ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
//el resultante de multiplicar cada una de las posiciones de las filas del array uno por
//cada una de las posiciones de las columnas del array 2.
//Muestre por pantalla cada uno de los arrays con sus valores.
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la dimension de filas ");
        int x = leer.nextInt();
        System.out.println("ingrese la dimension de columnas");
        int y = leer.nextInt();
        int[][] arreglo1 = new int[x][y];
        int[][] arreglo2 = new int[y][x];
        int[][] arreglo3 = new int[x][y];
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {
                arreglo1[f][c] = leer.nextInt();

            }

        }
        for (int f = 0; f < y; f++) {
            for (int c = 0; c < x; c++) {
                arreglo2[f][c] = leer.nextInt();

            }

        }
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {
                arreglo3[f][c] = arreglo1[f][c] * arreglo2[c][f];

            }

        }
        System.out.println("areglo1-------------------------------");
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {

                System.out.print(arreglo1[f][c] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("areglo2--------------------------------");
        for (int f = 0; f < y; f++) {
            for (int c = 0; c < x; c++) {

                System.out.print(arreglo2[f][c] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("arreglo3---------------------------------");
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < y; c++) {

                System.out.print(arreglo3[f][c] + " ");
            }
            System.out.println(" ");
        }
    }
}
