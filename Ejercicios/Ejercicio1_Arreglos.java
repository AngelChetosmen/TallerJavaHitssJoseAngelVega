package Ejercicios;

import java.util.Scanner;

public class Ejercicio1_Arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[10]; 
        Scanner scanner = new java.util.Scanner(System.in); //objeto Scanner para leer
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) { //Recorremos el arreglo para llenar los valores
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) { //Validamos que la entrada sea un entero
                System.out.print("Entrada no válida. Ingrese un número entero: ");
                scanner.next(); //Limpiar para no causar bucle infinito
            }
            numeros[i] = scanner.nextInt(); 
        }
        System.out.println("\nNúmeros en el orden solicitado:");
        for (int i = numeros.length - 1; i >= 0; i -= 2) { //Recorremos el arreglo desde el final al principio para cumplir el orden 
            System.out.print(numeros[i] + " "); //número actual
            if (i - 1 >= 0) { //Verifica si no excedemos los límites del arreglo
                System.out.print(numeros[numeros.length - 1 - i] + " "); 
            }
        }
        System.out.println(); 
        // arreglo original para referencia
        System.out.println("\nArreglo original:");
        for (int numero : numeros) { // Recorremos el arreglo para mostrar los números ingresados
            System.out.print(numero + " ");
        }
        scanner.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}