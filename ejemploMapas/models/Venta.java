package ejemploMapas.models;

public class Venta {
    // Atributos de la venta
    private int idVenta;
    private String cliente; 
    private double monto;

    public Venta(int idVenta, String cliente, double monto) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Venta {idVenta=" + idVenta 
        + ", cliente=" + cliente 
        + ", monto=" + monto 
        + "}";
    }

    
}
