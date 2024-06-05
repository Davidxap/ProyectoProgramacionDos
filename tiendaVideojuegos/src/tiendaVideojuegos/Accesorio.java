package tiendaVideojuegos;

//clase que uso para representar un accesorio
public class Accesorio extends Producto {
    private String tipo;

    
    public Accesorio(int id, String nombre, double precio, int stock, String tipo) {
        super(id, nombre, precio, stock);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public double calcularPrecioTotal(int cantidad) {
        return getPrecio() * cantidad;
    }

    @Override
    public String getDescripcion() {
        return "Accesorio del tipo " + tipo;
    }
}
