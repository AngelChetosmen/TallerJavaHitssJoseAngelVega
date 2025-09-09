package Ejercicios.EjercicioException_sep052025;

public class EdadInvalidaException extends Exception {
    /* Problema: Crea un programa que guarde alumnos en un arreglo de tamaño fijo (3). Maneja:
        •	Cuando el usuario intenta registrar más de 3 alumnos → ArrayIndexOutOfBoundsException.
        •	Si la edad del alumno es menor de 0 → IllegalArgumentException.
        •	Si la edad es menor a 18 → EdadInvalidaException (personalizada).
        
        EdadInvalidaException: Excepción personalizada que se lanza cuando la edad del alumno es menor a 18 años.
    */

    private String message; 

    public EdadInvalidaException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EdadInvalidaException: La edad del alumno es menor a 18 años.";
    }

}
