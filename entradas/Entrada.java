package entradas;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

//import sintaxis.Operadores;

public class Entrada {
    public static void main(String[] args) {
        //Nombre de la clase -> NombreClase nombreObjeto = new NombreConstructor(parámetro o bien vacío) ==> NombreClase
        Scanner entrada = new Scanner(System.in);//Comando para entrada de datos por usuario. 
        int edad;
        String nombre; 
        long telefono; 
        double estatura;
        System.out.print("Ingrese su nombre: ");
        //nombre = entrada.nextLine(); //nextLine() considera espacios
        nombre = entrada.next(); //next() considera solo la primera palabra
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años");
        System.out.print("Telfono: ");
        telefono = entrada.nextLong();
        System.out.print("Estatura: ");
        estatura = entrada.nextDouble();
        //System.out.println("Hola, " + nombre + ", tienes " + edad + " años");
        System.out.println("Telefono: " + telefono + ", Estatura: " + estatura);

        entrada.close();//comando para cerrar el objeto -> recolección de basura | espacio
        //Operadores
    }
    
}
