package escuela.test;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import escuela.clases.Estudiante;


public class TestMain {
    public static void main(String[] args) {
        // Leer un archivo de estudiantes (estudiantes.txt)
        // Procesar los datos (nombre, edad, calificacion)
        // Generar un archivo de reporte (reporte.txt) con estadìsticas
        // -> Número de estudiantes
        // -> Promedio de edad
        // -> Promedio de calificacion
        // -> Mejor y peor calificación (nombre y calificación)
        Path archivoEstudiante = Path.of("D:/Capacitacion HITSS Ago-Oct/escuela/estudiantes.txt");
        Path archivoReporte = Path.of("D:/Capacitacion HITSS Ago-Oct/escuela/reporte.txt");
        try {
            //Leer todas las lineas 
            List<String> lineas = Files.readAllLines(archivoEstudiante);

            //Lista de estudiantes
            List<Estudiante> estudiantes = new ArrayList<>();

            //Convertir cada a un objeto Estudiante
            for (String linea : lineas) {
                String[] elementos = linea.split(",");
                String nombre = elementos[0].trim();
                int edad = Integer.parseInt(elementos[1].trim());
                double calificacion = Double.parseDouble(elementos[2].trim());
                estudiantes.add(new Estudiante(nombre, edad, calificacion));
            }

            // Variables para estadisticas
            int totalEstudiantes = estudiantes.size();
            int sumaEdades = 0;
            double sumaCalificaciones = 0;
            double maximaCalificacion = Double.MIN_VALUE;
            double minimaCalificacion = Double.MAX_VALUE;
            Estudiante mejorEstudiante = null;
            Estudiante peorEstudiante = null;

            // Calcular estadisticas
            for (Estudiante estudiante : estudiantes){
                sumaEdades += estudiante.getEdad();
                sumaCalificaciones += estudiante.getCalificacion();
                if (estudiante.getCalificacion() > maximaCalificacion){
                    maximaCalificacion = estudiante.getCalificacion();
                    mejorEstudiante = estudiante;
                }
                if (estudiante.getCalificacion() < minimaCalificacion){
                    minimaCalificacion = estudiante.getCalificacion();
                    peorEstudiante = estudiante;
                }
            }

        } catch (Exception e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
