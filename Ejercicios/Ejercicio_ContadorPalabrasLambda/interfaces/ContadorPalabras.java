package Ejercicios.Ejercicio_ContadorPalabrasLambda.interfaces;

import java.util.Map;
@FunctionalInterface
public interface ContadorPalabras {
    Map<String, Integer> encontrarPalabraMasRepetida(String frase);
}
