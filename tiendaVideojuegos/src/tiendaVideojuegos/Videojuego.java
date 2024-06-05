package tiendaVideojuegos;

// Clase que representa un videojuego
public class Videojuego extends Producto {
    private String plataforma;
    private String genero;

    public Videojuego(int id, String nombre, double precio, int stock, String plataforma, String genero) {
        super(id, nombre, precio, stock);
        this.plataforma = plataforma;
        this.genero = genero;
    }


    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Implementación de los métodos de la interfaz ProductoVendible
    @Override
    public double calcularPrecioTotal(int cantidad) {
        return getPrecio() * cantidad;
    }

    @Override
    public String getDescripcion() {
        return "Videojuego para plataforma " + plataforma + " del género " + genero;
    }
}
