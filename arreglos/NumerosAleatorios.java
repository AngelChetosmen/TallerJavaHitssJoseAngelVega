package arreglos;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Numeros aleatorios 
        // Clase Match -> tiene metodos estaticos (random())
        double numero = Math.random()* 10; // Genera un numero aleatorio entre 0.0 y 10.0
        System.out.println("Numero aleatorio entre 0.0 y 1.0: " + numero);
        
        for (int i = 0; i <10; i++){
            int numeroEntero = (int) (Math.random() * 9) + 1; // Genera un numero entero entre 1 y 9
             System.out.println(numeroEntero);
        }
        // Clase Random -> crear una instancia / objeto 
        System.out.println("-----------------");
        System.out.println("Numeros aleatorios con Random");
        Random aleatorio = new Random();
        // int num = aleatorio.nextInt(10); // Genera un numero entero entre Integer.MIN_VALUE y Integer.MAX_VALUE
        int num;
        for (int i = 0; i < 10; i++) {
            num = aleatorio.nextInt(10); // Genera un numero entero entre 0 y 9
            System.out.println(num);
        }
        //System.out.println(num);
        double numDecimal = aleatorio.nextDouble(); // Genera un numero decimal entre 0.0 y 1.0
        System.out.println(numDecimal);
        boolean numBoolean = aleatorio.nextBoolean(); // Genera un booleano (true o false)
        System.out.println(numBoolean);
        // en Random para numeros negativos se pueden hacer si se multiplica por un numero negativo 
        // o bien se puede usar el metodo nextInt(int bound) con un valor negativo
    }
}
