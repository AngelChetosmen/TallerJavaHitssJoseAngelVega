package ejemploMapas.test;

import java.util.HashMap;
import java.util.Map;
import ejemploMapas.models.Empleado;

public class Empleados {
    public static void main(String[] args) {
        Map<Integer, Empleado> empleados = new HashMap<>();

        //Agregar empleados al mapa 
        empleados.put(1, new Empleado(1, "Pepe", "RRHH"));
        empleados.put(2, new Empleado(2, "Maria", "RRHH"));
        empleados.put(3, new Empleado(3, "Pedro", "RRHH"));
        empleados.put(4, new Empleado(4, "Ana", "RRHH"));
        empleados.put(5, new Empleado(5, "Luis", "RRHH"));
        System.out.println(empleados);

        //Recorrer el mapa y mostrar todos los empleados
        for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
            System.out.println(empleado.getKey() + " - " + empleado.getValue());
        }

        //Acceder a un empleado por su ID
        Empleado empleado5 = empleados.get(5);
        System.out.println("Buuscar empleado con ID 5: " + empleado5);

        //Verificar si existe un empleado
        int buscaID = 5;
        if (empleados.containsKey(buscaID)) {
            System.out.println("Existe un empleado con ID " + buscaID);
        }

        //Eliminar un empleado
        int idAEliminar = 5;
        if (empleados.containsKey(idAEliminar)) {
            empleados.remove(idAEliminar);
            System.out.println("Empleado con ID " + idAEliminar + " eliminado.");
        }

        //Recorrer el mapa
        for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
            System.out.println(empleado.getKey() + " - " + empleado.getValue());
        }
    }
}
