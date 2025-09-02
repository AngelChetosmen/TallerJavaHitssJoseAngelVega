package Ejercicios.AbstraccionMamiferos.clases;

public abstract class Felino extends Mamifero{
    private float tamGarras;
    private int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, float tamGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamGarras = tamGarras;
        this.velocidad = velocidad;
    }

    public float getTamGarras() {
        return tamGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

}
