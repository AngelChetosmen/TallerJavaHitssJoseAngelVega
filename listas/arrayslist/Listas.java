package listas.arrayslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import listas.modelos.*;

public class Listas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pepe");
        nombres.add("Angel");
        System.out.println(nombres);
        System.out.println("---------------------------------------");
        System.out.println("Nombres en el indice 3: " + nombres.get(3));
        System.out.println("---------------------------------------");
        System.out.println("Agregar un elemento: ");
        //Agregar un elemento en medio
        nombres.add(2, "Eloy");
        System.out.println(nombres);
        nombres.addFirst("Bingo");
        System.out.println(nombres);
        nombres.addLast("Susana");
        System.out.println(nombres);
        System.out.println("---------------------------------------");
        System.out.println("Modificar un elemento: ");
        // Modificar un elemento
        nombres.set(4, "Edith");
        System.out.println(nombres);
        System.out.println("---------------------------------------");
        System.out.println("Eliminar un elemento: ");
        // Eliminar un elemento
        nombres.remove(2);
        System.out.println(nombres);
        System.out.println("---------------------------------------");
        System.out.println("Eliminar el primero y el ultimo: ");
        // Eliminar el primero
        nombres.removeFirst();
        System.out.println(nombres);
        System.out.println("---------------------------------------");
        System.out.println("Eliminar el ultimo: ");
        System.out.println("Eliminar elemento mediante indice:" + nombres.remove(2));

        System.out.println("Eliminar elemento a traves del objeto: " + nombres.remove("Pepe"));
        // Eliminar el ultimo
        nombres.removeLast();
        System.out.println(nombres);
        // Tratar de eliminar un elemento mediante un ciclo
        for (String item : nombres) {
            if (item.equals("Ana")) {
                nombres.remove(item);
            }
        }

        //teradores
        System.out.println("---------------------------------------");
        System.out.println("Iteradores");
        var iterator = nombres.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        System.out.println("---------------------------------------");
        System.out.println("Lista de entero no ordenada: " + enteros);
        Collections.sort(enteros);
        System.out.println("Lista de entero ordenada: " + enteros);

        System.out.println("---------------------------------------");
        System.out.println("Comparar dos listas: ");
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Eloy", 40));
        personas.add(new Persona(2, "Ana", 30));
        personas.add(new Persona(3, "Pepe", 20));
        personas.add(new Persona(4, "Juan", 10));
        personas.add(new Persona(5, "Maria", 50));
        System.out.println("Lista de personas no ordenada");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        //Collections.sort(personas); // Ordenar la lista de personas por nombres
        Collections.sort(personas, (c1,c2) -> c1.getNombre().compareTo(c2.getNombre())); // Ordenar la lista de personas por nombres
        //Comparator para ordenar por edad
        //Collections.sort(personas, (c1,c2) -> c1.getEdad() - c2.getEdad()); // Ordenar la lista de personas por edad
        personas.sort(Comparator.comparingInt(Persona::getEdad)); // Ordenar la lista de personas por edad
        personas.sort(Comparator.comparing(Persona::getEdad)); // Ordenar la lista de personas por edad, otra forma
        System.out.println("Lista de personas ordenada por nombres: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
