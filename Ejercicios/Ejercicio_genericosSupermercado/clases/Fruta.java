package Ejercicios.Ejercicio_genericosSupermercado.clases;

public record Fruta(String color, double peso){
    //Constructor
    public Fruta(String color, double peso) {
        this.color = color;
        this.peso = peso;
    }

    public String color() {
        return color;
    }

    public double peso() {
        return peso;
    }
    
}
