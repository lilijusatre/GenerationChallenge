package project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DireccionTest {

    @Test
    void testGetCalle() {
        Direccion direccion = new Direccion("Calle Falsa", "Centro", "Springfield");
        assertEquals("Calle Falsa", direccion.getCalle());
    }

    @Test
    void testSetCalle() {
        Direccion direccion = new Direccion("Calle Falsa", "Centro", "Springfield");
        direccion.setCalle("Calle Verdadera");
        assertEquals("Calle Verdadera", direccion.getCalle());
    }

    @Test
    void testGetBarrio() {
        Direccion direccion = new Direccion("Calle Falsa", "Centro", "Springfield");
        assertEquals("Centro", direccion.getBarrio());
    }

    @Test
    void testSetBarrio() {
        Direccion direccion = new Direccion("Calle Falsa", "Centro", "Springfield");
        direccion.setBarrio("Norte");
        assertEquals("Norte", direccion.getBarrio());
    }

    @Test
    void testGetCiudad() {
        Direccion direccion = new Direccion("Calle Falsa", "Centro", "Springfield");
        assertEquals("Springfield", direccion.getCiudad());
    }

    @Test
    void testSetCiudad() {
        Direccion direccion = new Direccion("Calle Falsa", "Centro", "Springfield");
        direccion.setCiudad("Shelbyville");
        assertEquals("Shelbyville", direccion.getCiudad());
    }

    @Test
    void testToString() {
        Direccion direccion = new Direccion("Calle Falsa", "Centro", "Springfield");
        String expected = "Direccion{calle='Calle Falsa', barrio='Centro', ciudad='Springfield'}";
        assertEquals(expected, direccion.toString());
    }
}
