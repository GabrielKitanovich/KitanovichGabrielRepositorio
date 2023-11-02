package ArreglosUnidimensionales.Ej1;
public class fueraDeArray {
    public static void main(String[] args) {
        //Cuando se accede a un elemento fuera del tamaño del array ocurrirá el error "java.lang.ArrayIndexOutOfBoundsException"
        int num [] = new int[2];
        num[3] = 4;
        System.out.println(num[3]);
    }
}
