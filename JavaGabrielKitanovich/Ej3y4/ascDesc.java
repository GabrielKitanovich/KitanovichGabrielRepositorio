package Ej3y4;
import java.util.Scanner;
public class ascDesc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionElegida = 0;
        int opcion2 = 0;
        String stringOpcion;
        int lista[] = new int[20];
        System.out.println("Escriba 20 números enteros para rellenar el array");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = teclado.nextInt();
        }
        do {
            System.out.println("Escriba el número del algoritmo fundamental que quiere selecionar");
            System.out.println("1) Algoritmo Inserción");
            System.out.println("2) Algoritmo Burbuja");
            System.out.println("3) Algoritmo por Selección");
            opcionElegida = teclado.nextInt();
        } while (opcionElegida > 3 || opcionElegida < 1);
        do {
            System.out.println("Escriba el número del tipo de orden que quiere para el array");
            System.out.println("1) Ascendente");
            System.out.println("2) Descendente");
            opcion2 = teclado.nextInt();
        } while (opcion2 > 2 || opcion2 < 1);
        if (opcion2 == 1){
            stringOpcion = "asc";
        } else {
            stringOpcion = "desc";
        }
        algoritmosClase2 algoritmo = new algoritmosClase2(lista, stringOpcion);
        switch (opcionElegida) {
            case 1:
                System.out.println("Algoritmo por Insercion: ");
                algoritmo.porInsercionInversa();
                break;
            case 2:
                System.out.println("Algoritmo por Burbuja: ");
                algoritmo.porBurbujaInversa();
                break;
            case 3:
                System.out.println("Algoritmo por Selección: ");
                algoritmo.porSeleccionInversa();
                break;
            default:
                break;
        }
        algoritmo.mostrador();
        teclado.close();
    }

}
