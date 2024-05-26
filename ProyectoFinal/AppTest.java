package proyecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.*;
import java.lang.reflect.Field;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    private void setInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void testRegistraUsuario() throws NoSuchFieldException, IllegalAccessException {
        setInput("1\nJohn Doe\npassword123\n1234-5678-9012-3456\n6\n");
        App.main(null);

        Aplicacion app = getAplicacionInstance();
        assertEquals(1, app.getCuentas().size());
        assertEquals("John Doe", app.getCuentas().get(0).getNombre());
    }

    @Test
    public void testComprarCancion() throws NoSuchFieldException, IllegalAccessException {
        setInput("1\nJohn Doe\npassword123\n1234-5678-9012-3456\n2\n1\n2023-05-26\n1\n6\n");
        App.main(null);

        Aplicacion app = getAplicacionInstance();
        Cuenta cuenta = app.getCuentas().get(0);
        cuenta.setCreditos(100); // Añadimos créditos a la cuenta

        // Añadir canción
        Cancion cancion = new Cancion(1, "Artist", "Song", 50, null);
        app.getCanciones().add(cancion);

        setInput("2\n1\n2023-05-26\n1\n6\n");
        App.main(null);

        assertEquals(1, cuenta.getCancionesAdquiridas().size());
        assertEquals(cancion, cuenta.getCancionesAdquiridas().get(0));
        assertEquals(50, cuenta.getCreditos());
    }

    @Test
    public void testComprarCreditos() throws NoSuchFieldException, IllegalAccessException {
        setInput("1\nJohn Doe\npassword123\n1234-5678-9012-3456\n4\n1\n50\n6\n");
        App.main(null);

        Aplicacion app = getAplicacionInstance();
        Cuenta cuenta = app.getCuentas().get(0);

        assertEquals(50, cuenta.getCreditos());
    }

    @Test
    public void testComprarPremium() throws NoSuchFieldException, IllegalAccessException {
        setInput("1\nJohn Doe\npassword123\n1234-5678-9012-3456\n3\n1\n6\n");
        App.main(null);

        Aplicacion app = getAplicacionInstance();
        Cuenta cuenta = app.getCuentas().get(0);

        assertTrue(cuenta.getPremium());
    }

    @Test
    public void testAnadirCancion() throws NoSuchFieldException, IllegalAccessException {
        setInput("5\nArtist\nSong\n50\n6\n");
        App.main(null);

        Aplicacion app = getAplicacionInstance();
        assertEquals(1, app.getCanciones().size());
        assertEquals("Song", app.getCanciones().get(0).getNombre());
        assertEquals("Artist", app.getCanciones().get(0).getArtista());
        assertEquals(50, app.getCanciones().get(0).getCreditos());
    }

    private Aplicacion getAplicacionInstance() throws NoSuchFieldException, IllegalAccessException {
        Field aplicacionField = App.class.getDeclaredField("aplicacion");
        aplicacionField.setAccessible(true);
        return (Aplicacion) aplicacionField.get(null);
    }
}
