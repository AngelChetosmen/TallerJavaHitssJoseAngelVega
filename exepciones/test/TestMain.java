package exepciones.test;

public class TestMain {
    public static void main(String[] args) {
        try {
            int resultado = 10/0;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            //e.getMessage(); //Obtiene el mensaje de error asociado con la excepción.
            //e.printStackTrace(); //Imprime el stack trace de la excepción
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta (opcional)");
        }
        System.out.println("-----------------------------------");
        System.out.println("Continuando con la ejecucion del programa...");
    }
}
