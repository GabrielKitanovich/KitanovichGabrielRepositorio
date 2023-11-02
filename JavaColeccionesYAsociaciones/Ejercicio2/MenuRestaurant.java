import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List <Plato> platoList = new ArrayList<Plato>();
        String salida1;
        do {
            teclado = new Scanner(System.in);
            Plato plato = new Plato();
            System.out.println("Ingrese los datos del plato");
            System.out.println("Es una bebida?");
            System.out.println("1) Si");
            System.out.println("2) No");
            int opcionBebida = teclado.nextInt();
            int cantidadIngrediente = 1;
            if (opcionBebida == 1) {
                teclado = new Scanner(System.in);
                plato.setEsBebida(true);
                System.out.println("Ingrese el nombre de la bebida:");
                plato.setNombreCompleto(teclado.nextLine());
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el precio de la bebida:");
                plato.setPrecio(teclado.nextDouble());
            } else if (opcionBebida == 2){
                plato.setEsBebida(false);
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el nombre del plato:");
                plato.setNombreCompleto(teclado.nextLine());
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el precio del plato:");
                plato.setPrecio(teclado.nextDouble());
                String salida2;
                do {
                    teclado = new Scanner(System.in);
                    Ingrediente ingrediente = new Ingrediente();
                    System.out.println("Escriba el nombre del ingrediente N" + cantidadIngrediente);
                    ingrediente.setNombre(teclado.nextLine());
                    teclado = new Scanner(System.in);
                    System.out.println("Escriba la cantidad del ingrediente N" + cantidadIngrediente);
                    ingrediente.setCantidad(teclado.nextInt());
                    teclado = new Scanner(System.in);
                    System.out.println("Escriba la unidad de medida del ingrediente N" + cantidadIngrediente);
                    ingrediente.setUnidadDeMedida(teclado.nextLine());
                    teclado = new Scanner(System.in);
                    plato.getIngredientes().add(ingrediente);
                    System.out.println("Desea ingresar otro ingrediente?");
                    System.out.println("1) Si");
                    System.out.println("2) No");
                    salida2 = teclado.nextLine();
                    cantidadIngrediente++;
                } while (salida2.equalsIgnoreCase("1") || salida2.equalsIgnoreCase("Si"));
            } else {
                System.out.println("Opción incorrecta");
            }
            platoList.add(plato);
            teclado = new Scanner(System.in);
            System.out.println("Desea ingresar otro plato?");
            System.out.println("1) Si");
            System.out.println("2) No");
            salida1 = teclado.nextLine();
        } while (salida1.equals("1") || salida1.equalsIgnoreCase("si"));
        System.out.println("-----------MenuRestaurante----------------");
        for (Plato plato : platoList) {
            if (plato.esBebida) {
                System.out.println("Bebida: " + plato.getNombreCompleto());
                System.out.println("Precio: " + plato.getPrecio());
            } else {
                System.out.println("Plato: " + plato.getNombreCompleto());
                System.out.println("Precio: " + plato.getPrecio());
                System.out.println("Ingredientes: ");
                System.out.printf("%-15s%-10s%s%n", "Nombre", "Cantidad", "Unidad de Medida");
                for (Ingrediente ingrediente : plato.getIngredientes()) {
                    System.out.printf("%-15s%-10s%s%n", ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getUnidadDeMedida());
                }
            }
            System.out.println("------------------------------------------");
        }
    }
}
