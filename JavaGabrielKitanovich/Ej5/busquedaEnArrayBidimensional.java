package Ej5;
import java.util.Scanner;

public class busquedaEnArrayBidimensional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la cantidad de filas y la cantidad de columnas que quiere: ");
        int filas = teclado.nextInt();
        int columnas = teclado.nextInt();
        System.out.println("Rellene el Array creado: ");
        int Array [][] = llenadorArray(filas, columnas, teclado);
        System.out.println("Como quedó el Array: ");
        mostradorArrays(Array);
        int promedio = (int) sacaPromedio(Array);
        buscaPromedio(Array, promedio);
    }
    private static void mostradorArrays(int[][] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    private static int[][] llenadorArray(int x, int y, Scanner teclado){
        int arreglo[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arreglo[i][j] = teclado.nextInt();
            }
        }
        return arreglo;
    }
    private static int sacaPromedio(int[][] array){
        int sumaTotal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumaTotal = sumaTotal + array[i][j];
            }
        }
        System.out.println("El promedio es: " + (sumaTotal / (array.length*array[0].length)));
        return sumaTotal / (array.length*array[0].length);
    }
    private static void buscaPromedio(int[][] array, int promedio){
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (promedio == array[i][j]){
                    System.out.println("Se encontró el promedio '" + promedio + "' en el Array en la posición: ["   + i + "],[" + j + "]!!! o fila " + (i+1) + " columna " + (j+1));
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el promedio en el Array");
        }
    }
}
