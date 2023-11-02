import java.util.ArrayList;
import java.util.List;
public class alumno {
    String nombreCompleto;
    long legajo;
    List <Nota> lista = new ArrayList<>();
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public long getLegajo() {
        return legajo;
    }
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    public List<Nota> getLista() {
        return lista;
    }
    public void setLista(List<Nota> lista) {
        this.lista = lista;
    }
    
}
