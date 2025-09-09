package archivos.archivos;

import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class EscrituraArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("D:/Capacitacion HITSS Ago-Oct/archivos/archivos/Lista.txt");
        List <String> lineas = Arrays.asList("Primera linea", "Segunda linea", "Tercer linea");
        try {
            if (Files.exists(ruta)) {
                Files.write(ruta, lineas, StandardOpenOption.TRUNCATE_EXISTING);
                System.out.println("Archivo escrito con varias lineas: " + ruta.toAbsolutePath());
            }else {
                System.out.println("El archivo no existe, no se puede escribir");
            }
        } catch (Exception e) {
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
