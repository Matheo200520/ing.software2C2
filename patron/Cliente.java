

public class Cliente {
    private String celular;
    private String nombre;

    public Cliente(String celular, String nombre) {
        this.celular = celular;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre + " - Celular: " + celular);
    }
}
