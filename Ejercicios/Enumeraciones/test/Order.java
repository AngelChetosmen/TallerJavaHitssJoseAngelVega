package test;

import enums.OrderPriority;
import enums.OrderStatus;
import enums.PaymentMethod;

public class Order {

    private int id;
    private String cliente;
    private OrderPriority prioridad;
    private OrderStatus estado;
    private PaymentMethod metodoPago;
    
    public Order(int id, String cliente, OrderStatus estado, OrderPriority prioridad, PaymentMethod metodoPago) {
        this.id = id;
        this.cliente = cliente;
        this.estado = estado;
        this.prioridad = prioridad;
        this.metodoPago = metodoPago;
    }

    public void showDetails() {
        System.out.println("Pedido #: " + id);
        System.out.println("Cliente: " + cliente);
        System.out.println("Estado: " + estado.mensaje());
        System.out.println("Prioridad: " + prioridad + " (Nivel: " + prioridad.getPrioridad() + ")");
        System.out.println("Método de pago: "+ metodoPago + " --> " + metodoPago.description() + "\n");
    }
    public String toString() {
        return String.format("Pedido #%d" +
                "%nCliente: %s" +
                "%nEstado: %s --> %s" +
                "%nPrioridad: %s (Nivel %d)" +
                "%nMetodo de pago: %s --> %s",
                id,
                cliente,
                estado, estado.mensaje(),
                prioridad, prioridad.nivel(),
                metodoPago, metodoPago.description());
    }
    
}
