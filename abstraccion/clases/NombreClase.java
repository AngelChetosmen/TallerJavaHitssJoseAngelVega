package abstraccion.clases;

public abstract class NombreClase {
    // Atributos comunes 
    protected String nombre;

    // Metodo (s) abstracto (s) ==> sin cuerpo, lo debe de implementar las subclases
    public abstract void metodoAbstracto(String nombre);
    // Metodo (s) concreto (s) ==> con cuerpo, lo pueden usar las subclases
    public void metodoConcreto() {
        System.out.println("Metodo concreto en la clase abstracta");
        System.out.println("Nombre: " + nombre);
    }
    
}
