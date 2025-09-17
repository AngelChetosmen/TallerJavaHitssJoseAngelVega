package listas.arrayslist;

import java.util.LinkedList;
import java.util.List;

public class ListaEnlazada {
    public static void main(String[] args) {
        List<String> frutas = new LinkedList<>();

        //Agregar elementos
        frutas.add("Naranja");
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Melon");
        frutas.add("Sandia");
        frutas.add("Platano");

        System.out.println("---------------------------------------");
        System.out.println("Lista de frutas: ");
        System.out.println(frutas);

        // Acceso mediante get(index)
        System.out.println("Elemento en el indice 1: " + frutas.get(1));

        System.out.println("---------------------------------------");
        System.out.println("Agregar un elemento: ");
        // Insertar en medio (mas eficiente que ArrayList)
        frutas.add(2, "Durazno");
        System.out.println(frutas);

        System.out.println("---------------------------------------");
        System.out.println("Eliminar un elemento: ");
        // Eliminar un elemento
        frutas.remove(3);
        System.out.println("Elemento Eliminado: " + frutas.remove(1)); // Eliminar un elemento en medio
        System.out.println(frutas);

        System.out.println("---------------------------------------");
        System.out.println("Modificar un elemento: ");
        // Modificar un elemento
        frutas.set(2, "Fresa");
        System.out.println(frutas);
        frutas.reversed();
        System.out.println(frutas);

        System.out.println("---------------------------------------");
        System.out.println("Eliminar el primero y el ultimo: ");
        // Eliminar el primero y el ultimo
        frutas.removeFirst();
        frutas.removeLast();
        System.out.println(frutas);

        System.out.println("---------------------------------------");
        System.out.println("Iterar la lista: ");
        // Iterar la lista
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("---------------------------------------");
        System.out.println("Iteradores");
        System.out.println("Recorriendo con iterator: ");
        // Iteradores
        var iterator = frutas.iterator();
        while (iterator.hasNext()) {
            //System.out.println("Elemento: " + iterator.next());
            if (iterator.next().equals("Juan")){ //Si el siguiente elemento es Juan
                iterator.remove(); //Lo elimina
            }
        }

        //No se cumple porque el iterador esta al final
        //Se puede utilizar ListIterator
        var ListIterator = frutas.listIterator();
        while (iterator.hasNext()) {
            System.out.println("Elemento: " + iterator.next());
            
        }
        System.out.println(frutas);
    }
}
