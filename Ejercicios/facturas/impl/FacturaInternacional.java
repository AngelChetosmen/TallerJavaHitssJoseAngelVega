package Ejercicios.facturas.impl;

import Ejercicios.facturas.interfaces.Factura;

public class FacturaInternacional implements Factura {
    private double subtotal;
    private final double TAX;
    
    public FacturaInternacional(double subtotal) {
        this.subtotal = subtotal;
        TAX = 0.25;
    }
    
    public double calcularTotal() {
        return subtotal + (subtotal * TAX);
    }
    
    public String obtenerDetalles() {
        return "Factura Internacional - Subtotal: $" + subtotal + ", TAX: " + (TAX * 100) + "% | Total: $" + calcularTotal();
    }
    
}
