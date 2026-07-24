// Clase derivada que representa una prenda de vestir.
public class Ropa extends Producto implements Descuento {

    private String talla;

    public Ropa(String nombre, double precio, int cantidad, String talla) {
        super(nombre, precio, cantidad);
        this.talla = talla;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== ROPA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Talla: " + talla);
        System.out.println("Valor Inventario: $" + calcularValorInventario());
        System.out.println("Precio con descuento: $" + aplicarDescuento());
        System.out.println();
    }

    @Override
    public double aplicarDescuento() {
        return precio * 0.85;
    }

}