package Ejercicios.ProyectoVuelo.test;

import Ejercicios.ProyectoVuelo.listas.ListaVuelos;
import Ejercicios.ProyectoVuelo.modelos.Vuelo;
import java.util.List;

public class testMain {
    public static void main(String[] args) {
        // 1. Obtener la lista original de vuelos (en orden de registro)
        List<Vuelo> listaVuelos = ListaVuelos.obtenerListaOriginal();

        // 2. Ordenar por llegada ascendente
        ListaVuelos.ordenarPorLlegada(listaVuelos);

        // 3. Mostrar listado ordenado
        System.out.println("1.... listado ordenado por fecha llegada ascendente...");
        for (int i = 0; i < listaVuelos.size(); i++) {
            System.out.println((i + 1) + ". " + listaVuelos.get(i));
        }

        // 4. Obtener y mostrar el último vuelo en llegar
        Vuelo ultimoVuelo = ListaVuelos.obtenerUltimoVuelo(listaVuelos);
        System.out.println("\n2. El último vuelo en llegar es " + ultimoVuelo.getNombre() + ": " + ultimoVuelo.getOrigen() + 
                           ", aterriza el " + ultimoVuelo.getFechaLlegada().toString() + " " + ultimoVuelo.getHoraLlegada().toString());

        // 5. Obtener y mostrar el vuelo con menor número de pasajeros
        Vuelo vueloMenorPasajeros = ListaVuelos.obtenerVueloMenorPasajeros(listaVuelos);
        System.out.println("\n3. El vuelo con menor número de pasajeros es " + vueloMenorPasajeros.getNombre() + ": " + 
                           vueloMenorPasajeros.getOrigen() + ", con " + vueloMenorPasajeros.getNumPasajeros() + " pasajeros.");
    }
}