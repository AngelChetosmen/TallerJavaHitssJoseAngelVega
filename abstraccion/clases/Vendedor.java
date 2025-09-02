package abstraccion.clases;

public class Vendedor extends Empleado {
    
    private double ventas;

    public Vendedor(String nombre, double salario, double ventas) {
        super(nombre, salario);
        this.ventas = ventas;
    }

    @Override
    public double calcularBono() {
        // Un vendedor recibe un bono del 5% de sus ventas como bono
        return ventas * 0.05;
    }

    
}
