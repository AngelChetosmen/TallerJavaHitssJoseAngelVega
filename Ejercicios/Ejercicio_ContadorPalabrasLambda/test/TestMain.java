package Ejercicios.Ejercicio_ContadorPalabrasLambda.test;

import Ejercicios.Ejercicio_ContadorPalabrasLambda.interfaces.ContadorPalabras;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class TestMain {
    public static void main(String[] args) {
        // Expresión lambda que encuentra la palabra más repetida
        ContadorPalabras contador = (frase) -> {
            if (frase == null || frase.trim().isEmpty()) {
                return Collections.emptyMap();
            }
            
            // Convertir a minúsculas y dividir en palabras (eliminar puntuación)
            String[] palabras = frase.toLowerCase()
                                  .replaceAll("[^a-zA-Záéíóúüñ\\s]", "")
                                  .split("\\s+");
            
            // Contar frecuencia de palabras
            Map<String, Integer> frecuencia = new HashMap<>();
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
                }
            }
            
            // Encontrar la palabra con máxima frecuencia
            String palabraMasRepetida = null;
            int maxFrecuencia = 0;
            
            for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
                if (entry.getValue() > maxFrecuencia) {
                    maxFrecuencia = entry.getValue();
                    palabraMasRepetida = entry.getKey();
                }
            }
            
            // Crear Map resultado con solo la palabra más repetida
            Map<String, Integer> resultado = new HashMap<>();
            if (palabraMasRepetida != null) {
                resultado.put(palabraMasRepetida, maxFrecuencia);
            }
            
            return resultado;
        };
        
        // Ejemplos de uso
        System.out.println("=== CONTADOR DE PALABRAS MÁS REPETIDAS ===\n");
        
        String frase1 = "El sol brilla y el cielo está despejado";
        String frase2 = "Java es genial, java es poderoso, java es divertido";
        String frase3 = "amor amor amor paz paz paz paz felicidad felicidad";
        String frase4 = "Hola hola hola mundo mundo hola hola Hi";
        
        // Procesar frases
        procesarFrase(contador, frase1);
        procesarFrase(contador, frase2);
        procesarFrase(contador, frase3);
        procesarFrase(contador, frase4);
        
        // Probar con frase vacía
        procesarFrase(contador, "");
    }
    
    // Método para procesar y mostrar resultados
    public static void procesarFrase(ContadorPalabras contador, String frase) {
        System.out.println("Frase: \"" + frase + "\"");
        
        Map<String, Integer> resultado = contador.encontrarPalabraMasRepetida(frase);
        
        if (resultado.isEmpty()) {
            System.out.println("No hay palabras para contar.\n");
            return;
        }
        
        // Mostrar iterando el Map
        System.out.println("Iterando el Map:");
        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
            System.out.println("  Palabra: '" + entry.getKey() + "' - Repeticiones: " + entry.getValue());
        }
        
        // Mostrar usando get() - obteniendo el primer elemento
        System.out.println("Usando get() con la primera clave:");
        String primeraClave = resultado.keySet().iterator().next();
        System.out.println("  resultado.get(\"" + primeraClave + "\") = " + resultado.get(primeraClave));
        
        System.out.println("---\n");
    }
}
