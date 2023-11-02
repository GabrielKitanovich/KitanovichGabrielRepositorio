import java.util.Scanner;

public class departamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir la cantidad total de personas.
        System.out.print("Ingrese la cantidad total de personas: ");
        int totalPersonas = scanner.nextInt();

        // Paso 2: Preguntar si se quieren separar por hombres y mujeres.
        System.out.print("¿Desea separar por hombres y mujeres? (Sí: 1, No: 0): ");
        int separarHombresMujeres = scanner.nextInt();
        int hombres = 0;
        int mujeres = 0;

        if (separarHombresMujeres == 1) {
            // Pedir la cantidad de hombres y mujeres.
            System.out.print("Ingrese la cantidad de hombres: ");
            hombres = scanner.nextInt();
            System.out.print("Ingrese la cantidad de mujeres: ");
            mujeres = scanner.nextInt();

            // Verificar que no se supere la cantidad total de personas.
            if (hombres + mujeres != totalPersonas) {
                System.out.println("Error: La suma de hombres y mujeres no es igual a la cantidad total de personas.");
                scanner.close();
                return;
            }
        }

        // Paso 3: Pedir la cantidad de departamentos con vista al mar.
        System.out.print("Ingrese la cantidad de departamentos con vista al mar (máximo 4 personas por departamento): ");
        int numDepartamentos = scanner.nextInt();

        // Verificar que no se necesiten más departamentos de los disponibles.
        if (totalPersonas > numDepartamentos * 4) {
            System.out.println("Error: No hay suficientes departamentos para alojar a todas las personas.");
            scanner.close();
            return;
        }
        // Verificar que la cantidad de departamentos no exceda la cantidad de personas.
        if (numDepartamentos > totalPersonas) {
            System.out.println("Error: La cantidad de departamentos no puede exceder la cantidad total de personas.");
            scanner.close();
            return;
        }
        // Paso 4: Calcular el costo total.
        int costoTotal = 500000;

        // Imprimir el costo total.
        System.out.println("Se cobrarán $" + costoTotal + " por el alojamiento.");

        // Cerrar el scanner.
        scanner.close();
    }
}