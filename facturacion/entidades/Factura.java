package facturacion.entidades;

import facturacion.genericos.*;
import java.util.List;

public class Factura implements Identificable<Integer> {
    private Integer id;
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Integer id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Método dinámico para agregar un producto a la lista de productos
    public void aagregarElemento(Producto producto) {
        productos.add(producto); // Agregar el producto a la lista
        System.out.println("Producto agregado: " + producto);
    }

    //Eliminar un producto de lista de productos
    public boolean eliminarProducto(int id) { // Eliminar un producto de la lista
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                productos.remove(i);
                System.out.println("Producto eliminado: " + productos.get(i));

                return true;
            }
        }
        System.out.println("No se encontro el producto con el ID: " + id);
        return false;
    }

    //Calcular el total 
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    // Generar el ticket de la factura
    public String generarReporte(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n==============FACTURA #").append(id).append("==============\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("----------------------------------------------------------------\n");
        for(Producto producto: productos){
            sb.append(producto.getDescripcion()).append(":").append("\t\t$").append(producto.getPrecio()).append("\n");
        }
        sb.append("----------------------------------------------------------------\n");
        sb.append("Total: $").append(calcularTotal()).append("\n");
        sb.append("----------------------------------------------------------------\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Factura {" +
                "id = " + id +
                ", cliente = " + cliente +
                ", productos = " + productos +
                '}';
    }
}
