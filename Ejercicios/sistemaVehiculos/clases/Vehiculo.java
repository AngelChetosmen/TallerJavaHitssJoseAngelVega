package Ejercicios.sistemaVehiculos.clases;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int kilometros; 

    public Vehiculo(String marca, String modelo, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public abstract double calcularMantenimiento();
    
    @Override
    public String toString() {
        return "{Marca:" + marca 
        + ", Modelo:" + modelo 
        + ", Kilometros: " + kilometros 
        + "}";
    }

    public abstract double calcularCostoMantenimientoAnual();

}
