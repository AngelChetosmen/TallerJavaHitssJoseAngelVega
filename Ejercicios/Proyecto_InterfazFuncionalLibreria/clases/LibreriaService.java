package Ejercicios.Proyecto_InterfazFuncionalLibreria.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibreriaService {
    private List<Libro> libros;
    private List<Cliente> clientes;
    private List<Venta> ventas;
    
    public LibreriaService() {
        this.libros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    // Métodos para gestionar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    
    public Optional<Libro> buscarLibroPorId(String id) {
        return libros.stream()
                .filter(libro -> libro.getId().equals(id))
                .findFirst();
    }
    
    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        return libros.stream()
                .filter(libro -> libro.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    // Métodos para gestionar clientes
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public Optional<Cliente> buscarClientePorNombre(String nombre) {
        return clientes.stream()
                .filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }
    
    // Métodos para gestionar ventas
    public Venta realizarVenta(String nombreCliente, String idLibro) {
        Cliente cliente = buscarClientePorNombre(nombreCliente)
                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));
        
        Libro libro = buscarLibroPorId(idLibro)
                .orElseThrow(() -> new IllegalArgumentException("Libro no encontrado"));
        
        Venta venta = new Venta(cliente, libro);
        ventas.add(venta);
        cliente.agregarCompra(venta);
        
        return venta;
    }
    
    // Cálculos y reportes
    public double calcularPrecioPromedio() {
        if (libros.isEmpty()) return 0.0;
        
        return libros.stream()
                .mapToDouble(Libro::getPrecio)
                .average()
                .orElse(0.0);
    }
    
    public Optional<Libro> obtenerLibroMasCaro() {
        return libros.stream()
                .max((l1, l2) -> Double.compare(l1.getPrecio(), l2.getPrecio()));
    }
    
    public Optional<Libro> obtenerLibroMasBarato() {
        return libros.stream()
                .min((l1, l2) -> Double.compare(l1.getPrecio(), l2.getPrecio()));
    }
    
    public double calcularDescuento(double precioOriginal, double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        }
        return precioOriginal * (1 - porcentajeDescuento / 100);
    }
    
    // Reportes
    public void imprimirReporteLibros() {
        System.out.println("\n=== REPORTE DE LIBROS ===");
        System.out.printf("Total de libros: %d\n", libros.size());
        System.out.printf("Precio promedio: $%.2f\n", calcularPrecioPromedio());
        
        obtenerLibroMasCaro().ifPresent(libro -> 
            System.out.printf("Libro más caro: %s - $%.2f\n", libro.getTitulo(), libro.getPrecio()));
        
        obtenerLibroMasBarato().ifPresent(libro -> 
            System.out.printf("Libro más barato: %s - $%.2f\n", libro.getTitulo(), libro.getPrecio()));
        
        System.out.println("\nLista de libros:");
        libros.forEach(libro -> System.out.println("  • " + libro.toResumen()));
    }
    
    public void imprimirReporteVentas() {
        System.out.println("\n=== REPORTE DE VENTAS ===");
        System.out.printf("Total de ventas: %d\n", ventas.size());
        
        double totalVentas = ventas.stream()
                .mapToDouble(venta -> venta.getLibro().getPrecio())
                .sum();
        System.out.printf("Total recaudado: $%.2f\n", totalVentas);
        
        System.out.println("\nDetalle de ventas:");
        ventas.forEach(venta -> System.out.println("  • " + venta));
    }
    
    public void imprimirReporteClientes() {
        System.out.println("\n=== REPORTE DE CLIENTES ===");
        System.out.printf("Total de clientes: %d\n", clientes.size());
        
        clientes.forEach(cliente -> {
            System.out.println("\n" + cliente.obtenerResumenCompras());
        });
    }
    
    // Getters para las listas (solo lectura)
    public List<Libro> getLibros() { return new ArrayList<>(libros); }
    public List<Cliente> getClientes() { return new ArrayList<>(clientes); }
    public List<Venta> getVentas() { return new ArrayList<>(ventas); }
}
