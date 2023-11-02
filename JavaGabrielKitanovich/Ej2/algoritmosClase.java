package Ej2;

public class algoritmosClase {
    int lista[];
    
    public algoritmosClase(int[] lista) {
        this.lista = lista;
    }

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }
    public void porInsercion(){
        for (int i = 1; i < lista.length; i++) {
            int valor = lista[i];
            int j = i-1;
            while (j>= 0 && lista[j] > valor) {
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = valor;
        }
        
    }
    public void mostrador(){
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] +  " ");
        }
        System.out.println("");
    }
    public void porBurbuja(){
        int n = lista.length;
        boolean intercambian;
        do {
            intercambian = false;
            for (int i = 1; i < n; i++) {
                if (lista[i-1] > lista[i]) {
                    int aux = lista[i-1];
                    lista[i-1] = lista[i];
                    lista[i] = aux;
                    intercambian = true;
                }
            }
        } while (intercambian == true);
    }
    public void porSeleccion(){
        int n = lista.length;
        for (int i = 0; i < n-1; i++) {
            int minimo = i;
            for (int j = i+1; j < n; j++) {
                if (lista[j] < lista[minimo]) {
                    minimo = j;
                }
            }
            int aux = lista[minimo];
            lista[minimo] = lista[i];
            lista[i] = aux;
        }
    }
    public void busquedaSecuencial(String[] arrayStrings, String objetivo){
        int n = arrayStrings.length;
        boolean seEncontro = false;
        for (int i = 0; i < n; i++) {
            if (arrayStrings[i].equals(objetivo)) {
                seEncontro = true;
            }
        }
        if (seEncontro) {
            System.out.println("Se encontró la palabra objetivo en el Array");
        } else {
            System.out.println("No se encontró la palabra objetivo en el Array");
        }
    }
    
}
