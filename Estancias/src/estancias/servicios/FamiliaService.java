package estancias.servicios;

import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDAO;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class FamiliaService {
    private Scanner scan;
    private  FamiliaDAO dao;

    public FamiliaService() {
        scan = new Scanner(System.in).useDelimiter("\n");
        dao = new FamiliaDAO();
        
    }

    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }
    
    public Collection<Familia> listarFamiliasOp1() throws Exception{
         try {

            Collection<Familia> familias = dao.listarOp1();

         return familias;
        } catch (Exception e) {
            throw e;
        }
    }
//       public void imprimirFamilias() throws Exception {
//
//        try {
//            //Listar porductos
//            Collection<Familia> productos = listarFamilias();
//            //Imprimimos los productos, todos los argumentos
//            if (productos.isEmpty()) {
//                throw new Exception("No existen productos para imprimir");
//            } else {
//                for (Familia p : productos) {
//                    System.out.println(p);
//                }
//            }
//        } catch (Exception e) {
//            throw e;
//        }
          public void imprimirFamiliasOp1() throws Exception {

        try {
            //Listar porductos
            Collection<Familia> productos = listarFamiliasOp1();
            //Imprimimos los productos, todos los argumentos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Familia p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
