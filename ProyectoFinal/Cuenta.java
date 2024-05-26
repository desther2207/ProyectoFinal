/**
 * Clase que representa una Cuenta.
 */
public class Cuenta {
    private int idCuenta;
    private String nombre;
    private String contraseña;
    private int creditos;
    private String tarjetaCredito;
    private boolean premium;
    private ArrayList<Cancion> cancionesAdquiridas;
    private ArrayList<Factura> facturas;

    /**
     * Obtiene el ID de la cuenta.
     * @return el ID de la cuenta.
     */
    public int getIdCuenta() {
        return idCuenta;
    }

    /**
     * Establece el ID de la cuenta.
     * @param id el ID de la cuenta.
     */
    public void setIdCuenta(int id) {
        this.idCuenta = id;
    }

    /**
     * Obtiene el nombre de la cuenta.
     * @return el nombre de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la cuenta.
     * @param nombre el nombre de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la contraseña de la cuenta.
     * @return la contraseña de la cuenta.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña de la cuenta.
     * @param contraseña la contraseña de la cuenta.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene los créditos de la cuenta.
     * @return los créditos de la cuenta.
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Establece los créditos de la cuenta.
     * @param creditos los créditos de la cuenta.
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * Obtiene la tarjeta de crédito de la cuenta.
     * @return la tarjeta de crédito de la cuenta.
     */
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Establece la tarjeta de crédito de la cuenta.
     * @param tarjetaCredito la tarjeta de crédito de la cuenta.
     */
    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    /**
     * Verifica si la cuenta es premium.
     * @return true si la cuenta es premium, false en caso contrario.
     */
    public boolean getPremium() {
        return premium;
    }

    /**
     * Establece si la cuenta es premium.
     * @param premium true si la cuenta es premium, false en caso contrario.
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    /**
     * Obtiene las canciones adquiridas por la cuenta.
     * @return la lista de canciones adquiridas.
     */
    public ArrayList<Cancion> getCancionesAdquiridas() {
        return cancionesAdquiridas;
    }

    /**
     * Establece las canciones adquiridas por la cuenta.
     * @param cancionesAdquiridas la lista de canciones adquiridas.
     */
    public void setCancionesAdquiridas(ArrayList<Cancion> cancionesAdquiridas) {
        this.cancionesAdquiridas = cancionesAdquiridas;
    }

    /**
     * Obtiene las facturas de la cuenta.
     * @return la lista de facturas.
     */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    /**
     * Establece las facturas de la cuenta.
     * @param facturas la lista de facturas.
     */
    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
}