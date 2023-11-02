package ArreglosUnidimensionales.Ej10;
import java.util.Scanner;
public class sumaDeMultiplicacionDeArrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int array1[] = creadorArray(5, teclado);
        int array2[] = creadorArray(10, teclado);
        int array3[] = sumadorYMultiplicadorArrays(array1, array2);
        System.out.println("");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        } 
        teclado.close();
    }
    private static int[] creadorArray(int cantidad, Scanner teclado){
        int array[] = new int[cantidad];
        System.out.println("Ingrese los números enteros que irán en el arreglo de " + cantidad + " espacios: " );
        for (int index = 0; index < array.length; index++) {
            array[index] = teclado.nextInt();
        }
        return array;
    }
    private static int[] sumadorYMultiplicadorArrays(int[] array1, int[] array2){
        int arrayCalculado[] = new int[5];
        for (int i = 0; i < array1.length; i++) {
            int sumaMultiplicación = 0;
            for (int j = 0; j < array2.length; j++) {
                sumaMultiplicación = sumaMultiplicación + array1[i] * array2[j];
            }
            arrayCalculado[i] = sumaMultiplicación;
        }
        return arrayCalculado;
    }
}
