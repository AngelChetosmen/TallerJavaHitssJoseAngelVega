package SistemaFacturacionStreams.models;

public class Venta { 
    private String factura;
    private Producto producto;
    private String fecha; //Usamos String para simplificar
    private double monto;

    public Venta(String factura, Producto producto, String fecha, double monto) {
        this.factura = factura;
        this.producto = producto;
        this.fecha = fecha;
        this.monto = monto;
    }

    public String getFactura() {
        return factura;
    }



    public void setFactura(String factura) {
        this.factura = factura;
    }



    public Producto getProducto() {
        return producto;
    }



    public void setProducto(Producto producto) {
        this.producto = producto;
    }



    public String getFecha() {
        return fecha;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public double getMonto() {
        return monto;
    }



    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " - $" + monto;
        //return producto.getNombre() + " - $" + producto.getTotal();
        //eturn "Venta [factura=" + factura + ", monto=" + monto + ", fecha=" + fecha + "]";
    } 
}
