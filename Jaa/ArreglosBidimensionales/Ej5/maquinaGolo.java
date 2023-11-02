package ArreglosBidimensionales.Ej5;
import java.util.Scanner;

public class maquinaGolo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String maquinaGolosinas[][] = {
            {"KitKat", "32", "10"},
            {"Chicles", "2", "50"},
            {"Caramelos de Menta", "2", "50"},
            {"Huevo Kinder", "25", "10"},
            {"Chetos", "30", "10"},
            {"Twix", "26", "10"},
            {"M&M'S", "35", "10"},
            {"Papas Lays", "40", "20"},
            {"Milkybar", "30", "10"},
            {"Alfajor Tofi", "20", "15"},
            {"Lata Coca", "50", "20"},
            {"Chitos", "45", "10"}
        };
        
        int ventasTotales = 0;
        
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("a. Pedir golosina");
            System.out.println("b. Mostrar golosinas disponibles");
            System.out.println("c. Rellenar golosinas (requiere contraseña)");
            System.out.println("d. Apagar máquina");
            char opcion = teclado.next().charAt(0);
            
            switch (opcion) {
                case 'a':
                    System.out.println("Ingrese la fila de la golosina que desea:");
                    int fila = teclado.nextInt();
                    if (fila >= 0 && fila < maquinaGolosinas.length) {
                        int cantidadDisponible = Integer.parseInt(maquinaGolosinas[fila][2]);
                        if (cantidadDisponible > 0) {
                            int precio = Integer.parseInt(maquinaGolosinas[fila][1]);
                            ventasTotales += precio;
                            System.out.println("¡Disfrute su golosina!");
                            cantidadDisponible--;
                            maquinaGolosinas[fila][2] = Integer.toString(cantidadDisponible);
                        } else {
                            System.out.println("Lo siento, la golosina seleccionada está agotada. Por favor, elija otra.");
                        }
                    } else {
                        System.out.println("Fila de golosina no válida.");
                    }
                    break;
                case 'b':
                    System.out.println("Golosinas disponibles:");
                    for (int i = 0; i < maquinaGolosinas.length; i++) {
                        int cantidad = Integer.parseInt(maquinaGolosinas[i][2]);
                        if (cantidad > 0) {
                            String nombre = maquinaGolosinas[i][0];
                            int precio = Integer.parseInt(maquinaGolosinas[i][1]);
                            System.out.println(nombre + " - Precio: $" + precio + " - Cantidad disponible: " + cantidad);
                        }
                    }
                    break;
                case 'c':
                    System.out.println("Ingrese la contraseña para rellenar golosinas:");
                    String contraseña = teclado.next();
                    if (contraseña.equals("AdminXYZ")) {
                        System.out.println("Ingrese la fila de la golosina que desea rellenar:");
                        int filaRelleno = teclado.nextInt();
                        if (filaRelleno >= 0 && filaRelleno < maquinaGolosinas.length) {
                            System.out.println("Ingrese la cantidad a rellenar:");
                            int cantidadRelleno = teclado.nextInt();
                            int cantidadActual = Integer.parseInt(maquinaGolosinas[filaRelleno][2]);
                            cantidadActual += cantidadRelleno;
                            maquinaGolosinas[filaRelleno][2] = Integer.toString(cantidadActual);
                            System.out.println("Golosina rellenada correctamente.");
                        } else {
                            System.out.println("Fila de golosina no válida.");
                        }
                    } else {
                        System.out.println("Contraseña incorrecta. No tiene autorización para rellenar golosinas.");
                    }
                    break;
                case 'd':
                    System.out.println("Apagando máquina...");
                    System.out.println("Ventas totales durante la ejecución del programa: $" + ventasTotales);
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
            teclado.close();
        }
        
    }
}
