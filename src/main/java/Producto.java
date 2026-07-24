// Clase abstracta que representa un producto del inventario.
public abstract class Producto {

    // Atributos comunes para todos los productos
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para calcular el valor total del inventario
    public double calcularValorInventario() {
        return precio * cantidad;
    }

    // Método abstracto que implementarán las clases hijas
    public abstract void mostrarInformacion();
}