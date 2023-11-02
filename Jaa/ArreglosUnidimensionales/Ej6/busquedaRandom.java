package ArreglosUnidimensionales.Ej6;
import java.util.Scanner;
public class busquedaRandom {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[50];
        System.out.print("Escriba un número entero para buscarlo en un array aleatorio (1-50): ");
        int num = teclado.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)Math.floor(50* Math.random()) +1;
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        buscadorAleatorio(numeros, num);
        teclado.close();
    }
    private static void buscadorAleatorio(int numeros[], int num){
        for (int index = 0; index < numeros.length; index++) {
            if (num == numeros[index]) {
                System.out.println("El número " + num + " aparece en la posición " + index + " del arreglo por primera vez");
                break;
            } else if (index == numeros.length - 1){
                System.out.println("No se encontró el número en el array aleatorio");
            }
        }
        
    }
}
