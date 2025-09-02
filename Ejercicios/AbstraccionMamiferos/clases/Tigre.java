package Ejercicios.AbstraccionMamiferos.clases;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, float tamGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    // Desarrollo de Metodos Abstractos
    @Override
    public String comer() {
        return "El tigre de la especie " + especieTigre + " caza en solitario en " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El tigre de la especie " + especieTigre + " duerme en su guarida en " + getHabitat();
    }

    @Override
    public String correr() {
        return "El tigre de la especie " + especieTigre + " corre a una velocidad máxima de " + getVelocidad() + " km/h en " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge ferozmente para marcar su territorio"; 
    }
    
}
