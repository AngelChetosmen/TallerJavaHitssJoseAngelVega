package Streams.flujos;

import java.util.List;
import java.util.stream.Collectors;

public class OperacionesIntermedias {
    public static void main(String[] args) {
        // Ejemplo de operaciones intermedias en Streams
        // Son aquellas que transforman un Stream en otro Stream
        // Un Stream es una secuencia de elementos que se pueden procesar de manera funcional
        // Las operaciones intermedias son "perezosas", es decir, no se ejecutan hasta que se ejecuta una operacion terminal
        // Se pueden encadenar varias operaciones intermedias

        //Filter (Predicate<T> predicate)
        //Que hace: Selecciona solo los elementos que cumple con la condicion
        //Devuelve: Un nuevo Stream con los elementos filtrados
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Números pares:");
        System.out.println(numeros);
        //1. Convertir la colección a Stream
        System.out.println("----------------------------");
        System.out.println("1.- Convertir la colección a Stream");
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println("----------------------------");
        //2.- Ejecutar 1 o mas operaciones intermedias
        System.out.println("----------------------------");
        System.out.println("2.- Ejecutar 1 o mas operaciones intermedias");
        numeros.stream()
                .filter(n -> n % 2 == 0) //Operacion intermedia
                .map(n -> n * n) //Operacion intermedia
                //n -> System.out.println(n) // No es una operacion intermedia, referencia a metodo
                .forEach(System.out::println); //Operacion terminal
        System.out.println("----------------------------");
            //map(Function<T,R> mapper)
            //Que hace: Transforma cada elemento del Stream aplicando la funcion dada (es decir otro tipo o valor)
            //Devuelve: Un nuevo Stream<R> con los elementos transformados
            List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "java", "kotlin", "angel", "stream").stream()
                //.map(s -> s.toUpperCase()) //Operacion intermedia
                .filter(s -> s.length() >= 5) //Operacion intermedia
                .map(String::toUpperCase) //.map ayuda a convertir un tipo en otro
                .forEach(System.out::println); //Operacion terminal -> forEach ayuda a recorrer un Stream
        System.out.println("----------------------------");
            //flatMap(Function<T, Stream<R>> mapper)
            //Que hace: Transforma cada elemento del Stream en otro Stream y luego los "aplana" en un solo Stream
            //Devuelve: Un nuevo Stream<R> con los elementos transformados y aplanados
            List.of("Hola mundo", "Java Streams", "Operaciones Intermedias").stream()
                .flatMap(s -> List.of(s.split(" ")).stream()) //Operacion intermedia, .split es un metodo de String que divide un String en un array de Strings
                .forEach(System.out::println); //Operacion terminal
            //Otro ejemplo de flatMap
            List<List<String>> datos = List.of(
                    List.of("A", "B", "C"),
                    List.of("D", "E", "F"),
                    List.of("G", "H", "I")
            );
            datos.stream()
                    .flatMap(List::stream)
                    //.flatMap(l -> l.stream()) //Operacion intermedia
                    .collect(Collectors.toList());
                    //.forEach(System.out::println);
                    System.out.println(datos);

            //distinct()
            //Que hace: Elimina los elementos duplicados del Stream
            //Devuelve: Un nuevo Stream con los elementos sin duplicados
            List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5).stream()
                    .distinct() //Operacion intermedia
                    .forEach(System.out::println); //Operacion terminal
        //3.- Ejecutar una operacion terminal
        System.out.println("----------------------------");
        System.out.println("3.- Ejecutar una operacion terminal");
        numeros.stream()
                .filter(n -> n % 2 == 0) //Operacion intermedia
                .map(n -> n * n) //Operacion intermedia
                .forEach(System.out::println); //Operacion terminal
        System.out.println("----------------------------");
    }
}
