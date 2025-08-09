package sintaxis;

import java.nio.channels.Pipe.SourceChannel;

public class tiposPrimitivos{
    public static void main(String[] args) {
        //chat
        char variableChar = '&'; //comillas simples
        System.out.println("Char: "+ variableChar);
        //boolean
        boolean esValido = true;
        System.out.println("Booleano: "+ esValido);
        //Enteros => byte
        byte enteroByte = 127; //-128 a 127 el rango
        System.err.println("Entero byte:" + enteroByte);
        System.out.println("Valor minimo del byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: "+ Byte.MAX_VALUE);
        //Enteros => short
        short enteroShort = 32123; //rango
        System.err.println("Entero Short:" + enteroShort);
        System.out.println("Valor minimo del Short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);
        //Enteros => int
        int entero = 323423;
        System.err.println("Entero Int:" + entero);
        System.out.println("Valor minimo del Int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: "+ Integer.MAX_VALUE);
        //Enteros => long
        long enteroLong = 87984379472320472l;//un caracter para que lo identifique como Long y no Int
        System.out.println("Entero long:" + enteroLong);
        System.out.println("Valor minimo del Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: " + Long.MAX_VALUE);
        //Numeros Flotantes o decimales -> Float
        float numeroRealFloat = 3.45E12F;
        System.out.println("Numero real float: " + numeroRealFloat);
        System.out.println("Valor minimo del Float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo del Float: " + Float.MAX_VALUE);
        //Numeros flotantes o decimales = > double
        double numeroDouble = 12.4E-3;
        System.out.println("Valor double: " + numeroDouble);
        System.out.println("Valor minimo del Double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo del Double: " + Double.MAX_VALUE);
        //Tipos de Referencia => String
        String nombre = "Angel";
        System.out.println("Nombre: " + nombre.toUpperCase());
        System.out.println("Nombre" + nombre);
        //Conversion de tipos
        int i = 100;
        double d = i; //conversion automatica 
        System.out.println("d: " + d);
        int x = (int)d; // Un double > Int no se permite la asignacion directa
        System.out.println("x: " + x);
        String s = String.valueOf(d); //No se puede convertir un entero a cadena de forma explicita
        Integer y = x; 
        String p = y.toString(x);

    }
}