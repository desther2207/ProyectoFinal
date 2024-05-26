package proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.Test;

public class AplicacionTest {
    private Aplicacion app;
    private Cuenta cuenta;
    private Cancion cancion;

    @Before
    public void setUp() {
        app = new Aplicacion();
        cuenta = new Cuenta("testUser", "password", "1234-5678-9012-3456");
        cuenta.setCreditos(100);
        cancion = new Cancion(1, "Test Artist", "Test Song", 50, null);
        
        app.getCuentas().add(cuenta);
        app.getCanciones().add(cancion);
    }

    @Test
    public void testBuscarCancion() {
        Cancion foundCancion = app.buscarCancion(1);
        assertNotNull(foundCancion);
        assertEquals("Test Song", foundCancion.getNombre());
    }

    @Test
    public void testBuscarCuenta() {
        Cuenta foundCuenta = app.buscarCuenta(cuenta.getIdCuenta());
        assertNotNull(foundCuenta);
        assertEquals("testUser", foundCuenta.getNombre());
    }

    @Test
    public void testCompraCancion() {
        Factura factura = app.compraCancion(cuenta.getIdCuenta(), "2024-05-25");
        assertNotNull(factura);
        assertEquals(cuenta, factura.getCuenta());
        assertEquals(cancion, factura.getCancion());
        assertEquals(50, cuenta.getCreditos());
    }

    @Test
    public void testRegistraUsuario() {
        Cuenta newCuenta = app.registraUsuario("newUser", "newPass", "1111-2222-3333-4444");
        assertNotNull(newCuenta);
        assertEquals("newUser", newCuenta.getNombre());
        assertEquals("newPass", newCuenta.getContrasenia());
        assertEquals("1111-2222-3333-4444", newCuenta.getTarjetaCredito());
        assertTrue(app.getCuentas().contains(newCuenta));
    }

    @Test
    public void testComprarPremium() {
        Cuenta premiumCuenta = app.comprarPremium(cuenta.getIdCuenta());
        assertNotNull(premiumCuenta);
        assertTrue(premiumCuenta.getPremium());
    }

    @Test
    public void testCompraCreditos() {
        app.compraCreditos(50, cuenta.getIdCuenta());
        assertEquals(150, cuenta.getCreditos());
    }

    @Test
    public void testAñadeCancion() {
        Cancion nuevaCancion = app.aniadeCancion("New Artist", "New Song", 60, null);
        assertNotNull(nuevaCancion);
        assertEquals("New Song", nuevaCancion.getNombre());
        assertTrue(app.getCanciones().contains(nuevaCancion));
    }
}
