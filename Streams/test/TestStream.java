package Streams.test;

import Streams.models.Venta;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors; 

public class TestStream {
    public static void main(String[] args) {
        List<Venta> ventas = List.of(
            new Venta("F001", 1500.0, LocalDate.of(2025, 10, 1)),
            new Venta("F002", 2500.0, LocalDate.of(2025, 10, 1)),
            new Venta("F003", 800.0, LocalDate.of(2025, 10, 2)),
            new Venta("F004", 3000.0, LocalDate.of(2025, 10, 3)),
            new Venta("F005", 3500.0, LocalDate.of(2025, 10, 3))
        );
        ventas.forEach(System.out::println);

        //Total vendido
        double total = ventas.stream()
            .mapToDouble(v -> v.getMonto())
            .sum();
        System.out.println("Total vendido: $" + total);

        // Ventas mayores a 2000
        List<Venta> ventasMayores2000 = ventas.stream()
            .filter(v -> v.getMonto() > 2000)
            .toList();
        System.out.println("Ventas mayores a 2000: " + ventasMayores2000);

        //Agrupar ventas por fecha
        Map<LocalDate, List<Venta>> ventasPorFecha = ventas.stream()
            .collect(Collectors.groupingBy(Venta::getFecha));
        System.out.println("Ventas por fecha: " + ventasPorFecha);

        //Promedio de ventas
        double promedio = ventas.stream()
            .mapToDouble(Venta::getMonto)
            .average()
            .orElse(0.0);
        System.out.println("Promedio de ventas: $" + promedio);
    }
}
