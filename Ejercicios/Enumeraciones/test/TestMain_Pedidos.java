package test;

import enums.OrderPriority;
import enums.OrderStatus;
import enums.PaymentMethod;

public class TestMain_Pedidos {

    public static void main(String[] args) {
        Order orden1 = new Order(1, "Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order orden2 = new Order(2, "Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order orden3 = new Order(3, "Martha", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);

        System.out.println("--------- Ordenes ---------");
        orden1.showDetails();
        //System.out.println();
        orden2.showDetails();
        //System.out.println();
        orden3.showDetails();
        // showDetails() funciona para que muestre los detalles de las ordenes
    }
}