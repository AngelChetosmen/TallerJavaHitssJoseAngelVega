package ciclos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Numero de tabla: ");
        numero = entrada.nextInt();
        System.out.println("Tabla de multiplicar del numero " + numero);
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}
