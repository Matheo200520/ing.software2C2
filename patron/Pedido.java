import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.fecha = new Date();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("=========================================");
        System.out.println("          PEDIDO DEL CLIENTE             ");
        System.out.println("=========================================");
        cliente.mostrarCliente();
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de Tarjeta: " + numeroTarjetaCredito);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Productos:");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        for (Producto p : productos) {
            p.mostrarDetalles();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        }

        System.out.println(" Total del pedido: $" + calcularTotal());
        System.out.println("==============================================");
    }
}
