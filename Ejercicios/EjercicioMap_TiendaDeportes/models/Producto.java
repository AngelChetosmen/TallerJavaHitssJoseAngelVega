package Ejercicios.EjercicioMap_TiendaDeportes.models;

public class Producto {
    private String sku;
    private String nombre;
    private String categoria;
    private int stock;

    public Producto(String sku, String nombre, String categoria, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Getters y Setters
    public String getSku() { 
        return sku;
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getCategoria() { 
        return categoria; 
    }
    public int getStock() { 
        return stock; 
    }

    public void setStock(int stock) { 
        this.stock = stock; 
    }

    @Override
    public String toString() {
        return "Producto{" +
                "sku='" + sku +
                ", nombre='" + nombre +
                ", categoria='" + categoria +
                ", stock=" + stock +
                '}';
    }
}