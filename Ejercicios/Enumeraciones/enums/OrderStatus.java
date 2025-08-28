package enums;

public enum OrderStatus {
    NEW{
        @Override
        public String mensaje() {
            return "Pedido creado";
        }
    },
    PROCESSING{
        @Override
        public String mensaje() {
            return "Pedido en proceso";
        }
    },    
    SHIPPED{
        @Override
        public String mensaje() {
            return "Pedido enviado";
        }
    },    
    DELIVERED{
        @Override
        public String mensaje() {
            return "Pedido entregado";
        }
    },    
    CANCELLED{
        @Override
        public String mensaje() {
            return "Pedido cancelado";
        }
    };    
    
    public abstract String mensaje();
      
}
