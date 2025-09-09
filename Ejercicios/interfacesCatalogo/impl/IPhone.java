package Ejercicios.interfacesCatalogo.impl;

import Ejercicios.interfacesCatalogo.interfaces.IProducto;

public class IPhone extends Electronico implements IProducto{ // extends para heredar el fabricante de Electronico, implements para implementar IProducto
    
    private String modelo;
    private String color;
    private int precio;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(fabricante);
        this.precio = precio;
        this.color = color;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return this.precio;
    }

    public double getPrecioVenta() {
        return precio * 1.2;
    }

    @Override
    public String toString() {
        return "{ Modelo = " + modelo 
        + ", Color = " + color 
        + ", Precio = " + precio 
        + "}";
    }
    
}
