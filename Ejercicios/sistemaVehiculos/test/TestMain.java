package Ejercicios.sistemaVehiculos.test;

import Ejercicios.sistemaVehiculos.clases.Bus;
import Ejercicios.sistemaVehiculos.clases.Camion;
import Ejercicios.sistemaVehiculos.clases.Carro;
import Ejercicios.sistemaVehiculos.clases.Vehiculo;

public class TestMain {

    public static void main(String[] args) {

        // Crear instancias de vehículos
        Vehiculo carro = new Carro("Toyota", "Corolla 2025", 30000) {
            @Override
            public double calcularMantenimiento() {
                return 300 + (kilometros * 0.05);
            }

            @Override
            public String toString() {
                return "Carro [" + super.toString() + "]";
            }
        };
        Vehiculo bus = new Bus("Mercedes", "Sprinter 2025", 50000);
        Vehiculo camion = new Camion("Volvo", "Volvo 2025", 80000);

        // Imprimir detalles y costos de mantenimiento
        System.out.println(carro);
        System.out.println("Costo de mantenimiento anual: $" + carro.calcularCostoMantenimientoAnual());

        System.out.println(bus);
        System.out.println("Costo de mantenimiento anual: $" + bus.calcularCostoMantenimientoAnual());

        System.out.println(camion);
        System.out.println("Costo de mantenimiento anual: $" + camion.calcularCostoMantenimientoAnual());   
    }

}
