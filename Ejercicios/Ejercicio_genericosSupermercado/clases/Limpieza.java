package Ejercicios.Ejercicio_genericosSupermercado.clases;

public record Limpieza(String componentes, double litros) {
    //Constructor
    public Limpieza(String componentes, double litros) {
        this.componentes = componentes;
        this.litros = litros;
    }

    public String componentes() {
        return componentes;
    }

    public double litros() {
        return litros;
    }

}
