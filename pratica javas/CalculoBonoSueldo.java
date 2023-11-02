import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class CalculoBonoSueldo {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner teclado = new Scanner(System.in);
        String [][] haberes = {{"100","Presentismo", "9"} , {"101","Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104","Otros Haberes", "M"}};
        String [][] deducciones = {{"200", "Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203","Seguro", "1.5"} , {"204","Otros", "M"}};
        List<Integer> codigosIngresados = new ArrayList<Integer>();
        Empleado empleado = new Empleado();
        System.out.println("Hola, escriba el nombre del empleado!!:");
        empleado.setNombreEmpleado(System.console().readLine());
        System.out.println("-------------------------------");
        System.out.println("Escriba el cuil del empleado: ");
        empleado.setCuil(Long.valueOf(System.console().readLine()));
        System.out.println("-------------------------------");
        int anioIngresado = 0; 
        do {
            teclado = new Scanner(System.in);
            System.out.println("Ponga el año de ingreso del empleado: ");
            anioIngresado = teclado.nextInt();
            if (anioIngresado > (date.getYear() + 1900)) {
                System.out.println("Fecha ingresada incorrecta!!!");
            }else {
                empleado.setAnioIngreso(anioIngresado);
            }
        } while (anioIngresado > (date.getYear() + 1900));
        System.out.println("-------------------------------");
        System.out.println("Ingrese el sueldo básico:");
        empleado.setSueldoBasico(Double.valueOf(System.console().readLine()));
        teclado = new Scanner(System.in);
        int anioAntiguedad = (date.getYear() + 1900) - anioIngresado;
        System.out.println("-------------------------------");
        System.out.println("Usted tiene " + anioAntiguedad + " de años de antiguedad, y un monto de antiguedad de: $" + Math.round(empleado.getSueldoBasico() * (anioAntiguedad * 0.02))); 
        empleado.setMontoAntiguedad(empleado.getSueldoBasico() * (anioAntiguedad * 0.02));
        do {
            System.out.println("-------------------------------");
            int iteraiones = 1;
            BonoSueldo bonoSueldo = new BonoSueldo();
            System.out.println("Ingrese el mes de liquidación del bono de sueldo número " + iteraiones + ":");
            teclado = new Scanner(System.in);
            bonoSueldo.setMesLiquidacion(teclado.nextInt());
            int anioLiquidacion = 0;
            do {
                System.out.println("-------------------------------");
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el año de liquidación del bono de sueldo número " + iteraiones + ":");
                anioLiquidacion = teclado.nextInt();
                if (anioLiquidacion > (date.getYear() + 1900)) {
                    System.out.println("Año de liquidación incorrecto!!!");
                    continue;
                }
                bonoSueldo.setAnioLiquidacion(anioLiquidacion);
                break;
            } while (true);
            System.out.println("-------------------------------");
            String bonoCalculado[][] = new String[10][4];
            System.out.println("Ingrese los haberes del empleado");
            int iteraciones2 = 0;
            String codigoIngresadoString = "";
            String condicionDeSalida = "1";
            Boolean sePudo = false;
            Double totalHaberes = 0.0;
            Double totalDeducciones = 0.0;
            do {
                System.out.println("-------------------------------");
                System.out.println("Ingrese el código del haber: ");
                codigoIngresadoString = System.console().readLine();
                if (codigosIngresados.contains(Integer.valueOf(codigoIngresadoString))) {
                    System.out.println("El codigo ya ha sido ingresado!!!");
                    continue;
                }else if (buscadorBidimensional(haberes, codigoIngresadoString)){
                    codigosIngresados.add(Integer.valueOf(codigoIngresadoString));
                    int i = buscadorBidimensionalConCodigo(haberes, codigoIngresadoString);
                    bonoCalculado[iteraciones2][0] = haberes[i][0];
                    bonoCalculado[iteraciones2][1] = haberes[i][1];
                    if (haberes[i][2].equals("M")){
                        teclado = new Scanner(System.in);
                        double porcentaje = 0;
                        System.out.println("-------------------------------");
                        System.out.println("Escriba el porcentaje del sueldo Basico: ");
                        porcentaje = empleado.getSueldoBasico() * (teclado.nextDouble() / 100);
                        bonoCalculado[iteraciones2][2] = String.valueOf(porcentaje);
                        totalHaberes += porcentaje;
                    }else {
                        bonoCalculado[iteraciones2][2] = String.valueOf(empleado.getSueldoBasico() * (Double.valueOf(haberes[i][2])/100));
                        totalHaberes += empleado.getSueldoBasico() * (Double.valueOf(haberes[i][2])/100);
                    }
                    sePudo = true;
                } else {
                    System.out.println("El código no pudo ser encontrado, intentelo de vuelta");
                    continue;
                }
                iteraciones2 +=1;
                if (sePudo) {
                    System.out.println("-------------------------------");
                    System.out.println("Quiere agregar otro haber?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    condicionDeSalida = System.console().readLine();
                } else {
                    System.out.println("Tiene que ingresar al menos 1 bono!!!");
                    continue;
                }
                
            } while (condicionDeSalida.equals("1") || condicionDeSalida.equalsIgnoreCase("Si"));
            condicionDeSalida = "1";
            sePudo = false;
            System.out.println("----------------------------------------------------------------");
            System.out.println("Ingrese las deducciones del empleado");
            do {
                System.out.println("-------------------------------");
                System.out.println("Ingrese el código de decucción: ");
                codigoIngresadoString = System.console().readLine();
                if (codigosIngresados.contains(Integer.valueOf(codigoIngresadoString))) {
                    System.out.println("El codigo ya ha sido ingresado!!!");
                    continue;
                }else if (buscadorBidimensional(deducciones, codigoIngresadoString)){
                    codigosIngresados.add(Integer.valueOf(codigoIngresadoString));
                    int i = buscadorBidimensionalConCodigo(deducciones, codigoIngresadoString);
                    bonoCalculado[iteraciones2][0] = deducciones[i][0];
                    bonoCalculado[iteraciones2][1] = deducciones[i][1];
                    if (deducciones[i][2].equals("M")){
                        teclado = new Scanner(System.in);
                        double porcentaje = 0;
                        System.out.println("-------------------------------");
                        System.out.println("Escriba el porcentaje del sueldo Basico: ");
                        porcentaje = empleado.getSueldoBasico() * (teclado.nextDouble() / 100);
                        bonoCalculado[iteraciones2][3] = String.valueOf(porcentaje);
                        totalDeducciones += porcentaje;
                    }else {
                        bonoCalculado[iteraciones2][3] = String.valueOf(empleado.getSueldoBasico() * (Double.valueOf(deducciones[i][2])/100));
                        totalDeducciones += empleado.getSueldoBasico() * (Double.valueOf(deducciones[i][2])/100);
                    }
                    sePudo = true;
                } else {
                    System.out.println("El código no pudo ser encontrado, intentelo de vuelta");
                    continue;
                }
                iteraciones2 +=1;
                if (sePudo) {
                    System.out.println("-------------------------------");
                    System.out.println("Quiere agregar otra deducción?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    condicionDeSalida = System.console().readLine();
                } else {
                    System.out.println("Tiene que ingresar al menos 1na deducción!!!");
                    continue;
                }
            } while (condicionDeSalida.equals("1") || condicionDeSalida.equalsIgnoreCase("Si"));
            System.out.println("--------------------------------------");
            System.out.printf("Nombre %s%n", empleado.getNombreEmpleado());
            System.out.printf("CUIL %d%n", empleado.getCuil());
            System.out.printf("Mes Liquidación: %d Año Liquidación: %d%n", bonoSueldo.getMesLiquidacion(), bonoSueldo.getAnioLiquidacion());
            System.out.printf("Sueldo Básico %.2f Año Ingreso %d%n", empleado.getSueldoBasico(), empleado.getAnioIngreso());
            System.out.println("Código Ítem Denominación Haberes Deducciones");
            System.out.printf("Sueldo Básico %.2f%n", empleado.getSueldoBasico());
            System.out.printf("Antigüedad %.2f%n", empleado.getMontoAntiguedad());
            for (int i = 0; i < bonoCalculado.length; i++) {
                if (bonoCalculado[i][0] != null) {
                    String codigo = bonoCalculado[i][0];
                    String denominacion = bonoCalculado[i][1];
                    double haber = bonoCalculado[i][2] != null ? Double.parseDouble(bonoCalculado[i][2]) : 0;
                    double deduccion = bonoCalculado[i][3] != null ? Double.parseDouble(bonoCalculado[i][3]) : 0;
                    System.out.printf("%s %s %.2f %.2f%n", codigo, denominacion, haber, deduccion);
                }
            }
            totalHaberes = totalHaberes + empleado.getSueldoBasico() + empleado.getMontoAntiguedad();
            System.out.printf("SUB TOTAL %.2f %.2f%n", totalHaberes, totalDeducciones);
            System.out.printf("NETO %.2f%n", (totalHaberes - totalDeducciones));
            System.out.println("----------------------------------------------------------------");
            iteraiones += 1;
            System.out.println("Quiere calcular otro bono de sueldo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int salidaFinal = Integer.parseInt(System.console().readLine());
            if (salidaFinal == 2) {
                break;
            }
        } while (true);
    }
    public static boolean buscadorBidimensional(String[][] bidi, String codigoIngresado){
        for (int i = 0; i < 5; i++) {
            if (bidi[i][0].equals(codigoIngresado)) {
                return true;
            }
        }
        return false;
    }
    public static int buscadorBidimensionalConCodigo(String[][] bidi, String codigoIngresado){
        for (int i = 0; i < 5; i++) {
            if (bidi[i][0].equals(codigoIngresado)) {
                return i;
            }
        }
        return 0;
    }
}
