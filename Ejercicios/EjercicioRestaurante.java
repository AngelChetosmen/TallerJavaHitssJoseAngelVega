package Ejercicios;

import java.util.Scanner;
/* Ejercicio Restaurante :
* Un restaurante necesita un programa que permita al cajero: Mostrar un menú de opciones: 
* 1. Registrar un pedido.
* 2. Mostrar el total de ventas. 
* 3. Salir del sistema. 

Cada pedido se registra ingresando el precio. 
El programa debe seguir mostrando el menú hasta que el cajero elija Salir. 
Validar que el precio sea positivo antes de sumarlo a las ventas */
public class EjercicioRestaurante { // Clase principal del programa
    public static void main(String[] args) { // Método principal que inicia la ejecución del programa
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        double totalVentas = 0; 
        int[] cantidadPedidos = new int[5]; // Para contar pedidos por platillo
        double[] totalPorPlatillo = new double[5]; // Para sumar ventas por platillo

        // Catálogo de platillos mexicanos
        String[] platillos = {"Tacos", "Enchiladas", "Pozole", "Tamales", "Chiles en nogada"};

        boolean salir = false; // Variable para controlar el bucle de menú
        do {
            boolean esValido = false;
            int opcion = 0;
            do {
                System.out.println("\n\t===============================");
                System.out.println("\t        Menú de opciones");
                System.out.println("\t===============================");
                System.out.println("\t1. Registrar un pedido");
                System.out.println("\t2. Mostrar el total de ventas");
                System.out.println("\t3. Salir del sistema");
                System.out.println("\t===============================");
                System.out.print("\tSeleccione una opción: ");
                if (scanner.hasNextInt()) { // Validamos que la entrada sea un entero
                    opcion = scanner.nextInt();
                    esValido = true;
                } else { 
                    System.out.println("\n\t[!] Opción no válida, por favor intente de nuevo.\n");
                    scanner.next(); // Limpiar entrada inválida
                }
            } while (!esValido);

            switch (opcion) { // Estructura de control para manejar las opciones del menú
                case 1:
                    System.out.println("\n\t------ Catálogo de platillos ------");
                    for (int i = 0; i < platillos.length; i++) { // Mostramos el catálogo de platillos
                        System.out.printf("\t%d. %s\n", i + 1, platillos[i]);
                    }
                    System.out.print("\n\tSeleccione el número del platillo: ");
                    int seleccion = scanner.nextInt();
                    if (seleccion >= 1 && seleccion <= platillos.length) { // Validamos la selección del platillo
                        System.out.print("\tIngrese el precio del pedido: ");
                        double precio = scanner.nextDouble();
                        if (precio > 0) { // Validamos que el precio sea positivo
                            totalVentas += precio;
                            cantidadPedidos[seleccion - 1]++;
                            totalPorPlatillo[seleccion - 1] += precio;
                            System.out.println("\n\t[OK] Pedido de " + platillos[seleccion - 1] + " registrado exitosamente.\n");
                        } else { //Caso donde no sea positivo
                            System.out.println("\n\t[!] El precio debe ser positivo. Pedido no registrado.\n");
                        }
                    } else { // Caso donde la selección no sea válida
                        System.out.println("\n\t[!] Selección no válida.\n");
                    }
                    break;
                case 2:
                    System.out.println("\n\t====== Resumen de ventas ======");
                    for (int i = 0; i < platillos.length; i++) { // Mostramos el total de ventas por platillo
                        System.out.printf("\t- %s: %d pedidos, Total: $%.2f\n", platillos[i], cantidadPedidos[i], totalPorPlatillo[i]);
                    }
                    System.out.printf("\n\tTOTAL DE VENTAS: $%.2f\n\n", totalVentas);
                    break;
                case 3:
                    System.out.println("\n\tSaliendo del sistema...\n");
                    salir = true;
                    break;
                default:
                    System.out.println("\n\t[!] Opción no válida, por favor intente de nuevo.\n");
            }
        } while (!salir);
        scanner.close(); // Cerramos Scanner para liberar recursos
    }
}