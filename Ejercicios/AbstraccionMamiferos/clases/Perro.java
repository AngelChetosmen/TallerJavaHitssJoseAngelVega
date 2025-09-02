package Ejercicios.AbstraccionMamiferos.clases;

public class Perro extends Canino {
    private int fuerzaMordida; // en PSI

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro salvaje africano caza en grupo en " + getHabitat() +
               " y tiene una mordida de " + fuerzaMordida + " PSI.";
    }

    @Override
    public String dormir() {
        return "El perro de color " + getColor() + " duerme en madrigueras en " + getHabitat();
    }

    @Override
    public String correr() {
        return "El perro corre largas distancias en busca de presas en " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El perro salvaje africano se comunica con ladridos y gruñidos en " + getHabitat();
    }
}
