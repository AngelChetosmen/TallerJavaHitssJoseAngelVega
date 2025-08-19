package arreglos;

public class Matriz {
    public static void main(String[] args) {
        final int FILAS = 3, COLUMNAS = 2;
        int[][] matriz = new int [FILAS][COLUMNAS];
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        }; //otra forma de inicializar una matriz, si está incompleta en Java es valido
        // Recorrer la matriz
        for(int i = 0; i < matriz.length; i++) { // Recorre las filas
            for(int j = 0; j < matriz[i].length; j++) { // Recorre las columnas
                System.out.print(matriz[i][j] + " "); // Imprime el elemento actual
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        System.out.println("\n Segunda Matriz: ");
        //for each 
        for(int[] fila : matriz1) { // Recorre cada fila de la matriz
            for(int elemento : fila) { // Recorre cada elemento de la fila
                System.out.print(elemento + " "); // Imprime el elemento actual
            }
            System.out.println(); // Salto de línea al final de cada fila
        } //for each ayuda a simplificar la sintaxis con la lectura de matrices y arreglos

    }
    
}
