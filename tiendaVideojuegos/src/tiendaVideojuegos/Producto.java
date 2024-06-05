package tiendaVideojuegos;

//clase abstracta que define los atributos y métodos comunes a los productos
public abstract class Producto implements ProductoVendible {

    protected int id;
    protected String nombre;
    protected double precio;
    protected int stock;


    
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    // Método para actualizar el stock del producto
    public void actualizarStock(int cantidad) {
        this.stock = cantidad;
    }

}

