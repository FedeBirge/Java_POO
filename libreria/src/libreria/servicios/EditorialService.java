/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author feder
 */
public class EditorialService {

    private final EditorialDAO DAO;
    private Scanner scan;

    public EditorialService() {
        this.DAO = new EditorialDAO();
        scan = new Scanner(System.in).useDelimiter("\n");

    }

    public Editorial crearEditorial() {
        Editorial editorial = new Editorial();
        try {
            System.out.println("Ingrese el nombre de la editorial");
            editorial.setNombre(scan.next());
            DAO.guardarEditorial(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println("Error al crear editorial " + e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println("Error al buscar editorial " + e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId(Integer id) {
        try {
            DAO.eliminarEditorial(id);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar editorial " + e.getMessage());
            return false;
        }
    }

    public List<Editorial> listarEditorials() {
        try {
            return DAO.listarEditoriales();
        } catch (Exception e) {
            System.out.println("Error al listar editorial " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
