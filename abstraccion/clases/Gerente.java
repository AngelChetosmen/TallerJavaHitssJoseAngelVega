package abstraccion.clases;

public class Gerente extends Empleado{

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        // UN gerente recibe un bono del 20% de bono
        return salario * 0.20;
    }
    
    
}
