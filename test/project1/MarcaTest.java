package project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MarcaTest {

    @Test
    void testGetNombre() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        assertEquals("Toyota", marca.getNombre());
    }

    @Test
    void testSetNombre() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        marca.setNombre("Honda");
        assertEquals("Honda", marca.getNombre());
    }

    @Test
    void testGetNrDeModelos() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        assertEquals(10, marca.getNrDeModelos());
    }

    @Test
    void testSetNrDeModelos() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        marca.setNrDeModelos(15);
        assertEquals(15, marca.getNrDeModelos());
    }

    @Test
    void testGetAnioLanzamiento() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        assertEquals(1937, marca.getAnioLanzamiento());
    }

    @Test
    void testSetAnioLanzamiento() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        marca.setAnioLanzamiento(1940);
        assertEquals(1940, marca.getAnioLanzamiento());
    }

    @Test
    void testGetCodigoIdentificador() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        assertEquals("TOY123", marca.getCodigoIdentificador());
    }

    @Test
    void testSetCodigoIdentificador() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        marca.setCodigoIdentificador("HON456");
        assertEquals("HON456", marca.getCodigoIdentificador());
    }

    @Test
    void testToString() {
        Marca marca = new Marca("Toyota", 10, 1937, "TOY123");
        String expected = "Marca{nombre='Toyota', nrDeModelos=10, anioLanzamiento=1937, codigoIdentificador='TOY123'}";
        assertEquals(expected, marca.toString());
    }
}
