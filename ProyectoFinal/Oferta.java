/**
 * Clase que representa una Oferta.
 */
public class Oferta {
    private int idOferta;
    private double porcentajeRebaja;
    private String tipoOferta;

    /**
     * Obtiene el ID de la oferta.
     * @return el ID de la oferta.
     */
    public int getIdOferta() {
        return idOferta;
    }

    /**
     * Establece el ID de la oferta.
     * @param idOferta el ID de la oferta.
     */
    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    /**
     * Obtiene el porcentaje de rebaja de la oferta.
     * @return el porcentaje de rebaja de la oferta.
     */
    public double getPorcentajeRebaja() {
        return porcentajeRebaja;
    }

    /**
     * Establece el porcentaje de rebaja de la oferta.
     * @param porcentajeRebaja el porcentaje de rebaja de la oferta.
     */
    public void setPorcentajeRebaja(double porcentajeRebaja) {
        this.porcentajeRebaja = porcentajeRebaja;
    }

    /**
     * Obtiene el tipo de oferta.
     * @return el tipo de oferta.
     */
    public String getTipoOferta() {
        return tipoOferta;
    }

    /**
     * Establece el tipo de oferta.
     * @param tipoOferta el tipo de oferta.
     */
    public void setTipoOferta(String tipoOferta) {
        this.tipoOferta = tipoOferta;
    }
}
