/**
 * Clase que representa una Factura.
 */
public class Factura {
    private Cuenta cuenta;
    private Cancion cancion;
    private String fechaCompra;
    private Album album;

    public Factura(Cuenta cuenta, Cancion cancion, String fechaCompra, Album album) {
        this.cuenta = cuenta;
        this.cancion = cancion;
        this.fechaCompra = fechaCompra;
        this.album = album;
    }

    /**
     * Obtiene la cuenta asociada a la factura.
     * @return la cuenta asociada a la factura.
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * Establece la cuenta asociada a la factura.
     * @param cuenta la cuenta asociada a la factura.
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene la canción asociada a la factura.
     * @return la canción asociada a la factura.
     */
    public Cancion getCancion() {
        return cancion;
    }

    /**
     * Establece la canción asociada a la factura.
     * @param cancion la canción asociada a la factura.
     */
    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    /**
     * Obtiene la fecha de compra.
     * @return la fecha de compra.
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Establece la fecha de compra.
     * @param fechaCompra la fecha de compra.
     */
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * Obtiene el álbum asociado a la factura.
     * @return el álbum asociado a la factura.
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Establece el álbum asociado a la factura.
     * @param album el álbum asociado a la factura.
     */
    public void setAlbum(Album album) {
        this.album = album;
    }
}
