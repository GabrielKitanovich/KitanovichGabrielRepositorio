package ArreglosBidimensionales.Ej1;
import java.util.Scanner;
public class paisesYCiudades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String paisesYCiudades[][] = new String[4][4];
        System.out.println("Escribe 4 paises separados por guiones: ");
        for (int i = 0; i < 4; i++) {
            paisesYCiudades[i][0] = teclado.nextLine();
        }
        paisesYCiudades = pedirFila(paisesYCiudades, teclado);
        teclado.close();
        escribirArray(paisesYCiudades);
    }
    private static String[][] pedirFila(String[][] array, Scanner teclado){
        for (int i = 0; i < 4; i++) {
            System.out.println("Escribe 3 ciudades de " + array[i][0] + ":");
            for (int j = 1; j < 4; j++) {
                array[i][j] = teclado.nextLine();
            }
        }
        return array;
    }
    private static void escribirArray(String array[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.print("País: " + array[i][j] + "  ");
                } else  if (j==1) {
                    System.out.print("Ciudades: " + array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
                
            }
            System.out.println("");
        }
    }
}
