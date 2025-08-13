package ciclos;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class ManejoDeNumero {
    public static void main(String[] args) {
        //El Usuario debe ingresar un numero entero
        //Si Escribe texto (en la entrada) o caracteres especiales,
        // el programa seguirá pidiendo un numero entero hasta que se ingrese uno válido.
        int entero = 0;
        Scanner sc = new Scanner(System.in);
        boolean esValido = false;
        do {
            System.out.println("Ingrese un numero entero: ");
            esValido = sc.hasNextInt(); // Verifica si la entrada es un entero hasInt() para verificar si la entrada es un entero
            if (esValido) {
                entero = sc.nextInt();// Si es válido, lo lee
                sc.close();// Cierra el objeto Scanner
            }else {
                System.out.println("No es una entrada numérica. Por favor, ingrese un numero entero.");
                //sc.next(); // Limpia la entrada no válida, evita ciclos infinitos, .next() descarta la entrada 
                //.next() no descarta toda la linea en caso de dos tekens, .nectLine() descarta toda la linea
                sc.nextLine();
            }
        } while (!esValido);// Repite hasta que se ingrese un entero válido
        System.out.println("El numero ingresado es: " + entero);
    }
    
}
