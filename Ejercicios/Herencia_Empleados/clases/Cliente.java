package Ejercicios.Herencia_Empleados.clases;

public class Cliente extends Persona{
    private int clienteId;
    
    public Cliente(int clienteId, String nombre, String apellido, int numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cliente ID: " + clienteId);
    }

    //Sobreescritura del metodo toString() de la clase Object Persona
    @Override
    public String toString() {
        return "Persona [personaId=" + personaId 
        + ", nombre=" + nombre 
        + ", apellido=" + apellido 
        + ", numeroFiscal=" + numeroFiscal 
        + ", direccion=" + direccion 
        + "]";
    }

}
