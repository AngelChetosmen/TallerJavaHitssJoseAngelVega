package Ejercicios.AbstraccionMamiferos.clases;

public class Leon extends Felino {

    private int numManada;
    private float potenciaRugidoDecibel;
    
    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, float tamGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    // Desarrollo de Metodos Abstractos
    @Override
    public String comer() {
        return "El león caza junto a su grupo de " + numManada + " individuos en " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El león duerme bajo la sombra en " + getHabitat();
    }

    @Override
    public String correr() {
        return "El león corre a una velocidad máxima de " + getVelocidad() + " km/h en " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El león ruge con una potencia de " + potenciaRugidoDecibel + " decibeles en " + getHabitat();
    }
    
}
