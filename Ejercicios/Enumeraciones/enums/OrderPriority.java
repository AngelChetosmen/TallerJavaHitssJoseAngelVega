package enums;

public enum OrderPriority {
    LOW(1){
        @Override
        public String nivel() {
            return "Prioridad Baja";
        }
    },
    MEDIUM(2){
        @Override
        public String nivel() {
            return "Prioridad Media";
        }
    },
    HIGH(3){
        @Override
        public String nivel() {
            return "Prioridad Alta";
        }
    };

    private final int prioridad;

    OrderPriority(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public abstract String nivel();
    
}
