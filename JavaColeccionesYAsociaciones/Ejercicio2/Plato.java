import java.util.ArrayList;
import java.util.List;
public class Plato {
    String nombreCompleto;
    Double precio;
    Boolean esBebida;
    List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Boolean getEsBebida() {
        return esBebida;
    }
    public void setEsBebida(Boolean esBebida) {
        this.esBebida = esBebida;
    }
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
