package abstraccion.clases;

public abstract class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    // Calculo de bono (metodo concreto)
    public  abstract double calcularBono();
    
    public void mostrarInfo() {
        System.out.println("{Empleado: " + nombre + ", Salario: " + salario + ", Bono: " + calcularBono() + "}");
    }
}
