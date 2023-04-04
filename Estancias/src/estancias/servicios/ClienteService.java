/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.servicios;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import estancias.persistencia.ClienteDAO;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ClienteService {
    
    private Scanner scan;
    private  ClienteDAO dao;

    public ClienteService() {
        scan = new Scanner(System.in).useDelimiter("\n");
        dao = new ClienteDAO();
        
    }

    public void ListarCLientesOp5() throws Exception {
        try {

             Map<Cliente, Casa> mapaclientes = dao.buscarClientePorOp5();
              if (mapaclientes.isEmpty()) {
                  System.out.println("No existen casas para imprimir");
            } else {
                  for (Map.Entry<Cliente, Casa> entry : mapaclientes.entrySet()) {
                      Object key = entry.getKey();
                      Object val = entry.getValue();
                      System.out.println(key);
                      System.out.println(val);
                      System.out.println("");
                      
                  }
                }
            

          
        } catch (Exception e) {
            throw e;
        }

    }

}
