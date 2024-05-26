import java.util.ArrayList;

/**
 * Clase que representa un Álbum.
 */
public class Album {
    private ArrayList<Cancion> tracklist;

    public Album() {
        this.tracklist = new ArrayList<>();
    }

    public Album(ArrayList<Cancion> tracklist) {
        this.tracklist = tracklist;
    }

    /**
     * Obtiene la lista de canciones del álbum.
     * @return la lista de canciones del álbum.
     */
    public ArrayList<Cancion> getTracklist() {
        return tracklist;
    }

    /**
     * Establece la lista de canciones del álbum.
     * @param tracklist la lista de canciones del álbum.
     */
    public void setTracklist(ArrayList<Cancion> tracklist) {
        this.tracklist = tracklist;
    }

    /**
     * Agrega una canción al álbum.
     * @param cancion la canción a agregar.
     */
    public void agregarCancion(Cancion cancion) {
        this.tracklist.add(cancion);
    }
}
