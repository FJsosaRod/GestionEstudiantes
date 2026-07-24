// Clase derivada que representa un alimento.
public class Alimento extends Producto implements Descuento {

    private String fechaCaducidad;

    public Alimento(String nombre, double precio, int cantidad, String fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== ALIMENTO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Caducidad: " + fechaCaducidad);
        System.out.println("Valor Inventario: $" + calcularValorInventario());
        System.out.println("Precio con descuento: $" + aplicarDescuento());
        System.out.println();
    }

    @Override
    public double aplicarDescuento() {
        return precio * 0.95;
    }

}