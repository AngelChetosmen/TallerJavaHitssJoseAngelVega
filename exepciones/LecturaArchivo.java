package exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LecturaArchivo {
    public static void main(String[] args) {
        
        try {
            BufferedReader br  = new BufferedReader(new FileReader("datos.txt"));
            String linea = br.readLine();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }

        System.out.println("Continuando con la ejecucion del programa...");
    }
}
