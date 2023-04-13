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
        try {
            System.out.println("Ingrese el nombre del cliente");
            cliente.setNombre(scan.next());
            System.out.println("Ingrese el apellido del cliente");
            cliente.setApellido(scan.next());
            System.out.println("Ingrese el N° de documento");
            cliente.setDoc(scan.nextLong());
            System.out.println("Ingrese el telefono");
            cliente.setTelefono(scan.next());
            DAO.guardarCliente(cliente);
            System.out.println("¡ Cliente creado !");
            
            return cliente;
        } catch (Exception e) {
            System.out.println("Error al crear cliente " + e.getMessage());
            return null;
        }
    }

    public Cliente buscarPorId(Long id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por id" + e.getMessage());
            return null;
        }
    }
    public Cliente buscarPorDNI(Long dni) {
        try {
            return DAO.buscarPorDNI(dni);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por dni " + e.getMessage());
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
