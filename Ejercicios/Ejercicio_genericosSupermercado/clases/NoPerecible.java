package Ejercicios.Ejercicio_genericosSupermercado.clases;

public record NoPerecible(int contenido, int calorias) {
    //Constructor
    public NoPerecible(int contenido, int calorias) {
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int contenido() {
        return contenido;
    }

    public int calorias() {
        return calorias;
    }

}
