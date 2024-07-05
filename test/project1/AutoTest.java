package project1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    private Auto auto;
    private Marca marca;
    private Propietario propietario;

    @BeforeEach
    void setUp() {
        marca = new Marca("Toyota", 22, 2023, "AP009");
        propietario = new Propietario("Juan", LocalDate.of(1980, 5, 20), new Direccion("Calle 123", "Springfield", "CDMX"));
        auto = new Auto(marca, "Rojo", propietario, 200, 0, 4, true, 5, true, 1, "ABC123");
        auto.setCapacidadTanque(50.0);
        auto.setNivelCombustible(10.0);
    }

    @Test
    void testGetColor() {
        assertEquals("Rojo", auto.getColor());
    }

    @Test
    void testSetColor() {
        auto.setColor("Azul");
        assertEquals("Azul", auto.getColor());
    }

    @Test
    void testGetMarca() {
        assertEquals(marca, auto.getMarca());
    }

    @Test
    void testSetMarca() {
        Marca nuevaMarca = new Marca("Honda", 22, 2023, "AP009");
        auto.setMarca(nuevaMarca);
        assertEquals(nuevaMarca, auto.getMarca());
    }

    @Test
    void testGetChasis() {
        assertEquals("ABC123", auto.getChasis());
    }

    @Test
    void testSetChasis() {
        auto.setChasis("XYZ789");
        assertEquals("XYZ789", auto.getChasis());
    }

    @Test
    void testGetPropietario() {
        assertEquals(propietario, auto.getPropietario());
    }

    @Test
    void testSetPropietario() {
        Propietario nuevoPropietario = new Propietario("Carlos", LocalDate.of(1990, 1, 1), new Direccion("Calle 123", "Springfield", "CDMX"));
        auto.setPropietario(nuevoPropietario);
        assertEquals(nuevoPropietario, auto.getPropietario());
    }

    @Test
    void testGetVelocidadMaxima() {
        assertEquals(200, auto.getVelocidadMaxima());
    }

    @Test
    void testSetVelocidadMaxima() {
        auto.setVelocidadMaxima(220);
        assertEquals(220, auto.getVelocidadMaxima());
    }

    @Test
    void testGetVelocidadActual() {
        assertEquals(0, auto.getVelocidadActual());
    }

    @Test
    void testSetVelocidadActual() {
        auto.setVelocidadActual(80);
        assertEquals(80, auto.getVelocidadActual());
    }

    @Test
    void testGetNumeroPuertas() {
        assertEquals(4, auto.getNumeroPuertas());
    }

    @Test
    void testSetNumeroPuertas() {
        auto.setNumeroPuertas(2);
        assertEquals(2, auto.getNumeroPuertas());
    }

    @Test
    void testIsTieneTechoSolar() {
        assertTrue(auto.isTieneTechoSolar());
    }

    @Test
    void testSetTieneTechoSolar() {
        auto.setTieneTechoSolar(false);
        assertFalse(auto.isTieneTechoSolar());
    }

    @Test
    void testGetNumeroMarchas() {
        assertEquals(5, auto.getNumeroMarchas());
    }

    @Test
    void testSetNumeroMarchas() {
        auto.setNumeroMarchas(6);
        assertEquals(6, auto.getNumeroMarchas());
    }

    @Test
    void testIsTieneTransmisionAutomatica() {
        assertTrue(auto.isTieneTransmisionAutomatica());
    }

    @Test
    void testSetTieneTransmisionAutomatica() {
        auto.setTieneTransmisionAutomatica(false);
        assertFalse(auto.isTieneTransmisionAutomatica());
    }

    @Test
    void testGetMarchaActual() {
        assertEquals(1, auto.getMarchaActual());
    }

    @Test
    void testSetMarchaActual() {
        auto.setMarchaActual(3);
        assertEquals(3, auto.getMarchaActual());
    }

    @Test
    void testSetCapacidadTanque() {
        auto.setCapacidadTanque(60.0);
        assertEquals(60.0, auto.getCapacidadTanque());
    }

    @Test
    void testSetCapacidadTanqueInvalid() {
        assertThrows(IllegalArgumentException.class, () -> auto.setCapacidadTanque(0));
    }

    @Test
    void testSetNivelCombustible() {
        auto.setNivelCombustible(20.0);
        assertEquals(20.0, auto.getNivelCombustible());
    }

    @Test
    void testSetNivelCombustibleInvalid() {
        assertThrows(IllegalArgumentException.class, () -> auto.setNivelCombustible(60.0));
    }

    @Test
    void testAcelerar() {
        auto.acelerar();
        assertEquals(1, auto.getVelocidadActual());
    }

    @Test
    void testFrenar() {
        auto.setVelocidadActual(100);
        auto.frenar();
        assertEquals(0, auto.getVelocidadActual());
    }

    @Test
    void testIncrementarMarcha() {
        auto.incrementarMarcha();
        assertEquals(2, auto.getMarchaActual());
    }

    @Test
    void testReducirMarcha() {
        auto.setMarchaActual(2);
        auto.reducirMarcha();
        assertEquals(1, auto.getMarchaActual());
    }

    @Test
    void testCalcularAutonomia() {
        assertEquals(50000.0, auto.calcularAutonomia(10.0));
    }

    @Test
    void testCalcularAutonomiaInvalid() {
        assertThrows(IllegalArgumentException.class, () -> auto.calcularAutonomia(0));
    }

    @Test
    void testMostrarVolumenCombustible() {
        // This method prints to the console, so there's not much we can assert here.
        // You might consider redirecting System.out and capturing the output if you want to test this.
    }

    @Test
    void testToString() {
        String expected = "Auto{" +
                "color='Rojo'" +
                ", marca=" + marca +
                ", chasis='ABC123'" +
                ", propietario=" + propietario +
                ", velocidadMaxima=200" +
                ", velocidadActual=0" +
                ", numeroPuertas=4" +
                ", tieneTechoSolar=true" +
                ", numeroMarchas=5" +
                ", marchaActual=1" +
                ", tieneTransmisionAutomatica=true" +
                ", capacidadTanque=50.0" +
                ", nivelCombustible=10.0" +
                '}';
        assertEquals(expected, auto.toString());
    }
}