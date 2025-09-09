package Ejercicios.interfacesCatalogo.impl;

import Ejercicios.interfacesCatalogo.interfaces.ILibro;
import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;
    
    
    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio, 0);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }


    public String getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getEditorial() {
        return editorial;
    }

    public double getPrecioVenta() {
        return getPrecio() * 1.1;
    }

    @Override
    public String toString() {
        return "{Titulo = " + titulo 
        + ", Autor = " + autor
        + ", Editorial = " + editorial
        + " FechaPublicacion = " + fechaPublicacion
        + " Preio = " + getPrecio()
        + " PrecioVenta = " + getPrecioVenta()
        + "}";
    }

}
