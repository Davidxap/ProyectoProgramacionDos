package tiendaVideojuegos;

// Clase que representa un cliente de la tienda, hereda de Persona
public class Cliente extends Persona {
    private Carrito carrito;

    // Constructor
    public Cliente(int id, String nombre, String email) {
        super(id, nombre, email);
        this.carrito = new Carrito();
    }

    // Métodos getter y setter para los atributos
    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    // Método para realizar la compra de los productos y enseñar la factura
    public void realizarCompra() {
        double total = carrito.calcularTotal();
        Factura factura = new Factura(this, carrito.getItems(), total);
        factura.mostrarFactura();
    }

   
}

