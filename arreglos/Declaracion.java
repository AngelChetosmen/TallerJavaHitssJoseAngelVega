package arreglos;

import java.util.Arrays;

public class Declaracion {
    public static void main(String[] args) {
        //Declaracion de un arreglo en Java
        //tipo[] nombreArreglo = new tipo[tamaño];
        int []  numeros; //Declaracion
        numeros = new int[10]; // Inicializamos el arreglo con 5 elementos
        int n = 10; 
        String [] nombres = new String[n]; // Declaración e inicialización de un arreglo de cadenas con valor n 

        // Declarar e inicializar directamente con valores el arreglo
        char[] letras = {'a', 'b', 'c', 'd', 'e'}; // Declaración e inicialización de un arreglo de caracteres, se utilizan llaves para definir los valores. 
        int edades[] = new int[10]; //Solo cambie la posicion de los corchetes, forma valida pero menos común
        Arrays.fill(edades, n); // Llenamos el arreglo con el valor 18 en todas sus posiciones, Arrays es una clase estatica 

        String nombre = "Angel";
        System.out.println("Tamaño nombre: " + nombre.length());
        System.out.println("Tamaño arreglo numeros: " + numeros.length);

        // numeros[0] = 10;
        // numeros[1] = 20;
        // numeros[9] = 100; // Asignacion de valores directamente a los indices del arreglo

        System.out.println("Ultimo elemento: " + numeros[numeros.length - 1]);

        int valor  = 10; 
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = valor; // Asignamos el mismo valor a todos los elementos del arreglo
            valor += 10; // Incrementamos el valor para el siguiente elemento
        }

        // for normal
        for (int i = 0; i < numeros.length; i++) { // Recorremos el arreglo para asignar valores
            System.out.println(numeros[i]); 
        }

        //for each
        System.out.println("\nRecorrido con for-each:");
        for (int numero : numeros) { // Recorremos el arreglo usando for-each
            System.out.println(numero);
        }

        for( int i = 0; i < letras.length; i++) { // Recorremos el arreglo de caracteres
            System.out.println("Letra: " + letras[i]);
        }

        //for each
        System.out.println("\nRecorrido con for-each:");
        for (char c : letras) { // Recorremos el arreglo de caracteres usando for-each
            System.out.println("Letra: " + c);
        }

        /*Otros For*/
        for (int i = 0; i < nombres.length; i++) { // Recorremos el arreglo de cadenas
            System.out.println(nombres[i]);
        }
        for (int i = 0; i < edades.length; i++) { // Recorremos el arreglo de edades
            System.out.println("Edad: " + edades[i]);
        }

        Arrays.fill(edades, 0, 4, 50); // Llenamos las primeras 4 posiciones del arreglo
        for (int i = 0; i < edades.length; i++) { // Recorremos el arreglo de edades con valores actualizados
            System.out.println("Edad: " + edades[i]);
        }
    }
    
}
