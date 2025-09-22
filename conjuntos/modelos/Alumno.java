package conjuntos.modelos;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private int id;
        private String nombre;
        private double calificacion;


        // Consturctor
        public Alumno(int id, String nombre, double calificacion) {
            this.id = id;
            this.nombre = nombre;
            this.calificacion = calificacion;
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public double getCalificacion() {
            return calificacion;
        }

        @Override
        public String toString() {
            return "Alumno{" + "id=" + id 
            + ", nombre=" + nombre 
            + ", calificacion=" + calificacion 
            + '}';
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            //result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Alumno other = (Alumno) obj;
            if (id != other.id)
                return false;
            // if (nombre == null) {
            //     if (other.nombre != null)
            //         return false;
            // } else if (!nombre.equals(other.nombre))
            //     return false;
            // return ture; // Otra forma no es necesario
            return id == other.id && Objects.equals(nombre, other.nombre);
        }

        @Override
        public int compareTo(Alumno o) {
            //compareto por nombre
            return this.nombre.compareTo(o.nombre);
            //compareto por id
            //return Integer.compare(this.getId(), o.getId());
        }
        
}
