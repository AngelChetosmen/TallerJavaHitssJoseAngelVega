package Ejercicios.AbstraccionMamiferos.clases;

public class Guepardo extends Felino {
    
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, float tamGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
    }

    //Desarrollo de los Metodos Abstractos
    @Override
    public String comer() {
        return "El guepardo caza en " + getHabitat() + " a una velocidad máxima de " + getVelocidad() + " km/h" ;
    }

    @Override
    public String comunicarse() {
        return "El guepardo ruge en " + getHabitat();
    }

    @Override
    public String correr() {
        return "El guepardo corre a una velocidad máxima de " + getVelocidad() + " km/h en " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en " + getHabitat();
    }
    
}
