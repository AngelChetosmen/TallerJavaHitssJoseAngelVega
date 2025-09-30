package Ejercicios.Proyecto_InterfazFuncionalLibreria.clases;

import java.util.UUID;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private double precio;   

    // CORRECCIÓN: Elimina el parámetro 'id' del constructor
    public Libro(String titulo, String autor, int anioPublicacion, double precio) {
        this.id = generarId();  // El ID se genera automáticamente
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        validarDatos();
    }

    private String generarId(){
        return "LIB-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    private void validarDatos(){
        if (anioPublicacion < 1900) {  // CORRECCIÓN: Cambié 1990 por 1900
            throw new IllegalArgumentException("El año de publicacion debe ser posterior a 1900");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacio");
        }
    }

    public String toResumen(){
        return String.format("'%s' por %s (%d) - $%.2f", titulo, autor, anioPublicacion, precio);
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return toResumen();
    }
}