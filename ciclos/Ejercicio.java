package ciclos;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero (entero positivo o negativo): ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero (entero positivo o negativo): ");
        int num2 = entrada.nextInt();
        //Numeros absolutos para trabajar positivos al principio
        int numAbsoluto1 = num1 < 0 ? -num1 : num1;
        int numAbsoluto2 = num2 < 0 ? -num2 : num2;
        int resultado = 0;
        for(int i = 0; i < numAbsoluto2; i++){
            resultado += numAbsoluto1;//Multiplicacion = sumas del numero
        }
        if (num1 < 0 && num2 > 0 || (num1 > 0 && num2 <0)) {
            //ajustamos el valor de los signos originales
            resultado = -resultado;
        }
        System.out.println("El resultado de: " + num1 + " x " + num2 + " es " + resultado);
        entrada.close();
    }
}
