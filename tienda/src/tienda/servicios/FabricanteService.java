/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;


/**
 *
 * @author feder
 */
public class FabricanteService {
    
     private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    public void crearFabricante(String nombre) throws Exception{
        try {
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirFabricantes() throws Exception{
         try {
            //Listar porductos
            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            //Imprimimos los fabricantes, todos los argumentos
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante p : fabricantes) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    
    }
    public Fabricante buscarFabricanteNombre(String nombre) throws Exception{
         try {

            Fabricante fabricante = dao.buscarFabricanteNombre(nombre);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
}
