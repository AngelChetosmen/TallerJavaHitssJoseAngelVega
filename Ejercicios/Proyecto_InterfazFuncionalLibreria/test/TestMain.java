package Ejercicios.Proyecto_InterfazFuncionalLibreria.test;

import Ejercicios.Proyecto_InterfazFuncionalLibreria.clases.*;

public class TestMain {
    public static void main(String[] args) {
        LibreriaService libreria = new LibreriaService();
        
        try {
            // Crear algunos libros
            // Libro(String titulo, String autor, int anioPublicacion, double precio)
            Libro libro1 = new Libro("Libro 1", "Autor 1", 2022, 10.5);
            Libro libro2 = new Libro("Libro 2", "Autor 2", 2021, 8.5);
            Libro libro3 = new Libro("Libro 3", "Autor 3", 2020, 12.0);
            Libro libro4 = new Libro("Libro 4", "Autor 4", 2019, 9.5);
            
            // Agregar libros a la librería
            libreria.agregarLibro(libro1);
            libreria.agregarLibro(libro2);
            libreria.agregarLibro(libro3);
            libreria.agregarLibro(libro4);
            
            // Registrar clientes
            Cliente cliente1 = new Cliente("María González", 25, "maria@universidad.edu");
            Cliente cliente2 = new Cliente("Carlos Rodríguez", 22, "carlos@universidad.edu");
            Cliente cliente3 = new Cliente("Ana Martínez", 19);
            
            libreria.registrarCliente(cliente1);
            libreria.registrarCliente(cliente2);
            libreria.registrarCliente(cliente3);
            
            // Realizar ventas
            System.out.println("=== REALIZANDO VENTAS ===");
            Venta venta1 = libreria.realizarVenta("María González", libro1.getId());
            System.out.println(venta1.generarFactura());
            
            Venta venta2 = libreria.realizarVenta("Carlos Rodríguez", libro2.getId());
            System.out.println(venta2.generarFactura());
            
            Venta venta3 = libreria.realizarVenta("Ana Martínez", libro3.getId());
            System.out.println(venta3.generarFactura());
            
            // Generar reportes
            libreria.imprimirReporteLibros();
            libreria.imprimirReporteVentas();
            libreria.imprimirReporteClientes();
            
            // Ejemplo de cálculo de descuento
            System.out.println("\n=== EJEMPLO DE DESCUENTO ===");
            double precioOriginal = 50.0;
            double descuento = 20.0; // 20%
            double precioConDescuento = libreria.calcularDescuento(precioOriginal, descuento);
            System.out.printf("Precio original: $%.2f\n", precioOriginal);
            System.out.printf("Descuento: %.1f%%\n", descuento);
            System.out.printf("Precio con descuento: $%.2f\n", precioConDescuento);
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
