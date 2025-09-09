package archivos.archivos;

import java.nio.file.*;
import java.util.List;

public class LeerArchivoLinea {
    public static void main(String[] args) {
        Path ruta = Paths.get("D:/Capacitacion HITSS Ago-Oct/archivos/archivos/Ejemplo.txt");
        try {
            // var linea = Files.readString(ruta);
            // While ((String linea = archivo.readine()) != null) {Leo el archivo} -> Cuando se usa buffer
            // Stream -> Files.lines (ruta) -> Devuelve un flujo de lineas del archivo 
            List<String> lineas = Files.readAllLines(ruta); // Para archivos pequeños
             // Files.lines(ruta).forEach(System.out::println); // Para archivos grandes
            System.out.println("Contenido del archivo por lineas: ");
            for (String linea : lineas) {
                System.out.println("---> " +linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }        
    }
    
}
