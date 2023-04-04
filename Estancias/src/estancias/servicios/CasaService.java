/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.entidades.Casa;
import estancias.persistencia.CasaDAO;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class CasaService {
    private Scanner scan;
    private  CasaDAO dao;

    public CasaService() {
        scan = new Scanner(System.in).useDelimiter("\n");
        dao = new CasaDAO();
        
    }
    
    public Collection<Casa> listarCasasOp2() throws Exception{
        try {

            Collection<Casa> casas = dao.listarCasasDisponibleAgosto();

         return casas;
        } catch (Exception e) {
            throw e;
        }
        
    }
    public void imprimirCasasOp2() throws Exception {

        try {
            //Listar porductos
            Collection<Casa> casas = listarCasasOp2();
            //Imprimimos los productos, todos los argumentos
            if (casas.isEmpty()) {
                throw new Exception("No existen casas para imprimir");
            } else {
                for (Casa p : casas) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public void listarImprimirCasasOp4(LocalDate fecha, int tiempo ) throws Exception {
        try {

            Collection<Casa> casas = dao.listarCasasDisponibleFechasOp4(fecha, tiempo);

          if (casas.isEmpty()) {
                System.out.println("No existen casas para imprimir");
            } else {
                for (Casa p : casas) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    
}
    
    
}
