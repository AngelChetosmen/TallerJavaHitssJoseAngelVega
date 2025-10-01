package Ejercicios.Ejercicio_IfSupermercado.test;

import Ejercicios.Ejercicio_IfSupermercado.clases.*;
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        Supermercado service = new Supermercado();

        // Crear datos de prueba
        Producto p1 = new Producto(1, "Leche", 25, 10);
        Producto p2 = new Producto(2, "Pan", 15, 2);
        Producto p3 = new Producto(3, "Carne", 120, 8);

        Cliente c1 = new Cliente(1, "Juan Perez", "VIP");
        Empleado e1 = new Empleado(1, "Maria Lopez", "Cajera");

        List<Producto> productos = Arrays.asList(p1, p2, p3);
        Venta v1 = new Venta(1, c1, e1, productos, 0);

        // Probar operaciones
        System.out.println("Productos con stock bajo:");
        productos.stream().filter(service.stockBajo).forEach(System.out::println);

        service.imprimirVenta.accept(v1);

        Producto pMuestra = service.productoMuestra.get();
        System.out.println("Producto de muestra: " + pMuestra);

        System.out.println("Producto con descuento: " + service.aplicarDescuento.apply(p1));

        System.out.println("Producto más caro: " + service.productoMasCaro.apply(p1, p3));

        System.out.println("Cliente con descuento? " + service.clienteConDescuento.test(c1, v1));

        service.generarTicket.accept(c1, v1);

        service.notificarCompra.accept(c1, e1);
    }
}
