package conjuntos.conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoTreeSet {
    public static void main(String[] args) {
        Set<String> frutas = new TreeSet<>(); // TreeSet mantiene el orden de inserción
        System.out.println("Frutas: " + frutas.isEmpty());
        frutas.add("Naranja");
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Melon");
        frutas.add("Sandia");
        frutas.add("Platano");
        System.out.println("Frutas: " + frutas);
        System.out.println("Tamaño: " + frutas.size());
    }
}
