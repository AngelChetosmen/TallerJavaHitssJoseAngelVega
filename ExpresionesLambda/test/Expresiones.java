package ExpresionesLambda.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ExpresionesLambda.models.*;

public class Expresiones {
    public static void main(String[] args) {
        List<String> nombres = 
                Arrays.asList("Juan", "Eloy", "Angelica", "Elena", "Maria");

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        //Declarativa -> funcional
        System.out.println("==========Forma Funcional==========");
        nombres.forEach(System.out::println);
        //nombres.forEach(n -> System.out.println(n));

        //Delcarativa -> funcional con referencia a metodo
        System.out.println("==========Forma Declarativa (Referencia a metodo)==========");

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Juan", 30));
        clientes.add(new Cliente("Eloy", 30));
        clientes.add(new Cliente("Angelica", 30));
        clientes.add(new Cliente("Elena", 30));
        clientes.add(new Cliente("Maria", 30));

        //Imperativa 
        System.out.println("Listado de Clientes ..............");
        clientes.forEach(c -> System.out.println(c));
        clientes.forEach(System.out::println);
    }
    
}
