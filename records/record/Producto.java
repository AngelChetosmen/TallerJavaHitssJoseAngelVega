package records.record;

//Inmutable por defecto -> los atributos son final
// Sintaxis reducida, mucho menos código repetitivo 
// Record implementa automaticamente: constructor, getters (con el nombre del campo), setters, equals,
//hashCode, toString
// Se usan para modelos de datos (DTOs, entidades simples (POJO), respuestas de APIs, etc)

public record Producto(String descripcion, double precio) {
    public Producto{
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo: " + precio);
        }
    }

    public String mensaje(){
        return "Un método en un Record";
    }
}
