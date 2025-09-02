package Ejercicios.HerenciaBanco.clases;

import java.nio.channels.Pipe.SourceChannel;

public class Chequera  extends CuentaBancaria{
    private double limite;

    public Chequera(Integer cuentaId, String titular, double saldo, double limite) {
        super(cuentaId, titular, saldo);
        this.limite = limite;
    }

    @Override
    public void retirar (double cantidad) {
        if (saldo + limite >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar, excede el limite");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cuenta #: " + cuentaId);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo $: " + saldo);
        System.out.println("Limite $: " + limite);
    }

    

}
