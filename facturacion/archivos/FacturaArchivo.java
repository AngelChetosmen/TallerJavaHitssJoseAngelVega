package facturacion.archivos;

import facturacion.entidades.Factura;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FacturaArchivo {

    // Ahora RUTA es un directorio
    private static final String RUTA = "facturacion/facturas/";

    // 1.- Guardar factura en archivo
    public static void guardarFactura(Factura factura) {
        try {
            File dir = new File(RUTA);
            if (!dir.exists()) {
                dir.mkdirs(); // crear carpeta si no existe
            }

            String nombreArchivo = RUTA + "factura_" + factura.getId() + ".txt";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
                bw.write(factura.toString()); // aquí se imprime toda la info de la factura
            }

            System.out.println("Factura guardada con éxito en: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2.- Leer factura desde archivo y mostrar en consola
    public static void leerFactura(int idFactura) {
        String nombreArchivo = RUTA + "factura_" + idFactura + ".txt";
        try {
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido de la factura " + idFactura + ":");
            lineas.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("No se pudo leer la factura con id: " + idFactura);
        }
    }

    // 3.- Listar todas las facturas existentes
    public static void listarFacturas() {
        File dir = new File(RUTA);
        if (!dir.exists() || dir.listFiles() == null) {
            System.out.println("No hay facturas registradas.");
            return;
        }

        System.out.println("Facturas existentes:");
        for (File f : dir.listFiles()) {
            if (f.isFile() && f.getName().startsWith("factura_")) {
                System.out.println(f.getName());
            }
        }
    }
}
