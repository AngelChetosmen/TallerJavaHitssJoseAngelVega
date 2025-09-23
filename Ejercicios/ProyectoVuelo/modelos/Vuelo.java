package Ejercicios.ProyectoVuelo.modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo implements Comparable<Vuelo> {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDate fechaLlegada;
    private LocalTime horaLlegada;
    private int numPasajeros;

    // Constructor
    public Vuelo(String nombre, String origen, String destino, LocalDate fechaLlegada, LocalTime horaLlegada, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.numPasajeros = numPasajeros;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public LocalDate getFechaLlegada() { return fechaLlegada; }
    public LocalTime getHoraLlegada() { return horaLlegada; }
    public int getNumPasajeros() { return numPasajeros; }

    // Método para obtener fecha y hora combinada como String legible
    public String getFechaHoraLlegadaString() {
        return String.format("%s %s", fechaLlegada.toString(), horaLlegada.toString());
    }

    // Implementación de Comparable para ordenar por fecha y hora de llegada
    @Override
    public int compareTo(Vuelo otro) {
        int cmpFecha = this.fechaLlegada.compareTo(otro.fechaLlegada);
        if (cmpFecha != 0) {
            return cmpFecha;
        }
        return this.horaLlegada.compareTo(otro.horaLlegada);
    }

    // Representación en String para impresión
    @Override
    public String toString() {
        return String.format("%s: %s, aterriza el %s %s", 
            nombre, origen, fechaLlegada.toString(), horaLlegada.toString());
    }
}