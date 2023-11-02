package ArreglosUnidimensionales.Ej3;
import java.util.Scanner;
public class multiplesDeNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número entero para saber los multiplos: ");
        int num = teclado.nextInt();
        System.out.println("Escriba la cantidad de multiplos que quiere ver: ");
        int dimension = teclado.nextInt();
        int multiplesDeNumArray[] = new int[dimension];
        multiplesDeNumArray = llenadorDeMultiplos(multiplesDeNumArray, num);
        for (int index = 0; index < multiplesDeNumArray.length; index++) {
            System.out.println(num + " * " + (index+1) + " = " + multiplesDeNumArray[index]);
        }
        teclado.close();
    }
    private static int[] llenadorDeMultiplos(int multiplesDeNumArray[], int num){
        for (int i = 0; i < multiplesDeNumArray.length; i++) {
            multiplesDeNumArray[i] = num * (i+1);
        }
        return multiplesDeNumArray;
    }
}
