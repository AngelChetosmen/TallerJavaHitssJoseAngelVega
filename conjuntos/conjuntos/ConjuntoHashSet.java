package conjuntos.conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import conjuntos.modelos.Alumno;

public class ConjuntoHashSet {
    public static void main(String[] args) {
        Set<String> departamentos = new HashSet<>();
        departamentos.add("Ventas");
        departamentos.add("Crédito");
        departamentos.add("TI");
        departamentos.add("Crédito"); // Duplicado, se ignora
        departamentos.add("RH");
        departamentos.add("Limpieza");
        System.out.println("Conjunto: " + departamentos);
        System.out.println("Tamaño: " + departamentos.size());
        // For each
        for (String dep : departamentos) {
            System.out.println(dep);
            // if (dep.equals("TI")) {
            //     departamentos.remove(dep);
            // }
        }

        Iterator<String> iterator = departamentos.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            String d = iterator.next();
            if (d.equals("TI")) { // Eliminar un elemento de forma correcta con next()
                iterator.remove();
            }
        } // Métodos de un iterador: hasNext(), next(), remove()

        departamentos.remove("RH"); // Eliminar un elemento
        System.out.println("Conjunto: " + departamentos);

        System.out.println("=================Alumnos======================");
        Set<Alumno> alumnos = new LinkedHashSet<>(); // HashSet no mantiene el orden de inserción
        alumnos.add(new Alumno(1,"Juan", 20));
        alumnos.add(new Alumno(3, "Pedro", 15)); // Duplicado, se ignora
        alumnos.add(new Alumno(4, "Luis", 22));
        alumnos.add(new Alumno(2, "Maria", 19)); 
        for (Alumno a : alumnos) {
            System.out.println(a.toString());
        }
    }
}