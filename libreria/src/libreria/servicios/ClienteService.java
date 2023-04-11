/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;

/**
 *
 * @author feder
 */
public class ClienteService {
     private final ClienteDAO DAO;
    private Scanner scan;

    public ClienteService() {
        this.DAO = new ClienteDAO();
        scan = new Scanner(System.in).useDelimiter("\n");

    }

    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        AutorService servA = new AutorService();
        EditorialService servE = new EditorialService();
        try {
//            System.out.println("Ingrese el ISDN del cliente");
//            cliente.setIsbn(scan.nextLong());
//            System.out.println("Ingrese el titulo del cliente");
//            cliente.setTitulo(scan.next());
//            System.out.println("Ingrese el año");
//            cliente.setAnio(scan.nextInt());
//            System.out.println("Ingrese la cantidad de ejemplares");
//            cliente.setEjemplares(scan.nextInt());
//            cliente.setEjemRestantes(cliente.getEjemRestantes());
//            cliente.setEjemPrestados(0);
//            System.out.println("Ingrese el nombre del autor ");
//            String nombre = scan.next();
//            Autor a = servA.buscarPorNombre(nombre);
//            if (a == null) {
//                a = servA.crearAutor(nombre);
//            }
//            cliente.setAutor(a);

            //Autor
//            System.out.println("Ingrese el nombre de la editorial");
//
//            nombre = scan.next();
//            Editorial e = servE.buscarPorNombre(nombre);
//            if (e == null) {
//                e = servE.crearEditorial(nombre);
//            }
//            cliente.setEditorial(e);
//            // Editorial
//
//            DAO.guardarCliente(cliente);
//            System.out.println("¡ Cliente creado !");
            return cliente;
        } catch (Exception e) {
            System.out.println("Error al crear cliente " + e.getMessage());
            return null;
        }
    }

    public Cliente buscarPorId(Long isbn) {
        try {
            return DAO.buscarPorId(isbn);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por isbn" + e.getMessage());
            return null;
        }
    }

    public Cliente buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por titulo " + e.getMessage());
            return null;
        }
    }
        public Cliente buscarPorAutor(String nombre) {
        try {
            return DAO.buscarPorAutor(nombre);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por autor " + e.getMessage());
            return null;
        }
    }
        public Cliente buscarPorEditorial(String nombre) {
        try {
            return DAO.buscarPorAutor(nombre);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por editorial " + e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId(Long isbn) {
        try {
            DAO.eliminarCliente(isbn);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar cliente " + e.getMessage());
            return false;
        }
    }

    public List<Cliente> listarClientes() {
        try {
            return DAO.listarClientes();
        } catch (Exception e) {
            System.out.println("Error al listar cliente " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
}
