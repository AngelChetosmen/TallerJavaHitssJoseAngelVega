package archivos.archivos;

import java.nio.file.*;

public class LeerArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("D:/Capacitacion HITSS Ago-Oct/archivos/archivos/Ejemplo.txt");
        try {
            String contenido = Files.readString(ruta);
            System.out.println("Contenido del archivo: ");
            System.out.println(contenido);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
