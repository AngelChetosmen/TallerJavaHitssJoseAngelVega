package ciclos;

import java.text.DecimalFormat;

public class FormateoNumeros {
    public static void main(String[] args) {
        //Formateo de numeros
        double numero = 233424.23423423;
        float numero1 = 234.23423423F;
        String cadena = "Hola, como estas?";
        int entero = 1234567;
        System.out.printf("Numero: %,.2f\n", numero);// \n para salto de linea, version C 
        System.out.println("Numero 2:  %.3f" + numero1);
        System.out.println("\t------------------");// \t para tabulador
        System.out.println("String.format:");
        System.out.println(String.format("Numero: %,.2f", numero));//version de Java, "," para separador de miles
        System.out.println(String.format("Cadena %s", cadena)); // %s para cadenas
        System.out.println(String.format("Entero: %,d", entero)); // %d para enteros, %o para octal, %x para hexadecimal
        //Decimal Format
        System.out.println("\t------------------");
        System.out.println("Decimal Format:");
        DecimalFormat df = new DecimalFormat("#,###.00");// Formato con separador de miles y 2 decimales
        System.out.println("Numero: " + df.format(numero));// Formateo con DecimalFormat
    }
    
}
