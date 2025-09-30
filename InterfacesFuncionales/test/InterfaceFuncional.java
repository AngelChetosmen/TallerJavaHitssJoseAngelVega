package InterfacesFuncionales.test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class InterfaceFuncional {
    public static void main(String[] args) {
        //BiPredicate<T, U> -> recibe los argumentos (T,U) y devuelve un booleano
        //Uso: Operaciones sobre mapas Map(clave, valor)
        //Uso: Validaciones
        BiPredicate<String, Integer> lon = (s, l) -> s.length() == l;
        System.out.println(lon.test("Hola", 5));
        System.out.println(lon.test("Programacion", 10));

        //BiFunction<T, U R> -> recibe los argumentos (T,U) y devuelve un tipo R
        //Uso: operaciones matematicas, combinación de objetos
        BiFunction<Integer, Integer, Integer> operacion = (a, b) -> a * b; //Operacion
        System.out.println(operacion.apply(5, 3));

        //BiConsumer<T, U> -> recibe los argumentos (T,U) y no devuelve nada
        //Uso: Operaciones sobre mapas Map(clave, valor)
        BiConsumer<String, Integer> imprimir = (s, l) -> System.out.println(s + " tiene " + l + " letras.");
        imprimir.accept("Programacion", 10);

        //UnaryOperator<T> -> recibe un argumento (T) y devuelve un tipo T
        //Uso: Operaciones sobre mapas Map(clave, valor)
        // Uso Transformaciones (normalizar texto, operaciones aritmeticas)
        UnaryOperator <Integer> cuadrado = x -> x * x;
        System.out.println(cuadrado.apply(5));

        //BinaryOperator<T> -> Es un tipo especial de BiFunction <T, T, T>
        //(dos entradas del mismo tipo (T) y devuelve una salida del mismo tipo T)
        //Uso: Operaciones de reducción (suma, maximo, minimo)
        BinaryOperator<Integer> maximo = (a,b) -> a > b ? a : b;
        System.out.println(maximo.apply(23, 45));

        //Function<T, R> -> recibe un argumento (T) y devuelve un tipo R
        //Uso: Operaciones sobre mapas Map(clave, valor)
        Function<String, Integer> longitud = s -> s.length(); //Funcion que devuelve la longitud de un String
        System.out.println("Longitud: " + longitud.apply("Taller de Java"));

        //Consumer<T> -> recibe un argumento (T) y no devuelve nada
        //Uso: Operaciones sobre mapas Map(clave, valor)
        Consumer<String> imprimirConsumer = s -> System.out.println(s);
        imprimirConsumer.accept("Taller de Java");
        System.out.println("Consumer: " + imprimirConsumer);
        //System.out.println("Consumer: " + imprimirConsumer.accept("Taller de java"););
    }
}
