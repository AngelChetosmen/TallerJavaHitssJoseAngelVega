package records.test;

import records.record.*;

public class TestMain {

    public static void main(String[] args) {
        Producto p1 = new Producto("Leche Santa Clara", 30.4);
        Producto p2 = new Producto("Leche Lacteos", 23.5);
        System.out.println(p1.mensaje());
        System.out.println("------------------------");
        System.out.println(p2.descripcion());

    }

}
