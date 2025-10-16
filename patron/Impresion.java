import java.util.ArrayList;

public class Impresion extends Producto {
    private String tipo;
    private ArrayList<String> fotos;

    public Impresion(int numero, String descripcion, double precio, String tipo) {
        super(numero, descripcion, precio);
        this.tipo = tipo;
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(String foto) {
        fotos.add(foto);
    }
    
    public void mostrarFotos() {
        System.out.println(" Fotos a imprimir:");
        for (String f : fotos) {
            System.out.println(" - " + f);
        }
    }

    public void imprimir() {
        if (tipo.equalsIgnoreCase("color")) {
            System.out.println(" Imprimiendo fotografía a color...");
        } else if (tipo.equalsIgnoreCase("blanco y negro")) {
            System.out.println(" Imprimiendo fotografía en blanco y negro...");
        } else {
            System.out.println(" Tipo de impresión desconocido.");
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" Impresión - Tipo: " + tipo + ", Nº Producto: " + numero + 
                           ", Descripción: " + descripcion + ", Precio: $" + precio);
        mostrarFotos();
    }

    // Factory method
    public static Impresion crearImpresion(int numero, String descripcion, double precio, String tipo) {
        return new Impresion(numero, descripcion, precio, tipo);
    }
}
