package Ejercicios.AbstraccionMamiferos.clases;

public abstract class Mamifero {
    private String habitat;
    private double altura;
    private double largo;
    private double peso;
    private String nombreCientifico;
    
    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    //Metodo abstractos 
    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();

    @Override
    public String toString() {
        return "Mamifero: {" + "habitat=" + habitat 
        + ", altura=" + altura 
        + ", largo=" + largo 
        + ", peso=" + peso 
        + ", nombreCientifico=" + nombreCientifico 
        + '}';
    }
    
}
