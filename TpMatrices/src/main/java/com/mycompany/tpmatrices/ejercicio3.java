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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        EJERCICIO 3
//Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o
//igual a 10. Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los
//UTN-FRM
//Arreglos Multidimensionales.
//valores necesarios para cargar cada una de las celdas de la matriz. Muestre por
//pantalla la matriz resultante.
//Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
//en una nueva matriz de una dimensión, finalmente sume los valores de esta última
//matriz y muestre el resultado por pantalla.
//Ejemplo: X=5
        Scanner leer = new Scanner(System.in);
        int x;
        do {
            System.out.println("ingrese un valor mayor o igual a 3 y menor o igual a 10");
            x = leer.nextInt();
        } while (x < 3 || x > 10);
        int[][] matriz1 = new int[x][x];
        int[] array1 = new int[x];
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                matriz1[f][c] = leer.nextInt();
            }
        }
        for (int f = 0; f < x; f++) {
            for (int c = 0; c < x; c++) {
                System.out.print(matriz1[f][c] + " ");
            }
            System.out.println("");
        }

        for (int c = 0; c < x; c++) {
            int suma = 0;
            for (int f = 0; f < x; f++) {
                suma = suma + matriz1[f][c];
                array1[c] = suma;
            }

        }
        for (int c = 0; c < x; c++) {
            System.out.print(array1[c] + " ");
        }

    }

}
