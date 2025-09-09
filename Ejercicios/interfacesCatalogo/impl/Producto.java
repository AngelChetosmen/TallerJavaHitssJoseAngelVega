package Ejercicios.interfacesCatalogo.impl;

import Ejercicios.interfacesCatalogo.interfaces.IProducto;

public abstract class Producto implements IProducto{
    
    private int precio;
    
    public Producto(int precio, double precioVenta) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
    
}
