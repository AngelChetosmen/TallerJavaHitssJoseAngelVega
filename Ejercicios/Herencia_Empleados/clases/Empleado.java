package Ejercicios.Herencia_Empleados.clases;

//import Ejercicios.Herencia_Empleados.clases.Persona;
public class Empleado extends Persona{

    private int empleadoId;
    private double remuneracion;

    public double aumentarRemuneracion(double aumento) {
        remuneracion += aumento;
        return remuneracion;
    }

    public Empleado(int empleadoId, String nombre, String apellido, int numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Empleado ID: " + empleadoId);
        System.out.println("Remuneracion: " + remuneracion);
    }

    //Sobre escritura del metodo toString() de la clase Object Persona -> Empleado
    @Override
    public String toString() {
        return "Empleado [empleadoId=" + empleadoId 
        + ", remuneracion=" + remuneracion 
        + "]";
    }
}
