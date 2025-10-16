public abstract class Producto {
    protected int numero;
    protected String descripcion;
    protected double precio;

    public Producto(int numero, String descripcion, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void mostrarDetalles();
}
