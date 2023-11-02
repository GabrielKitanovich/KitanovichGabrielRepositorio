package Ejercicio1;

import java.util.HashMap;

public class HashmapAgenda {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        String exitCondition = "";
        do {
            System.out.println("\n1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            exitCondition = System.console().readLine();
            switch (exitCondition) {
                case "1":
                    System.out.println("Escriba el nombre del contacto: ");
                    String name = System.console().readLine();
                    if (agenda.keySet().contains(name)) {
                        System.out.println("\nEl contacto ya existe!!!");
                        break;
                    }
                    System.out.println("Escriba su número de teléfono: ");
                    agenda.put(name, Long.parseLong(System.console().readLine()));
                    System.out.println("\nContacto agregado correctamente!!!");
                    break;
                case "2":
                    System.out.println("Escriba el nombre del contacto a eliminar: ");
                    name = System.console().readLine();
                    if (agenda.keySet().contains(name)){
                        agenda.remove(name);
                        System.out.println("\nContacto eliminado correctamente!!!");
                    } else {
                        System.out.println("\nContacto no encontrado!!!");
                    }
                    break;
                case "3":
                    System.out.println("\nContactos agregados: \n");
                    agenda.forEach((k, v) -> System.out.println(k + " - " + v));
                    break;
                case "4":
                    System.out.println("Adios!!!");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!exitCondition.equals("4"));
    }
}
