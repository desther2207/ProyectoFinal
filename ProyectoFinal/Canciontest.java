package proyecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Canciontest {

    @Test
    public void testConstructorAndGetters() {
        int idCancion = 1;
        String artista = "Artista";
        String nombre = "Cancion";
        int creditos = 10;
        Oferta oferta = new Oferta();

        Cancion cancion = new Cancion(idCancion, artista, nombre, creditos, oferta);

        assertEquals(idCancion, cancion.getIdCancion());
        assertEquals(artista, cancion.getArtista());
        assertEquals(nombre, cancion.getNombre());
        assertEquals(creditos, cancion.getCreditos());
        assertEquals(oferta, cancion.getOferta());
    }

    @Test
    public void testSetters() {
        Oferta oferta = new Oferta();
    	Cancion cancion = new Cancion(1, "Artista", "NombreCancion", 3, oferta);
        int nuevoId = 2;
        String nuevoArtista = "Nuevo Artista";
        String nuevoNombre = "Nueva Cancion";
        int nuevosCreditos = 5;

        cancion.setIdCancion(nuevoId);
        cancion.setArtista(nuevoArtista);
        cancion.setNombre(nuevoNombre);
        cancion.setCreditos(nuevosCreditos);
        cancion.setOferta(oferta);

        assertEquals(nuevoId, cancion.getIdCancion());
        assertEquals(nuevoArtista, cancion.getArtista());
        assertEquals(nuevoNombre, cancion.getNombre());
        assertEquals(nuevosCreditos, cancion.getCreditos());
        assertEquals(oferta, cancion.getOferta());
    }
}
