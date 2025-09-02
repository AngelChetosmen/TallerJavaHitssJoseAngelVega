package Ejercicios.sistemaVehiculos.clases;

public abstract class Carro extends Vehiculo{

    public Carro(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    @Override
    public abstract double calcularMantenimiento();

    public double calcularCostoMantenimientoAnual() {
        return calcularMantenimiento() * 12;
    }
}
