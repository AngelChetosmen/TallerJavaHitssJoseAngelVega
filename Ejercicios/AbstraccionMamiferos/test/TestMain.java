package Ejercicios.AbstraccionMamiferos.test;

import Ejercicios.AbstraccionMamiferos.clases.Mamifero;
import Ejercicios.AbstraccionMamiferos.clases.Perro;
import Ejercicios.AbstraccionMamiferos.clases.Tigre;
import Ejercicios.AbstraccionMamiferos.clases.Guepardo;
import Ejercicios.AbstraccionMamiferos.clases.Leon;
import Ejercicios.AbstraccionMamiferos.clases.Lobo;

public class TestMain {
    public static void main(String[] args) {
        
        Mamifero[] mamiferos = new Mamifero[5];

        //LLenar el arreglo de mamiferos con base en los constructores que tiene cada uno

        mamiferos[0] = new Leon("Selva Amazonica", 1.5, 3.5, 150, "Panthera leo", 9, 65, 10, 190);
        mamiferos[1] = new Tigre("Selva Asiatica", 1.1, 2.5, 220, "Panthera tigris", 9.0f, 65, "Bengala");
        mamiferos[2] = new Guepardo("Llanuras Africanas", 0.9, 1.5, 72, "Acinonyx jubatus", 4.0f, 120);
        mamiferos[3] = new Lobo("Bosques Templados", 0.8, 1.6, 50.0, "Canis lupus", "Gris", 4.5, 5, "Ártico");
        mamiferos[4] = new Perro("Sabana", 0.75, 1.4, 35, "Lycaon pictus", "Manchado", 3.8, 320);
        // mamiferos[0] = new Leon("Sabana Africana", 1.2, 2.1, 190, "Panthera leo", 7.5, 80, 10, 114.0);
        // mamiferos[1] = new Tigre("Selva Asiatica", 1.1, 2.5, 220, "Panthera tigris", 9.0, 65, "Bengala");
        // mamiferos[2] = new Guepardo("Llanuras Africanas", 0.9, 1.5, 72, "Acinonyx jubatus", 4.0, 120);
        // mamiferos[3] = new Lobo("Bosques Templados", 0.8, 1.6, 50, "Canis lupus", "Gris", 4.5, 5.0, "Ártico");
        // mamiferos[4] = new Perro("Sabana", 0.75, 1.4, 35, "Lycaon pictus", "Manchado", 3.8, 320);

        
        for (Mamifero mamifero : mamiferos) {
            System.out.println("--------------------------------------------------");
            System.out.println(mamifero);
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println("--------------------------------------------------");
        }
    }
}
