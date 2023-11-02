import java.util.Scanner;
import java.util.ArrayList;
public class CargarNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <alumno> alumnos = new ArrayList<alumno>();
        String salida;
        do {
            teclado = new Scanner(System.in);
            alumno alumnoAlumno = new alumno();
            System.out.println("Intrese los datos del alumno");
            System.out.println("Ingrese el nombre completo del alumno:");
            alumnoAlumno.setNombreCompleto(teclado.nextLine());
            System.out.println("Ingrese el legajo del alumno:");
            alumnoAlumno.setLegajo(teclado.nextLong());
            String salida2;
            do {
                teclado = new Scanner(System.in);
                Nota nota = new Nota();
                System.out.println("Ingrese el nombre de catedra: ");
                nota.setCatredra(teclado.nextLine());
                System.out.println("Ingrese la nota: ");
                nota.setNotaExamen(teclado.nextDouble());
                alumnoAlumno.getLista().add(nota);
                teclado = new Scanner(System.in);
                System.out.println("Desea ingresar otra nota?");
                System.out.println("1) Si");
                System.out.println("2) No");
                salida2 = teclado.nextLine();
            } while (salida2.equals("1"));
            alumnos.add(alumnoAlumno);
            System.out.println("Desea ingresar otro alumno?");
            System.out.println("1) Si");
            System.out.println("2) No");
            salida = teclado.nextLine();
        } while (salida.equals("1"));
        for (alumno alumnoAlumno : alumnos) {
            System.out.println("Datos del alumno: " + alumnoAlumno.getNombreCompleto());
            System.out.println("Legajo: " + alumnoAlumno.getLegajo());
            System.out.println("Notas: ");
            double total = 0;
            for (Nota nota : alumnoAlumno.getLista()) {
                System.out.println("Nota: " + nota.getNotaExamen() + ", catedra: " + nota.getCatredra());
                total += nota.getNotaExamen();
            }
            double promedio = total / alumnoAlumno.getLista().size();
            System.out.println("Promedio: " + promedio);
            System.out.println("");
        }
        teclado.close();
    }
}