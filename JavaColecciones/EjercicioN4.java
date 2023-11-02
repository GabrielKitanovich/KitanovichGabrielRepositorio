import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioN4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> arrayIntegers = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            arrayIntegers.add((int) (Math.random() * 50 + 1));
            System.out.print(arrayIntegers.get(i) + " ");
        }
        System.out.println("");
        System.out.println("Escriba el número entero que quere buscar del Array (del 1 al 50): ");
        int numeroBuscado = teclado.nextInt();
        if (arrayIntegers.contains(numeroBuscado)) {
            System.out.println("El número buscado está por primera vez en la posición " + arrayIntegers.indexOf(numeroBuscado)+ "!!");
        } else {
            System.out.println("El número buscado no está en el array!!");
        }
        teclado.close();
    }
}
