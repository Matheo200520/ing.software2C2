public class Ejecutar {
    public static void main(String[] args) {

        // Crear clientes
        Cliente cliente1 = new Cliente("3151267888", "Matheo López");
        Cliente cliente2 = new Cliente("3178502783", "Danny Casso");

        // Crear pedidos
        Pedido pedido = new Pedido(cliente1, 22331458);
        Pedido pedido2 = new Pedido(cliente2, 10346547);

        // Crear productos del cliente 1 (usando la clase base Producto)
        Producto impresionColor = Impresion.crearImpresion(1, "Impresión de fotos familiares", 1500, "color");
        Producto impresionBN = Impresion.crearImpresion(2, "Impresión de documentos", 500, "blanco y negro");
        Producto camara = new Camara(3, "Cámara profesional para fotos con una resolución 2k", 12000, "Canon", "EOS 90D");

        // Crear productos del cliente 2
        Producto impresionColor2 = Impresion.crearImpresion(4, "Impresión de fotos familiares", 1500, "color");
        Producto impresionbyn = Impresion.crearImpresion(5, "Impresión de documentos", 500, "blanco y negro");
        Producto impresionbyn2 = Impresion.crearImpresion(6, "Impresión de tablas de multiplicar", 700, "blanco y negro");
        Producto camara2 = new Camara(7, "Cámara profesional multiuso de alta resolución", 15000, "Sony", "Alpha 1 II");

        // Convertir a tipo concreto para usar métodos propios
        Camara cam1 = (Camara) camara;
        Camara cam2 = (Camara) camara2;
        Impresion impColor = (Impresion) impresionColor;
        Impresion impBN = (Impresion) impresionBN;
        Impresion impColor2 = (Impresion) impresionColor2;
        Impresion impBN1 = (Impresion) impresionbyn;
        Impresion impBN2 = (Impresion) impresionbyn2;

        // Tomar fotos y agregarlas (cliente 1)
        String foto1 = cam1.tomarFoto();
        String foto2 = cam1.tomarFoto();
        impColor.agregarFoto(foto1);
        impBN.agregarFoto(foto2);

        // Agregar productos al pedido del cliente 1
        pedido.agregarProducto(impColor);
        pedido.agregarProducto(impBN);
        pedido.agregarProducto(cam1);

        // Mostrar pedido completo del cliente 1
        pedido.mostrarPedido();

        // Imprimir fotos cliente 1
        impColor.imprimir();
        impBN.imprimir();

        // Tomar fotos y agregarlas (cliente 2)
        String foto3 = cam2.tomarFoto();
        String foto4 = cam2.tomarFoto();
        String foto5 = cam2.tomarFoto();

        impColor2.agregarFoto(foto3);
        impBN1.agregarFoto(foto4);
        impBN2.agregarFoto(foto5);

        // Agregar productos al pedido del cliente 2
        pedido2.agregarProducto(impColor2);
        pedido2.agregarProducto(impBN1);
        pedido2.agregarProducto(impBN2);
        pedido2.agregarProducto(cam2);

        // Mostrar pedido completo del cliente 2
        pedido2.mostrarPedido();

        // Imprimir fotos cliente 2
        impColor2.imprimir();
        impBN1.imprimir();
        impBN2.imprimir();
    }
}
