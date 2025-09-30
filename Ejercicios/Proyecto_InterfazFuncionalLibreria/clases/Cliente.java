package Ejercicios.Proyecto_InterfazFuncionalLibreria.clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int edad;
    private String email;
    private List<Venta> historialCompras;
    
    public Cliente(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.historialCompras = new ArrayList<>();
        validarDatos();
    }

    public Cliente(String nombre, int edad){
        this(nombre,edad, "");
    }

    private void validarDatos() {
        if (edad < 18) {
            throw new IllegalArgumentException("El cliente debe ser mayor de 18 años.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacio.");
        }
    }

    public void agregarCompra(Venta venta){
        historialCompras.add(venta);
    }

    public String obtenerResumenCompras(){
        double totalGastado = historialCompras.stream()
                .mapToDouble(venta -> venta.getLibro().getPrecio())
                .sum();
        return String.format("Cliente: %s\nCompras realizadas: %d\nTotal gastado: $%.2f", 
                           nombre, historialCompras.size(), totalGastado);
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public List<Venta> getHistorialCompras() {
        return historialCompras;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%d años)", nombre, edad);
    }
}
