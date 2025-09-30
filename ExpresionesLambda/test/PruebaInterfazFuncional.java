package ExpresionesLambda.test;

import ExpresionesLambda.interfaces.Operacion;
import ExpresionesLambda.interfaces.Transformador;

public class PruebaInterfazFuncional {
    public static void main(String[] args) {
        //Implementación con lambdas
        Operacion suma = (a, b) -> a + b;

        int resultado = suma.calcular(5, 3);
        System.out.println("El resultado es: " + resultado);

        Operacion resta = (x, y) -> x - y;
        int resultadoResta = resta.calcular(10, 5);
        System.out.println("El resultado de la resta es: " + resultadoResta);

        //Lambda que transforma String a mayusculas
        Transformador <String, String> aMayusculas = s -> s.toUpperCase();

        String cadena = "hola mundo";
        String cadenaMayusculas = aMayusculas.transformar(cadena);
        //Metodo transformar
        System.out.println(aMayusculas.transformar(cadena));
        System.out.println("Cadena en mayusculas: " + cadenaMayusculas);
    }
}
