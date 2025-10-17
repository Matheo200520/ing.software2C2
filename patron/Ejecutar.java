public class Ejecutar {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("3151267888", "Matheo López");
        Cliente cliente2 = new Cliente("3178502783", "Danny Casso");

        Pedido pedido = new Pedido(cliente1, 22331458);
        Pedido pedido2 = new Pedido(cliente2, 10346547);

        // Crear impresiones usando Factory Method
        Impresion impresionColor = Impresion.crearImpresion(1, "Impresión de fotos familiares", 1500, "color");
        Impresion impresionBN = Impresion.crearImpresion(2, "Impresión de documentos", 500, "blanco y negro");
        Camara camara = new Camara(3, "Cámara profesional para fotos con una resolucion 2k", 12000, "Canon", "EOS 90D");


        Impresion impresionColor2 = Impresion.crearImpresion(1, "Impresión de fotos familiares", 1500, "color");
        Impresion impresionbyn = Impresion.crearImpresion(2, "Impresión de documentos", 500, "blanco y negro");
        Impresion impresionbyn2 = Impresion.crearImpresion(3, "Impresión de tablas de multiplicar", 700, "blanco y negro");
        Camara camara2 = new Camara(4, "Cámara profesional para fotos y de documentos con su modo multiuso de alta resolucion", 15000, "Sony", "Alpha 1 II");


      // Tomar fotos y agregarlas
        String foto1 = camara.tomarFoto();
        String foto2 = camara.tomarFoto();

        impresionColor.agregarFoto(foto1);
        impresionBN.agregarFoto(foto2);


        // Agregar productos al pedido
        pedido.agregarProducto(impresionColor);
        pedido.agregarProducto(impresionBN);
        pedido.agregarProducto(camara);

        // Mostrar pedido completo
        pedido.mostrarPedido();

        // Imprimir fotos
        impresionColor.imprimir();
        impresionBN.imprimir();



        String foto3 = camara.tomarFoto();
        String foto4 = camara.tomarFoto();
        String foto5 = camara.tomarFoto();

        impresionColor2.agregarFoto(foto3);
        impresionbyn.agregarFoto(foto4);
        impresionbyn2.agregarFoto(foto5);


        pedido2.agregarProducto(impresionColor2);;
        pedido2.agregarProducto(impresionbyn);
        pedido2.agregarProducto(impresionbyn2);
        pedido2.agregarProducto(camara2);

        pedido2.mostrarPedido();

        impresionColor2.imprimir();
        impresionbyn.imprimir();
        impresionbyn2.imprimir();



    }
}
