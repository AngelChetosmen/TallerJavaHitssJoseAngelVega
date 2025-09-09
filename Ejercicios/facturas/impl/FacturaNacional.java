package Ejercicios.facturas.impl;

import Ejercicios.facturas.interfaces.Factura;

public class FacturaNacional implements Factura{

    private double subtotal;
    private final double IVA;

    public FacturaNacional(double subtotal) {
        this.subtotal = subtotal;
        IVA = 0.16;
    }

    @Override
    public double calcularTotal() {
        return subtotal + (subtotal * IVA);
    }

    @Override
    public String obtenerDetalles() {
        return "Factura Nacional - Subtotal: $" + subtotal + ", IVA: " + (IVA * 100) + "% | Total: $" + calcularTotal();
    }
    
}
