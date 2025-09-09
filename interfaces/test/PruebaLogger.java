package interfaces.test;

import interfaces.interfaces.Logger;
import interfaces.impl.LoggerConsola;

public class PruebaLogger {

    public static void main(String[] args) {
        Logger logger = new LoggerConsola();
        
        logger.info("Iniciando la aplicacion..............");
        logger.error("Error al iniciar la aplicacion");
        logger.log("Mensaje de log");        
    }

}
