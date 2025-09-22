package Ejercicios.EjercicioSet_Deportes.conjuntos;

import Ejercicios.EjercicioSet_Deportes.modelos.Jugador;
import java.util.*;

public class Torneo {
    private final Map<String, Set<Jugador>> inscripcionesRapidas;
    private final Map<String, Set<Jugador>> inscripcionesPorOrden;
    private final Map<String, Set<Jugador>> inscripcionesOrdenadas;

    public Torneo() {
        this.inscripcionesRapidas = new HashMap<>();
        this.inscripcionesPorOrden = new HashMap<>();
        this.inscripcionesOrdenadas = new HashMap<>();
    }

    //Método para inicializar una disciplina si no existe
    private void inicializarDisciplina(String disciplina) {
        inscripcionesRapidas.putIfAbsent(disciplina, new HashSet<>());
        inscripcionesPorOrden.putIfAbsent(disciplina, new TreeSet<>());
        inscripcionesOrdenadas.putIfAbsent(disciplina, new TreeSet<>());
    }

    //Método para registrar un jugador en una disciplina
    public boolean registrarJugador(String disciplina, Jugador jugador) {
        inicializarDisciplina(disciplina);
        boolean agregado = inscripcionesRapidas.get(disciplina).add(jugador);
        if (agregado) {
            inscripcionesPorOrden.get(disciplina).add(jugador);
            inscripcionesOrdenadas.get(disciplina).add(jugador);
        }
        return agregado;
    }

    //Eliminar un jugador de una disciplina
    public boolean eliminarJugador(String disciplina, Jugador jugador) {
        if (!inscripcionesRapidas.containsKey(disciplina)) {
            return false;
        }
        boolean eliminado = inscripcionesRapidas.get(disciplina).remove(jugador);
        if (eliminado) {
            inscripcionesPorOrden.get(disciplina).remove(jugador);
            inscripcionesOrdenadas.get(disciplina).remove(jugador);
        }
        return eliminado;
    }

    //Verificar si un hugador está inscito en una disciplina
    public boolean estaInscrito(String disciplina, Jugador jugador) {
        Set<Jugador> set = inscripcionesRapidas.get(disciplina);
        return set != null && set.contains(jugador);
    }

    //Mostrar todos los jugadores de una disciplina, de acuerdo al tipo de visualización
    public void mostrarJugadores(String disciplina, String tipo) {
        Set<Jugador> set = switch(tipo.toLowerCase()){
            case "orden" -> inscripcionesRapidas.get(disciplina);
            case "alfabetico" -> inscripcionesOrdenadas.get(disciplina);
            default -> inscripcionesPorOrden.get(disciplina); //Por orden de inscripción rápido
        };

        if (set == null || set.isEmpty()) {
            System.out.println("No hay jugadores inscritos en la disciplina: " + disciplina);
            return;
        }

        System.out.println("Jugadores inscritos en: " + disciplina);
        for (Jugador j : set) {
            System.out.println(j);
        }
    }

    // Contar el numero de jugadores en una disciplina
    public int contarJugadores(String disciplina) {
        Set<Jugador> set = inscripcionesRapidas.get(disciplina);
        return set != null ? set.size() : 0;
    }

    //Fusión o unión de los jugadores de dos disciplinas
    public Set<Jugador> fusionarEquipos (String disciplina1, String disciplina2) {
        Set<Jugador> union = new HashSet<>(); //conjunto para almacenar la unión de los jugadores
        if (inscripcionesRapidas.containsKey(disciplina1) && inscripcionesRapidas.containsKey(disciplina2)) {
            union.addAll(inscripcionesRapidas.get(disciplina1)); // Agregar los jugadores de la primera disciplina al conjunto de unión
            union.addAll(inscripcionesRapidas.get(disciplina2)); // Agregar los jugadores de la segunda disciplina al conjunto de unión
        }
        return union;
    }

    //Encontrar la intersección (jugadores en comun) entre dos disciplinas
    public Set<Jugador> jugadoresComunes(String disciplina1, String disciplina2) {
        Set<Jugador> interseccion = new HashSet<>(); //conjunto para almacenar la intersección de los jugadores
        Set<Jugador> set1 = inscripcionesRapidas.get(disciplina1);
        Set<Jugador> set2 = inscripcionesRapidas.get(disciplina2);
        if (set1 != null && set2 != null) {
            interseccion.addAll(set1);
            interseccion.retainAll(set2);
        }
        return interseccion;
    }

    //Transferir un jugador de una disciplina a otra
    public boolean transferirJugador(String de, String a, Jugador jugador) {
        boolean eliminado = eliminarJugador(de, jugador);
        if (eliminado) {
            return registrarJugador(a, jugador);
        }
        return false;
    }

    /*Obtiene todos los jugadores de todas las disciplinas, ordenados alfabéticamente.*/
    public Set<Jugador> obtenerTodosJugadoresOrdenados() {
        Set<Jugador> todos = new TreeSet<>();
        for (Set<Jugador> set : inscripcionesRapidas.values()) {
            todos.addAll(set);
        }
        return todos;
    }

    /*Obtiene todos los jugadores de todas las disciplinas, en orden de inscripción global.*/
    public Set<Jugador> obtenerTodosJugadoresEnOrdenInscripcion() {
        Set<Jugador> todos = new LinkedHashSet<>();
        for (Set<Jugador> set : inscripcionesPorOrden.values()) {
            todos.addAll(set);
        }
        return todos;
    }

    /*Obtiene todos los jugadores de todas las disciplinas, ordenados por ID.*/
    public Set<Jugador> obtenerRankingPorId() {
        Set<Jugador> todos = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        for (Set<Jugador> set : inscripcionesRapidas.values()) {
            todos.addAll(set);
        }
        return todos;
    }

    /*Obtiene la lista de todas las disciplinas registradas.*/
    public Set<String> obtenerDisciplinas() {
        return new HashSet<>(inscripcionesRapidas.keySet());
    }
}
