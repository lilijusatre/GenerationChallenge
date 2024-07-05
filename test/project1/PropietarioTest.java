package project1;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PropietarioTest {
    @Test
    void testGetNombre() {
        Propietario propietario = new Propietario("Juan", LocalDate.of(1980, 5, 20), new Direccion("Calle C 123", "Springfield", "Londres"));
        assertEquals("Juan", propietario.getNombre());
    }

    @Test
    void testSetNombre() {
        Propietario propietario = new Propietario("Juan", LocalDate.of(1980, 5, 20), new Direccion("Calle K 23", "Pesado", "CDMX"));

        propietario.setNombre("Carlos");
        assertEquals("Carlos", propietario.getNombre());
    }

    @Test
    void testGetFechaNacimiento() {
        Propietario propietario = new Propietario("Juan", LocalDate.of(1980, 5, 20), new Direccion("Calle F 13", "Uno", "Toronto"));
        assertEquals(LocalDate.of(1980, 5, 20), propietario.getFechaNacimiento());
    }

    @Test
    void testSetFechaNacimiento() {
        Propietario propietario = new Propietario("Juan", LocalDate.of(1980, 5, 20), new Direccion("Calle Falsa 123", "Spring", "Paris"));
        propietario.setFechaNacimiento(LocalDate.of(1990, 1, 1));
        assertEquals(LocalDate.of(1990, 1, 1), propietario.getFechaNacimiento());
    }

    @Test
    void testGetDireccion() {
        Direccion direccion = new Direccion("Calle Falsa 123", "Springfield", "Paris");
        Propietario propietario = new Propietario("Juan", LocalDate.of(1980, 5, 20), direccion);
        assertEquals(direccion, propietario.getDireccion());
    }

    @Test
    void testSetDireccion() {
        Direccion direccion = new Direccion("Calle Fresa 23", "Springfield", "CDMX");
        Propietario propietario = new Propietario("Juan", LocalDate.of(1988, 5, 20), direccion);
        Direccion nuevaDireccion = new Direccion("Avenida Siempre Viva 742", "Spring", "Toronto");
        propietario.setDireccion(nuevaDireccion);
        assertEquals(nuevaDireccion, propietario.getDireccion());
    }

    @Test
    void testToString() {
        Direccion direccion = new Direccion("Calle 123", "Springfield", "Nueva");
        Propietario propietario = new Propietario("Juan", LocalDate.of(1980, 5, 20), direccion);
        String expected = "Propietario{nombre='Juan', fechaNacimiento=1980-05-20, direccion=" + direccion + "}";
        assertEquals(expected, propietario.toString());
    }
}