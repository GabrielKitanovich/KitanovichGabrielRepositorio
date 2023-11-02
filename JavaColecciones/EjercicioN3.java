import java.util.ArrayList;

public class EjercicioN3 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayEnteros = new ArrayList<Integer>();
        int numeroRandom;
        do {
            numeroRandom = (int) (Math.random() * 100 + 1);
            if (numeroRandom % 2 == 0) {
                arrayEnteros.add(numeroRandom);
                System.out.print(numeroRandom + " ");
            }
        } while (arrayEnteros.size() != 20);
        System.out.println("");
        int total = 0;
        for (int i = 0; i < arrayEnteros.size(); i++) {
            total += arrayEnteros.get(i);
        }
        int promedio = total / 20;
        System.out.println("El promedio es: " + promedio);
        if (calculadorPromedios(arrayEnteros, promedio) == 0) {
            System.out.println("No hay números iguales al promedio!!");
        } else {
            System.out.println("Hay " + calculadorPromedios(arrayEnteros, promedio) + " números iguales al promedio!!");
        }
        System.out.println("Hay " + calculadorMayores(arrayEnteros, promedio) + " de números mayores al promedio!!");
        System.out.println("Hay " + calculadorMenores(arrayEnteros, promedio) + " de números menores al promedio!!");


    }
    private static int calculadorPromedios(ArrayList <Integer> arrayEnteros, int promedio){
        int cantidadPromedios = 0;
        for (int i = 0; i < arrayEnteros.size(); i++) {
            if (arrayEnteros.get(i) == promedio) {
                cantidadPromedios += 1;
            }
        }
        return cantidadPromedios;
    }
    private static int calculadorMayores(ArrayList <Integer> arrayEnteros, int promedio){
        int cantidadMayores = 0;
        for (int i = 0; i < arrayEnteros.size(); i++) {
            if (arrayEnteros.get(i) > promedio) {
                cantidadMayores += 1;
            }
        }
        return cantidadMayores;
    }
    private static int calculadorMenores(ArrayList <Integer> arrayEnteros, int promedio){
        int cantidadMenores = 0;
        for (int i = 0; i < arrayEnteros.size(); i++) {
            if (arrayEnteros.get(i) < promedio) {
                cantidadMenores += 1;
            }
        }
        return cantidadMenores;
    }
}
