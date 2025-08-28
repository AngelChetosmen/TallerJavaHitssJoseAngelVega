package enums;

public enum Semaforo {
    // Simular un semaforo, cada constante va a implementar 
    // el método accion() que devuelva lo que el conductor 
    // debe hacer, de acuerdo al color. 
    ROJO {
        @Override
        public String accion() {
            // Retornar una cadena
            return "Detenerse";
        }
    }, 
    AMARILLO {
        @Override
        public String accion() {
            // Volver una cadena
            return "Precaucion";
        }
    }, 
    VERDE {
        @Override
        public String accion() {
            // Devuelve una cadena
            return "Avanzar";
        }
    };
    // Metodo abstracto que cada constante debe implementar
    public abstract String accion();

}
