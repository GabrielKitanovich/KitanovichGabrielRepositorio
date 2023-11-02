import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioN2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Double> arrayDoubles = new ArrayList<Double>();
        System.out.println("Escriba 20 números enteros: ");
        for (int i = 0; i < 20; i++) {
            arrayDoubles.add(teclado.nextDouble());
        }
        Double maximo = Collections.max(arrayDoubles);
        Double minimo = Collections.min(arrayDoubles);
        Double rango = maximo - minimo;
        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: " + minimo);
        if (rango != 0) {
            System.out.println("El rango es de: " + rango);
        } else {
            System.out.println("El máximo y el mínimo son iguales!!");
        }
        teclado.close();
    }
}
