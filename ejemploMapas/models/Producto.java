package ejemploMapas.models;

public class Producto {
    private String codigo; 
    private String nombre;
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto {codigo=" + codigo 
        + ", nombre=" + nombre 
        + ", cantidad=" + cantidad 
        + "}";
    }

    
}
