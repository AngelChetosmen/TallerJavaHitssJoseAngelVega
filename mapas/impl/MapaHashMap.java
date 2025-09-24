package mapas.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapaHashMap {
    public static void main(String[] args) {
        //Map<K,V>
        Map<Integer, String> frutas = new HashMap<>();

        frutas.put(1, "Manzana");
        frutas.put(2, "Pera");
        frutas.put(3, "Sandia");
        frutas.put(4, "Naranja");
        frutas.put(5, "Melon");
        frutas.put(6, "Platano");
        frutas.put(null, "Fruta desconocida");

        System.out.println("Frutas:" + frutas);
        System.out.println("Fruta 2: " + frutas.get(2));

        //Recorrer con entrySet (clave y valor)
        System.out.println("Recorriendo el mapa por entrySet:");
        for (Map.Entry<Integer, String> fruta : frutas.entrySet()) { //entrySet te devuelve las claves ambas por separado
            System.out.println("Clave: " + fruta.getKey() + " - Valor: " + fruta.getValue());
        }

        //Set<Integer> claves = frutas.keySet();
        //Recorriendo por claves
        System.out.println("Recorriendo el mapa por claves:");
        for (Integer clave : frutas.keySet()) { //keySet te devuelve las claves
            System.out.println("Clave: " + clave);
        }

        //Recorrer solo los valores
        System.out.println("Recorriendo el mapa por valores:");
        List<String> valores = new ArrayList<>(frutas.values());
        for (String valor : valores) {
            System.out.println("Valor: " + valor);
        }

        //Si fuera por collection
        System.out.println("Recorriendo el mapa por valores (Collecciones HashSet):");
        Set<String> valores2 = new HashSet<>(frutas.values());
        for (String valor : valores2) {
            System.out.println("Valor: " + valor);
        }
        // for (String valor : frutas.values()) { //values te devuelve los valores
        //     System.out.println("Valor: " + valor);
        // }
    }
}
