import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioN6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
        while (true) {
            teclado = new Scanner(System.in);
            System.out.println("Escriba el valor que le quiere dar a la celda (o escriba fin para salir): ");
            String valorCelda = teclado.nextLine();
            if (valorCelda.toUpperCase().equals("FIN")) {
                break;
            }
            System.out.println("Escriba la fila para ese valor: ");
            int valorFila = teclado.nextInt();
            System.out.println("Escriba la columna para ese valor: ");
            int valorColumna = teclado.nextInt();
            Celda celda = new Celda(valorFila, valorColumna, valorCelda);
            matrizCuadrada.add(celda);
        }
        if (!matrizCuadrada.isEmpty()) {
            for (int i = 0; i < matrizCuadrada.size() ; i++) {
                Celda celtaTemp = matrizCuadrada.get(i);
                System.out.println("La celda " + (i+1) + " de la matriz cuadrada tiene el valor '" + celtaTemp.getValor() + "' y está en la fila " + celtaTemp.getFila() + " y el la columna " + celtaTemp.getColumna());
            }
        } else {
            
        }
        System.out.println("");
        System.out.println("Escriba la fila y la columna del cual quiere ver el contenido: ");
        int filaBuscada = teclado.nextInt();
        int columnaBuscada = teclado.nextInt();
        Boolean encontrada = false;
        for (Celda celda : matrizCuadrada) {
            if (celda.getFila() == filaBuscada && celda.getColumna() == columnaBuscada) {
                System.out.println("El valor de la fila " + filaBuscada + " columna " + " es: " + celda.getValor());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("El valor de la fila " + filaBuscada + " columna " + " no ha sido asignada");
        }
        teclado.close();   
    }
}
