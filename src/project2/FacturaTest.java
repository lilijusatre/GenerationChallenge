package project2;

public class FacturaTest {

    public static void main(String[] args) {
        Factura factura1 = new Factura("001", "Laptop", 5, 800.0);
        Factura factura2 = new Factura("002", "Smartphone", -3, 500.0);
        Factura factura3 = new Factura("003", "Tablet", 2, -250.0);

        mostrarDetallesFactura(factura1);
        mostrarDetallesFactura(factura2);
        mostrarDetallesFactura(factura3);

        factura2.setCantidad(3);
        factura2.setPrecioPorArticulo(600.0);
        factura3.setCantidad(4);
        factura3.setPrecioPorArticulo(200.0);

        System.out.println("\nDetalles después de modificar:");
        mostrarDetallesFactura(factura2);
        mostrarDetallesFactura(factura3);
    }

    private static void mostrarDetallesFactura(Factura factura) {
        System.out.println(factura);
        System.out.println("Total de la factura: " + factura.getTotalFactura());
    }
}
