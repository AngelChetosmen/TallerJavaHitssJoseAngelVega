package entradas;

public class Cadenas {
    public static void main(String[] args) {
        //               0123456789..    length()-1
        String nombre = "Jose Angel Vega     ";
        String nombre1 = "Jose Angel Vega";
        System.out.println("length(): " + nombre.length());//length() nos dice el tamaño de la cadena del String
        System.out.println("==:" + (nombre == nombre1));//Esta forma no es recomendable para comparar objetos
        System.out.println("equals():" + (nombre.equals(nombre1)));
        System.out.println("equalsIgnoreCase(String b): " + (nombre.equalsIgnoreCase(nombre1)));//equalsIgnoreCase Va a ignorar las mayusculas se va por caracteres
        System.out.println("charArt(int i): " + (nombre.charAt(6)));
        System.out.println("Nombre:" + nombre);
        System.out.println("trim(): " + nombre.trim());//trim devuelve la cadena pero sin los espacios en blanco
        System.out.println("substring(int a, int b): " + (nombre1.substring(5, 11)));//Obtiene la subcadena desde una longitud especifica
        System.out.println("substring(int i): " + nombre.substring(5));//Se obtiene la subcadena a partir del caracter inicial hasta el final
        System.out.println("indexOf(String cadena): " + nombre1.indexOf("e"));//Para identificar una cadena o un caracter al principio (el primero que encuentre de izquierda a derecha)
        System.out.println("lastIndexOf(): " + nombre.lastIndexOf("eg"));//Busca el primer caracter o cadena desde el final al inicio (derecha a izquierda)
        System.out.println("startWith(String prefijo): " + nombre.startsWith("E"));//Verifica si comienza con la cadena o caracter especifico
        System.out.println("endWith (String prefijo): " + nombre.endsWith("a"));
        System.out.println("toLowerCase(): " + nombre.toLowerCase());//Convierte a minusculas toda la cadena
        System.out.println("toUpperCase(): " + nombre.toUpperCase());
    }
}
