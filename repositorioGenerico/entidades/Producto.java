package repositorioGenerico.entidades;

public class Producto {
    private String descripcion;
    public Producto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "{Descripcion = " + descripcion + "}";
    }
}
