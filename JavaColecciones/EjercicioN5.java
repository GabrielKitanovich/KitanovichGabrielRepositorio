import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioN5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> arrayEnteros = new ArrayList<Integer>();
        System.out.println("Escriba 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            arrayEnteros.add(teclado.nextInt());
        }
        Collections.sort(arrayEnteros);
        ArrayList <Integer> arrayEnterosAscendente = new ArrayList<Integer>();
        arrayEnterosAscendente.addAll(arrayEnteros);
        System.out.println("Números ordenados de manera Ascendente: ");
        imprimidor(arrayEnterosAscendente);
        ArrayList <Integer> arrayEnterosDescendente = new ArrayList<Integer>();
        arrayEnterosDescendente.addAll(arrayEnteros);
        Collections.reverse(arrayEnterosDescendente);
        System.out.println("Números ordenados de manera Descendente: ");
        imprimidor(arrayEnterosDescendente);
        teclado.close();
    }
    private static void imprimidor(ArrayList <Integer> arrayList){
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }
}
