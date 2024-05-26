package proyecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class OfertaTest {

    @Test
    public void testConstructorAndGetters() {
        int idOferta = 1;
        double porcentajeRebaja = 0.2;
        String tipoOferta = "Descuento";

        Oferta oferta = new Oferta();
        oferta.setIdOferta(idOferta);
        oferta.setPorcentajeRebaja(porcentajeRebaja);
        oferta.setTipoOferta(tipoOferta);

        assertEquals(idOferta, oferta.getIdOferta());
        assertEquals(porcentajeRebaja, oferta.getPorcentajeRebaja());
        assertEquals(tipoOferta, oferta.getTipoOferta());
    }

    @Test
    public void testSetters() {
        Oferta oferta = new Oferta();
        int nuevoId = 2;
        double nuevoPorcentaje = 0.1;
        String nuevoTipo = "Promoción";

        oferta.setIdOferta(nuevoId);
        oferta.setPorcentajeRebaja(nuevoPorcentaje);
        oferta.setTipoOferta(nuevoTipo);

        assertEquals(nuevoId, oferta.getIdOferta());
        assertEquals(nuevoPorcentaje, oferta.getPorcentajeRebaja());
        assertEquals(nuevoTipo, oferta.getTipoOferta());
    }
}
