package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String producto = null;
        int opcion = 0;
        do {
            System.out.println("\t====== MENU DE PRODUCTOS ======");
            System.out.println("1.- Crear Producto");
            System.out.println("2.- Actualizar Producto");
            System.out.println("3.- Eliminar Producto");
            System.out.println("4.- Listar Producto");
            System.out.println("5.- Salir");
            System.out.println("===============================");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer después de nextInt(), buufer = espacio de memoria temporal
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto a crear: ");
                    producto = sc.nextLine();
                    System.out.println("Producto creado: '" + producto + "' creado exitosamente.");
                    break;
                case 2:
                    if (producto != null) {
                        System.out.println("Ingrese el nuevo nombre para el producto: ");
                        producto = sc.nextLine();
                        System.out.println("Producto actualizado a:  '" + producto + "'.");
                    } else {
                        System.out.print("Error: No hay producto para actualizar.");
                    }
                    break;
                case 3:
                    if (producto != null) {
                        producto = null;
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        System.out.println("Error: No hay producto para eliminar.");
                    }
                    break;
                case 4:
                    if (producto != null) {
                        System.out.println("Producto actual: '" + producto + "'.");
                    } else {
                        System.out.println("No hay productos disponibles.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);
        sc.close();; // Cerramos el objeto Scanner
    }
    
}
