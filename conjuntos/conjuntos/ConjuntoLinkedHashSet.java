package conjuntos.conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new LinkedHashSet<>(); // LinkedHashSet mantiene el orden de inserción
        numeros.add(34);
        numeros.add(23);
        numeros.add(34); // Duplicado, se ignora
        numeros.add(50);
        numeros.add(20);
        numeros.add(10);
        numeros.add(9);
        System.out.println("Numeros: " + numeros);
        System.out.println("Tamaño: " + numeros.size());
    }
}
