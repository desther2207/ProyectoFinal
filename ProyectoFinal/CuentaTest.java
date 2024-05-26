package proyecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CuentaTest {
    
    @Test
    public void testConstructorAndGetters() {
        String nombre = "Usuario";
        String contraseña = "contraseña";
        String tarjetaCredito = "1234-5678-9012-3456";

        Cuenta cuenta = new Cuenta(nombre, contraseña, tarjetaCredito);

        assertEquals(nombre, cuenta.getNombre());
        assertEquals(contraseña, cuenta.getContrasenia());
        assertEquals(tarjetaCredito, cuenta.getTarjetaCredito());
        assertFalse(cuenta.getPremium());
        assertEquals(0, cuenta.getCreditos());
    }

    @Test
    public void testSetters() {
        Cuenta cuenta = new Cuenta("Usuario", "contraseña", "1234-5678-9012-3456");
        String nuevoNombre = "NuevoUsuario";
        String nuevaContraseña = "nuevaContraseña";
        String nuevaTarjetaCredito = "1111-2222-3333-4444";
        boolean nuevoPremium = true;
        int nuevosCreditos = 100;

        cuenta.setNombre(nuevoNombre);
        cuenta.setContrasenia(nuevaContraseña);
        cuenta.setTarjetaCredito(nuevaTarjetaCredito);
        cuenta.setPremium(nuevoPremium);
        cuenta.setCreditos(nuevosCreditos);

        assertEquals(nuevoNombre, cuenta.getNombre());
        assertEquals(nuevaContraseña, cuenta.getContrasenia());
        assertEquals(nuevaTarjetaCredito, cuenta.getTarjetaCredito());
        assertTrue(cuenta.getPremium());
        assertEquals(nuevosCreditos, cuenta.getCreditos());
    }
}
