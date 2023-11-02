package ArreglosBidimensionales.Ej4;
import java.util.Scanner;
public class tablaMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la dimensíon del arreglo de enteros bidimensional, que sea menor a 11 y mayor que 4: ");
        int dimension = 0;
        do {
            dimension = teclado.nextInt();
        } while (dimension < 4 || dimension > 10);
        int arreglo[][] = new int[dimension][dimension];
        System.out.println("Elija una opción: ");
        
        boolean matrizRellena = false;
        while (true) {
            String opciones[] = {"1) Rellenar Matriz", "2) Sumar Fila", "3) Sumar Columna", "4) Sumar diagonal principal", "5) Sumar diagonal inversa", "6) Promedio de la Matriz"};
            for (int i = 0; i < opciones.length; i++) {
                System.out.println(opciones[i]);
            }
            int opcionElegida = selectorOpcion(teclado);
            if (opcionElegida == 1) {
                System.out.println("Rellene la matriz:");
                for (int i = 0; i < dimension; i++) {
                    for (int j = 0; j < dimension; j++) {
                        arreglo[i][j] = teclado.nextInt(); 
                        
                    }
                }
                mostradorArrays(arreglo, dimension);
                matrizRellena = true;
            } else if (opcionElegida !=1 && matrizRellena == false){
                System.out.println("Para eso tenes que rellenar la matriz!");
            } else {
                switch (opcionElegida) {
                    case 2:
                        int filaElegida = 0;
                        int sumaFila = 0;
                        do {
                            System.out.println("Cuál fila quiere sumar? ");
                            filaElegida = teclado.nextInt();
                        } while (filaElegida > dimension || filaElegida < 0);
                        for (int i = 0; i < dimension; i++) {
                                sumaFila = sumaFila + arreglo[filaElegida-1][i]; 
                        }
                        System.out.println("El resultado de la suma es: " + sumaFila);
                        break;
                    case 3:
                        int columnaElegida = 0;
                        int sumaColumna = 0;
                        do {
                            System.out.println("Cuál columna quiere sumar? ");
                            columnaElegida = teclado.nextInt();
                        } while (columnaElegida > dimension+1 || columnaElegida < 0);
                        for (int i = 0; i < dimension; i++) {
                                sumaColumna = sumaColumna + arreglo[i][columnaElegida-1]; 
                        }
                        System.out.println("El resultado de la suma es :" + sumaColumna);
                        break;
                    case 4:
                        int sumaDiagonal = 0;
                        for (int i = 0; i < dimension; i++) {
                            for (int j = i; j < i+1; j++) {
                                sumaDiagonal = sumaDiagonal + arreglo[i][j];
                            }
                        }
                        System.out.println("El resultado de la suma es :" + sumaDiagonal);
                        break;
                    case 5:
                        int sumaDiagonalInversa = 0;
                        int segundIterador = 0;
                        for (int i = dimension - 1; i > 0; i--) {
                            sumaDiagonalInversa = sumaDiagonalInversa + arreglo[i][segundIterador];
                            segundIterador +=1;
                        }
                        System.out.println("El resultado de la suma es: " + sumaDiagonalInversa);
                        break;
                    case 6:
                        int sumaTotal = 0;
                        for (int i = 0; i < dimension; i++) {
                            for (int j = 0; j < dimension; j++) {
                                sumaTotal = sumaTotal + arreglo[i][j];
                            }
                        }
                        System.out.println("El promedio es: " + (sumaTotal / (dimension*dimension)));
                        break;
                
                    default:
                        break;
                }
                break;
            }
        }
        teclado.close();
    }
    public static int selectorOpcion(Scanner teclado){
        int opcionElegida = 0;
        do {
            opcionElegida = teclado.nextInt();
        } while (opcionElegida < 1 || opcionElegida > 6);
        return opcionElegida;
    }
    private static void mostradorArrays(int[][] array, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
