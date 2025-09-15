package repositorioGenerico.test;

import repositorioGenerico.repo.*;
import java.util.List;
import repositorioGenerico.entidades.*;

public class TestMain {
    public static void main(String[] args) {
        Repositorio<Cliente> clienteRepositorio = new Repositorio<>();
        clienteRepositorio.agregar(new Cliente("Angel"));
        clienteRepositorio.agregar(new Cliente ("Susana"));   
        clienteRepositorio.agregar(new Cliente("Juan"));

        List<Cliente> clientes = clienteRepositorio.obtenerTodo();
        // var clientes = clienteRepositorio , otra forma  

        System.out.println("------------Clientes-------------");
        for(Cliente c : clientes){
            System.out.println(c);
        }
        System.out.println("---------------------------------");

        Repositorio<Producto> productoRepositorio = new Repositorio<>();
        productoRepositorio.agregar(new Producto("Coca-Cola", 1.50));
        productoRepositorio.agregar(new Producto("Pepsi", 1.50));
        productoRepositorio.agregar(new Producto("Sprite", 1.50));

        List<Producto> productos = productoRepositorio.obtenerTodo();

        System.out.println("------------Productos------------");
        for(Producto p : productos){
            System.out.println(p);
        }
        System.out.println("---------------------------------");
        
    }
}
