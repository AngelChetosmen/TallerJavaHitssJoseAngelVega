package src.clases;

public class Cuenta {
    
    private static int contadorCuentas;
    private int idCuenta; 
    private String nombreTitular;
    private double saldo; 

    public Cuenta(String nombreTitular, double depositoInicial){
        this.idCuenta = ++contadorCuentas;
        this.nombreTitular = nombreTitular;
        this.saldo = depositoInicial;
    }
    public int getIdCuenta(){
        return idCuenta;
    }
    public String getNombreTitular(){
        return nombreTitular;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean depositar(double monto){
        if(monto > 0){
            saldo += monto;
            return true;
        }
        return false;
    }
    public boolean retirar(double monto){
        if(monto > 0 && monto <= saldo){
            saldo -= monto;
            return true;
        }
        return false;
    }

    public String obtenerCuenta(){
        return "ID Cuenta: " + idCuenta 
        + "\nTitular: " + nombreTitular 
        + "\nSaldo: $" + saldo;
    }

}
