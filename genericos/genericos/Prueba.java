package genericos.genericos;

public class Prueba {
    public static void main(String[] args) {
        Caja <String> caja1 = new Caja<>();
        caja1.set("Factura");
        System.out.println("Caja contiene: " + caja1.get());


        Caja<Double> caja2 = new Caja<>();
        caja2.set(125.4);
        System.out.println("Caja contiene: " + caja2.get());

        System.out.println("Maximo(20, 30): " + Utilerias.maximo(20, 30));
        System.out.println("Cadenas(java, python): " + Utilerias.maximo("Java", "Python"));
    }
}
