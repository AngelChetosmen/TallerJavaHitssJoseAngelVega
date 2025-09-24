package ejemploMapas.test;

import java.util.LinkedHashMap;
import java.util.Map;
import ejemploMapas.models.Producto;

public class Productos {
    public static void main(String[] args) {
        //LinkedHashMap mantiene el orden de inserción
        Map<String, Producto> inventario = new LinkedHashMap<>();

        //Agregar productos
        inventario.put("P001", new Producto("P001", "Coca-Cola", 5));
        inventario.put("P002", new Producto("P002", "Pepsi", 5));
        inventario.put("P003", new Producto("P003", "Sprite", 2));
        inventario.put("P004", new Producto("P004", "Laptop", 5));

        //Mostrar el inventario
        for (Map.Entry<String, Producto> producto : inventario.entrySet()) { //entrySet() devuelve un conjunto de pares de clave-valor
            System.out.println(producto.getKey() + " - " + producto.getValue());
        }

        //Actualizar un producto
        String clave = "P001";
        if (inventario.containsKey(clave)) {
            Producto producto = inventario.get(clave);
            producto.setCantidad(10);
            inventario.put(clave, producto);
        } else {
            System.out.println("No se encontro el producto con la clave: " + clave);
            
        }
        Producto producto = inventario.get("P002");
        producto.setCantidad(15);
        inventario.put("P002", producto);
        inventario.get("PP03").setCantidad(10);
        System.out.println("Cantidad: " + inventario.get("P003").getCantidad());

        //Mostrar el inventario actualizado
        System.out.println("\nInventario actualizado:");
        for (Map.Entry<String, Producto> producto2 : inventario.entrySet()) {
            System.out.println(producto2.getKey() + " - " + producto2.getValue());
        }

        //Eliminar un producto
        System.out.println("Eliminando el producto P003");
        inventario.remove("P003");
        System.out.println("Inventario actualizado:");
        for (Map.Entry<String, Producto> producto3 : inventario.entrySet()) { //Mostramos el inventario actualizado
            System.out.println(producto3.getKey() + " - " + producto3.getValue());
        }

        //Insertar o Agregar otro producto en el inventario
        inventario.put("P005", new Producto("P005", "Monitor", 5));
        System.out.println("Inventario actualizado:");
        for (Map.Entry<String, Producto> producto4 : inventario.entrySet()) { //Mostramos el inventario actualizado
            System.out.println(producto4.getKey() + " - " + producto4.getValue());
        }

        //Buscar un producto por su clave
        String claveBuscada = "P004";
        if (inventario.containsKey(claveBuscada)) {
            Producto productoBuscado = inventario.get(claveBuscada);
            System.out.println("Producto encontrado: " + productoBuscado);
        } else {
            System.out.println("No se encontro el producto con la clave: " + claveBuscada);
        }

        //Verificar si un producto existe en el inventario
        String claveVerificada = "P005";
        if (inventario.containsKey(claveVerificada)) {
            System.out.println("El producto con la clave " + claveVerificada + " existe en el inventario.");
        } else {
            System.out.println("El producto con la clave " + claveVerificada + " no existe en el inventario.");
        }

    }
    
}
