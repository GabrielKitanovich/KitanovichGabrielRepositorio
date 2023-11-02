package Ej2;
import java.util.Arrays;
public class algoritmosFundamentalesCodigo {
    public static void main(String[] args) {
        int lista[] = {1, 2, 7, 5, 3, 8, 17, 22, 0, 64, -125};
        String listaString[] = {"1", "2", "7", "5", "3", "8", "17", "22", "0", "64", "-125"};
        algoritmosClase listaObjeto = new algoritmosClase(Arrays.copyOf(lista, lista.length));
        algoritmosClase listaObjeto2 = new algoritmosClase(Arrays.copyOf(lista, lista.length));
        algoritmosClase listaObjeto3 = new algoritmosClase(Arrays.copyOf(lista, lista.length));
        System.out.println("Lista ordenada por Inserción");
        listaObjeto.porInsercion();
        listaObjeto.mostrador();
        System.out.println("Lista ordenada por Burbuja");
        listaObjeto2.porBurbuja();
        listaObjeto2.mostrador();
        System.out.println("Lista ordenada por Selección");
        listaObjeto3.porSeleccion();
        listaObjeto3.mostrador();
        System.out.println("Se busca '-125' en el Array");
        listaObjeto.busquedaSecuencial(listaString, "-125");
    }
}
