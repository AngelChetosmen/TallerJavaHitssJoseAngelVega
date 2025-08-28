package src.clases;

import java.util.ArrayList;
import java.util.List;
import src.clases.Cuenta;
import src.clases.Transaccion;
public class SistemaBancario {
    
    private List<Cuenta> cuentas; //List<Cuenta> se utiliza para almacenar una colección de objetos de la clase Cuenta.
    private List<Transaccion> transacciones; //List<Transaccion> se utiliza para almacenar una colección de objetos de la clase Transaccion.

    public SistemaBancario() {
        this.cuentas = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    public Cuenta crearCuenta(String nombreTitular, double depositoInicial) {
        Cuenta nuevaCuenta = new Cuenta(nombreTitular, depositoInicial);
        cuentas.add(nuevaCuenta);
        return nuevaCuenta;
    }

    public boolean realizarDeposito(int idCuenta, double monto){
        Cuenta cuenta = buscarCuentaID(idCuenta);
        if (cuenta != null && monto > 0) {
            cuenta.depositar(monto);
            transacciones.add(new Transaccion("Depósito", monto, cuenta));
            return true;
        }
        return false;
    }

    public boolean realizarRetiro(int idCuenta, double monto) {
        Cuenta cuenta = buscarCuentaID(idCuenta);
        if (cuenta != null && monto > 0 && cuenta.retirar(monto)) {
            transacciones.add(new Transaccion("Retiro", monto, cuenta));
            return true;
        }
        return false;
    }

    private Cuenta buscarCuentaID(int idCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getIdCuenta() == idCuenta) {
                return cuenta;
            }
        }
        return null;
    }

    public void mostrarCuentas() {
        System.out.println("------Cuentas Bancarias:------");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.obtenerCuenta());
        }
    }

    public void mostrarTransacciones() {
        System.out.println("------Historial de Transacciones:------");
        for (Transaccion transaccion : transacciones) {
            System.out.println(transaccion.obtenerDatosTransaccion());
        }
    }
}
