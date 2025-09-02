package Ejercicios.Herencia_Empleados.test;

import Ejercicios.Herencia_Empleados.clases.Empleado;
import Ejercicios.Herencia_Empleados.clases.Gerente;
import Ejercicios.Herencia_Empleados.clases.Persona;
import Ejercicios.Herencia_Empleados.clases.Cliente;

public class TestMain {
    public static void main(String[] args) {

        // Ejemplo de Empleado desde un set y get e imprimir por medio de toString()
        Empleado empleado = new Empleado(1, "Pepe", "Perez", 12345678, "Calle 1", 1000.0);
        System.out.println("\nEmpleado: \n");
        System.out.println(empleado.toString());
        //empleado.mostrarInfo(); // A traves del metodo mostrarInfo() de la clase Empleado

        //  Ejemplo de un Cliente e imprimir todos sus datos
        Cliente cliente = new Cliente(2, "Maria", "Gutierrez", 23456789, "Calle 2");
        System.out.println("\nCliente: \n");
        System.out.println(cliente.toString());
        //cliente.mostrarInfo(); // A traves del metodo mostrarInfo() de la clase Cliente

        //  Ejemplo de una Persona
        Persona persona = new Persona("Pepe", "Perez", 12345678, "Calle 1");
        System.out.println("\nPersona: \n");
        System.out.println(persona.toString());
        //persona.mostrarInfo(); // A traves del metodo mostrarInfo() de la clase Persona

        //  Ejemplo de un Gerente e imprimir todos sus datos
        Gerente gerente = new Gerente(2, "Maria", "Gutierrez", 23456789, "Calle 2", 4000.0, 15000.0);
        System.out.println("\nGerente: \n");
        System.out.println("Gerente remuneracion: " + gerente.aumentarRemuneracion(1500.0));
        System.out.println(gerente.toString());
        //gerente.mostrarInfo(); // A traves del metodo mostrarInfo() de la clase Gerente

    }
}
