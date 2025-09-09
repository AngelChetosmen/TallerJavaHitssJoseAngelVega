package repositorioGenerico.repo;

import java.util.List;
import java.util.ArrayList;

public class Repositorio<T> {
    private List<T> datos = new ArrayList<>();
    
    public void agregar(T elemento) {
        datos.add(elemento);
    }

    public List<T> obtenerTodo() {
        return datos;
    }
}
