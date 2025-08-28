package test;

import enums.Calificacion;
import enums.Dia;

public class TestMain {
    private static String verificarDias(Dia dia){
        String respuesta = switch (dia) {
            case SABADO, DOMINGO -> "Fin de semana"; 
        
            default -> "Dia Laboral";
        };
        return respuesta;
    }
    public static void main(String[] args) {
        //
        System.out.println("Día Lunes: " + verificarDias(Dia.LUNES));
        System.out.println("Día Viernes: " + verificarDias(Dia.VIERNES));
        System.out.println("Día Sábado: " + verificarDias(Dia.SABADO));
        System.out.println(Dia.values()); // Obtiene todos los valores


        for (Calificacion cal : Calificacion.values()) {
            System.out.println("Valor ordinal: " + cal.ordinal());
            System.out.println("Nombre: " + cal.name());
            System.out.println(cal.getDescripcion());
        }
    }
}
