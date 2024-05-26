import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Aplicacion aplicacion = new Aplicacion();

    public static void main(String[] args) {
        boolean salir = false;
        
        while (!salir) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            
            switch (opcion) {
                case 1:
                    comprarCancion();
                    break;
                case 2:
                    registrarUsuario();
                    break;
                case 3:
                    comprarPremium();
                    break;
                case 4:
                    comprarAlbum();
                    break;
                case 5:
                    comprarCreditos();
                    break;
                case 6:
                    añadirCancion();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("----- Menú de Opciones -----");
        System.out.println("1. Comprar canción");
        System.out.println("2. Registrar usuario");
        System.out.println("3. Comprar cuenta premium");
        System.out.println("4. Comprar álbum");
        System.out.println("5. Comprar créditos");
        System.out.println("6. Añadir canción");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
    }

    private static int obtenerOpcion() {
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        return opcion;
    }

    private static void comprarCancion() {
        System.out.println("Introduce el ID de la canción:");
        int idCancion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        System.out.println("Introduce el ID de la cuenta:");
        int idCuenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        if (!aplicacion.existeCuenta(idCuenta)) {
            System.out.println("La cuenta no existe. Registrando nuevo usuario...");
            registrarUsuario();
        }
        
        System.out.println("Introduce la fecha de compra:");
        String fechaCompra = scanner.nextLine();
        
        aplicacion.compraCancion(idCancion, idCuenta, fechaCompra);
    }

    private static void registrarUsuario() {
        System.out.println("Introduce el nombre del usuario:");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce la contraseña:");
        String contraseña = scanner.nextLine();
        
        System.out.println("Introduce la tarjeta de crédito:");
        String tarjetaCredito = scanner.nextLine();
        
        aplicacion.registraUsuario(nombre, contraseña, tarjetaCredito);
    }

    private static void comprarPremium() {
        System.out.println("Introduce el ID de la cuenta:");
        int idCuenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        aplicacion.comprarPremium(idCuenta);
    }

    private static void comprarAlbum() {
        System.out.println("Introduce el ID del álbum:");
        int idAlbum = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        System.out.println("Introduce el ID de la cuenta:");
        int idCuenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        System.out.println("Introduce la fecha de compra:");
        String fechaCompra = scanner.nextLine();
        
        aplicacion.compraAlbum(idAlbum, idCuenta, fechaCompra);
    }

    private static void comprarCreditos() {
        System.out.println("Introduce la cantidad de créditos a comprar:");
        int numCreditos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        System.out.println("Introduce el ID de la cuenta:");
        int idCuenta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        aplicacion.compraCreditos(numCreditos, idCuenta);
    }

    private static void añadirCancion() {
        System.out.println("Introduce el nombre del artista:");
        String artista = scanner.nextLine();
        
        System.out.println("Introduce el nombre de la canción:");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce el ID del álbum:");
        int idAlbum = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        System.out.println("Introduce el ID de la oferta:");
        int idOferta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        
        Oferta oferta = new Oferta(); // Suponiendo que ya tienes una instancia de Oferta
        oferta.setIdOferta(idOferta);
        
        aplicacion.añadeCancion(artista, nombre, idAlbum, oferta);
    }
}
