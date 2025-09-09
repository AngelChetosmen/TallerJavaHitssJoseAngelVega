package Ejercicios.EjercicioException_sep052025;

public class EjercicioException {
    /* Problema: Crea un programa que guarde alumnos en un arreglo de tamaño fijo (3). Maneja:
        •	Cuando el usuario intenta registrar más de 3 alumnos → ArrayIndexOutOfBoundsException.
        •	Si la edad del alumno es menor de 0 → IllegalArgumentException.
        •	Si la edad es menor a 18 → EdadInvalidaException (personalizada). 
    */
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa: " + edad);
        }
        if (edad < 18) {
            throw new EdadInvalidaException("La edad " + edad + " es menor a 18 años. No se permiten alumnos menores de edad.");
        }
    }
    
    public static void main(String[] args) {
        // Arreglo de alumnos
        Alumno[] alumnos = new Alumno[3];
        
        try {
            // Registro de alumnos con validación
            alumnos[0] = new Alumno("Juan", 20);
            validarEdad(alumnos[0].getEdad());
            
            alumnos[1] = new Alumno("Pedro", 15);
            validarEdad(alumnos[1].getEdad()); // Esto lanzará EdadInvalidaException
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error de edad: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error de argumento: " + e.getMessage());
        }

        try {
            alumnos[2] = new Alumno("Luis", 22);
            validarEdad(alumnos[2].getEdad());
        } catch (EdadInvalidaException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostrar alumnos registrados
        System.out.println("\nAlumnos registrados:");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                System.out.println(alumnos[i].toString());
            }
        }

        try {
            // Intentar agregar un cuarto alumno
            alumnos[3] = new Alumno("Ana", 19); // Esto lanzará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: No se pueden registrar más de 3 alumnos. " + e.getMessage());
        }

        try {
            // Intentar agregar un alumno con edad negativa
            if (alumnos[0] != null) {
                alumnos[0].setEdad(-5); // Esto lanzará IllegalArgumentException en validarEdad
                validarEdad(alumnos[0].getEdad());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error de edad negativa: " + e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println("Error de edad: " + e.getMessage());
        }
    }
}