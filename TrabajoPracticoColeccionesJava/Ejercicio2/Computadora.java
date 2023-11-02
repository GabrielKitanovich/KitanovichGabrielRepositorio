package Ejercicio2;
import java.util.HashSet;
public class Computadora {
    String marca;
    String modelo;
    int cantidadDeComponentes;
    HashSet <ComponenteCPU> componentes = new HashSet<ComponenteCPU>();
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public HashSet<ComponenteCPU> getComponents() {
        return componentes;
    }
    public void setComponents(HashSet<ComponenteCPU> components) {
        this.componentes = components;
    }
    public int getCantidadDeComponentes() {
        return cantidadDeComponentes;
    }
    public void setCantidadDeComponentes(int cantidadDeComponentes){
        this.cantidadDeComponentes = cantidadDeComponentes;
    }
}
