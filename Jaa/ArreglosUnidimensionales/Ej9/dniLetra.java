package ArreglosUnidimensionales.Ej9;
import java.util.Scanner;
public class dniLetra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su DNI sin la letra: ");
        int dni = teclado.nextInt();
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println(dni + letras[dni%23]);
        teclado.close();
    }
}
