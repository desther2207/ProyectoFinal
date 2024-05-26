package proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

public class FacturaTest {
    private Factura factura;
    private Cuenta cuenta;
    private Cancion cancion;

    @Before
    public void setUp() {
        cuenta = new Cuenta("testUser", "password", "1234-5678-9012-3456");
        cancion = new Cancion(1, "Test Artist", "Test Song", 50, null);
        factura = new Factura(cuenta, cancion, "2024-05-25");
    }

    @Test
    public void testGetCuenta() {
        assertEquals(cuenta, factura.getCuenta());
    }

    @Test
    public void testSetCuenta() {
        Cuenta newCuenta = new Cuenta("newUser", "newPass", "1111-2222-3333-4444");
        factura.setCuenta(newCuenta);
        assertEquals(newCuenta, factura.getCuenta());
    }

    @Test
    public void testGetCancion() {
        assertEquals(cancion, factura.getCancion());
    }

    @Test
    public void testSetCancion() {
        Cancion nuevaCancion = new Cancion(2, "New Artist", "New Song", 60, null);
        factura.setCancion(nuevaCancion);
        assertEquals(nuevaCancion, factura.getCancion());
    }

    @Test
    public void testGetFechaCompra() {
        assertEquals("2024-05-25", factura.getFechaCompra());
    }

    @Test
    public void testSetFechaCompra() {
        factura.setFechaCompra("2024-05-26");
        assertEquals("2024-05-26", factura.getFechaCompra());
    }
}

