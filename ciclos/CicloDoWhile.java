package ciclos;

import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        //Ciclo Do While
        Scanner sc = new Scanner(System.in);//objeto para entrada de datos
        int i;//ingresar numeros y repetir hasta que se ingrese un 0
        do {
            System.out.println("Ingrese un numero (0 para salir): ");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("Ingresaste el valor de i como: " + i);
    }
    
}
