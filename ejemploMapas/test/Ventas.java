package ejemploMapas.test;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
import ejemploMapas.models.*;

public class Ventas {
    public static void main(String[] args) {
        //TreeMap aquí mantenerá un orden natural de las claves (LocalDate)
        TreeMap<LocalDate, Venta> ventas = new TreeMap<>();

        ventas.put(LocalDate.of(2025, 9, 12), 
            new Venta(1, "Pepe", 1500.0));

        ventas.put(LocalDate.of(2025, 9, 10), 
            new Venta(2, "Soledad", 2500.0));

        ventas.put(LocalDate.of(2025, 9, 11), 
            new Venta(3, "Pedro", 3000.0));

        //Mostrar las ventas
        for (Map.Entry<LocalDate, Venta> venta : ventas.entrySet()) {
            System.out.println(venta.getKey() + " - " + venta.getValue());
        }

        // //Obtener la primera y la ultima venta
        // System.out.println("Primera venta registrada: " + ventas.firstEntry().getValue());
        // System.out.println("Ultima venta registrada: " + ventas.lastEntry().getValue()); //Solamente con TreeMap

        // Ventas anteriores a una fecha
        System.out.println("Ventas antes del 2025-09-12");
        for (Map.Entry<LocalDate, Venta> ventaAnterior : ventas.headMap(LocalDate.of(2025, 9, 12)).entrySet()) {
            System.out.println(ventaAnterior.getKey() + " - " + ventaAnterior.getValue());
        }
    }
}
