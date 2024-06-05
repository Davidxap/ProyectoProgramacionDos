package tiendaVideojuegos;

import java.util.ArrayList;
import java.util.List;

// Clase que representa el carrito de compras
public class Carrito {
    private List<ItemCarrito> items;

    // Constructor
    public Carrito() {
        this.items = new ArrayList<>();
    }

    // Método para agregar un ítem al carrito
    public void agregarItem(ProductoVendible producto, int cantidad) {
        if (producto instanceof Producto) {
            Producto prod = (Producto) producto;
            if (prod.getStock() >= cantidad) {
                items.add(new ItemCarrito(producto, cantidad));
                prod.setStock(prod.getStock() - cantidad);
            } else {
                System.out.println("No hay suficiente stock para " + producto.getNombre());
            }
        }
    }

    // Método para eliminar un ítem del carrito
    public void eliminarItem(ProductoVendible producto) {
        ItemCarrito itemAEliminar = null;
        for (ItemCarrito item : items) {
            if (item.getProducto().equals(producto)) {
                itemAEliminar = item;
                break;
            }
        }
        if (itemAEliminar != null) {
            items.remove(itemAEliminar);
            if (producto instanceof Producto) {
                Producto prod = (Producto) producto;
                prod.setStock(prod.getStock() + itemAEliminar.getCantidad());
            }
        }
    }


    // Método para calcular el total del carrito
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getProducto().calcularPrecioTotal(item.getCantidad());
        }
        return total;
    }



    public List<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }
}
