package Ejercicio2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CostoComputadora {
    public static void main(String[] args) {
        List<Computadora> computadoras = new ArrayList<Computadora>();
        Scanner teclado = new Scanner(System.in);
        String salida = "";
        do {
            teclado = new Scanner(System.in);
            Computadora computadora = new Computadora();
            System.out.println("Ingrese la marca de la computadora: ");
            computadora.setMarca(teclado.nextLine());
            System.out.println("Ingrese el modelo de la computadora: ");
            computadora.setModelo(teclado.nextLine());
            System.out.println("Ingrese la cantidad de componentes de la computadora: ");
            computadora.setCantidadDeComponentes(teclado.nextInt());
            for (int i = 0; i < computadora.getCantidadDeComponentes(); i++) {
                teclado = new Scanner(System.in);
                ComponenteCPU componente = new ComponenteCPU();
                System.out.println("\nComponente número " + (i + 1) +":\n");
                System.out.println("Ingrese el nombre del componente: ");
                componente.setComponente(teclado.nextLine());
                System.out.println("Ingrese la marca del componente: ");
                componente.setMarca(teclado.nextLine());
                teclado = new Scanner(System.in);
                System.out.println("Ingrese la cantidad del componente: ");
                componente.setCantidad(teclado.nextInt());
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el precio por unidad del componente: ");
                componente.setPrecio(teclado.nextDouble());
                computadora.getComponents().add(componente);
                System.out.println("Componente cargado exitosamente!!!");
            }
            computadoras.add(computadora);
            teclado = new Scanner(System.in);
            System.out.println("\n¿Desea cotizar una nueva computadora?");
            System.out.println("1. Si");
            System.out.println("2. No");
            salida = teclado.nextLine();
        } while (salida.equals("1"));
        for (Computadora computadora : computadoras) {
            System.out.println("--------------------------------Computadora----------------");
            System.out.println("Marca: " + computadora.getMarca());
            System.out.println("Modelo: " + computadora.getModelo());
            System.out.println("Componentes:");
            System.out.printf("%-15s %-15s %-15s %-20s %-15s%n", "Componente", "Marca", "Cantidad", "Precio X Unidad", "SubTotal");
            
            double costoTotal = 0;
            for (ComponenteCPU componente : computadora.getComponents()) {
                System.out.printf("%-15s %-15s %-15d %-20.2f %-15.2f%n", componente.getComponente(), componente.getMarca(), componente.getCantidad(), componente.getPrecio(), componente.getCantidad() * componente.getPrecio());
                costoTotal += componente.getCantidad() * componente.getPrecio();
            }
            if (Math.round(costoTotal) <= 50000) {
                System.out.println("Costo Total $" + costoTotal);
                System.out.println("El precio sugerido de venta es " + costoTotal + " + " + costoTotal * 0.4 + " = $" + (costoTotal + costoTotal * 0.4));
                System.out.println();
            } else {
                System.out.println("Costo Total $" + costoTotal);
                System.out.println("El precio sugerido de venta es " + costoTotal + " + " + costoTotal * 0.3 + " = $" + (costoTotal + costoTotal * 0.3));
                System.out.println();
            }
        }
    }
}
