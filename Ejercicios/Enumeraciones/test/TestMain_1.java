package test;

import enums.Semaforo;

public class TestMain_1 {
    public static void main(String[] args) {
        // Enumeracion de Semaforo
        Semaforo s = Semaforo.AMARILLO; // Semaforo.AMARILLO otra forma de acceder desde objeto
        for (Semaforo luz : Semaforo.values()) {
            System.out.println(luz + " = > " + s.accion()); //luz.accion(); otra manera de acceder desde objeto de for-each
        }
    } // Los constructores como Semaforo deben ser privados para que no se puedan instanciar
}
