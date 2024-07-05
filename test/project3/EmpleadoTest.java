package project3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    private Empleado empleado1;
    private Empleado empleado2;

    @BeforeEach
    public void setUp() {
        empleado1 = new Empleado("Juan", "Pérez", 3000.0);
        empleado2 = new Empleado("Ana", "Gómez", 2500.0);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Juan", empleado1.getNombre());
        assertEquals("Ana", empleado2.getNombre());
    }

    @Test
    public void testSetNombre() {
        empleado1.setNombre("Carlos");
        assertEquals("Carlos", empleado1.getNombre());
    }

    @Test
    public void testGetApellido() {
        assertEquals("Pérez", empleado1.getApellido());
        assertEquals("Gómez", empleado2.getApellido());
    }

    @Test
    public void testSetApellido() {
        empleado2.setApellido("Martínez");
        assertEquals("Martínez", empleado2.getApellido());
    }

    @Test
    public void testGetSalarioMensual() {
        assertEquals(3000.0, empleado1.getSalarioMensual());
        assertEquals(2500.0, empleado2.getSalarioMensual());
    }

    @Test
    public void testSetSalarioMensual() {
        empleado1.setSalarioMensual(3200.0);
        assertEquals(3200.0, empleado1.getSalarioMensual());
    }

    @Test
    public void testConstructorIncreasesContadorEmpleados() {
        int initialCount = Empleado.getContadorEmpleados();
        new Empleado("Test", "Empleado", 1000.0);
        assertEquals(initialCount + 1, Empleado.getContadorEmpleados());
    }

    @Test
    public void testContadorEmpleadosIncrement() {
        int contadorInicial = Empleado.getContadorEmpleados();
        Empleado empleado3 = new Empleado("Pedro", "López", 4000.0);
        Empleado empleado4 = new Empleado("María", "Rodríguez", 3500.0);
        assertEquals(contadorInicial + 2, Empleado.getContadorEmpleados());
    }
}
