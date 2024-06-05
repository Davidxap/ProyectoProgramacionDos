package tiendaVideojuegos;

import java.util.List;

// Clase que representa una factura de compra
public class Factura {
    
    private Cliente cliente;
    private List<ItemCarrito> itemsComprados;
    private double total;


    public Factura(Cliente cliente, List<ItemCarrito> itemsComprados, double total) {
        this.cliente = cliente;
        this.itemsComprados = itemsComprados;
        this.total = total;
    }

    // Método para mostrar los detalles de la factura
    public void mostrarFactura() {
        System.out.println("Factura para " + cliente.getNombre() + "\n" +"Correo: " + cliente.getEmail() +"\nID: " + cliente.getId());
        for (ItemCarrito item : itemsComprados) {
            System.out.println(item.getCantidad() + " x " + item.getProducto().getNombre() +" - " + item.getProducto().calcularPrecioTotal(item.getCantidad())+" "+item.getProducto().getDescripcion());
        }
        System.out.println("Total: " + total+"\n");
    }
}
