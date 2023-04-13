package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;

import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


/**
 *
 * @author feder
 */
public class LibreriaService {

    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public LibreriaService() {
        
    }

    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }

    public void menu() throws Exception {
        AutorService servA = new AutorService();
        LibroService servL = new LibroService();
        ClienteService servC = new ClienteService();
        PrestamoService servP = new PrestamoService();
        try {

            System.out.println("<*************** MENÚ JPA ***************>");
            System.out.println("");
            System.out.println("1. Creación de un Cliente nuevo");
            System.out.println("2. Registrar el préstamo de un libro");
            System.out.println("3. Devolución de un libro");
            System.out.println("4. Búsqueda de todos los préstamos de un Cliente.");

            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            System.out.println("");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("CREAR CLIENTE");
                    servC.crearCliente();
                    presioneTecla();
                    menu();
                    break;
                case 2:
                    System.out.println("REGISTRO DE UN PRESTAMO");
                    servP.crearPrestamo();
                    presioneTecla();
                    menu();
                    break;
                case 3:
                    System.out.println("DEVOLUCION DE UN LIBRO");
                    System.out.println("Indique el numero de prestamo: ");
                    servP.eliminarPorId(scan.nextLong());
                    presioneTecla();
                    menu();
                    break;
                case 4:
                    System.out.println("PRESTAMOS DE UN CLIENTE ");
                    System.out.println("");
                    System.out.println("Indique el documento del cliente: ");
                    Long dni = scan.nextLong();
                    Cliente cl = servC.buscarPorDNI(dni);
                    if (cl == null){
                        System.out.println("EL cliente no existe");
                    }
                    else{
                        servP.imprimirPrestamos(servP.buscarPrestamosDNICliente(cl.getDoc()));
                        
                    }
                    presioneTecla();
                    menu();
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Opcion incorrecta!!");
                    presioneTecla();
                    menu();
                    break;
            }

        } catch (Exception e) {
//            throw e;
            System.out.println("DEBE ingresar un numero, no simbolos ni letras");
            presioneTecla();
            menu();
        }
    }

}
