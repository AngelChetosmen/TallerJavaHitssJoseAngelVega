package genericos.genericos;

public class Utilerias {
    //Método genérico que devuelve el mayor de dos valores
    public static <T extends Comparable <T>> T maximo (T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

}
