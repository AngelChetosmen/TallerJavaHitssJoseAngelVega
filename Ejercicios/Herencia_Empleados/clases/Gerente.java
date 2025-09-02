package Ejercicios.Herencia_Empleados.clases;

public class Gerente extends Empleado{
    private double presupuesto;
    public Gerente(int empleadoId, String nombre, String apellido, int numeroFiscal, String direccion, double remuneracion, double presupuesto) {
        super(empleadoId, nombre, apellido, numeroFiscal, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Gerente [presupuesto=" + presupuesto + "]");
    }
    @Override
    public String toString() {
        return "Gerente [presupuesto=" + presupuesto + "]";
    }   
    
    // Sobreescritura del metodo aumentarRemuneracion de la clase Empleado
    @Override
    public double aumentarRemuneracion(double aumento) {
        // El gerente recibe un % mas de aumento de lo que el usuario indique
        double aumentoGerente = aumento * 1.10;
        return super.aumentarRemuneracion(aumentoGerente);
    }

}
