package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_Arreglos {
    public static void main(String[] args) {
        
        Scanner scanner = new java.util.Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Ingrese 10 números enteros del 1 al 9:");
        for (int i = 0; i < numeros.length; i++) { // Ciclo para llenar valores
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) { //Validar que el numero sea entero
                System.out.println("Entrada no válida. Ingrese un número entero del 1 al 9. ");
                System.out.println("Número :");
                scanner.next(); // Limpiar entrada
            }
            int numero = scanner.nextInt(); // Leer el número ingresado
            while (numero < 1 || numero > 9) { // Validar rango
                System.out.print("Número fuera de rango. Ingrese un número del 1 al 9: ");
                numero = scanner.nextInt();
            }
            numeros[i] = numero;
        }
        int[] ocurrencias = new int[10]; // Arreglo para contar ocurrencias de cada número
        for (int numero : numeros) { // for each para contar ocurrencias
            ocurrencias[numero]++; // Para incrementar el contador del número
        }
        int maxOcurrencias = 0; // Para almacenar la mayor ocurrencia
        int numeroMasRepetido = 0; // Para almacenar el número más repetido
        for (int i = 1; i < ocurrencias.length; i++) { // Ciclo para encontrar el número más repetido
            if (ocurrencias[i] > maxOcurrencias) {
                maxOcurrencias = ocurrencias[i];
                numeroMasRepetido = i;
            }
        }
        //Resultados
        System.out.println("El número que más se repite es: " + numeroMasRepetido);
        System.out.println("La mayor ocurrencia es: " + maxOcurrencias); 
        System.out.println("Arreglo ingresado:" + Arrays.toString(numeros)); // Para referencia, Arrays.toString para imprimir el arreglo
        scanner.close();
    }
    
}
