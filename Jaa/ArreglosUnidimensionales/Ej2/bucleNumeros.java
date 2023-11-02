package ArreglosUnidimensionales.Ej2;
import java.util.Scanner;
public class bucleNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = {12, 52, 34, 34, 575};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i+1) + ": " +numeros[i]);
        } 
        teclado.close();
    }
}
