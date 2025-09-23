package Ejercicios.ProyectoVuelo.listas;

import Ejercicios.ProyectoVuelo.modelos.Vuelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaVuelos {

    // Método que devuelve una lista de vuelos en el orden original de registro (según tabla)
    public static List<Vuelo> obtenerListaOriginal() {
        List<Vuelo> lista = new ArrayList<>();

        // Agregamos los vuelos en el mismo orden que en la tabla del Excel
        lista.add(new Vuelo("AAL 933", "New York", "Santiago", LocalDate.of(2021, Month.AUGUST, 29), LocalTime.of(5, 39), 62));
        lista.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", LocalDate.of(2021, Month.AUGUST, 31), LocalTime.of(4, 45), 47));
        lista.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", LocalDate.of(2021, Month.AUGUST, 30), LocalTime.of(16, 0), 52));
        lista.add(new Vuelo("DAL 147", "Atlanta", "Santiago", LocalDate.of(2021, Month.AUGUST, 29), LocalTime.of(13, 22), 59));
        lista.add(new Vuelo("AVA 241", "Bogota", "Santiago", LocalDate.of(2021, Month.AUGUST, 31), LocalTime.of(14, 5), 25));
        lista.add(new Vuelo("AMX 10", "Mexico City", "Santiago", LocalDate.of(2021, Month.AUGUST, 31), LocalTime.of(5, 20), 29));
        lista.add(new Vuelo("IBE 6833", "Londres", "Santiago", LocalDate.of(2021, Month.AUGUST, 30), LocalTime.of(8, 45), 55));
        lista.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", LocalDate.of(2021, Month.AUGUST, 29), LocalTime.of(7, 41), 51));
        lista.add(new Vuelo("SKU 803", "Lima", "Santiago", LocalDate.of(2021, Month.AUGUST, 30), LocalTime.of(10, 35), 48));
        lista.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", LocalDate.of(2021, Month.AUGUST, 29), LocalTime.of(9, 14), 59));
        lista.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", LocalDate.of(2021, Month.AUGUST, 31), LocalTime.of(8, 33), 31));
        lista.add(new Vuelo("CMP 111", "Panama City", "Santiago", LocalDate.of(2021, Month.AUGUST, 31), LocalTime.of(15, 15), 29));
        lista.add(new Vuelo("LAT 705", "Madrid", "Santiago", LocalDate.of(2021, Month.AUGUST, 30), LocalTime.of(8, 14), 47));
        lista.add(new Vuelo("AAL 957", "Miami", "Santiago", LocalDate.of(2021, Month.AUGUST, 29), LocalTime.of(22, 53), 60));
        lista.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", LocalDate.of(2021, Month.AUGUST, 31), LocalTime.of(9, 57), 32));
        lista.add(new Vuelo("LAT 1283", "Cancún", "Santiago", LocalDate.of(2021, Month.AUGUST, 31), LocalTime.of(4, 0), 35));
        lista.add(new Vuelo("LAT 579", "Barcelona", "Santiago", LocalDate.of(2021, Month.AUGUST, 29), LocalTime.of(7, 45), 61));
        lista.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", LocalDate.of(2021, Month.AUGUST, 30), LocalTime.of(7, 12), 58));
        lista.add(new Vuelo("LAT 501", "París", "Santiago", LocalDate.of(2021, Month.AUGUST, 29), LocalTime.of(18, 29), 49));
        lista.add(new Vuelo("LAT 405", "Montevideo", "Santiago", LocalDate.of(2021, Month.AUGUST, 30), LocalTime.of(15, 45), 39));

        return lista;
    }

    // Ordena la lista por fecha y hora de llegada ascendente
    public static void ordenarPorLlegada(List<Vuelo> lista) {
        Collections.sort(lista);
    }

    // Devuelve el último vuelo en llegar (el mayor según el orden)
    public static Vuelo obtenerUltimoVuelo(List<Vuelo> lista) {
        if (lista.isEmpty()) return null;
        return lista.get(lista.size() - 1);
    }

    // Devuelve el vuelo con menor número de pasajeros
    public static Vuelo obtenerVueloMenorPasajeros(List<Vuelo> lista) {
        if (lista.isEmpty()) return null;
        return Collections.min(lista, (v1, v2) -> Integer.compare(v1.getNumPasajeros(), v2.getNumPasajeros()));
    }
}