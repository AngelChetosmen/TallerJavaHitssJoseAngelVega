package Streams.flujos;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionesTerminales {
    public static void main(String[] args) {
        //forEach(Consumer)

        //toArray()
        //Que hace: Convierte el Stream en un array
        //Devuelve: Object[] -> Un array con los elementos del Stream o un tipo generico si se pasa por un generador
        String[] arreglo = List.of("Eloy", "Angel", "Juan", "Pedro", "Maria").stream()
                .toArray(String[]::new); //El :: es una referencia a metodo, en este caso al constructor de String[]
        System.out.println("Array: ");
        for (String s : arreglo) {
            System.out.println(s);
        }

        //reduce(....)
        //Que hace: Combina elementos en un único valor o resultado (acumulación)
        //Sobrecarga del método
        //1.- reduce(BinaryOperator<T> accumulator) -> Optional<T>
        //2.- reduce(T identity, BinaryOperator<T> accumulator) -> T
        //3.- reduce(U identity, BiFunction<U, ? super T, U), BinaryOperator<U> accumulator) -> U
        System.out.println("=================Reduce()================="); 
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 45, 67, 89, 90);
        int suma = numeros.stream().reduce(0, Integer::sum); //Suma todos los numeros, 0 es el valor inicial
        // Integer::sum -> (a, b) -> a + b -> Integer.sum(a, b)
        System.out.println("Suma: " + suma);

        System.out.println("=======================================");
        List<String> lista = Stream.of("a", "b", "c", "d", "e")
        .collect(Collectors.toList());
        System.out.println(lista);
 
        Map<Integer, String> mapa =  List.of("uno", "tres", "cuatro", "cinco")
        .stream()
        .collect(Collectors.toMap(String::length, s -> s));
        mapa.forEach((k, v) -> System.out.println(k +" -> " + v));
        //java 16 ->
        System.out.println("============toList()================");
        List<String> lista2 = Stream.of("a", "b", "c", "d", "e")
        .toList();
        System.out.println(lista2);
 
        //min(Comparator<? Super T> comparator)
        //Que hace: Encuentra el elemento menor o minimo
        //Devuelve: Optional<T>
        System.out.println("=======================================");
        //colect(Collector<T, A, R> collector)
        //Que hace: Agrupa los elementos del Stream en una colección o estructura de datos. Es decir, acumula los elementos en una colección
        // o resultado mutable. Muy usado con Collectors
        //Devuelve: R -> El tipo de colección o estructura de datos resultante
        System.out.println("=================Collect()=================");
        List<String> lista1 = Stream.of("a", "b", "c", "d", "e")
                .collect(java.util.stream.Collectors.toList());
                //.toList(); java 16 en adelante
        System.out.println("Lista1: " + lista1);
        //min(Comparator<? super T> comparator)
        //Que hace: Encuentra el elemento mínimo en el Stream según un comparador (Encuentra el elemento menor o minimo)
        // Devuelve Optional<T> -> Un Optional que contiene el elemento mínimo si está presente
        System.out.println("=================Min()=================");
        Optional<Integer> minimo = List.of(4,2,8,5,1).stream()
                .min(Integer::compareTo); //El :: es una referencia a metodo, en este caso al metodo compareTo de Integer
                //.ifPresent(min -> System.out.println("Minimo: " + min)); //Si el Optional tiene un valor, lo imprime
        System.out.println("Valor Minimo: " + minimo.orElseThrow()); //Si el Optional tiene un valor, lo imprime, si no lanza una excepcion
        //if (minimo.isPresent()) {
        //    System.out.println("Minimo: " + minimo.get());
        //}

        //max(Comparator<? super T> comparator)
        //Que hace: Encuentra el elemento máximo en el Stream según un comparador (Encuentra el elemento mayor o maximo)
        // Devuelve Optional<T> -> Un Optional que contiene el elemento máximo si está presente
        System.out.println("=================Max()=================");
        Optional<Integer> maximo = List.of(4,2,8,5,1).stream()
                .max(Integer::compareTo); //El :: es una referencia a metodo, en este caso al metodo compareTo de Integer
                //.ifPresent(max -> System.out.println("Maximo: " + max)); //Si el Optional tiene un valor, lo imprime
        System.out.println("Valor Maximo: " + maximo.orElseThrow()); //Si el Optional tiene un valor, lo imprime, si no lanza una excepcion

        //count()
        //Que hace: Cuenta el número de elementos en el Stream
        //Devuelve: long -> El número de elementos en el Stream
        System.out.println("=================Count()=================");
        long cantidad = List.of(1, 2, 3, 4, 5).stream().count();
        System.out.println("Conteo Total: " + cantidad); //.stream() para convertir la lista en un Stream -> Stream tipo T, T tipo de dato de la lista

        //anyMatch()
        //Que hace: Verifica si al menos un elemento del Stream cumple con una condición dada
        //Devuelve: boolean -> true si al menos un elemento cumple con la condición, false en caso contrario
        System.out.println("=================AnyMatch()=================");
        boolean hayPar = List.of(3, 7, 5, 8, 11, 15).stream()
                .anyMatch(n -> n % 2 == 0); //Verifica si hay al menos un numero par
        System.out.println("Stream de ejemplo: (3, 7, 5, 8, 11, 15)");
        System.out.println("¿Hay algun numero par?: " + hayPar);

        //allMatch()
        //Que hace: Verifica si todos los elementos del Stream cumplen con una condición dada
        //Devuelve: boolean -> true si todos los elementos cumplen con la condición, false en caso contrario
        System.out.println("=================AllMatch()=================");
        boolean todosPares = List.of(2, 4, 6, 8, 10).stream()
                .allMatch(n -> n % 2 == 0); //Verifica si todos los numeros son pares
        System.out.println("Stream de ejemplo: (2, 4, 6, 8, 10)");
        System.out.println("¿Todos los numeros son pares?: " + todosPares);

        //noneMatch()
        //Que hace: Verifica si ningún elemento del Stream cumple con una condición dada
        //Devuelve: boolean -> true si ningún elemento cumple con la condición, false en caso contrario
        System.out.println("=================NoneMatch()=================");
        boolean ningunNegativo = List.of(3, 7, 5, 8, 11, 15).stream()
                .noneMatch(n -> n < 0); //Verifica si no hay ningun numero negativo
        System.out.println("Stream de ejemplo: (3, 7, 5, 8, 11, 15)");
        System.out.println("¿No hay ningun numero negativo?: " + ningunNegativo);

        //findFirst()
        //Que hace: Encuentra y devuelve el primer elemento del Stream
        //Devuelve: Optional<T> -> Un Optional que contiene el primer elemento si está presente
        System.out.println("=================FindFirst()=================");
        Optional<Integer> primero = List.of(3, 7, 5, 8, 11, 15).stream()
                .findFirst(); //Encuentra el primer elemento del Stream
        System.out.println("Stream de ejemplo: (3, 7, 5, 8, 11, 15)");
        System.out.println("Primer elemento: " + primero.orElseThrow()); 

        Optional<String> primero_1 = Stream.of("A", "B", "C", "D", "E").findFirst();
        System.out.println("Stream de ejemplo: (A, B, C, D, E)");
        System.out.println("Primer elemento: " + primero_1.orElseThrow());

        //findAny() -> Paralelismo
        //Que hace: Encuentra y devuelve cualquier elemento del Stream (usualmente el primero en streams secuenciales), como un iterador
        //Devuelve: Optional<T> -> Un Optional que contiene un elemento si está presente, splititerador
        System.out.println("=================FindAny()=================");
        Optional<Integer> cualquiera = List.of(3, 7, 5, 8, 11, 15).stream()
                .findAny(); //Encuentra cualquier elemento del Stream
        System.out.println("Stream de ejemplo: (3, 7, 5, 8, 11, 15)");
        System.out.println("Cualquier elemento: " + cualquiera.orElseThrow()); 

    }
}
