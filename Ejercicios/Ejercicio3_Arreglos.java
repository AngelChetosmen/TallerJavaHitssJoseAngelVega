package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la X (n): ");
        int n = entrada.nextInt();
        if (n <= 0) {
            System.out.println("ERROR");
            entrada.close(); //Cerrar en caso de error
            return; 
        }
        char[][] matriz = new char[n][n]; // Matriz de n x n 
        
        for (int i = 0; i < n; i++) { // Llenar matriz con guiones bajos, si i = 0 empieza en fila 0 
            for (int j = 0; j < n; j++) {
                matriz[i][j] = '_'; // Rellenar con guiones bajos
            }
        }
        // Primero se llena con "_" y luego se colocan las "X"
        for (int i = 0; i < n; i++) { // Colocar X en las diagonales
            matriz[i][i] = 'X'; // Diagonal principal
            matriz[i][n - 1 - i] = 'X'; // n -1 -i = Diagonal secundaria
        }
        // Imprimir la matriz
        System.out.println("Matriz resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
        entrada.close(); 
    }
    
}
