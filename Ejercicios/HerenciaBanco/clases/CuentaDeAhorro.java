package Ejercicios.HerenciaBanco.clases;

public class CuentaDeAhorro extends CuentaBancaria{

    private double tasaDeInteres;

    public CuentaDeAhorro(Integer cuentaId, String titular, double saldo, double tasaDeInteres) {
        super(cuentaId, titular, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void aplicarIntereses() {
        saldo += saldo * tasaDeInteres;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Ahorros | Tasa de Interes: " + (tasaDeInteres * 100) + "%");
    }
}
