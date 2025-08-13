package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// Creamos un objeto Scanner para leer la entrada del usuario
        // Variables para almacenar las sumas y contadores
        double sumaMayoresIgual6 = 0;
        double sumaMenores6 = 0;
        double sumaTotal = 0;
        // Contadores para las notas mayores o iguales a 6 y menores a 6
        int contadorMayoresIgual6 = 0;
        int contadorMenores6 = 0;
        for(int i = 0; i <=20; i++){// Bucle para solicitar 20 notas
            System.out.print("Ingrese la nota: " + i + " (0 para salir): ");
            double nota = entrada.nextDouble();
            if(nota <= 0){// Verificamos si la nota es 0 o negativa
                System.out.println("Error: se ingresó 0 o bien un numero negativo. Programa finalizado.");
                return; // Salimos del programa si se ingresa 0 o un número negativo    
            }
            if (nota > 10) {// Verificamos si la nota está fuera del rango permitido
                System.out.println("Error: la nota debe estar entre 0 y 10. Intente de nuevo.");
                i--;// Decrementamos i para repetir la iteración actual 
                continue;     
            }
            sumaTotal += nota; // Acumulamos la suma total de las notas
            if (nota>=6) {// Verificamos si la nota es mayor o igual a 6
                sumaMayoresIgual6 += nota; // Acumulamos la suma de notas mayores o iguales a 6
                contadorMayoresIgual6++; // Contamos las notas mayores o iguales a 6    
            }else {// Si la nota es menor a 6
                sumaMenores6 += nota; // Acumulamos la suma de notas menores a 6
                contadorMenores6++; // Contamos las notas menores a 6    
            }
        }
        // Resultados
        System.out.println("");//Espacio de linea
        System.out.println("Resultados: ");
        if (contadorMayoresIgual6 > 0) {// Verificamos si hay notas mayores o iguales a 6
            System.out.println("Promedio de notas mayores o iguales a 6: " + (sumaMayoresIgual6 / contadorMayoresIgual6));
        } else {// Si no hay notas mayores o iguales a 6
            System.out.println("No hay notas mayores o iguales a 6.");    
        }
        if (contadorMenores6 > 0) {// Verificamos si hay notas menores a 6
            System.out.println("Promedio de notas menores a 6: " + (sumaMenores6 / contadorMenores6));
        } else {// Si no hay notas menores a 6
            System.out.println("No hay notas menores a 6.");    
        }
        System.out.println("Cantidad de notas >=6: " + contadorMayoresIgual6);
        System.out.println("Cantidad de notas <6: " + contadorMenores6);
        System.out.println("Promedio total: " + (sumaTotal / (contadorMayoresIgual6 + contadorMenores6)));
        entrada.close(); // Cerramos el objeto Scanner
    }
    
}
