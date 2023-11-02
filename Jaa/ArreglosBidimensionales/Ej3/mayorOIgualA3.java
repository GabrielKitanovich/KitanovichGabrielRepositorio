package ArreglosBidimensionales.Ej3;
import java.util.Scanner;
public class mayorOIgualA3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la dimensíon del arreglo bidimensional, que sea menor a 11 y mayor que 2: ");
        int dimension = 0;
        do {
            dimension = teclado.nextInt();
        } while (dimension < 3 || dimension > 10);
        int arreglo[][] = new int[dimension][dimension];
        System.out.println("Rellene los espacios de la matriz con números enteros: ");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                arreglo[i][j] = teclado.nextInt(); 
            }
        }
        System.out.println("Como queda el arreglo: ");
        mostradorArrays(arreglo, dimension);
        System.out.println("Arreglo con las columnas sumadas: ");
        int arregloColumnas[] = rellenarArrayColuma(arreglo, dimension);
        int total = 0;
        for (int i = 0; i < arregloColumnas.length; i++) {
            System.out.print(arregloColumnas[i] + " ");
            total = total + arregloColumnas[i];
        }
        System.out.println("");
        System.out.println("El total es de: " + total);
        teclado.close();
    }
    private static void mostradorArrays(int[][] array, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    private static int[] rellenarArrayColuma(int[][] array, int dimension){
        int suma = 0;
        int resultante[] = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            suma = 0;
            for (int j = 0; j < dimension; j++) {
                suma = suma + array[j][i];
            }
            resultante[i] = suma;
        } 
        return resultante;
    }

}
