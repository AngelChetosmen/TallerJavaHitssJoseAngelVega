package Ejercicios.sistemaVehiculos.clases;

public class Bus extends Vehiculo{
    
    public Bus(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros); // super funciona como el this pero para la clase padre
        // Clase padre es Vehiculo
    }

    @Override
    public double calcularMantenimiento() {
        return 1000 + (kilometros * 0.20);
    }
    
    @Override
    public double calcularCostoMantenimientoAnual() {
        return calcularMantenimiento() * 12;
    }
}
