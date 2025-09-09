package interfaces.impl;

import interfaces.interfaces.MetodoPago;
public class PagoPayPal implements MetodoPago {

    @Override // Override es para sobreescribir un metodo, indicador de que se esta sobreescribiendo un metodo
    public void pago(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con PayPal");
    }
    
}
