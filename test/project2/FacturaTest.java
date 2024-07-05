package project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {
    @Test
    void testConstructor() {
        Factura factura = new Factura("001", "Laptop", 5, 800.0);
        assertEquals("001", factura.getNumero());
        assertEquals("Laptop", factura.getDescripcion());
        assertEquals(5, factura.getCantidad());
        assertEquals(800.0, factura.getPrecioPorArticulo());
    }

    @Test
    void testSetCantidadPositiva() {
        Factura factura = new Factura("001", "Laptop", 5, 800.0);
        factura.setCantidad(10);
        assertEquals(10, factura.getCantidad());
    }

    @Test
    void testSetCantidadNegativa() {
        Factura factura = new Factura("001", "Laptop", 5, 800.0);
        factura.setCantidad(-5);
        assertEquals(0, factura.getCantidad());
    }

    @Test
    void testSetPrecioPorArticuloPositivo() {
        Factura factura = new Factura("001", "Laptop", 5, 800.0);
        factura.setPrecioPorArticulo(1000.0);
        assertEquals(1000.0, factura.getPrecioPorArticulo());
    }

    @Test
    void testSetPrecioPorArticuloNegativo() {
        Factura factura = new Factura("001", "Laptop", 5, -800.0);
        factura.setPrecioPorArticulo(-100.0);
        assertEquals(0.0, factura.getPrecioPorArticulo());
    }

    @Test
    void testGetTotalFactura() {
        Factura factura = new Factura("001", "Laptop", 5, 800.0);
        assertEquals(4000.0, factura.getTotalFactura());
    }

    @Test
    void testGetTotalFacturaCantidadNegativa() {
        Factura factura = new Factura("001", "Laptop", -5, 800.0);
        assertEquals(0.0, factura.getTotalFactura());
    }

    @Test
    void testGetTotalFacturaPrecioNegativo() {
        Factura factura = new Factura("001", "Laptop", 5, -800.0);
        assertEquals(0.0, factura.getTotalFactura());
    }
}