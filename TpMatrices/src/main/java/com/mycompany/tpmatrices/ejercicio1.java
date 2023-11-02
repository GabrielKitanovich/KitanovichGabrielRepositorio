package com.mycompany.tpmatrices;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
//       EJERCICIO 1
//Crea un programa que pida por pantalla cuatro países y a continuación tres
//ciudades de cada uno de estos países. Los nombres de ciudades deben
//almacenarse en un array multidimensional cuyo primer índice sea el número
//asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
//el array deberá tener un tamaño de 4x4
//Ejemplo de resultados que debe mostrar el programa:
//País:     Argentina   Ciudades:     Buenos Aires  Cordoba     La Plata
//País:     España      Ciudades:     Madrid        Lugo        Sevilla
//País:     Francia     Ciudades:     Paris         Niza        Lyon
//País:     Italia      Ciudades:     Roma          Napoles     Sicilia 
        String [][] matriz = new String[4][4];
        Scanner leer = new Scanner(System.in);
        String pais;
        String ciudades;
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                if (c == 0 ) {
                    System.out.println("ingrese un pais");
                    matriz[f][c]= leer.nextLine();
                } else {
                    System.out.println("ingrese una ciudad");
                    matriz [f][c]= leer.nextLine();
                }
            }
        }
         for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(matriz[f][c]+ "   ");
            }
             System.out.println(" ");
        }

    }
}
