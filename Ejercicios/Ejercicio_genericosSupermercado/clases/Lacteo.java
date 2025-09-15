package Ejercicios.Ejercicio_genericosSupermercado.clases;

public record Lacteo(int cantidad, int proteinas) {
    //Constructor
    public Lacteo(int cantidad, int proteinas) {
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int cantidad() {
        return cantidad;
    }

    public int proteinas() {
        return proteinas;
    }

    

}
