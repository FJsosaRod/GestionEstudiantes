public class Main {

    public static void main(String[] args) {

        Producto p1 = new Electronico("Laptop", 15000, 5, 24);
        Producto p2 = new Alimento("Pan Integral", 45, 30, "15/08/2026");
        Producto p3 = new Ropa("Playera", 250, 15, "M");

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();

    }

}