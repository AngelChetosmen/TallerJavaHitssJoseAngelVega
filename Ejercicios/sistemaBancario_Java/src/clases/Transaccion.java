package src.clases;

public class Transaccion {
    
    private static int contadorTransacciones;
    private int idTransaccion;
    private String tipoOperacion;
    private double monto;
    private Cuenta cuentaAsociada;

    public Transaccion(String tipoOperacion, double monto, Cuenta cuentaAsociada) {
        this.idTransaccion = ++contadorTransacciones;
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.cuentaAsociada = cuentaAsociada;
    }

    public int getTransaccion() {
        return idTransaccion;
    }

    public String obtenerDatosTransaccion() {
        return "ID Transaccion: " + idTransaccion 
        + "\nTipo Operacion: " + tipoOperacion 
        + "\nMonto: $" + monto 
        + "\nCuenta Asociada: " + cuentaAsociada.obtenerCuenta();
    }

}

