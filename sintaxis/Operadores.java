package sintaxis;

import java.net.SocketTimeoutException;
import java.nio.channels.Pipe.SourceChannel;

public class Operadores {
    public static void main(String[] args) {
     //Operadores Aritmeticos
     int a = 12, b = 5;
     System.out.println("a = 12, b= 5 ");
     System.out.println("Suma a + b: " + (a + b));//Concatenacion + suma aritmetica
     //Resta
     System.out.println("Resta: a - b: " + (a-b));
     System.out.println("Multiplicacion a * b: " + (a*b));
     System.out.println("Divison a / b: " + (a/b));
     System.out.println("Modulo a mod b: " + (a % b));//% => MOD / Modulo
     //Operadores de asignacion
     a = 14;
     //a = a + 5;
     a += 5; // a = a + 5; Es la misma operacion pero con valor de asignacion
     System.out.println("Valor de a: " + a);
     a -=5; //a = a -5;
     a *= 2; //a = a * 2;
     a /= 3; //a = a / 3;
     a %= 2; //a = a % 2; -> a = 1
     System.out.println("Valor de a: " + a);
     //Operadores de relacion o comparacion:
     System.out.println("Igual a = b: " + (a==b));
     System.out.println("Diferente a/= b:" + (a !=b));
     System.out.println("Mayor que a>b: " + (a>b));
     System.out.println("Menor que a<b: " + (a<b));
     System.out.println("Mayor o igual que a>=b: " + (a>=b));
     System.out.println("Menor o igual que a<=b: " + (a<=b));
     //Operadores logicos
        // Operador AND
        //true && ture = true
        //true && false = false
        //false && true = false
        //false && false = false
        System.out.println("And: " + ((a>b)&&(a>=b)));//False

        //OR
        //true || ture = true 
        //true || false = true
        //false || true = true
        //false || false = false
        System.out.println("Or: " + ((a>b)||(a>=b)));//true

        //Not
        //!true || ture = true 
        //!false || true = true
        System.out.println("Not: " + (!(a<b)));

    }
}
