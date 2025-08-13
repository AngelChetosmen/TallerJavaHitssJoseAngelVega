package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//Declaramos el objeto Scanner para leer datos
        int cantidad; //Variable para almacenar la cantidad de numeros a comparar
        do {// Bucle para asegurarnos de que la cantidad sea al menos 10
            System.out.println("Ingrese la cantidad de numeros a comparar (minimo 10): ");
            cantidad = entrada.nextInt();
            if (cantidad < 10) {// Si la cantidad es menor a 10, mostramos un mensaje y repetimos
                System.out.println("La cantidad debe ser al menos 10. Intente de nuevo.");
            }
        } while (cantidad < 10);
        int menor = Integer.MAX_VALUE;//La idea es iniciar con un numero muy grande para comparar
        for (int i = 0; i < cantidad; i++) {// Bucle para solicitar los numeros
            System.out.print("Ingrese el numero " + (i + 1) + ": ");//i +1 para saber el numero que se ingresa
            int numero = entrada.nextInt();// Leemos el numero ingresado
            if (numero < menor) {// Comparamos el numero ingresado con el menor encontrado hasta ahora
                menor = numero;
            }
        }
        // Mostramos el menor numero encontrado
        System.out.println("El numero menor ingresado es: " + menor);
        if (menor < 10) {// Verificamos si el menor es menor que 10
            System.out.println("El numero: " + menor  + " es menor que 10.");
        } else {
            System.out.println("El numero: " + menor + " es mayor o igual a 10.");   
        }
        entrada.close();// Cerramos el objeto Scanner
    }
    
}
