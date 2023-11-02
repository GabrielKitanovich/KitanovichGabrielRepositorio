package Ej3y4;

public class algoritmosClase2 {
    int lista[];
    String opcion;
    public algoritmosClase2(int[] lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }
    public void porInsercionInversa(){
        if (opcion.equals("asc")) {
            for (int i = 1; i < lista.length; i++) {
            int valor = lista[i];
            int j = i-1;
            while (j>= 0 && lista[j] > valor) {
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = valor;
            }
        } else {
            for (int i = 1; i < lista.length; i++) {
            int valor = lista[i];
            int j = i-1;
            while (j>= 0 && lista[j] < valor) {
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = valor;
            }
        }
    }
    public void mostrador(){
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] +  " ");
        }
        System.out.println("");
    }
    public void porBurbujaInversa(){
        int n = lista.length;
        boolean intercambian;
        if (opcion.equals("asc")) {
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
        } else {
            do {
            intercambian = false;
            for (int i = 1; i < n; i++) {
                if (lista[i-1] < lista[i]) {
                    int aux = lista[i-1];
                    lista[i-1] = lista[i];
                    lista[i] = aux;
                    intercambian = true;
                }
            }
            } while (intercambian == true);
        }
    }
    public void porSeleccionInversa(){
        int n = lista.length;
        if (opcion.equals("asc")) {
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
        } else {
            for (int i = 0; i < n-1; i++) {
                int maximo = i;
                for (int j = i+1; j < n; j++) {
                    if (lista[j] > lista[maximo]) {
                        maximo = j;
                    }
                }
                int aux = lista[maximo];
                lista[maximo] = lista[i];
                lista[i] = aux;
            }
        }
    }
}
