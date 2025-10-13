package SistemaFacturacionStreams.test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import SistemaFacturacionStreams.models.Cliente;
import SistemaFacturacionStreams.models.Factura;
import SistemaFacturacionStreams.models.Producto;
import SistemaFacturacionStreams.models.Venta;

public class PruebaFacturacion {
    public static void main(String[] args) {
        //Clientes
        Cliente c1 = new Cliente(1, "Juan Perez","juanperez@empresa.com");
        Cliente c2 = new Cliente(2, "Maria Gomez","mariagomez@empresa.com");
        Cliente c3 = new Cliente(3, "Carlos Ruiz","carlosruiz@empresa.com");
        Cliente c4 = new Cliente(4, "Ana Torres","anatorres@empresa.com");

        //Productos
        Producto p1 = new Producto(1, "Laptop", 1500.0);
        Producto p2 = new Producto(2, "Smartphone", 800.0);
        Producto p3 = new Producto(3, "Tablet", 600.0);
        Producto p4 = new Producto(4, "Monitor", 300.0);

        // Facturas y Ventas
        Factura f1 = new Factura(1, c1, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 31), null);

        f1.agregarVentas(new Venta("F001", p4, "2023-10-01", 300.0)); // 300.0, 0));        // 1500.0
        f1.agregarVentas(new Venta("F002", p2, "2023-10-01", 800.0)); // 800.0, 0));         // 800.0

        Factura f2 = new Factura(2, c2, LocalDate.of(2023, 10, 2), LocalDate.of(2023, 11, 1), null);
        f2.agregarVentas(new Venta("F003", p3, "2023-10-02", 600.0)); // 600.0, 0));         // 600.0
        f2.agregarVentas(new Venta("F004", p1, "2023-10-02", 1500.0)); // 1500.0, 0));        // 1500.0

        Factura f3 = new Factura(3, c3, LocalDate.of(2023, 10, 3), LocalDate.of(2023, 11, 2), null);
        f3.agregarVentas(new Venta("F005", p1, "2023-10-03", 1500.0)); // 1500.0, 0));        // 1500.0
        f3.agregarVentas(new Venta("F006", p2, "2023-10-03", 800.0)); // 800.0, 0));         // 800.0

        Factura f4 = new Factura(4, c4, LocalDate.of(2023, 10, 4), LocalDate.of(2023, 11, 3), null);
        f4.agregarVentas(new Venta("F007", p4, "2023-10-04", 300.0)); // 300.0, 0));         // 300.0
        f4.agregarVentas(new Venta("F008", p3, "2023-10-04", 600.0)); // 600.0, 0));         // 600.0

        //Lista de Facturas
        List<Factura> facturas = List.of(f1, f2, f3, f4);
        facturas.forEach(System.out::println);

        //1.- Total de ventas por cliente 
        System.out.println("=== Total de ventas por cliente ===");
        facturas.stream().collect(Collectors.groupingBy(Factura::getCliente, Collectors.summingDouble(Factura::getTotal))).forEach((cliente, total) -> System.out.println(cliente  + "-> $" + total));

        //3.- Top 3 productos mas vendidos
        System.out.println("=== Top 3 productos mas vendidos ===");
        facturas.stream()
            .flatMap(f -> f.getVentas().stream()) //Stream<Venta>
            .collect(Collectors.groupingBy(Venta::getProducto, Collectors.summingInt(v -> 1))) //Map<Producto, Integer>
            .entrySet().stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) //Ordena de mayor a menor
            .limit(3) //Toma los 3 primeros
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue() + " unidades"));
            
        // 4.- 
    }
}
