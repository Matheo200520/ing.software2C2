public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String descripcion, double precio, String marca, String modelo) {
        super(numero, descripcion, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String tomarFoto() {
        String foto = "Foto tomada con la cámara " + marca + " modelo " + modelo;
        System.out.println("📸 " + foto);
        return foto; 
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara - Marca: " + marca + ", Modelo: " + modelo + 
                           ", Nº Producto: " + numero + ", Descripción: " + descripcion + 
                           ", Precio: $" + precio);
    }
}
