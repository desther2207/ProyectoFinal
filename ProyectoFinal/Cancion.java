import java.util.ArrayList;

/**
 * Clase que representa una Canción.
 */
public class Cancion {
    private int idCancion;
    private String artista;
    private String nombre;
    private Album album;
    private Oferta oferta;

    public Cancion(int idCancion, String artista, String nombre, Album album, Oferta oferta) {
        this.idCancion = idCancion;
        this.artista = artista;
        this.nombre = nombre;
        this.album = album;
        this.oferta = oferta;
    }

    /**
     * Obtiene el ID de la canción.
     * @return el ID de la canción.
     */
    public int getIdCancion() {
        return idCancion;
    }

    /**
     * Establece el ID de la canción.
     * @param idCancion el ID de la canción.
     */
    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    /**
     * Obtiene el nombre del artista.
     * @return el nombre del artista.
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Establece el nombre del artista.
     * @param artista el nombre del artista.
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Obtiene el nombre de la canción.
     * @return el nombre de la canción.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la canción.
     * @param nombre el nombre de la canción.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el álbum al que pertenece la canción.
     * @return el álbum al que pertenece la canción.
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Establece el álbum al que pertenece la canción.
     * @param album el álbum al que pertenece la canción.
     */
    public void setAlbum(Album album) {
        this.album = album;
    }

    /**
     * Obtiene la oferta asociada a la canción.
     * @return la oferta asociada a la canción.
     */
    public Oferta getOferta() {
        return oferta;
    }

    /**
     * Establece la oferta asociada a la canción.
     * @param oferta la oferta asociada a la canción.
     */
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
}
