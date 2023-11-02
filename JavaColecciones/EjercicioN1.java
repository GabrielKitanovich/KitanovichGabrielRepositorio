import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioN1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> arrayEnteros = new ArrayList<Integer>();
        System.out.println("Escriba los números enteros que quiera (escriba 0 o un número menor para terminar):");
        Integer numero;
        do {
            numero = teclado.nextInt();
            if (numero >0 ) {
                arrayEnteros.add(numero);
            }
        } while (numero > 0);
        if (arrayEnteros.isEmpty()) {
            System.out.println("No escribió ningún número antes de terminar!!");
        } else {
            System.out.println("Los números que escribió: ");
            for (Integer integer : arrayEnteros) {
                System.out.print(integer + " ");
            }
        }
        teclado.close();
    }
}
