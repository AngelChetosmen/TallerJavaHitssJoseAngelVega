package interfaces.interfaces;

public interface Logger {
    public void log(String mensaje);

    // Java 8+ 
    public default void info(String mensaje) {
        log("[INFO]: " + mensaje);
    }

    public default void error(String mensaje) {
        log("[ERROR]: " + mensaje);
    }
}
