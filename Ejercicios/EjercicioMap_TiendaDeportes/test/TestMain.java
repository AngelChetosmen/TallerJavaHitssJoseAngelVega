package Ejercicios.EjercicioMap_TiendaDeportes.test;

import Ejercicios.EjercicioMap_TiendaDeportes.models.Producto;
import java.util.*;

public class TestMain {
    // Mapa para acceso O(1) por SKU
    private static Map<String, Producto> inventarioPorSku = new HashMap<>();
    // Lista para mantener el orden de inserción
    private static List<Producto> ordenInsercion = new ArrayList<>();

    public static void main(String[] args) {
        /*Requisitos del sistema
        1. Registrar productos en el inventario.
        2. Consultar un producto en O(1) usando su código SKU.
        3. Generar un reporte de productos en el orden en que fueron agregados.
        4. Generar un reporte de productos ordenados alfabéticamente por nombre.
        5. Actualizar stock cuando se registren ventas o lleguen nuevas unidades. 
        */

        // Registrar productos
        registrarProducto("TENIS001", "Zapatillas Nike Air", "running", 50);
        registrarProducto("CAMI002", "Camiseta Adidas", "fútbol", 100);
        registrarProducto("BALON003", "Balón Wilson NBA", "baloncesto", 30);
        registrarProducto("TENIS004", "Zapatillas Asics Gel", "running", 20);

        // Consultar producto por SKU
        System.out.println("=== Consulta por SKU ===");
        System.out.println(buscarProductoPorSku("CAMI002"));

        // Reporte por orden de inserción
        System.out.println("\n=== Reporte por orden de inserción ===");
        generarReportePorInsercion().forEach(System.out::println);

        // Reporte ordenado alfabéticamente por nombre
        System.out.println("\n=== Reporte ordenado alfabéticamente ===");
        generarReporteAlfabetico().forEach(System.out::println);

        // Actualizar stock (ejemplo: venta de 5 camisetas)
        actualizarStock("CAMI002", -5);
        System.out.println("\n=== Stock actualizado de CAMI002 ===");
        System.out.println(buscarProductoPorSku("CAMI002"));
        
    }

    public static void registrarProducto(String sku, String nombre, String categoria, int stock) {
        Producto p = new Producto(sku, nombre, categoria, stock);
        inventarioPorSku.put(sku, p);
        ordenInsercion.add(p);
    }

    public static Producto buscarProductoPorSku(String sku) {
        return inventarioPorSku.get(sku);
    }

    public static List<Producto> generarReportePorInsercion() {
        return new ArrayList<>(ordenInsercion);
    }

    public static List<Producto> generarReporteAlfabetico() {
        List<Producto> lista = new ArrayList<>(inventarioPorSku.values());
        lista.sort(Comparator.comparing(Producto::getNombre));
        return lista;
    }

    public static void actualizarStock(String sku, int cambio) {
        Producto p = inventarioPorSku.get(sku);
        if (p != null) {
            int nuevoStock = p.getStock() + cambio;
            if (nuevoStock >= 0) {
                p.setStock(nuevoStock);
            } else {
                System.out.println("Advertencia: Stock insuficiente para " + sku);
            }
        } else {
            System.out.println("Producto no encontrado: " + sku);
        }
    }
}