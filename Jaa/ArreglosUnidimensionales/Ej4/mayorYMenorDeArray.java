package ArreglosUnidimensionales.Ej4;
import java.util.Scanner;
public class mayorYMenorDeArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double arrayDouble[] = new double[20];
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print("Escriba el valor de la posición " + (i+1) + " del Array: ");
            arrayDouble[i] = teclado.nextDouble();
        }
        double mayor = calculoMayor(arrayDouble);
        System.out.println("El mayor del array es: " + mayor);
        double menor = calculoMenor(arrayDouble);
        System.out.println("El menor del array es: " + menor);
        double rango = mayor - menor;
        System.out.println("El rango del array es de: " + rango);

        teclado.close();
    }
    private static double calculoMayor(double array[]){
        double mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }
    private static double calculoMenor(double array[]){
        double menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
}
