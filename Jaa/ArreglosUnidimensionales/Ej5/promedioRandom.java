package ArreglosUnidimensionales.Ej5;

public class promedioRandom {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =(int)Math.floor(100* Math.random()) +1;
            ;
        }
        for (int index = 0; index < numeros.length; index++) {
            System.out.print(numeros[index] + " ");
        }
        int promedio = sacarPromedio(numeros);
        int iguales = cuantosIguales(numeros, promedio);
        int mayores = cuantosMayores(numeros, promedio);
        int menores = cuantosMenores(numeros, promedio);
        System.out.println("");
        System.out.println("El promedio es de: " + promedio);
        System.out.println("La cantidad de iguales al promedio es de: " + iguales);
        System.out.println("La cantidad de mayores al promedio es de: " + mayores);
        System.out.println("La cantidad de menores al promedio es de: " + menores);
    }
    private static int sacarPromedio(int numeros[]){
        int promedio = 0;
        for (int i = 0; i < numeros.length; i++) {
            promedio = promedio + numeros[i];
        }
        return promedio / numeros.length;
    }
    private static int cuantosIguales(int numeros[], int promedio){
        int iguales = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == promedio) {
                iguales ++;
            }
        }
        return iguales;
    }
    private static int cuantosMayores(int numeros[], int promedio){
        int mayores = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > promedio) {
                mayores ++;
            }
        }
        return mayores;
    }
    private static int cuantosMenores(int numeros[], int promedio){
        int menores = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < promedio) {
                menores ++;
            }
        }
        return menores;
    }
}
