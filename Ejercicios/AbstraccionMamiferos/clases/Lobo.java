package Ejercicios.AbstraccionMamiferos.clases;

public class Lobo extends Canino {
    
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                String color, double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + especieLobo + " caza en manada en " + getHabitat() + " y suele tener " + numCamada + " crías por camada.";
    }

    @Override
    public String dormir() {
        return "El lobo de color " + getColor() + " duerme en las cavernas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "El lobo corre grandes distancias en " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El lobo aúlla en " + getHabitat() + " para comunicarse con su manada.";
    }
}
