package Ej1;
/*Explique brevemente en qué consisten los siguientes Algoritmos Fundamentales.
Algoritmos de Ordenación:
 Ordenamiento por Inserción
 Algoritmo de la burbuja
 Ordenamiento por selección
 Algoritmo Quick-Sort
Algoritmos de Búsqueda:
 Búsqueda Secuencial
 Búsqueda Binaria
Algoritmos de Recorrido:
 Recorrido de Profundidad
 Recorrido de Anchura */
public class algoritmosFundamentales{
    public static void main(String[] args) {
        /*El ordenamiento por inserción es el más natural ya que ordenamos el contenido tomando el cuenta los anteriores elementos ya ordenados
         * 
         */
        /*Algoritmo de la burbuja: Este algoritmo consiste en comparar cada elemento de la lista con el siguiente (por parejas), si no están en el orden correcto, se intercambian entre sí sus valores hasta que todo el orden de verdadero
         * 
         */
        /*Ordenamiento por selección: se recorre toda la lista buscando el menor de todos los elementos, una vez terminada la recorrida el menor elemento se coloca al inicio de la lista recorrida. En la siguiente iteración se recorre nuevamente la lista pero comenzando en el segundo elemento hasta que solo quede un solo elemento, que será el mayor de la lista.
         * 
         */
        /*Algoritmo quick-sort: se elije un pivote aleatorio de la lista y se separan todos los demas elementos en dos sublistas, los mayores que el pivote y los menores, despues se vuelve a repetir el proceso para las sublistas de manera recursiva, hasta que esté todo ordenado.
         * 
         */
        /*Busqueda secuencial: Este algoritmo busca el elemento dado, recorriendo secuencialmente la lista desde un elemento al siguiente, comenzando en la primera posición de la lista y se detiene cuando encuentra el elemento buscado o bien se alcanza el final de la lista sin haberlo encontrado. 
         * 
         */
        /*Busqueda binaria: funciona solo en listas ordenadas, donde se busca primero el elemento central de la lista, se separan los dos lados en dos sublistas y comparando el objetivo al elemento central se decide cual sublista se seleccionará para inciar el proceso de vuelta, hasta que el elemento central sea el elemento objetivo o no haya más elementos en la lista. 
         * 
         */
        /*Recorrido de profundidad:  En el recorrido en profundidad, el proceso exige un camino desde el nodo raıź a través de un hijo, al descendiente más lejano del primer hijo antes de proseguir a un segundo hijo. En otras palabras, en el recorrido en profundidad, todos los descendientes de un hijo se procesan antes del siguiente hijo. Para saber cómo regresarnos, vamos guardando los nodos visitados en una estructura de pila.
         * 
         */
        /*Recorrido en anchura: el proceso se realiza horizontalmente desde el raıź a todos sus hijos, a continuación, a los hijos de sus hijos y así ́ sucesivamente hasta que todos los nodos han sido procesados. En otras palabras, en el recorrido en anchura, cada nivel se procesa totalmente antes de que comience el siguiente nivel. Para poder saber qué vértices visitar, utilizamos una cola.
         * 
         */
        
    }
}