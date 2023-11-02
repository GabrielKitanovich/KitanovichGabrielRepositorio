package ArreglosBidimensionales.Ej2;
import java.util.Scanner;
public class multiplicacionDeArreglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba 2 valores numéricos enteros: ");
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        System.out.println("Escriba los elementos del primer arreglo: ");
        int arreglo1[][] = llenadorArray(x, y, teclado);
        System.out.println("Escriba los elementos del segundo arreglo: ");
        int arreglo2[][] = llenadorArray(y, x, teclado);
        int arreglo3[][] = multiplicadorArrays(arreglo1, arreglo2, x, y);
        System.out.println("Arreglo 1: ");
        mostradorArrays(arreglo1, x, y);
        System.out.println("Arreglo 2: ");
        mostradorArrays(arreglo2, y, x);
        System.out.println("Array resultante de multiplicar cada una de las posiciones de las filas del array 1 por cada una de las posiciones de las columnas del array 2: ");
        mostradorArrays(arreglo3, x, y);
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
    private static int[][] multiplicadorArrays(int[][] arreglo1, int[][] arreglo2, int x, int y){
        int arreglo3[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arreglo3[i][j] = arreglo1[i][j] * arreglo2[j][i];
            }

        }
        return arreglo3;
    }
    private static void mostradorArrays(int[][] array, int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
