package src.test;

import src.clases.Cuenta;
import src.clases.SistemaBancario;

public class testMain {
    /*
    Problema: Sistema Bancario Simple con IDs Automáticos
    Una institución bancaria necesita un sistema básico para administrar cuentas bancarias y registrar
    sus transacciones.

    Cada cuenta creada debe tener un ID único que se genere automáticamente sin que el usuario lo
    proporcione. Lo mismo debe ocurrir con cada transacción registrada.
    El sistema debe permitir:

    1. Crear cuentas bancarias con un titular y un depósito inicial.
    o Cada cuenta debe tener: un ID único, el nombre del titular y el saldo actual.

    2. Realizar operaciones bancarias:
    o Depósito: aumentar el saldo de la cuenta.
    o Retiro: disminuir el saldo, siempre que haya suficiente dinero disponible.
    
    3. Registrar transacciones asociadas a las cuentas.
    o Cada transacción debe tener un ID único automático, el tipo de operación
    (depósito o retiro), el monto y la cuenta asociada.
    
    4. Mostrar información de las cuentas y de las transacciones realizadas.
    Ejemplo de funcionamiento esperado
    • Crear dos cuentas:
    o Ana con $5000
    o Luis con $10000
    • Ana deposita $2000 y retira $1000.
    • Luis retira $3000 y deposita $1500.
    • El sistema debe mostrar el detalle de cada cuenta y un historial de las transacciones con
    IDs únicos
     */
    public static void main(String[] args) {
        SistemaBancario sistema = new SistemaBancario();
        //Se crean dos cuentas
        Cuenta cuentaAna = sistema.crearCuenta("Ana", 5000.0);
        Cuenta cuentaLuis = sistema.crearCuenta("Luis", 10000.0);

        // Ana deposita 2000 y retira 1000
        sistema.realizarDeposito(cuentaAna.getIdCuenta(), 2000.0);
        sistema.realizarRetiro(cuentaAna.getIdCuenta(), 1000.0);

        // Luis retira 3000 y deposita 1500
        sistema.realizarRetiro(cuentaLuis.getIdCuenta(), 3000.0);
        sistema.realizarDeposito(cuentaLuis.getIdCuenta(), 1500.0);

        // Resultados
        sistema.mostrarCuentas();
        sistema.mostrarTransacciones();
    }
}
