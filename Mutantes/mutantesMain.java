public class mutantesMain {
    public static void main(String[] args) {
        String[][] dnaNoMutante = {
            {"A", "T", "G", "C", "G", "A"},
            {"C", "A", "G", "T", "G", "C"},
            {"T", "T", "A", "T", "T", "T"},
            {"A", "G", "A", "C", "G", "G"},
            {"G", "C", "G", "T", "C", "A"},
            {"T", "C", "A", "C", "T", "G"}
        };
        String[][] dnaMutante = {
            {"A", "T", "G", "C", "G", "A"},
            {"C", "A", "G", "T", "G", "C"},
            {"T", "T", "A", "T", "G", "T"},
            {"A", "G", "A", "A", "G", "G"},
            {"C", "C", "C", "C", "T", "A"},
            {"T", "C", "A", "C", "T", "G"}
        };
        System.out.println("DNA de prueba 1: ");
        sequencePrinter(dnaNoMutante);
        System.out.println("----------------------------------------------------------------");
        System.out.println("DNA de prueba 2: ");
        sequencePrinter(dnaMutante);
        System.out.println("----------------------------------------------------------------");
        int counter = 0;
        String option = "";
        String dnaPersonalizado[][] = new String[6][6];
        System.out.println("Prueba personalizada:");
        for (int i = 0; i < dnaPersonalizado.length; i++) {
            for (int j = 0; j < dnaPersonalizado[0].length; j++) {
                String letra = "";
                do {
                    System.out.print("Escriba la base nitrogenada de la posición [" + i + "] [" + j + "]: ");
                    letra = System.console().readLine();
                    letra = letra.toUpperCase();
                    if (!letra.equals("A") && !letra.equals("C") && !letra.equals("T") && !letra.equals("G")) {
                        System.out.println("La base nitrogenada no es correcta!!!");
                    } else {
                        dnaPersonalizado[i][j] = letra;
                    }
                } while (!letra.equals("A") && !letra.equals("C") && !letra.equals("T") && !letra.equals("G"));
                System.out.println();
            }
        }
        System.out.println("DNA de prueba 3: ");
        sequencePrinter(dnaPersonalizado);
        System.out.println("----------------------------------------------------------------");
        String condicionDeSalida = "";
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Qué secuencia quiere probar?");
            System.out.println("(1) Prueba 1");
            System.out.println("(2) Prueba 2");
            System.out.println("(3) Prueba personalizada");
            option = System.console().readLine();
            System.out.println("----------------------------------------------------------------");
            switch (option) {
                case "1":
                    counter = 0;
                    subMains(counter, dnaNoMutante);
                    break;
                case "2":
                    counter = 0;
                    subMains(counter, dnaMutante);
                    break;
                case "3":
                    counter = 0;
                    subMains(counter, dnaPersonalizado);
                    break;
                default:
                    System.out.println("Secuencia no existe " + option);
                    continue;
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("Quiere probar otra secuencia?");
            System.out.println("1. Si");
            System.out.println("2. No");
            condicionDeSalida = System.console().readLine();
        } while (condicionDeSalida.equals("1"));
    }
    private static boolean isMutant(String[] dna) {
        /*  */
        for (String lineString : dna) {
            if (lineString.contains("AAAA") || lineString.contains("CCCC") || lineString.contains("TTTT") || lineString.contains("GGGG")) {
                return true;
            }
        }
        return false;
    }
    private static int isMutantCounter(String[] dna) {
        int counter = 0;
        for (String lineString : dna) {
            if (lineString.contains("AAAA") || lineString.contains("CCCC") || lineString.contains("TTTT") || lineString.contains("GGGG")) {
                counter++;
            }
        }
        return counter;
    }
    private static void sequencePrinter(String[][] dna){
        for (int i = 0; i < dna.length ; i++) {
            for (int j = 0; j < dna[0].length; j++) {
                System.out.print(dna[i][j] + "   ");
            }
            System.out.println();
        }
    }
    private static String[] horizontalStringMaker(String[][]dna){
        String[] dnaString = new String[dna[0].length];
        String tempString = "";
        for(int i = 0; i < dna.length; i++ ) {
            tempString = "";
            for(int j = 0; j < dna[0].length; j++ ) {
                tempString += dna[i][j];
            }
            dnaString[i] = tempString;
        }
        return dnaString;
    }
    private static String[] verticalStringMaker(String[][]dna){
        String[] dnaString = new String[dna.length];
        String tempString = "";
        for(int i = 0; i < dna.length; i++ ) {
            tempString = "";
            for(int j = 0; j < dna[0].length; j++ ) {
                tempString += dna[j][i];
            }
            dnaString[i] = tempString;
        }
        return dnaString;
    }
    private static String[] diagonalStringMaker(String[][] dna) {
        int filas = 0;
        int columnas = 0;
        String tempString = "";
        String[] diagonals = new String[2];
        for (int i = 0; i < dna.length; i++) {
            tempString += dna[filas][columnas];
            filas++;
            columnas++;
        }
        diagonals[0] = tempString;
        columnas = dna[0].length - 1;
        filas = 0;
        tempString = "";
        for (int i = 0; i < dna[0].length; i++) {
            tempString += dna[filas][columnas];
            filas++;
            columnas--;
        }
        diagonals[1] = tempString;
        return diagonals;
    }
    private static void subMains(int counter, String[][] dna) {
        counter = 0;
        sequencePrinter(dna);
        System.out.println("----------------------------------------------------------------");
        String[] dna2 = horizontalStringMaker(dna);
        if (isMutant(dna2)) {
            counter = isMutantCounter(dna2);
            System.out.println("La secuencia tiene " + isMutantCounter(dna2) + " filas mutantes.");
        } 
        dna2 = verticalStringMaker(dna);
        if (isMutant(dna2)) {
            counter += isMutantCounter(dna2);
            System.out.println("La secuencia tiene " + isMutantCounter(dna2) + " columnas mutantes.");
        } 
        dna2 = diagonalStringMaker(dna);
        if (isMutant(dna2)) {
            counter += isMutantCounter(dna2);
            System.out.println("La secuencia tiene " + isMutantCounter(dna2) + " diagonales mutantes.");
        }
        if (counter >= 2) {
            System.out.println("La secuencia de dna se detectó mutante!!!!");
            return;
        }
        System.out.println("La secuencia de dna es no mutante");
    }
}
