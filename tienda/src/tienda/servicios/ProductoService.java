package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import tienda.servicios.FabricanteService;

/**
 *
 * @author feder
 */
public class ProductoService {

    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto() throws Exception {

        try {
            //Creamos producto
            Producto producto = new Producto();
            System.out.println("Ingrese el nombre del producto");
            producto.setNombre(scan.next());
            System.out.println("Ingrese el precio");
            producto.setPrecio(scan.nextDouble());
            System.out.println("Ingrese el nombre del fabricante");
            String fab = scan.next();
            FabricanteService servf = new FabricanteService();
            Fabricante fabricante = servf.buscarFabricanteNombre(fab);
            
            if (fabricante == null) {
                servf.crearFabricante(fab);
                fabricante = servf.buscarFabricanteNombre(fab);
            }
            producto.setCodigoFabricante(fabricante.getCodigo());
//            
//            //Validamos
//            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
//                throw new Exception("Debe indicar el correo electrónico");
//            }
//            if (correoElectronico.contains("@") == false) {
//                throw new Exception("El correo electrónico es incorrecto");
//            }
//            if (clave == null || clave.trim().isEmpty()) {
//                throw new Exception("Debe indicar la clave");
//            }
//            if (clave.length() < 8) {
//                throw new Exception("La clave no puede tener menos de 8 caracteres");
//            }
//            if (buscarUsuarioPorCorreoElectronico(correoElectronico) != null) {
//                throw new Exception("Ya existe un usuario con el correo electrónico indicado " + correoElectronico);
//            }         

            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductosPrecios() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductosEntrePrecios();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {

        try {
            //Listar porductos
            Collection<Producto> productos = listarProductos();
            //Imprimimos los productos, todos los argumentos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirNombreProductos() throws Exception {

        try {
            //Listar porductos
            Collection<Producto> productos = listarProductos();
            //Imprimimos los productos, todos los argumentos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirNombrePrecioProductos() throws Exception {

        try {
            //Listar porductos
            Collection<Producto> productos = listarProductos();
            //Imprimimos los productos, todos los argumentos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + " $ " + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirNombrePrecioProductosPrecio() throws Exception {

        try {
            //Listar porductos
            Collection<Producto> productos = listarProductosPrecios();
            //Imprimimos los productos, todos los argumentos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + " $ " + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductosPortatiles() throws Exception {

        try {
            //Listar porductos
            Collection<Producto> productos = dao.listarProductosPortatiles();
            //Imprimimos los productos, todos los argumentos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + " $ " + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductosBarato() throws Exception {

        try {
            //Listar porductos
            Collection<Producto> productos = dao.listarProductosBarato();
            //Imprimimos los productos, todos los argumentos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + " $ " + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }

    public void menu() throws Exception {
        try {
            System.out.println("<*************** MENÚ TIENDA ***************>");
            System.out.println("");
            System.out.println("1. Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2. Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4. Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5. Listar el nombre y el precio del producto más barato.");
            System.out.println("6. Ingresar un producto a la base de datos.");
            System.out.println("7. Ingresar un fabricante a la base de datos");
            System.out.println("8. Editar un producto con datos a elección.");
            System.out.println("9. Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            System.out.println("");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    imprimirNombreProductos();
                    presioneTecla();
                    menu();
                    break;
                case 2:
                    imprimirNombrePrecioProductos();
                    presioneTecla();
                    menu();
                    break;
                case 3:
                    imprimirNombrePrecioProductosPrecio();
                    presioneTecla();
                    menu();
                    break;
                case 4:
                    imprimirProductosPortatiles();
                    presioneTecla();
                    menu();
                    break;
                case 5:
                    imprimirProductosBarato();
                    presioneTecla();
                    menu();
                    break;
                case 6:
                    crearProducto();
                    presioneTecla();
                    menu();
                    break;
                case 7:
                    presioneTecla();
                    menu();
                    break;
                case 8:
                    imprimirProductos();
                    presioneTecla();
                    menu();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                    presioneTecla();
                    menu();
                    break;
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
