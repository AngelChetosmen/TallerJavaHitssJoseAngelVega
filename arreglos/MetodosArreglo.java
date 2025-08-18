package arreglos;

import java.util.Arrays;

public class MetodosArreglo {
    public static void main(String[] args) {
        int[] edades = {34, 20, 15, 34, 43, 38, 19, 27, 60, 10};
        System.out.println("Arreglo original: ");
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        } 
        System.out.println("Busqueda: " + Arrays.binarySearch(edades, 10));
        //Arrays.binarySearch(edades, 10);
        Arrays.sort(edades); //mergesort para objetos y quicksort para primitivos
        System.out.println("\nArreglo ordenado de menor a mayor: ");
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }
    }
}
