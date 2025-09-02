package Ejercicios.Herencia_Empleados.clases;

public class Persona {
    protected Integer personaId;
    protected String nombre;
    protected String apellido;
    protected int numeroFiscal;
    protected String direccion;
    private static Integer contador = 0;

    public Persona(String nombre, String apellido, int numeroFiscal, String direccion) {
        this.personaId = ++contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(int numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Persona.contador = contador;
    }

    public void mostrarInfo() { //Se Sobreescribe el metodo de la clase padre -> Persona
        System.out.println("Persona ID: " + personaId);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Numero Fiscal: " + numeroFiscal);
        System.out.println("Direccion: " + direccion);
    }

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
