package flujo;
 
import java.util.Scanner;
 
public class Caracteres {
    //Saber si el caracter dado por el usuario es una vocal, o una consonante
    //un numero, o caracter especial
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        char caracter;
 
        System.out.println("Caracter: ");
        caracter = entrada.next().charAt(0);
        if (Character.isLetter(caracter)) {
            //Si es vocal o consonante
            System.out.println("Es una letra: " + caracter);
            //Si es vocal o consonante
            char c = Character.toLowerCase(caracter);
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    System.out.println("El caracter: " + caracter + " es una vocal");
                }
                default -> System.out.println("El caracter: " + caracter + " es una consonante");
            }
        } else if (Character.isDigit(caracter)){
            //Si es un numero
            System.out.println("Es un numero: " + caracter);
        } else { 
            System.out.println("Es un caracter especial: " + caracter);
        }
    }
 
}