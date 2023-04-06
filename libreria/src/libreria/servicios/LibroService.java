/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author feder
 */
public class LibroService {

    private final LibroDAO DAO;
    private Scanner scan;

    public LibroService() {
        this.DAO = new LibroDAO();
        scan = new Scanner(System.in).useDelimiter("\n");

    }

    public Libro crearLibro() {
        Libro libro = new Libro();
        AutorService servA = new AutorService();
        EditorialService servE = new EditorialService();
        try {
//            System.out.println("Ingrese el ISDN del libro");
//            libro.setIsbn(scan.nextLong());
            System.out.println("Ingrese el titulo del libro");
            libro.setTitulo(scan.next());
            System.out.println("Ingrese el año");
            libro.setAnio(scan.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares");
            libro.setEjemplares(scan.nextInt());
            libro.setEjemRestantes(libro.getEjemRestantes());
            libro.setEjemPrestados(0);
            System.out.println("Ingrese el nombre del autor ");
            String nombre = scan.next();
            Autor a = servA.buscarPorNombre(nombre);
            if (a == null) {
                a = servA.crearAutor(nombre);
            }
            libro.setAutor(a);

            //Autor
            System.out.println("Ingrese el nombre de la editorial");

            nombre = scan.next();
            Editorial e = servE.buscarPorNombre(nombre);
            if (e == null) {
                e = servE.crearEditorial(nombre);
            }
            libro.setEditorial(e);
            // Editorial

            DAO.guardarLibro(libro);
            System.out.println("¡ Libro creado !");
            return libro;
        } catch (Exception e) {
            System.out.println("Error al crear libro " + e.getMessage());
            return null;
        }
    }

    public Libro buscarPorId(Long isbn) {
        try {
            return DAO.buscarPorId(isbn);
        } catch (Exception e) {
            System.out.println("Error al buscar libro " + e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId(Long isbn) {
        try {
            DAO.eliminarLibro(isbn);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar libro " + e.getMessage());
            return false;
        }
    }

    public List<Libro> listarLibros() {
        try {
            return DAO.listarLibros();
        } catch (Exception e) {
            System.out.println("Error al listar libro " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
