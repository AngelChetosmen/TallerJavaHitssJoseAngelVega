package Ejercicios.facturas.test;

import Ejercicios.facturas.interfaces.Factura;
import Ejercicios.facturas.impl.FacturaInternacional;
import Ejercicios.facturas.impl.FacturaNacional;

public class PruebaFactura {

    public static void main(String[] args) {

        Factura factura1 = new FacturaNacional(10000);
        Factura factura2 = new FacturaInternacional(2000);

        System.out.println(factura1.obtenerDetalles());
        System.out.println(factura2.obtenerDetalles());
    }
    
}
