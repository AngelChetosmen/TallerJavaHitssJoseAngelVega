package listas.linkedlist;

import java.util.List;
public class LinkedList {
    /*Ejemplo del uso de una lista de Linkedlist */
    public static void main(String[] args) {
        List<String> alumnos =  new java.util.LinkedList<>();
        alumnos.add("Pepe");
        alumnos.add("Juan");
        alumnos.add("Luisa");
        alumnos.add("Maria");

        System.out.println(alumnos);

        alumnos.remove(2);
        System.out.println(alumnos);

        alumnos.remove("Pepe");

        System.out.println(alumnos);
        System.out.println(alumnos.size());
        System.out.println("-------------------------");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
    }

}
