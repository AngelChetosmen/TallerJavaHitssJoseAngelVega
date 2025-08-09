package sintaxis;

import java.nio.channels.Pipe.SourceChannel;

public class TiposDatos {//Variables de instancia
    static String nombre;//Tipo de dato de referencia - objeto
    static int edad=20;
    static boolean esValido;
    public static void main(String[] args) {
        int edad=40; //Variable Local
        {//Bloque del metodo, proceso mas interno
            //edad = 40;
        }
        TiposDatos objeto = new TiposDatos();
        //System.out.println("Edad: "+ edad);
        //objeto.saludar();
        saludar();
    }
    public static void saludar(){
        nombre = "Angel";
        //int edad1 = 40; //Variable Local
        System.out.println("Edad en método: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Es valido: "+ esValido);
    }
}
