package Ejercicios.sistemaVehiculos.clases;

public abstract class Nissan extends Carro {

    public Nissan(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    @Override
    public double calcularMantenimiento() {
        return 500 + (kilometros * 0.10);
    }

    @Override
    public double calcularCostoMantenimientoAnual() {
        // Costo de mantenimiento específico para Nissan
        return 500 + (kilometros * 0.10); // 4% del precio del vehículo
    }
    
}
