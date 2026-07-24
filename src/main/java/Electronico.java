// Clase derivada que representa un producto electrónico.
public class Electronico extends Producto implements Descuento {

    private int garantia;

    public Electronico(String nombre, double precio, int cantidad, int garantia) {
        super(nombre, precio, cantidad);
        this.garantia = garantia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== ELECTRONICO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Garantía: " + garantia + " meses");
        System.out.println("Valor Inventario: $" + calcularValorInventario());
        System.out.println("Precio con descuento: $" + aplicarDescuento());
        System.out.println();
    }

    @Override
    public double aplicarDescuento() {
        return precio * 0.90;
    }

}