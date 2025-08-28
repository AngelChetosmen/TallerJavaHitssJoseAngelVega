package enums;

public enum Calificacion {
    A("Excelente"), 
    B("Buena"), 
    C("Regular"), 
    D("Mala"), 
    E("Muy Mala"), 
    F("Muy Muy Mala");
    
    private final String descripcion;

    Calificacion(String descripcion) { //private Calificacion
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
