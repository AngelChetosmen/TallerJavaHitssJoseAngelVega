package SistemaFacturacionStreams.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalDate fechaVencimiento;
    private List<Venta> ventas;

    public Factura(int id, Cliente cliente, LocalDate fecha, LocalDate fechaVencimiento, List<Venta> ventas) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.fechaVencimiento = fechaVencimiento;
        this.ventas = new ArrayList<>();
    }

    public void agregarVentas(Venta venta) {
        this.ventas.add(venta);
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public double getTotal() {
        return ventas.stream()
                //Venta:: getMonto()  = venta -> venta.getMonto()
                .mapToDouble(Venta::getMonto) //Mapea cada venta a su monto
                .sum(); //Suma todos los montos
    }

    public boolean estaVencida() {
        return LocalDate.now().isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return "Factura #: " + id 
        + " Cliente: " + cliente.getNombre() +
        " Fecha: " + fecha 
        + " Total: " + ventas;
    }
}
