import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class CalculoBonoSueldo {
    public static void main(String[] args) {
        String[][] haberes = {{"100", "Presentismo", "9"}, {"101", "Titulo Profesional", "9"}, {"102", "Horas Extraordinarias", "M"}, {"103", "Horas Nocturnas", "M"}, {"104", "Otros Haberes", "M"}};
        String[][] deducciones = {{"200", "Obra Social", "3"}, {"201", "Jubilacion", "11"}, {"202", "Sindicato", "2"}, {"203", "Seguro", "1.5"}, {"204", "Otros", "M"}};
        List<Integer> codigosIngresados = new ArrayList<Integer>();
        Empleado empleado = new Empleado();
        Date fecha = new Date();
        int fechInt = fecha.getYear() + 1900;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre del Empleado:");
        empleado.setNombreEmpleado(teclado.nextLine());
        teclado = new Scanner(System.in);
        System.out.println("Escriba el CUIL del empleado: ");
        empleado.setCuil(teclado.nextLong());
        teclado = new Scanner(System.in);
        int anioIngresado = 0;
        do {
            teclado = new Scanner(System.in);
            System.out.println("Escriba el año de ingreso del empleado: ");
            anioIngresado = teclado.nextInt();
            if (anioIngresado > fechInt) {
                System.out.println("Año no puede ser mayor que el año actual!!!");
                continue;
            } else {
                empleado.setAnioIngreso(anioIngresado);
                break;
            }
        } while (true);
        System.out.println("Escriba el sueldo basico: ");
        teclado = new Scanner(System.in);
        empleado.setSueldoBasico(teclado.nextDouble());
        empleado.setMontoAntiguedad(empleado.getSueldoBasico() * ((fechInt - anioIngresado)*0.02));
        do {
            System.out.println("Escriba el es del bono:");
            teclado = new Scanner(System.in);
            BonoSueldo bonoSueldo = new BonoSueldo();
            bonoSueldo.setMesLiquidacion(teclado.nextInt());
            do {
                System.out.println("Escriba el año del bono: ");
                teclado = new Scanner(System.in);
                anioIngresado = teclado.nextInt();
                if (anioIngresado > fechInt) {
                    System.out.println("Año no puede ser mayor que el año actual!!!");
                    continue;
                } else {
                    bonoSueldo.setAnioLiquidacion(anioIngresado);
                    break;
                }
            } while (anioIngresado > fechInt);
            String[][] BonoCalculado = new String[10][4];
            int iteraciones = 0;
            boolean sePudo = false;
            int codigoIngresado = 1;
            Double totalHaberes = 0.0;
            do {
                codigosIngresados.clear();
                System.out.println("Ingrese los Haberes");
                System.out.println("Ingrese el codigo del haber (000 para terminar): ");
                teclado = new Scanner(System.in);
                codigoIngresado = teclado.nextInt();
                if (codigosIngresados.contains(codigoIngresado)){
                    System.out.println("El código ya ha sido ingresado!!!");
                    continue;
                }
                codigosIngresados.add(codigoIngresado);
                for (int index = 0; index < 5; index++) {
                    if (haberes[index][0].equals(String.valueOf(codigoIngresado))) {
                        System.out.println("Código encontrado");
                        BonoCalculado[iteraciones][0] = haberes[index][0];
                        BonoCalculado[iteraciones][1] = haberes[index][1];
                        if (haberes[index][2].equals("M")) {
                            teclado = new Scanner(System.in);
                            System.out.println("Escriba el porcentaje del haber: ");
                            BonoCalculado[iteraciones][2] = String.valueOf(empleado.getSueldoBasico() * (teclado.nextDouble() /100 ));
                            totalHaberes += Double.valueOf(BonoCalculado[iteraciones][2]);
                        } else {
                            BonoCalculado[iteraciones][2] = String.valueOf(empleado.getSueldoBasico() * (Double.valueOf(haberes[index][2]) /100 ));
                            totalHaberes += Double.valueOf(BonoCalculado[iteraciones][2]);
                        }
                        sePudo = true;
                        break;
                    }
                }
                if (!sePudo) {
                    System.out.println("No se encontró el código!!!");
                    continue;
                }
                if (sePudo == false) {
                    System.out.println("El total de los haberes no puede ser 0!!");
                    codigoIngresado = 1;
                }
                iteraciones++;
            } while (codigoIngresado != 000);
            sePudo = false;
            Double totalDeducciones= 0.0;
            do {
                System.out.println("Ingrese las Deducciones: ");
                System.out.println("Ingrese el codigo de las deducciones (000 para terminar): ");
                teclado = new Scanner(System.in);
                codigoIngresado = teclado.nextInt();
                if (codigosIngresados.contains(codigoIngresado)){
                    System.out.println("El código ya ha sido ingresado!!!");
                    continue;
                }
                codigosIngresados.add(codigoIngresado);
                for (int index = 0; index < 5; index++) {
                    if (deducciones[index][0].equals(String.valueOf(codigoIngresado))) {
                        System.out.println("Código encontrado");
                        BonoCalculado[iteraciones][0] = deducciones[index][0];
                        BonoCalculado[iteraciones][1] = deducciones[index][1];
                        if (deducciones[index][2].equals("M")) {
                            teclado = new Scanner(System.in);
                            System.out.println("Escriba el porcentaje del debe: ");
                            BonoCalculado[iteraciones][3] = String.valueOf(empleado.getSueldoBasico() * (teclado.nextDouble() /100 ));
                            totalDeducciones += Double.valueOf(BonoCalculado[iteraciones][3]);
                        } else {
                            BonoCalculado[iteraciones][3] = String.valueOf(empleado.getSueldoBasico() * (Double.valueOf(deducciones[index][2]) /100 ));
                            totalDeducciones += Double.valueOf(BonoCalculado[iteraciones][3]);
                        }
                        sePudo = true;
                        break;
                    }
                }
                if (!sePudo) {
                    System.out.println("No se encontró el código!!!");
                    continue;
                }
                if (sePudo == false) {
                    System.out.println("El total de las deducciones no puede ser 0!!");
                    codigoIngresado = 1;
                }
                iteraciones++;
            } while (codigoIngresado != 000);
            System.out.println("");
            totalHaberes = totalHaberes + empleado.getSueldoBasico() + empleado.getMontoAntiguedad();
            bonoSueldo.setTotalHaberes(totalHaberes);
            bonoSueldo.setTotalDeducciones(totalDeducciones);
            bonoSueldo.setBonoCalculado(BonoCalculado);
            empleado.getBonos().add(bonoSueldo);
            System.out.println("Bonos de Sueldo:");
            for (BonoSueldo bono : empleado.getBonos()) {
            System.out.println("Nombre: " + empleado.getNombreEmpleado());
            System.out.println("CUIL: " + empleado.getCuil());
            System.out.println("Mes Liquidación: " + bono.getMesLiquidacion() + " Año Liquidación: " + bono.getAnioLiquidacion());
            System.out.println("Sueldo Básico " + empleado.getSueldoBasico() + " Año Ingreso " + empleado.getAnioIngreso());
            System.out.println("Código Ítem Denominación Haberes Deducciones");
            for (String[] detalle : bono.getBonoCalculado()) {
                if (detalle[2] != null || detalle[3] != null) {
                    System.out.println(detalle[0] + " " + detalle[1] + " " + (detalle[2] != null ? detalle[2] : "") + " " + (detalle[3] != null ? detalle[3] : ""));
                }
            }
            System.out.println("Sueldo Básico " + empleado.getSueldoBasico());
            System.out.println("Antiguedad: " + empleado.getMontoAntiguedad());
            System.out.println("SUB TOTAL " + bono.getTotalHaberes() + " " + bono.getTotalDeducciones());
            System.out.println("NETO " +  (bono.getTotalHaberes() - bono.getTotalDeducciones()));
            System.out.println();}
            teclado = new Scanner(System.in);
            System.out.println("¿Desea ingresar otro bono de sueldo? (S/N): ");
            String respuesta = teclado.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;}
        } while(true);
    }
}
