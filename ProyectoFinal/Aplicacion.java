import java.util.ArrayList;

/**
 * Clase que representa una Aplicación.
 */
public class Aplicacion {
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Factura> facturas;
    private ArrayList<Album> albums;

    public Aplicacion() {
        this.cuentas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.facturas = new ArrayList<>();
        this.albums = new ArrayList<>();
    }

    /**
     * Busca una canción por su ID.
     * @param codCancion el ID de la canción a buscar.
     * @return la canción encontrada.
     */
    private Cancion buscarCancion(int codCancion) {
        for (Cancion cancion : canciones) {
            if (cancion.getIdCancion() == codCancion) {
                return cancion;
            }
        }
        return null;
    }

    /**
     * Busca una cuenta por su ID.
     * @param codCuenta el ID de la cuenta a buscar.
     * @return la cuenta encontrada.
     */
    private Cuenta buscarCuenta(int codCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getIdCuenta() == codCuenta) {
                return cuenta;
            }
        }
        return null;
    }

    /**
     * Busca un álbum por su ID.
     * @param codAlbum el ID del álbum a buscar.
     * @return el álbum encontrado.
     */
    private Album buscarAlbum(int codAlbum) {
        for (Album album : albums) {
            if (album.getTracklist().get(0).getAlbum().getIdAlbum() == codAlbum) {
                return album;
            }
        }
        return null;
    }

    /**
     * Verifica si una cuenta con un determinado ID existe.
     * @param codCuenta el ID de la cuenta a verificar.
     * @return true si la cuenta existe, false en caso contrario.
     */
    public boolean existeCuenta(int codCuenta) {
        return buscarCuenta(codCuenta) != null;
    }

    /**
     * Compra una canción, buscando la cuenta y la canción en los arrayList existentes usando los métodos privados de buscar.
     * @param codCancion el ID de la canción.
     * @param idCuenta el ID de la cuenta que realiza la compra.
     * @param fechaCompra la fecha de la compra.
     * @return la factura generada por la compra.
     */
    public Factura compraCancion(int codCancion, int idCuenta, String fechaCompra) {
        Cancion cancion = buscarCancion(codCancion);
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cancion != null && cuenta != null) {
            Factura factura = new Factura(cuenta, cancion, fechaCompra, cancion.getAlbum());
            facturas.add(factura);
            cuenta.getCancionesAdquiridas().add(cancion);
            cuenta.setCreditos(cuenta.getCreditos() - 1); // Asumiendo que comprar una canción cuesta 1 crédito
            return factura;
        }
        return null;
    }

    /**
     * Registra un nuevo usuario en la aplicación.
     * @param nombre el nombre del usuario.
     * @param contraseña la contraseña del usuario.
     * @param tarjetaCredito la tarjeta de crédito del usuario.
     * @return la cuenta registrada.
     */
    public Cuenta registraUsuario(String nombre, String contraseña, String tarjetaCredito) {
        Cuenta cuenta = new Cuenta();
        cuenta.setIdCuenta(cuentas.size() + 1); // Generar un nuevo ID único para la cuenta
        cuenta.setNombre(nombre);
        cuenta.setContraseña(contraseña);
        cuenta.setTarjetaCredito(tarjetaCredito);
        cuenta.setCreditos(10); // Asignar una cantidad inicial de créditos
        cuenta.setPremium(false);
        cuenta.setCancionesAdquiridas(new ArrayList<>());
        cuenta.setFacturas(new ArrayList<>());
        cuentas.add(cuenta);
        return cuenta;
    }

    /**
     * Convierte el atributo de una cuenta premium a true.
     * @param idCuenta el ID de la cuenta.
     * @return la cuenta actualizada a premium.
     */
    public Cuenta comprarPremium(int idCuenta) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            cuenta.setPremium(true);
            return cuenta;
        }
        return null;
    }

    /**
     * Compra un álbum, buscando el álbum y la cuenta que la compra con los métodos de buscar.
     * @param codAlbum el ID del álbum.
     * @param idCuenta el ID de la cuenta que realiza la compra.
     * @param fechaCompra la fecha de la compra.
     * @return la factura generada por la compra.
     */
    public Factura compraAlbum(int codAlbum, int idCuenta, String fechaCompra) {
        Album album = buscarAlbum(codAlbum);
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (album != null && cuenta != null) {
            Factura factura = new Factura(cuenta, null, fechaCompra, album);
            facturas.add(factura);
            cuenta.setCreditos(cuenta.getCreditos() - album.getTracklist().size()); // Asumiendo que cada canción cuesta 1 crédito
            return factura;
        }
        return null;
    }

    /**
     * Compra créditos adicionales
     * @param numCreditos la cantidad de créditos a comprar.
     * @param idCuenta el ID de la cuenta.
     */
    public void compraCreditos(int numCreditos, int idCuenta) {
        Cuenta cuenta = buscarCuenta(idCuenta);
        if (cuenta != null) {
            cuenta.setCreditos(cuenta.getCreditos() + numCreditos);
        }
    }

    /**
     * Añade una canción a la aplicación.
     * @param artista el nombre del artista.
     * @param nombre el nombre de la canción.
     * @param idAlbum el ID del álbum.
     * @param oferta la oferta asociada a la canción.
     * @return la canción añadida.
     */
    public Cancion añadeCancion(String artista, String nombre, int idAlbum, Oferta oferta) {
        Album album = buscarAlbum(idAlbum);
        if (album != null) {
            Cancion cancion = new Cancion(canciones.size() + 1, artista, nombre, album, oferta);
            canciones.add(cancion);
            album.agregarCancion(cancion);
            return cancion;
        }
        return null;
    }

    /**
     * Obtiene la lista de cuentas registradas en la aplicación.
     * @return la lista de cuentas.
     */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * Establece la lista de cuentas registradas en la aplicación.
     * @param cuentas la lista de cuentas.
     */
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * Obtiene la lista de canciones disponibles en la aplicación.
     * @return la lista de canciones.
     */
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    /**
     * Establece la lista de canciones disponibles en la aplicación.
     * @param canciones la lista de canciones.
     */
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * Obtiene la lista de facturas generadas en la aplicación.
     * @return la lista de facturas.
     */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    /**
     * Establece la lista de facturas generadas en la aplicación.
     * @param facturas la lista de facturas.
     */
    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    /**
     * Obtiene la lista de álbumes disponibles en la aplicación.
     * @return la lista de álbumes.
     */
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    /**
     * Establece la lista de álbumes disponibles en la aplicación.
     * @param albums la lista de álbumes.
     */
    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
