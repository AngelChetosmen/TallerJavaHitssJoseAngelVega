package Ejercicios.interfacesCatalogo.impl;

import Ejercicios.interfacesCatalogo.interfaces.IProducto;

public class TvLcd extends Electronico implements IProducto{
    private int pulgada;
    private int precio; 

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(fabricante);
        this.precio = precio;
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public int getPrecio() {
        return precio;
    }

    public double getPrecioVenta() {
        return precio * 1.3;
    }

    @Override
    public String toString() {
        return "{ Pulgada = " + pulgada 
        + ", Precio = " + getPrecio() 
        + ", GetFabricante() = " + getFabricante()
        + ", GetPrecioVenta() = " + getPrecioVenta() 
        + "}";
    }
    
}
