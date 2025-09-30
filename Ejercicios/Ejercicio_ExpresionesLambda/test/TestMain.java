package Ejercicios.Ejercicio_ExpresionesLambda.test;

import java.util.Scanner;

import Ejercicios.Ejercicio_ExpresionesLambda.interfaces.ProcesadorTexto;

public class TestMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Expresión lambda que elimina espacios, comas y puntos, y convierte a mayúsculas
        ProcesadorTexto procesador = (texto) -> {
            if (texto == null) {
                return "";
            }
            // Eliminar espacios, comas y puntos, y convertir a mayúsculas
            return texto.replaceAll("[\\s,.]", "").toUpperCase();
        };
        
        // Ejemplos de uso
        String frase1 = "Hola, mundo. Esto es una prueba.";
        String frase2 = "Java, 8.0 y lambda expressions.";
        String frase3 = "Remove, spaces. and, dots.";
        
        // Procesar las frases
        System.out.println("=== PROCESADOR DE TEXTO CON LAMBDA ===");
        System.out.println("Frase original: " + frase1);
        System.out.println("Frase procesada: " + procesador.procesar(frase1));
        System.out.println();
        
        System.out.println("Frase original: " + frase2);
        System.out.println("Frase procesada: " + procesador.procesar(frase2));
        System.out.println();
        
        System.out.println("Frase original: " + frase3);
        System.out.println("Frase procesada: " + procesador.procesar(frase3));
        System.out.println();
        
        // Probar con método que recibe la lambda como parámetro
        procesarConLambda(procesador, "Texto, de. prueba con, espacios.");
        
        // Otra forma de definir la lambda directamente
        procesarConLambda(
            txt -> txt.replaceAll("[\\s,.]", "").toUpperCase(),
            "Otra, frase. de ejemplo."
        );

        System.out.println("Ingrese Un texto");
        String texto = entrada.nextLine();
        System.out.println("Texto ingresado: " + texto);
        procesarConLambda(procesador, texto);
        System.out.println("Texto procesado" + procesador.procesar(texto));
        entrada.close();
    }
    
    // Método que recibe un ProcesadorTexto como parámetro
    public static void procesarConLambda(ProcesadorTexto procesador, String texto) {
        String resultado = procesador.procesar(texto);
        System.out.println("Usando método con lambda:");
        System.out.println("Original: " + texto);
        System.out.println("Procesado: " + resultado);
        System.out.println();
    }
}