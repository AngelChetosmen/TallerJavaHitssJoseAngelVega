package Ejercicios.Ejercicio_IfSupermercado.clases;

import java.util.List;

public class Venta {
    private int idVenta;
    public Cliente cliente;
    public Empleado empleado;
    public List<Producto> productos;
    private double total;

    public Venta(int idVenta, Cliente cliente, Empleado empleado, List<Producto> productos, double total) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.total = total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
