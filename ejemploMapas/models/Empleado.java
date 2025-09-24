package ejemploMapas.models;

public class Empleado {
    /*
     * Implementar Empleado.java para generar este bloque de código:
     * package ejemploMapas.test;
        import java.util.HashMap;
        import java.util.Map;
        import Ejercicios.Herencia_Empleados.clases.Empleado;

        public class Empleados {
            public static void main(String[] args) {
                Map<Integer, Empleado> empleados = new HashMap<>();

                //Agregar empleados al mapa 
                empleados.put(1, new Empleados(1, "Pepe", "TI"));
                empleados.put(2, new Empleados(203, "Juan",  "Ventas"));
                empleados.put(3, new Empleados(101, "Maria", "RH"));
                System.out.println(empleados);

                //Recorrer el mapa y mostrar todos los empleados
                for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
                    System.out.println(empleado.getKey() + " - " + empleado.getValue());
                }
            }
        }
     */
    private int idEmpleado;
    private String nombre;
    private String departamento;

    public Empleado(int idEmpleado, String nombre, String departamento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }

    // Método equals() y hashCode() para un correcto funcionamiento en colecciones
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Empleado empleado = (Empleado) obj;
        return idEmpleado == empleado.idEmpleado;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(idEmpleado);
    }

}
