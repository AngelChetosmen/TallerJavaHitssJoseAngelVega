package Ejercicios.EjercicioSet_Deportes.Test;

import java.util.Scanner;
import java.util.Set;
import Ejercicios.EjercicioSet_Deportes.conjuntos.Torneo;
import Ejercicios.EjercicioSet_Deportes.modelos.Jugador;

public class TestMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Torneo torneo = new Torneo();

    public static void main(String[] args) {
        // Datos de prueba iniciales
        inicializarDatosDePrueba();

        while (true) {
            mostrarMenu();
            int opcion = leerOpcion();

            switch (opcion) {
                case 1 -> añadirJugador();              // <-- NUEVA OPCIÓN
                case 2 -> mostrarJugadoresPorDeporte(); // <-- Antes era 1
                case 3 -> contarJugadoresPorDisciplina(); // <-- Antes era 2
                case 4 -> fusionarEquipos();          // <-- Antes era 3
                case 5 -> verJugadoresComunes();      // <-- Antes era 4
                case 6 -> transferirJugador();        // <-- Antes era 5
                case 7 -> mostrarTodosJugadoresOrdenados(); // <-- Antes era 6
                case 8 -> mostrarTodosJugadoresEnOrdenInscripcion(); // <-- Antes era 7
                case 9 -> mostrarRankingPorId();      // <-- Antes era 8
                case 10 -> {                          // <-- Antes era 9
                    System.out.println("¡Gracias por usar el sistema!");
                    return;
                }
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        }
    }

    private static void inicializarDatosDePrueba() {
        // Jugadores de prueba
        Jugador j1 = new Jugador(1, "Ana");
        Jugador j2 = new Jugador(2, "Carlos");
        Jugador j3 = new Jugador(3, "Beatriz");
        Jugador j4 = new Jugador(4, "David");
        Jugador j5 = new Jugador(5, "Elena");

        // Inscripciones iniciales
        torneo.registrarJugador("fútbol", j1);
        torneo.registrarJugador("fútbol", j2);
        torneo.registrarJugador("fútbol", j3);

        torneo.registrarJugador("básquetbol", j2); // Carlos juega ambos
        torneo.registrarJugador("básquetbol", j4);
        torneo.registrarJugador("básquetbol", j5);

        torneo.registrarJugador("vóleibol", j1); // Ana juega fútbol y vóleibol
        torneo.registrarJugador("vóleibol", j5); // Elena juega básquetbol y vóleibol
    }

    private static void mostrarMenu() {
        System.out.println("=== Gestión de Torneo Deportivo Universitario ===");
        System.out.println("1. Añadir jugador.");                     // <-- NUEVO
        System.out.println("2. Mostrar jugadores por deporte.");     // <-- Antes 1
        System.out.println("3. Contar jugadores en cada disciplina."); // <-- Antes 2
        System.out.println("4. Fusionar equipos (unión).");          // <-- Antes 3
        System.out.println("5. Ver jugadores en común (intersección)."); // <-- Antes 4
        System.out.println("6. Transferir un jugador de un deporte a otro."); // <-- Antes 5
        System.out.println("7. Mostrar todos los jugadores ordenados por nombre."); // <-- Antes 6
        System.out.println("8. Mostrar todos los jugadores en orden de inscripción."); // <-- Antes 7
        System.out.println("9. Mostrar ranking de jugadores por ID."); // <-- Antes 8
        System.out.println("10. Salir");                             // <-- Antes 9
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // ▼▼▼▼▼ NUEVO MÉTODO ▼▼▼▼▼
    private static void añadirJugador() {
        System.out.print("Ingrese el ID del jugador: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la disciplina a la que se inscribe: ");
        String disciplina = scanner.nextLine();

        Jugador nuevoJugador = new Jugador(id, nombre);
        boolean exito = torneo.registrarJugador(disciplina, nuevoJugador);

        if (exito) {
            System.out.println("✅ Jugador '" + nombre + "' (ID: " + id + ") inscrito correctamente en " + disciplina + ".");
        } else {
            System.out.println("❌ El jugador ya está inscrito en " + disciplina + ". No se permiten duplicados.");
        }
    }
    // ▲▲▲▲▲ FIN DEL NUEVO MÉTODO ▲▲▲▲▲

    private static void mostrarJugadoresPorDeporte() {
        System.out.print("Ingrese el nombre del deporte: ");
        String deporte = scanner.nextLine();
        System.out.println("¿En qué orden desea verlos? (rapido/orden/alfabetico): ");
        String tipo = scanner.nextLine().trim().toLowerCase();
        if (!tipo.equals("rapido") && !tipo.equals("orden") && !tipo.equals("alfabetico")) {
            tipo = "rapido"; // Por defecto
        }
        torneo.mostrarJugadores(deporte, tipo);
    }

    private static void contarJugadoresPorDisciplina() {
        Set<String> disciplinas = torneo.obtenerDisciplinas();
        System.out.println("=== Conteo de Jugadores por Disciplina ===");
        for (String disciplina : disciplinas) {
            int count = torneo.contarJugadores(disciplina);
            System.out.println(disciplina + ": " + count + " jugadores");
        }
    }

    private static void fusionarEquipos() {
        System.out.print("Ingrese la primera disciplina: ");
        String d1 = scanner.nextLine();
        System.out.print("Ingrese la segunda disciplina: ");
        String d2 = scanner.nextLine();

        Set<Jugador> fusionados = torneo.fusionarEquipos(d1, d2);
        System.out.println("Jugadores únicos en la fusión de " + d1 + " y " + d2 + ":");
        for (Jugador j : fusionados) {
            System.out.println(j);
        }
    }

    private static void verJugadoresComunes() {
        System.out.print("Ingrese la primera disciplina: ");
        String d1 = scanner.nextLine();
        System.out.print("Ingrese la segunda disciplina: ");
        String d2 = scanner.nextLine();

        Set<Jugador> comunes = torneo.jugadoresComunes(d1, d2);
        if (comunes.isEmpty()) {
            System.out.println("No hay jugadores comunes entre " + d1 + " y " + d2 + ".");
        } else {
            System.out.println("Jugadores comunes entre " + d1 + " y " + d2 + ":");
            for (Jugador j : comunes) {
                System.out.println(j);
            }
        }
    }

    private static void transferirJugador() {
        System.out.print("Ingrese el ID del jugador a transferir: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la disciplina de origen: ");
        String de = scanner.nextLine();
        System.out.print("Ingrese la disciplina de destino: ");
        String a = scanner.nextLine();

        // Buscamos el jugador en la disciplina de origen
        Set<Jugador> jugadoresOrigen = torneo.fusionarEquipos(de, ""); // Hack para obtener todos de 'de'
        Jugador jugador = null;
        for (Jugador j : jugadoresOrigen) {
            if (j.getId() == id) {
                jugador = j;
                break;
            }
        }

        if (jugador == null) {
            System.out.println("El jugador con ID " + id + " no está inscrito en " + de + ".");
            return;
        }

        boolean exito = torneo.transferirJugador(de, a, jugador);
        if (exito) {
            System.out.println("Jugador transferido con éxito de " + de + " a " + a + ".");
        } else {
            System.out.println("No se pudo realizar la transferencia.");
        }
    }

    private static void mostrarTodosJugadoresOrdenados() {
        Set<Jugador> todos = torneo.obtenerTodosJugadoresOrdenados();
        System.out.println("=== Todos los jugadores (orden alfabético) ===");
        for (Jugador j : todos) {
            System.out.println(j);
        }
    }

    private static void mostrarTodosJugadoresEnOrdenInscripcion() {
        Set<Jugador> todos = torneo.obtenerTodosJugadoresEnOrdenInscripcion();
        System.out.println("=== Todos los jugadores (orden de inscripción) ===");
        for (Jugador j : todos) {
            System.out.println(j);
        }
    }

    private static void mostrarRankingPorId() {
        Set<Jugador> ranking = torneo.obtenerRankingPorId();
        System.out.println("=== Ranking de jugadores por ID (de menor a mayor) ===");
        for (Jugador j : ranking) {
            System.out.println(j);
        }
    }
}