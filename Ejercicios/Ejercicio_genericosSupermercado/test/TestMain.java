package Ejercicios.Ejercicio_genericosSupermercado.test;

import java.util.List;
import Ejercicios.Ejercicio_genericosSupermercado.clases.*;

public class TestMain {
    /*
     * Ejercicio: Carrito de supermercado
        Entonces como requerimiento vamos a tener 4 clases de
        productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene en común dos atributos el nombre
        (string) y precio (double) que deben heredar de la clase padre Producto, pero ademas cada una
        van a tener dos atributos propios adicionales, sus métodos getter y constructor para inicializar los
        4 atributos (los 2 del padre y los 2 propios)
     */

     public static void main(String[] args) {
        /* Para el ejemplo de la clase main se pide crear un objeto bolsa para cada tipo de producto con 5
        elementos, se debe mostrar por cada bolsa el detalle completo de sus elementos, el precio,
        nombre y los atributos adicionales sin realizar cast de ningún tipo, ni toString().
        */
        
        List<Fruta> bolsaFrutas = List.of(
            new Fruta("Naranja", 1.5),
            new Fruta("Manzana", 2.5),
            new Fruta("Pera", 3.5),
            new Fruta("Melon", 4.5),
            new Fruta("Sandia", 5.5)
        );

        List<Limpieza> bolsaLimpieza = List.of(
            new Limpieza("Desinfectante", 1.5),
            new Limpieza("Desinfectante", 2.5),
            new Limpieza("Desinfectante", 3.5 ),
            new Limpieza("Desinfectante", 4.5),
            new Limpieza("Desinfectante", 5.5)
        );

        List<Lacteo> bolsaLacteos = List.of(
            new Lacteo(1, 1),
            new Lacteo(2, 2),
            new Lacteo(3, 3),
            new Lacteo(4, 4),
            new Lacteo(5, 5)
        );

        List<NoPerecible> bolsaNoPerecibles = List.of(
            new NoPerecible(1, 1),
            new NoPerecible(2, 2),
            new NoPerecible(3, 3),
            new NoPerecible(4, 4),
            new NoPerecible(5, 5)
        );

        // Mostramos el detalle de cada bolsa
        System.out.println("----- Bolsa de Frutas -----");
        for (Fruta fruta : bolsaFrutas) {
            System.out.println("Color: " + fruta.color() + ", Peso: " + fruta.peso()); 
        }
        System.out.println("---------------------------");

        System.out.println("----- Bolsa de Limpieza -----");
        for (Limpieza limpieza : bolsaLimpieza) {
            System.out.println("Componentes: " + limpieza.componentes() + ", Litros: " + limpieza.litros()); 
        }
        System.out.println("---------------------------");

        System.out.println("----- Bolsa de Lacteos -----");
        for (Lacteo lacteo : bolsaLacteos) {
            System.out.println("Cantidad: " + lacteo.cantidad() + ", Proteinas: " + lacteo.proteinas()); 
        }
        System.out.println("---------------------------");

        System.out.println("----- Bolsa de No Perecibles -----");
        for (NoPerecible noPerecible : bolsaNoPerecibles) {
            System.out.println("Contenido: " + noPerecible.contenido() + ", Calorías: " + noPerecible.calorias()); 
        }
        System.out.println("---------------------------");

     }
    
}
