
import tiendaVideojuegos.Accesorio;
import tiendaVideojuegos.Cliente;
import tiendaVideojuegos.Producto;
import tiendaVideojuegos.Videojuego;



public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto videojuego1 = new Videojuego(1, "The Witcher 3", 59.99, 10, "PC", "RPG");
        Producto videojuego2 = new Videojuego(2, "FIFA 22", 69.99, 5, "PS4", "Deportes");
        Producto videojuego3 = new Videojuego(3, "Halo Infinite", 59.99, 10, "Xbox", "Shooter");

        Accesorio accesorio1 = new Accesorio(2, "Control Xbox", 49.99, 5, "Control");
        Accesorio accesorio2 = new Accesorio(3, "Control PS4", 49.99, 5, "Control");
        Accesorio accesorio3 = new Accesorio(4, "Teclado Gamer", 29.99, 10, "Teclado");
        // Crear clientes
        Cliente cliente = new Cliente(1, "Juan Perez", "juan.perez@example.com");
        Cliente cliente2 = new Cliente(2, "Maria Lopez", "Maria.llpez@example.com");
        Cliente cliente3 = new Cliente(3, "Pedro Ramirez", "Ppramires@example.com");
        // Agregar productos al carrito
        cliente.getCarrito().agregarItem(videojuego1, 2);
        cliente.getCarrito().agregarItem(accesorio1, 1);
        cliente2.getCarrito().agregarItem(accesorio1, 2);
        cliente2.getCarrito().agregarItem(accesorio2, 1);
        cliente2.getCarrito().agregarItem(accesorio3, 1);
        cliente3.getCarrito().agregarItem(videojuego3, 4);

        //Uso el método eliminarItem para eliminar un item del carrito y probar el método
        cliente2.getCarrito().eliminarItem(accesorio1);

        //Agrego un nuevo juego  al carrito
        cliente2.getCarrito().agregarItem(videojuego2, 3);

        // Realizar compra y mostrar factura ya que el método realizarCompra llama al método mostrarFactura
        cliente.realizarCompra();
        cliente2.realizarCompra();
        cliente3.realizarCompra();
       


    }
}