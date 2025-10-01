package Ejercicios.Ejercicio_IfSupermercado.clases;


import java.util.function.*;
public class Supermercado {

    // 1. Filtrar productos con stock bajo (< 5)
    public Predicate<Producto> stockBajo = p -> p.getStock() < 5;

    // 2. Calcular total de una venta
    public Function<Venta, Double> calcularTotal = v ->
            v.productos.stream().mapToDouble(p -> p.getPrecio()).sum();

    // 3. Imprimir detalles de una venta
    public Consumer<Venta> imprimirVenta = v -> {
        System.out.println("Venta #" + v.getIdVenta());
        System.out.println("Cliente: " + v.cliente.getNombre());
        System.out.println("Empleado: " + v.empleado.getNombre());
        v.productos.forEach(p -> System.out.println("- " + p));
        v.setTotal(calcularTotal.apply(v));
        System.out.println("TOTAL: $" + v.getTotal());
    };

    // 4. Generar producto de muestra
    public Supplier<Producto> productoMuestra = () -> new Producto(1, "Producto Prueba", 10.5, 3);

    // 5. Aplicar descuento del 10%
    public UnaryOperator<Producto> aplicarDescuento = p -> {
        p.setPrecio(p.getPrecio( )* 0.9);
        return p;
    };

    // 6. Comparar dos productos y devolver el más caro
    public BinaryOperator<Producto> productoMasCaro = (p1, p2) -> p1.getPrecio() > p2.getPrecio() ? p1 : p2;

    // 7. Verificar si cliente puede tener descuento
    public BiPredicate<Cliente, Venta> clienteConDescuento = (c, v) ->
            c.getTipo().equalsIgnoreCase("VIP") && calcularTotal.apply(v) > 1000;

    // 8. Generar ticket en consola
    public BiConsumer<Cliente, Venta> generarTicket = (c, v) -> {
        System.out.println("===== TICKET DE VENTA =====");
        imprimirVenta.accept(v);
        System.out.println("Gracias por su compra, " + c.getNombre() + "!");
    };

    // 9. Notificar a cliente
    public BiConsumer<Cliente, Empleado> notificarCompra = (c, e) ->
            System.out.println("Estimado " + c.getNombre() + ", su compra fue procesada por " + e.getNombre());
}
