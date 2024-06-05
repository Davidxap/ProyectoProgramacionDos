package tiendaVideojuegos;

//Creo la interfaz con los méotos que deben implementar las clases que la implementen
public interface ProductoVendible {

    public double calcularPrecioTotal(int cantidad);
    public String getNombre();
    public String getDescripcion();
    
}
