package Ejercicios.Proyecto_InterfazFuncionalLibreria.clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Venta {
    private String codigoVenta;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;
    
    public Venta(Cliente cliente, Libro libro) {
        this.codigoVenta = generarCodigoVenta();
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = LocalDate.now();
        validarVenta();
    }
    
    private String generarCodigoVenta() {
        return "VENTA-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
    
    private void validarVenta() {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser nulo");
        }
        if (libro == null) {
            throw new IllegalArgumentException("Libro no puede ser nulo");
        }
    }
    
    public String generarFactura() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format(
            "\n╔══════════════════════════════════╗\n" +
            "║          FACTURA DE VENTA        ║\n" +
            "╠══════════════════════════════════╣\n" +
            "║ Código: %-23s ║\n" +
            "║ Fecha:  %-23s ║\n" +
            "╠══════════════════════════════════╣\n" +
            "║ CLIENTE: %-22s ║\n" +
            "║ LIBRO:   %-22s ║\n" +
            "║ AUTOR:   %-22s ║\n" +
            "╠══════════════════════════════════╣\n" +
            "║ PRECIO:              $%-9.2f ║\n" +
            "╚══════════════════════════════════╝",
            codigoVenta,
            fecha.format(formatter),
            cliente.getNombre(),
            libro.getTitulo().length() > 22 ? libro.getTitulo().substring(0, 19) + "..." : libro.getTitulo(),
            libro.getAutor().length() > 22 ? libro.getAutor().substring(0, 19) + "..." : libro.getAutor(),
            libro.getPrecio()
        );
    }
    
    // Getters
    public String getCodigoVenta() { return codigoVenta; }
    public Cliente getCliente() { return cliente; }
    public Libro getLibro() { return libro; }
    public LocalDate getFecha() { return fecha; }
    
    @Override
    public String toString() {
        return String.format("Venta %s - %s compró %s", codigoVenta, cliente.getNombre(), libro.getTitulo());
    }
}