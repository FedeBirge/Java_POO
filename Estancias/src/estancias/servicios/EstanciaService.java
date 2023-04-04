package estancias.servicios;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import estancias.entidades.Estancia;
import estancias.persistencia.EstanciaDAO;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class EstanciaService {
    private Scanner scan;
    private  EstanciaDAO dao;

    public EstanciaService() {
        scan = new Scanner(System.in).useDelimiter("\n");
        dao = new EstanciaDAO();
        
    }
    public void imprimirEstanciasOp6() throws Exception {

        try {
            //Listar porductos
             Map<Estancia, Map<Cliente, Casa>> casas = dao.listarEstanciasOp6();
            
            //Imprimimos
            if (casas.isEmpty()) {
                throw new Exception("No existen estancias para imprimir");
            } else {
                for (Map.Entry<Estancia, Map<Cliente, Casa>> entry : casas.entrySet()) {
                    Estancia key = entry.getKey();
                    Map<Cliente, Casa> value = entry.getValue();
                    System.out.println(key);
                    System.out.println(value);
                    System.out.println("");
                    
                }
                }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
