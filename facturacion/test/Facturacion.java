package facturacion.test;

import facturacion.genericos.ServicioGenerico;
import facturacion.entidades.*;
import facturacion.archivos.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Facturacion {
    //Sistema de facturacion
    // Entidades: Cliente, Producto, Factura
    // Servicio Genérico. ID único -> Todas las entidades que implementen de Identificable
    // Guardar entidades
    // Listar las entidades
    // Buscar por ID
    // Actualizar por ID
    // Eliminar por ID

    //Una interfaz genérica identificable 

    //Problema: Escribir y leer un archivo donde se guarde el detalle de la factura
    public static void main(String[] args) {

        //Una clase con mmetodos estaticos, los cuales son: 
        //1.- Guardar n un archivo la factura, con el siguiente nomenclatura en el archivo
            // Nombre del archivo: "factura_idFactura.txt"
        //2.- Leer la factura y mostrar en consola
        //3.- Listar todas las facturas existentes
            //factura_1.txt
            //factura_2.txt

        // Resultado de la aplicacion:
        Factura f1 = new Factura(1, new Cliente("123", "Juan"), new ArrayList<>(Arrays.asList(new Producto(1, "Coca-Cola", 1.50), new Producto(2, "Pepsi", 1.50), new Producto(3, "Sprite", 1.50))));
        // Guardar
        FacturaArchivo.guardarFactura(f1);

        //Leer
        FacturaArchivo.listarFacturas();

        //Listar
        FacturaArchivo.listarFacturas();

        //Servicios
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Integer> facturaServicio = new ServicioGenerico<>();
        // No se acepta la entidad Estudiante porque no implementa Identificable como las demás entidades
        //ServicioGenerico<Estudiante, Integer> estudianteServicio = new ServicioGenerico<>();

        //Clientes
        Cliente cliente1 = new Cliente("123", "Juan");
        Cliente cliente2 = new Cliente("456", "Pedro");
        Cliente cliente3 = new Cliente("789", "Maria");

        //Productos
        Producto producto1 = new Producto(1, "Coca-Cola", 1.50);
        Producto producto2 = new Producto(2, "Pepsi", 1.50);
        Producto producto3 = new Producto(3, "Sprite", 1.50);

        //Facturas
        //List<Producto> nuevaLista = new ArrayList<>(Arrays.asList(producto1, producto2, producto3));

        Factura factura1 = new Factura(1, cliente1, new ArrayList<>());
        Factura factura2 = new Factura(2, cliente2, new ArrayList<>());
        Factura factura3 = new Factura(3, cliente3, new ArrayList<>());

        //Agregar elementos a la factura
        factura1.aagregarElemento(producto1);
        factura1.aagregarElemento(producto2);
        factura2.aagregarElemento(producto1);
        factura3.aagregarElemento(producto3);

        //Guardar elementos
        clienteServicio.guardar(cliente1);
        clienteServicio.guardar(cliente2);
        clienteServicio.guardar(cliente3);
        productoServicio.guardar(producto1);
        productoServicio.guardar(producto2);
        productoServicio.guardar(producto3);
        facturaServicio.guardar(factura1);
        facturaServicio.guardar(factura2);
        facturaServicio.guardar(factura3);

        //Listar elementos
        System.out.println("Clientes: " + clienteServicio.listar());
        System.out.println("Productos: " + productoServicio.listar());
        System.out.println("Facturas: " + facturaServicio.listar());

        //Buscar por ID
        System.out.println("Cliente con ID 123: " + clienteServicio.buscarPorId("123"));

        //Actualizar por ID
        clienteServicio.actualizar("123", new Cliente("123", "Juan Carlos"));

        //Eliminar por ID
        facturaServicio.eliminar(1);

        //Listar elementos actualizados
        System.out.println("Clientes: " + clienteServicio.listar());
        System.out.println("Productos: " + productoServicio.listar());
        System.out.println("Facturas: " + facturaServicio.listar());

        // Metodo

        System.out.println(factura1.generarReporte());
    }
}
