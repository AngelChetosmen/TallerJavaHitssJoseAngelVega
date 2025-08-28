package enums;

public enum PaymentMethod {
    CASH{
        @Override
        public String description() {
            return "Efectivo";
        }
    },
    CARD{
        @Override
        public String description() {
            return "Tarjeta";
        }
    },
    TRANSFER{
        @Override
        public String description() {
            return "Transferencia";
        }
    };
    
    public abstract String description();
    
}
