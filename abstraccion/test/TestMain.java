package abstraccion.test;

import abstraccion.clases.Desarrollador;
import abstraccion.clases.Empleado;
import abstraccion.clases.Gerente;
import abstraccion.clases.Vendedor;

public class TestMain {
    public static void main(String[] args) {
        // En una empresa ecisten distintos tipos de empleados.Todos tienen nombre y salario
        // Pero el calculo de bono es diferente segun el tipo de empleado
        Gerente gerente = new Gerente("Pepe", 15000.0);
        Empleado dev = new Desarrollador("Renata", 12000.0);
        Empleado vendedor = new Vendedor("Ana", 10000.0, 50000.0);

        gerente.mostrarInfo();
        System.out.println("Bono del gerente: " + gerente.calcularBono());

        dev.mostrarInfo();
        System.out.println("Bono del desarrollador: " + dev.calcularBono());

        vendedor.mostrarInfo();
        System.out.println("Bono del vendedor: " + vendedor.calcularBono());
    }
}
