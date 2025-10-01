package Ejercicios.Ejercicio_IfSupermercado.clases;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String puesto;

    public Empleado(int idEmpleado, String nombre, String puesto) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    
}
