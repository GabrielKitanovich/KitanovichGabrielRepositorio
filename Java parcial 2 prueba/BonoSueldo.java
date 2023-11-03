public class BonoSueldo {
    Empleado empleado;
    int mesLiquidacion;
    int anioLiquidacion;
    double montoLiquidacion;
    String[][] BonoCalculado;
    double totalHaberes;
    double totalDeducciones;
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public int getMesLiquidacion() {
        return mesLiquidacion;
    }
    public void setMesLiquidacion(int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }
    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }
    public void setAnioLiquidacion(int anioLiquidacion) {
        this.anioLiquidacion = anioLiquidacion;
    }
    public double getMontoLiquidacion() {
        return montoLiquidacion;
    }
    public void setMontoLiquidacion(double montoLiquidacion) {
        this.montoLiquidacion = montoLiquidacion;
    }
    public String[][] getBonoCalculado() {
        return BonoCalculado;
    }
    public void setBonoCalculado(String[][] bonoCalculado) {
        BonoCalculado = bonoCalculado;
    }
    public double getTotalHaberes() {
        return totalHaberes;
    }
    public void setTotalHaberes(double totalHaberes) {
        this.totalHaberes = totalHaberes;
    }
    public double getTotalDeducciones() {
        return totalDeducciones;
    }
    public void setTotalDeducciones(double totalDeducciones) {
        this.totalDeducciones = totalDeducciones;
    }
    
}
