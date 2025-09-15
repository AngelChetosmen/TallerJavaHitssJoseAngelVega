package facturacion.genericos;

import java.util.ArrayList;
import java.util.List;
public class ServicioGenerico <T extends Identificable<ID>, ID> {
    private List<T> datos = new ArrayList<>();

    /*
    public ServicioGenerico() {
        datos = new ArrayList<>();
    }
    Buscar elemento por ID
    */

    public T buscarPorId(ID id) {
        for (T elemento : datos) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }

    //Guardar elemento sin duplicarse 
    public void guardar(T elemento){
        if (buscarPorId(elemento.getId()) != null) {
            System.out.println("Ya existe el elemento con ID: " + elemento.getId());
        }else{
            datos.add(elemento); // Agregar elemento a la lista
            System.out.println("Guardado: " + elemento);
        }
    }

    //Listar todos los elementos
    public List<T> listar(){
        return datos;
    }

    // Actualizar un elemento de datos de acuerdo al ID
    public boolean actualizar(ID id, T nuevoElemento) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.set(i, nuevoElemento);
                return true;
            }
        }
        return false;
    }

    //Eliminar un elemento de datos de acuerdo al ID
    public boolean eliminar(ID id) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i);
                return true;
            }
        }
        return false;
    }
}
