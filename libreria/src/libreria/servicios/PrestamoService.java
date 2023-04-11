/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Prestamo;
import libreria.persistencia.PrestamoDAO;

/**
 *
 * @author feder
 */
public class PrestamoService {
    
     private final PrestamoDAO DAO;
    private Scanner scan;

    public PrestamoService() {
        this.DAO = new PrestamoDAO();
        scan = new Scanner(System.in).useDelimiter("\n");

    }

    public Prestamo crearPrestamo() {
        Prestamo prestamo = new Prestamo();
//        AutorService servA = new AutorService();
//        EditorialService servE = new EditorialService();
        try {
//            System.out.println("Ingrese el ISDN del prestamo");
//            prestamo.setIsbn(scan.nextLong());
//            System.out.println("Ingrese el titulo del prestamo");
//            prestamo.setTitulo(scan.next());
//            System.out.println("Ingrese el año");
//            prestamo.setAnio(scan.nextInt());
//            System.out.println("Ingrese la cantidad de ejemplares");
//            prestamo.setEjemplares(scan.nextInt());
//            prestamo.setEjemRestantes(prestamo.getEjemRestantes());
//            prestamo.setEjemPrestados(0);
//            System.out.println("Ingrese el nombre del autor ");
//            String nombre = scan.next();
//            Autor a = servA.buscarPorNombre(nombre);
//            if (a == null) {
//                a = servA.crearAutor(nombre);
//            }
//            prestamo.setAutor(a);
//
//            //Autor
//            System.out.println("Ingrese el nombre de la editorial");
//
//            nombre = scan.next();
//            Editorial e = servE.buscarPorNombre(nombre);
//            if (e == null) {
//                e = servE.crearEditorial(nombre);
//            }
//            prestamo.setEditorial(e);
//            // Editorial
//
//            DAO.guardarPrestamo(prestamo);
//            System.out.println("¡ Prestamo creado !");
            return prestamo;
        } catch (Exception e) {
            System.out.println("Error al crear prestamo " + e.getMessage());
            return null;
        }
    }

    public Prestamo buscarPorId(Long isbn) {
        try {
            return DAO.buscarPorId(isbn);
        } catch (Exception e) {
            System.out.println("Error al buscar prestamo por isbn" + e.getMessage());
            return null;
        }
    }

//    public Prestamo buscarPorNombre(String nombre) {
//        try {
//            return DAO.buscarPorNombre(nombre);
//        } catch (Exception e) {
//            System.out.println("Error al buscar prestamo por titulo " + e.getMessage());
//            return null;
//        }
//    }
//        public Prestamo buscarPorAutor(String nombre) {
//        try {
//            return DAO.buscarPorAutor(nombre);
//        } catch (Exception e) {
//            System.out.println("Error al buscar prestamo por autor " + e.getMessage());
//            return null;
//        }
//    }
//        public Prestamo buscarPorEditorial(String nombre) {
//        try {
//            return DAO.buscarPorAutor(nombre);
//        } catch (Exception e) {
//            System.out.println("Error al buscar prestamo por editorial " + e.getMessage());
//            return null;
//        }
//    }

    public boolean eliminarPorId(Long isbn) {
        try {
            DAO.eliminarPrestamo(isbn);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar prestamo " + e.getMessage());
            return false;
        }
    }

    public List<Prestamo> listarPrestamos() {
        try {
            return DAO.listarPrestamos();
        } catch (Exception e) {
            System.out.println("Error al listar prestamo " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
}
