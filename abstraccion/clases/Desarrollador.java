package abstraccion.clases;

public class Desarrollador extends Empleado {
    
    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        // Un desarrollador recibe un bono del 10% de bono
        return salario * 0.10;
    }
    
}
