package ArreglosUnidimensionales.Ej7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ordenarArreglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer arreglo[] = new Integer[10];
        System.out.println("Escriba 10 números enteros para ordenarlos: ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = teclado.nextInt();
        }
        Arrays.sort(arreglo);
        System.out.println();
        mostrarArreglo(arreglo);
        Arrays.sort(arreglo, Collections.reverseOrder());
        mostrarArreglo(arreglo);
        teclado.close();
    }
    private static void mostrarArreglo(Integer arreglo[]){
        for (int index = 0; index < arreglo.length; index++) {
            System.out.print(arreglo[index] + " ");
        }
        System.out.println("");
    }
}
