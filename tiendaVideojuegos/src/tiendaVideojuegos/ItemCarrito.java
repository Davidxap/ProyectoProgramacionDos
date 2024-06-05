package tiendaVideojuegos;

public class ItemCarrito {
    
    private ProductoVendible producto;
    private int cantidad;



    public ItemCarrito(ProductoVendible producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public ProductoVendible getProducto() {
        return producto;
    }

    public void setProducto(ProductoVendible producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
