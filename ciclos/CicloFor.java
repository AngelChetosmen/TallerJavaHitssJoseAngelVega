package ciclos;

public class CicloFor {
    public static void main(String[] args) {
        //break --> Corta la ejecución y termina el ciclo, mediante una condicion
        //continue --> No ejecuta el resto de la iteracción actual
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Se terminan las iteraciones del ciclo");
                //break;
                continue;
            }
            System.out.println("Numero: " + i);
        }
    }
}
