package Ejercicios.interfacesCatalogo.impl;

import java.util.Date;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.15;
    }

    @Override
    public String toString() {
        return "{ Titulo = " + getTitulo()
        + ", Personaje = " + personaje
        + ", Autor = " + getAutor()
        + ", Editorial = " + getEditorial()
        + ", Preio = " + getPrecio()
        + ", PrecioVenta = " + getPrecioVenta()
        + "}";
    }

    
    
}
