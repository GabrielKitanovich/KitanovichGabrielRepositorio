package ArreglosUnidimensionales.Ej8;
import java.util.Scanner;
public class arregloGuiones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una cadena de números enteros separadas por guiones entre medio: ");
        String string = teclado.nextLine();
        String arreglo[] = string.split("-"); 
        int arregloEntero[] = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arregloEntero[i] = Integer.valueOf(arreglo[i]);
        }
        for (int index = 0; index < arregloEntero.length; index++) {
            System.out.print(arregloEntero[index] + " ");
        }
        System.out.println("");
        calculo(arregloEntero);
        teclado.close();
    }
    private static void calculo(int[] arreglo){
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = arreglo[i] + suma;
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);
        double promedio = (double) suma/arreglo.length;
        System.out.println("El promedo de los elementos del arreglo es: " + promedio);
    }
}
