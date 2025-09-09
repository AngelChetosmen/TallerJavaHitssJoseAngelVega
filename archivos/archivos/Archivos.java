package archivos.archivos;

import java.nio.file.*;

public class Archivos {
    public static void main(String[] args) {
        // java.io.file 
        // Path -> Representa la ruta de un archivo o directorio en el sistema de archivos
        // Files -> Contiene métodos estáticos para operar sobre archivos y directorios
        // (crear, copiar, mocerar, eliminar, leer, escribir, etc)
        // Paths  -> Contiene métodos para crear objetos Path a partir de cadenas de texto
        // Crear un archivo

        Path ruta = Paths.get("D:/Capacitacion HITSS Ago-Oct/archivos/archivos/Ejemplo.txt");
        String contenido = "Hola, este es un archivo de ejemplo.";
        //Files createFile(ruta);
        try { // Manejo de errores, creacion del archivo
            //Files.createFile(ruta); // Crea el archivo en la ruta especificada solo una vez
            //System.out.println("Archivo creado en: " + ruta.toAbsolutePath());
            //Files.writeString(ruta, contenido, StandardOpenOption.APPEND); // TRUNCATE_EXISTING
            Files.writeString(ruta, contenido, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Archivo creado y contnido escrito en: " + ruta.toAbsolutePath());
            System.out.println("Texto escrito en el archivo");
            
        } catch (Exception e) { // Captura cualquier error que pueda ocurrir
            System.out.println("No se pudo crear el archivo: " + e.getMessage());
        }
    }
}
