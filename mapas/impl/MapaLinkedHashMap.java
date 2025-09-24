package mapas.impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLinkedHashMap {
    public static void main(String[] args) {
        Map<String,String> nombres = new LinkedHashMap<>();

        nombres.put("eduardo", "Ricardo Pinos");
        nombres.put("eloy", "Eloy Corgeza");
        nombres.put("pepe", "pepe Escarcega");
        nombres.put("juan", "Juan Garcia");
        nombres.put("luis", "Luis Perez");
        nombres.put("maria", "Maria Hernandez");

        System.out.println("Nombres: "+ nombres);
        
        for(String valores : nombres.values()){
            System.out.println(valores);
        }
    }
}
