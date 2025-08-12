package ciclos;

import java.util.Scanner;
public class SumaHastaCero {
    public static void main(String[] args) {
        //Realizar la suma de un numero solicitado al usuario, mientras
        //el valor del numero no sea cero
        Scanner entrada = new Scanner(System.in);
        int suma = 0, numero;
        System.out.println("Ingrrese el numero: ");
        numero = entrada.nextInt();
        while (numero != 0) {
            suma += numero; // suma = suma + numero
            System.out.print("Ingrrese el numero: ");
            numero = entrada.nextInt();
        }
        System.out.println("La suma total es: " + suma);
        entrada.close();
    }
    
}
